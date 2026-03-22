#PYTHON CODE
import tkinter as tk
from tkinter import messagebox
import mysql.connector
import swipy

class DatabaseConnector:
    def __init__(self, host, user, password, database):
        self.host = host
        self.user = user
        self.password = password
        self.database = database
        self.connection = None
        self.cursor = None
        self.connected = False

        self.connect()

    def connect(self):
        try:
            self.connection = mysql.connector.connect(
                host=self.host,
                user=self.user,
                password=self.password,
                database=self.database
            )
            self.cursor = self.connection.cursor()
            self.connected = True
            print("Success", "Database connection established successfully!")

        except mysql.connector.Error as err:
            messagebox.showerror("Error", f"Error: {err}")

    def close_connection(self):
        if self.connection.is_connected():
            self.cursor.close()
            self.connection.close()
            self.connected = False
            print("Success", "Database connection closed.")

    def execute_query(self, query):
        try:
            self.cursor.execute(query)
            self.connection.commit()
            messagebox.showinfo("Success", "Query executed successfully.")
        except mysql.connector.Error as err:
            messagebox.showerror("Error", f"Error executing query: {err}")

class PrologConnector:
    def __init__(self, prolog_file):
        self.prolog = swipy.Prolog()
        try:
            self.prolog.consult(prolog_file)
        except Exception as e:
            print("Error", f"Error consulting Prolog file: {e}")

    def get_gpa(self,total_earned, total_done):
        self.prolog.assertz('gpa(total_earned,total_done,GPA)')  
        self.prolog.query(f'gpa({total_earned},{total_done},X)')
        result = self.prolog.get_solution('X')
        print(f'The GPA is: {result}')
    
    def get_total_credit(self,student_id,sem):
        db_connector.cursor.execute("SELECT `Module` FROM `Module Details` WHERE `Semester` = %s AND `Student ID` = %s",(sem,student_id))
        sqlResult = db_connector.cursor.fetchall()
        A = 0
        for row_num, row in enumerate(sqlResult):
            #print(row_num, row)
            db_connector.cursor.execute("SELECT `Number of Credits` FROM `Module Master` WHERE `Module` LIKE %s", (row,))
            sqlResult2 = db_connector.cursor.fetchone()
            self.prolog.assertz(f"total_done(Total_done,A,Credit).")
            self.prolog.query(f'total_done(X,{A},{sqlResult2})')
            result = self.prolog.get_solution('X')
            '''for col_num, col in enumerate(sqlResult2):
                print(f"({row_num}, {col_num}) -> {col}")
                '''
            A = result
            
        return result
    
    def get_total_earned_per_semester(self,student_id,sem):
        db_connector.cursor.execute("SELECT `Module`, `Grade Points` FROM `Module Details` WHERE `Semester` = %s AND `Student ID` = %s", (sem,student_id))
        sqlResult = db_connector.cursor.fetchall()
        A = 0
        for row_num, row in enumerate(sqlResult):
            #print(row_num, row)
            for col_num, col in enumerate(row):
                #print(f"({row_num}, {col_num}) -> {col}")
                
                if col_num == 0 :
                    db_connector.cursor.execute("SELECT `Number of Credits` FROM `Module Master` WHERE `Module` LIKE %s", (col,))
                    sqlResult2 = db_connector.cursor.fetchone()
                    credit = sqlResult2 
                    #print (credit)
                else:
                    grade = col
                    #print (grade)    
            self.prolog.assertz(f"total_earned(Total_earned,A,Grade,Credit).")
            self.prolog.query(f'total_earned(X,{A},{grade},{credit})')
            result = self.prolog.get_solution('X')
            '''for col_num, col in enumerate(sqlResult2):
                print(f"({row_num}, {col_num}) -> {col}")
                '''
            A = result
            
        return result

    def save_student_data(prolog_connector, student_id, student_name, student_email, school, programme):
        prolog_connector.assert_student(student_id, student_name, student_email, school, programme)

    def generate_report(year, gpa_threshold):
        # Placeholder for report generation logic
        report_text = f"Year: {year}\nGPA Threshold: {gpa_threshold}\n\n"
        report_text += "Student ID Student Name GPA Semester 1 GPA Semester 2 Cumulative GPA\n"
        report_text += "---------------------------------------------------------------------------------------------\n"
        # Add code to fetch data from database and generate report
        return report_text

