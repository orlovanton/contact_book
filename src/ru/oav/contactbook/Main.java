package ru.oav.contactbook;

/**
 * Created by antonorlov on 18/11/16.
 */
public class Main {

    public static void main(String[] args) {
        Contact anton = new Contact();
        anton.name="Anton";
        anton.lastName="Orlov";
        anton.number="+79219518963";

        System.out.println(anton);
    }
}
