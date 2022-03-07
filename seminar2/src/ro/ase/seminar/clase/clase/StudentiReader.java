package ro.ase.seminar.clase.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends IReader{
    public StudentiReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicant(String file) throws FileNotFoundException {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (super.scanner.hasNext()) {
            Student student=new Student();
            ReadAplicant(super.scanner,student);
            student.setAn_studii(super.scanner.nextInt());
            student.setFacultate(super.scanner.next());
            studenti.add(student);
        }
        super.scanner.close();
        return studenti;
    }
}
