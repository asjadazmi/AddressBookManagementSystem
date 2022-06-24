package com.bridgelabzaddressbook;

import java.util.ArrayList;
import java.util.Scanner;



public class AddressBookService {
	static Scanner sc=new Scanner(System.in);
	public static ArrayList<Contacts> arrayOfContacts = new ArrayList<Contacts>();
	public static void addContact() {
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
	    arrayOfContacts.add(contact);
	    
	}
	
	public static int edit(String name) {
		for(Contacts contact : arrayOfContacts) {
			if(name.compareToIgnoreCase(contact.getFirst_name())==0){
				return arrayOfContacts.indexOf(contact);
			}
		}
		return -1;
	}
	
	public static void editContact() {
		System.out.println("please enter the name which you want to edit");
		String name=sc.next();
		int choice=edit(name);
		
		if(choice==-1) {
			System.out.println("No such contact are found ");
			
		}else {
			System.out.println("contact found please edit your contact");
			addContact();
		}
		
		
		
	}
	public static int delete(String name) {
		for(Contacts contact : arrayOfContacts) {
			if(name.compareToIgnoreCase(contact.getFirst_name())==0){
				return arrayOfContacts.indexOf(contact);
			}
		}
		return -1;
	}
	public static void deleteContact() {
		System.out.println("please enter the name which you want to delete");
		String name=sc.next();
		int choice=delete(name);
		
		if(choice == -1) {
			System.out.println("No such contact are found ");
			
		}else {
			 
			arrayOfContacts.remove(choice);
			System.out.println("contact deleted successfully!!");
		}
		
	}
	  public static void display()
	    {

	        for(Contacts contact : arrayOfContacts)
	        {
	            System.out.println(contact);
	        }
	    }
}
