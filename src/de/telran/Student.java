package de.telran;

public class Student {

    String name;
    String surname;
    int age;
    int number;

    public Student(String name, String surname, int age, int number) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
    }

    void introduce() {
        System.out.println("This is " + name + " " + surname + " " + "and is" + " " + age + " " + "years old" + " " + "with number" + " " + number);
    }
}
