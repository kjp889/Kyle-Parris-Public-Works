package lab4;

import java.util.ArrayList;
import java.util.List;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> usersList = new ArrayList<>();
		
		usersList.add(new User("John", "Brown", 25, new Date(2,2,1990)));
		usersList.add(new User("kn", "Brown", 25, new Date(2,2,1990)));
		usersList.add(new User("ohn", "Brown", 25, new Date(2,2,1990)));
		usersList.add(new User("hn", "Brown", 25, new Date(2,2,1990)));
		usersList.add(new User("n", "Brown", 25, new Date(2,2,1990)));
		User.writeToUsersDBFile(usersList);
		
		List<User> usesList = new ArrayList<User>();
		usesList = User.readFromUsersDBFile();
		for(User user: usesList) {
			System.out.println(user.toString());
		}
	
	}

}
