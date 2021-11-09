package de.telran;

public class Student {

    String name;
    String surname;
    String country;
    int age;
    int number;
    int stipendy;

    public Student(String name, String surname, String country, int age, int number, int stipendy) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
        this.number = number;
        this.stipendy = stipendy;
    }

    public void introduce() {
        if (stipendy < 200)
            System.out.println("This is third class and" + " " + name + " " + surname + " " + "and is" + " " + age + " " + "years old" + " " + "with number" + " " + number + " " + "with" + " " + stipendy+" "+country);
        else if (stipendy > 500)
            System.out.println("This is first class and" + " " + name + " " + surname + " " + "and is" + " " + age + " " + "years old" + " " + "with number" + " " + number + " " + "with" + " " + stipendy+" "+country);
        else
        System.out.println("This is second third and" + " " + name + " " + surname + " " + "and is" + " " + age + " " + "years old" + " " + "with number" + " " + number + " " + "with" + " " + stipendy+" "+country);
    }
}
