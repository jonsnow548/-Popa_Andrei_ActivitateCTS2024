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

import static jdk.internal.org.jline.utils.Colors.s;

public class StudentReader extends ApplicantReader {
    public StudentReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(this.fileName));
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(scanner, elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}
