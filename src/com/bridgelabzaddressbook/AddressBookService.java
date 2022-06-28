package com.bridgelabzaddressbook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class AddressBookService {
	static Scanner sc=new Scanner(System.in);
	public static HashSet<Contacts> addressBookMang=new HashSet<Contacts>();
//	 static List<Contacts> arrayOfContacts = new ArrayList<Contacts>();
	public static Contacts addContact() {
		System.out.println("Please enter your first name :");
	    String first_name = sc.next();
	    System.out.println("Please enter your last name :");
	    String last_name = sc.next();
	    sc.nextLine();
	    System.out.println("Please enter your Address :");
	    String Address = sc.nextLine();
	    System.out.println("Please enter your city :");
	    String city = sc.next();
	    System.out.println("Please enter your state :");
	    String state = sc.next();
	    System.out.println("enter the zip");
	    int zip=sc.nextInt();
	    System.out.println("Please enter your phone number :");
	    long phone_number = sc.nextLong();
	    System.out.println("Please enter your email id :");
	    String email = sc.next();
	    Contacts contact=new Contacts(first_name,last_name,Address,city,state,zip,phone_number,email);
//	    arrayOfContacts.add(contact);
		return contact;
	}
	public static void addContacts() {
		System.out.println("how many contact you want to add");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Contacts con=addContact();
			if(!addressBookMang.add(con)) {
				System.out.println("name already exists");
				i--;
				continue;
			}
			System.out.println();
		}
	}
	public Contacts findContacts() {
		System.out.print(" Please enter the first name: ");
        String firstName = sc.next();

        for (Contacts contact : addressBookMang) {
            if (firstName.compareToIgnoreCase(contact.getFirst_name()) == 0) {
                return contact;
            }
        }

        return null;
		
	}
	
	public  void editContact() {
		
		Contacts contact = findContacts();

        if (contact == null) {
            System.out.println(" ERROR: No such contact");
            return;
        }

        System.out.println(" Contact found! Please enter new details of the contact");
        addressBookMang.remove(contact);
        addressBookMang.add(addContact());

    }
		
		

	public void deleteContact() {
		Contacts contact = findContacts();

        if (contact == null) {
            System.out.println(" not found ");
            return;
        }

        addressBookMang.remove(contact);
        System.out.println(" Contact deleted succesfully");
	
		
	}
	  public static void display()
	    {

	        for(Contacts contact : addressBookMang)
	        {
	            System.out.println(contact);
	        }
	    }
	
}
