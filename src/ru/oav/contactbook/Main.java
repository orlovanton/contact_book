package ru.oav.contactbook;

import java.util.Scanner;

/**
 * Created by antonorlov on 18/11/16.
 */
public class Main {

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Scanner scanner = new Scanner(System.in);
        showMenu();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("1")) {
                for (Contact contact : contactBook.getContacts()) {
                    System.out.println(contact.name + " "
                            + contact.lastName + "\n"
                            + contact.number);

                    System.out.println("-----------");
                }
            } else if (line.equals("3")) {
                System.out.println("Завершение работы...");
                System.exit(0);
            } else if (line.equals("2")) {
                addContact(contactBook);
                showMenu();
            } else {
                System.out.println("Неизвестная команда... \nЗавершение работы...");
                System.exit(0);
            }
        }
    }

    private static void addContact(ContactBook book) {
        Scanner scanner = new Scanner(System.in);

        Contact contact = new Contact();

        System.out.println("Введите имя");
        String line = scanner.nextLine();
        contact.name = line;

        System.out.println("Введите фамилию");
        line = scanner.nextLine();
        contact.lastName = line;

        System.out.println("Введите телефон");

        line = scanner.nextLine();
        contact.number = line;

        book.addContact(contact);

        System.out.println("---------------");
        System.out.println("Контакт добавлен");
        System.out.println("---------------");
    }

    private static void showMenu() {
        System.out.print("Телефонная книга \n");
        System.out.println("Команды: \n");
        System.out.print("1.Все контакты \n");
        System.out.print("2.Добавить контакт\n");
        System.out.print("3.Выход \n");
    }
}
