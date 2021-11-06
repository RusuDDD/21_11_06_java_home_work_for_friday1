package de.telran;

public class StudentsWithStipendy {

    String name;
    String surname;
    int age;
    int number;
    int stipendy;

    public StudentsWithStipendy(String name, String surname, int age, int number, int stipendy) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
        this.stipendy = stipendy;
    }

    void introducere() {
        System.out.println("This is" + " " + name + " " + surname + " " + "and is" + " " + age + " " + "years old" + " " + "with number" + " " + number + " " + "with" + " " + stipendy);

    }
}
