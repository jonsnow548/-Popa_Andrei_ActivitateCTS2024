package sustinereExamen.main;

import sustinereExamen.classes.Student;
import sustinereExamen.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {

        Student student1=new Student(1,"Andrei","andrei@yahoo.com",3);
        Student student2=new Student(2,"Carla","carla@yahoo.com",3);
        Student student3=new Student(3,"Razvan","razvan@yahoo.com",3);
        Student student4=new Student(4,"Sabin","sabin@yahoo.com",3);


        SustinereExamen examenPOO= new SustinereExamen("Examen POO");
        SustinereExamen examenCTS= new SustinereExamen("Examen CTS");

        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student2);
        examenPOO.inregistrareStudent(student1);
        examenPOO.inregistrareStudent(student3);
        examenPOO.inregistrareStudent(student4);




    }
}
