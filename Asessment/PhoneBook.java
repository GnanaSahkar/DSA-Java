package Asessment;

import java.util.*;

public class PhoneBook {
    public static Set<Contact> contactSet = new HashSet<Contact>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Phone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addContact() {
        System.out.println("Enter name:");
        String name = System.console().readLine();
        System.out.println("Enter phone number:");
        String phoneNumber = System.console().readLine();

        Contact contact = new Contact(name, phoneNumber);
        contactSet.add(contact);
        System.out.println("Contact added successfully!");
    }

    public static void searchContact() {
        System.out.println("Enter name to search:");
        String name = System.console().readLine();

        for (Contact contact : contactSet) {
            if (contact.getName().equals(name)) {
                System.out.println("Contact found: " + contact.getPhoneNumber());
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public static void updateContact() {
        System.out.println("Enter name to update:");
        String name = System.console().readLine();

        for (Contact contact : contactSet) {
            if (contact.getName().equals(name)) {
                System.out.println("Enter new phone number:");
                String newPhoneNumber = System.console().readLine();
                contact.setPhoneNumber(newPhoneNumber);
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public static void deleteContact() {
        System.out.println("Enter name to delete:");
        String name = System.console().readLine();

        for (Contact contact : contactSet) {
            if (contact.getName().equals(name)) {
                contactSet.remove(contact);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}