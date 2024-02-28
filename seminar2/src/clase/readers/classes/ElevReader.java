package clase.readers.classes;

import clase.Aplicant;
import clase.Elev;
import clase.Student;
import clase.readers.interfaces.ApplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends ApplicantReader {
    public ElevReader(String fileName) {
        super(fileName);
    }

    public  List<Aplicant> read() throws FileNotFoundException, NumberFormatException {
    Scanner scanner = new Scanner(new File(super.fileName));
    scanner.useDelimiter(",|\n");
    List<Aplicant> elevi = new ArrayList<Aplicant>();

    while (scanner.hasNext()) {
        String nume = scanner.next();
        String prenume = (scanner.next()).toString();
        int varsta = Integer.valueOf(scanner.nextInt());
        int punctaj = Integer.valueOf(scanner.nextInt());
        int nr = Integer.valueOf(scanner.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        int an_studii = scanner.nextInt();
        String facultate = (scanner.next()).toString();
        Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
        elevi.add(s);
    }
    scanner.close();
    return elevi;
}
}
