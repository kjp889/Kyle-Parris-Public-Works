from subprocess import Popen, PIPE

def calculate_gpa(total_earned, total_done, credit):
    # Construct the command to call the Prolog interpreter
    command = ['swipl', '-q', '-s', 'Prolog_Probation.pl', 'gpa', str(total_earned), str(total_done), str(credit)]

    # Run the command and capture the output
    process = Popen(command, stdout=PIPE, stderr=PIPE)
    stdout, stderr = process.communicate()

    # Check if the command was successful
    if process.returncode == 0:
        # Split the output by spaces and convert the last element to float
        output = stdout.decode('utf-8').split()
        gpa = float(output[-1])
        return gpa
    else:
        # If the command was not successful, print the error message
        print(f"Error: {stderr.decode('utf-8')}")
        return None

# Example usage
total_earned = 100
total_done = 20
credit = 3
gpa_result = calculate_gpa(total_earned, total_done, credit)
if gpa_result is not None:
    print(f"The GPA is: {gpa_result}")