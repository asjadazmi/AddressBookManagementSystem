package com.bridgelabzaddressbook;

import java.util.Scanner;



public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("welcome to the address book problem");
		
		Scanner sc =new Scanner(System.in);
		int option;
		while(true) {
			System.out.println("what operation you want perform\n 1)Add Contact\n 2)edit contact\n 3)delete\n4)Display contact");
			option =sc.nextInt();
			switch(option) {
			case 1:
				AddressBookService.addContacts();
				break;
			case 2:
				AddressBookService.editContact();
				break;
			case 3:
				AddressBookService.deleteContact();
				break;
			case 4:
				AddressBookService.display();
				break;
			default:
				System.out.println("please enter the correct option");
			}
			
		System.out.println("please keep visiting my website");
		}
		
		
	}}


