package mobilephone;

import java.util.ArrayList;

public class MobilePhone {

	private static String myNumber;
	private static ArrayList<Contacts> mycontacts;
	public MobilePhone(String myNumber) {
		this.myNumber=myNumber;
		this.mycontacts=mycontacts;
	}
	public static boolean addNewContact(Contacts contact) {
		if(findContact(contact.getName())>=0) {
			mycontacts.add(contact);
			return true;
		}
		else {
			return false;
		}
	}
	private static int findContact(String name) {
		// TODO Auto-generated method stub
		int pos=0;
		for(int i=0;i<mycontacts.size();i++) {
			Contacts contacts=mycontacts.get(i);
			if(contacts.getName().equals(name))
			{
				pos=i;
			}
			pos=-1;
		}
		return pos;

	}
	public static boolean updateContact(Contacts oldcontact,Contacts newcontact) {
		int pos=findContact(oldcontact);
		if(pos>=0) {
			mycontacts.set(pos, newcontact);
			return true;
		}
		else
		{
		return false;
		}
	}
	public static boolean removeContact(Contacts contact) {
		int pos=findContact(contact);
		if(pos>=0) {
			mycontacts.remove(contact);
			return true;
		}
		else
		{
			return false;
		}
	}
	private static int findContact(Contacts contact) {
		return mycontacts.indexOf(contact);
	}
	public static Contacts queryContact(String name) {
		int pos=findContact(name);
		if(pos>=0) {
			return mycontacts.get(pos);
		}
		return null;
	}
	public static void printContacts() {
		System.out.println("Contact List:");
		for(int i=0;i<mycontacts.size();i++) {
			System.out.println(i+" "+mycontacts.get(i).getName()+ "-->"+mycontacts.get(i).getPhoneNumber());
		}
	}
}
