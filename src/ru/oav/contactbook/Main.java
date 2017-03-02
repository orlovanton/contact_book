package ru.oav.contactbook;

import java.util.List;
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
                printContacts(contactBook);
            } else if (line.equals("4")) {
                System.out.println("Завершение работы...");
                System.exit(0);
            } else if (line.equals("3")) {
                System.out.println("Выберите контакт для удаления");
                printContacts(contactBook);
                System.out.println("Для отмены введите 0");
                String index = scanner.nextLine();
                if (!index.equals("0")) {
                    Integer integer = Integer.valueOf(index);
                    contactBook.deleteContact(integer - 1);
                }
                showMenu();
            } else if (line.equals("2")) {
                addContact(contactBook);
                showMenu();
            } else {
                System.out.println("Неизвестная команда... \nЗавершение работы...");
                System.exit(0);
            }
        }
    }

    /**
     * Печатаем все контакты
     * @param contactBook
     */
    public static void printContacts(ContactBook contactBook) {
        List<Contact> contacts = contactBook.getContacts();
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println(i + 1 + " - " + contact.name + " "
                    + contact.lastName + "\n"
                    + contact.number);
            System.out.println("-----------");
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
        System.out.print("3.Удалить контакт\n");
        System.out.print("4.Выход \n");
    }
}
