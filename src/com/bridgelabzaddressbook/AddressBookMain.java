package com.bridgelabzaddressbook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("welcome to the address book problem");
		AddressBookHash addressBookser=new AddressBookHash();
		Scanner sc =new Scanner(System.in);
		int option;
		while(true) {
			System.out.println("what operation you want perform\n 1)Add AddressBook\n 2)edit contact\n 3)delete\n4)Display contact\n5) add contact\n5) search by city");
			option =sc.nextInt();
			switch(option) {
			case 1:
				addressBookser.addAddressBook();
				break;
			case 2:
				addressBookser.editContact();
				break;
			case 3:
				addressBookser.deleteContact();
				break;
			case 4:
				addressBookser.display();
				break;
			case 5:
				addressBookser.addContact();
			case 6:
			    System.out.print(" please enter the name of person ");
                String name = sc.next();
                System.out.print(" enter to search by city: ");
                String City = sc.next();
                System.out.println("please enter state");
                String state=sc.next();
                addressBookser.find(name, state, City);
			default:
				System.out.println("please enter the correct option");
			}
			
		System.out.println("please keep visiting my website");
		}
		
		
	}}


