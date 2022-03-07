package ro.ase.seminar.clase.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends IReader{
    public EleviReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicant() throws FileNotFoundException {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (super.scanner.hasNext()) {
            Elev elev = new Elev();
            ReadAplicant(super.scanner,elev);
            elev.setClasa(super.scanner.nextInt());
            elev.setTutore(super.scanner.next());
            elevi.add(elev);
        }

        super.scanner.close();
        return elevi;
    }
}
