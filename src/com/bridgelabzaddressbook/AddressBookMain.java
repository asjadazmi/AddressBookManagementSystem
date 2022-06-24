package com.bridgelabzaddressbook;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("welcome to the address book problem");
		AddressBookService.addContact();
		AddressBookService.editContact();
		AddressBookService.display();
	}
}