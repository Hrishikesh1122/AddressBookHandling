/**************************************************
 * Purpose : Address Book Handling
 * @author Hrishikesh Ugavekar
 * @version 1.0
 * @since 07-06-2021
 *
 *************************************************/
package services;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Person;
public class AddressBook {
	 private static Scanner sc = new Scanner(System.in);
	 List<Person> personList = new ArrayList<>();
	 
	 /**
	 * This method adds object person and its fields to ArrayList
	 */
	private void add() {
		 System.out.println(personList);
		 Person person = new Person();
		 System.out.println("First Name :");
		 person.setFirstName(sc.next());
		 System.out.println("Last name : ");
		 person.setLastName(sc.next());
		 System.out.println("Address :");
		 person.setAddress(sc.next());
		 System.out.println("City :");
		 person.setCity(sc.next());
		 System.out.println("State :");
		 person.setState(sc.next());
		 System.out.println("Zip :");
		 person.setZip(sc.nextInt());
		 System.out.println("Phone :");
		 person.setPhone(sc.nextLong());
		 System.out.println("Email :");
		 person.setEmail(sc.next());
		 
		 personList.add(person);
		 
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println("Welcome to Address Book Handling");
		AddressBook book = new AddressBook();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Enter options\n1.Add\n2.Edit\n3.Delete\n4.Show\n5.Exit Contact");
			int userInput = sc.nextInt();
			switch (userInput) {
			case 1: 
				book.add();
				break;
			default :
				System.out.println("Invalid input");
			}
		}
	}

}
