package de.telran;

public class NewStudents {

    String name;
    String surname;
    String country;
    int age;

    public NewStudents(String name, String surname, String country, int age) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
    }

    void introdu() {
        System.out.println("This is " + " " + name + " " + surname + " " + " is from" + " " + country + " " + "is" + " " + age + " " + "years old");
    }
}
