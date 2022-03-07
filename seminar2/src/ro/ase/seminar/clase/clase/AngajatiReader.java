package ro.ase.seminar.clase.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends IReader{
    public AngajatiReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicant() throws FileNotFoundException {
        super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (super.scanner.hasNext()) {
           Angajat angajat = new Angajat();
            ReadAplicant(super.scanner,angajat);
           angajat.setSalariu(super.scanner.nextInt());
           angajat.setOcupatie(super.scanner.next());
           angajati.add(angajat);
        }
        super.scanner.close();
        return angajati;
    }
}
