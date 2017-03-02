package ru.oav.contactbook;
/**
 * Created by antonorlov on 18/11/16.
 */
public class Contact {

    public Contact() {
    }

    public Contact(String name,
                   String lastName,
                   String number){
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }

    public String name;
    public String lastName;
    public String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contact{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
