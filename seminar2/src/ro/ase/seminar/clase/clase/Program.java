package ro.ase.seminar.clase.clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			IReader angajatiReader = new AngajatiReader("angajati.txt");

			listaAngajati = angajatiReader.readAplicant();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString()); //liscof
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
