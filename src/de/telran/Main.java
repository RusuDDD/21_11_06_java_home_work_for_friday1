package de.telran;

public class Main {

    public static void main(String[] args) {

        Student gs1 = new Student("Grisha", "Schustrik", "Estonia", 20 ,1 ,150);
        Student studentca = new Student("Maria", "Bombacika","Russia" , 19, 2,175 );
        Student studentische = new Student("Aliosha", "Trubacist", "Romania", 20 ,3, 125);
        Student studentic = new Student("Prinparc", "Trasa", "Moldova" ,20 , 4 ,135);
        Student st = new Student("Dwein", "Kratik", "Columbia", 19 ,5,145);

        Student hama = new Student("Masha", "Pupok", "Peru", 20, 6,500);
        Student hama1 = new Student("Petea", "Pupokin", "Spane", 21,7, 700);
        Student hama2 = new Student("Misha", "Pupokacia", "Cipru", 22,8, 800);
        Student hama3 = new Student("Tristan", "Pupokinoia", "Amsterdam", 19, 9,600);
        Student hama4 = new Student("Gari", "Supoka", "Belgia", 18, 10,590);

        Student bumbum = new Student("Badi", "Trotykii", "America", 20,11 ,250);
        Student bumbum1 = new Student("Denis", "Trambo", "Japon", 19, 12, 255);
        Student bumbum2 = new Student("Cristina", "Taras", "France", 21 , 13,265);
        Student bumbum3 = new Student("Tolea", "Koki", "Greece", 22, 14 ,270);
        Student bumbum4 = new Student("Mark", "Tuleai", "India", 18, 15, 300);

        gs1.introduce();
        studentca.introduce();
        studentische.introduce();
        studentic.introduce();
        st.introduce();

        System.out.println();

        hama.introduce();
        hama1.introduce();
        hama2.introduce();
        hama3.introduce();
        hama4.introduce();

        System.out.println();
        bumbum.introduce();
        bumbum1.introduce();
        bumbum2.introduce();
        bumbum3.introduce();
        bumbum4.introduce();

    }
}