class StudentEntryWindow:
    def __init__(self, root, prolog_connector):
        self.root = root
        self.prolog_connector = prolog_connector
        self.root.title("Student Data Entry")
        self.root.geometry("400x300")

        self.student_id_label = tk.Label(root, text="Student ID:")
        self.student_id_entry = tk.Entry(root)

        self.student_id_label.place(x=20, y=20)
        self.student_id_entry.place(x=200, y=20)

        self.student_name_label = tk.Label(root, text="Student Name:")
        self.student_name_entry = tk.Entry(root)

        self.student_name_label.place(x=20, y=70)
        self.student_name_entry.place(x=200, y=70)

        self.student_email_label = tk.Label(root, text="Student Email:")
        self.student_email_entry = tk.Entry(root)

        self.student_email_label.place(x=20, y=120)
        self.student_email_entry.place(x=200, y=120)

        self.school_label = tk.Label(root, text="School:")
        self.school_entry = tk.Entry(root)

        self.school_label.place(x=20, y=170)
        self.school_entry.place(x=200, y=170)

        self.programme_label = tk.Label(root, text="Programme:")
        self.programme_entry = tk.Entry(root)

        self.programme_label.place(x=20, y=220)
        self.programme_entry.place(x=200, y=220)

        self.save_btn = tk.Button(root, text="Save Student Data", command=self.save_student)

        self.save_btn.place(x=200, y=270)

        print("Student Entry Window initialized.")

    def save_student(self):
        student_id = self.student_id_entry.get()
        student_name = self.student_name_entry.get()
        student_email = self.student_email_entry.get()
        school = self.school_entry.get()
        programme = self.programme_entry.get()
        save_student_data(self.prolog_connector, student_id, student_name, student_email, school, programme)
        self.generate_report_window() # Call the method to switch to Report Window

    def generate_report_window(self):
        self.root.withdraw() # Hide the Student Entry Window
        report_window = ReportWindow() # Create an instance of the Report Window
        report_window.show_report_window() # Show the Report Window

class ReportWindow:
    def __init__(self):
        self.root = tk.Tk()
        self.root.title("GPA Report")
        self.root.geometry("600x300")

        self.label_year = tk.Label(self.root, text="Enter Year:")
        self.entry_year = tk.Entry(self.root)

        self.label_year.place(x=20, y=30)
        self.entry_year.place(x=200, y=30)

        self.label_gpa = tk.Label(self.root, text="Enter GPA Threshold:")
        self.entry_gpa = tk.Entry(self.root)

        self.label_gpa.place(x=20, y=70)
        self.entry_gpa.place(x=200, y=70)

        self.generate_btn = tk.Button(self.root, text="Generate Report", command=self.generate_and_show_report)
        self.generate_btn.place(x=200, y=110)

        print("Report Window initialized.")

    def generate_and_show_report(self):
        year = self.entry_year.get()
        gpa_threshold = self.entry_gpa.get()
        report_text = generate_report(year, gpa_threshold)
        report_label = tk.Label(self.root, text=report_text, justify="left")
        report_label.place(x=20, y=150)

    def show_report_window(self):
        self.root.deiconify() # Show the Report Window
        self.root.mainloop() # Start the main loop for the Report Window

root = tk.Tk()
db_connector = DatabaseConnector(host='localhost', user='root', password='', database='AI_Project')
prolog_connector = PrologConnector(prolog_file='Prolog Probation.pl')

student_entry_window = StudentEntryWindow(root, prolog_connector)

root.mainloop()