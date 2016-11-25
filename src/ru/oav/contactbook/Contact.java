package ru.oav.contactbook;

/**
 * Created by antonorlov on 18/11/16.
 */
public class Contact {

    public Contact() {
    }

    public Contact(String name, String lastName, String number) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }

    public String name;
    public String lastName;
    public String number;
    public String comment;

    public String toString() {
        String srt = "";

        srt += name == null ? "" : name + " ";
        srt += lastName == null ? "" : lastName + " ";
        srt += number == null ? "" : number + " ";
        srt += comment == null ? "" : comment + " ";

        return srt;
    }


//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Contact{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", lastName='").append(lastName).append('\'');
//        sb.append(", number='").append(number).append('\'');
//        sb.append(", comment='").append(comment).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
}
