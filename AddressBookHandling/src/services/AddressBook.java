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
	/**
	 * This method finds person according to first name and change its field according to user input
	 */
	private void edit() {
		String enteredName;
		System.out.println("Enter First name of contact to edit it ");
		enteredName=sc.next();
		for(int i=0;i<personList.size();i++)
		{
			if(personList.get(i).getFirstName().equals(enteredName))
			{
				int check=0;
				System.out.println("Person found , what do you want to edit ?");
				System.out.println("Enter\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
				check=sc.nextInt();
				switch(check) {
				case 1:
					System.out.println("Enter new first name");
					personList.get(i).setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter new last name");
					personList.get(i).setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter new Address");
					personList.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter new city");
					personList.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter new state");
					personList.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter new zip");
					personList.get(i).setZip(sc.nextInt());
					break;
				case 7:
					System.out.println("Enter new phone number");
					personList.get(i).setPhone(sc.nextLong());
					break;
				case 8:
					System.out.println("Enter new email");
					personList.get(i).setEmail(sc.next());
					break;
				default :
					System.out.println("Invalid Entry");
						
				}
			}
		}
		
		
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
			case 2:
				book.edit();
			default :
				System.out.println("Invalid input");
			}
		}
	}

}
