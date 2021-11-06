package de.telran;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Grisha", "Schustrik", 21, 1);
        Student studentca = new Student("Maria", "Bombacika", 19, 2);
        Student studentische = new Student("Aliosha", "Trubacist", 20, 3);
        Student studentic = new Student("Prinparc", "Trasa", 20, 4);
        Student st = new Student("Dwein", "Kratik", 19, 5);

        StudentsWithStipendy hama = new StudentsWithStipendy("Masha", "Pupok", 20, 6, 500);
        StudentsWithStipendy hama1 = new StudentsWithStipendy("Petea", "Pupokin", 21, 7, 700);
        StudentsWithStipendy hama2 = new StudentsWithStipendy("Misha", "Pupokacia", 22, 8, 400);
        StudentsWithStipendy hama3 = new StudentsWithStipendy("Tristan", "Pupokinoia", 19, 9, 600);
        StudentsWithStipendy hama4 = new StudentsWithStipendy("Gari", "Supoka", 18, 10, 550);

        NewStudents bumbum = new NewStudents("Badi", "Trotykii", "America", 20);
        NewStudents bumbum1 = new NewStudents("Denis", "Trambo", "Japon", 19);
        NewStudents bumbum2 = new NewStudents("Cristina", "Taras", "France", 21);
        NewStudents bumbum3 = new NewStudents("Tolea", "Koki", "Greace", 22);
        NewStudents bumbum4 = new NewStudents("Mark", "Tuleai", "India", 18);

        student.introduce();
        studentca.introduce();
        studentische.introduce();
        studentic.introduce();
        st.introduce();

        System.out.println();

        hama.introducere();
        hama1.introducere();
        hama2.introducere();
        hama3.introducere();
        hama4.introducere();

        System.out.println();
        bumbum.introdu();
        bumbum1.introdu();
        bumbum2.introdu();
        bumbum3.introdu();
        bumbum4.introdu();

    }
}
