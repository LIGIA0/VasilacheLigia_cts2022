package ro.ase.dice.main;

import ro.ase.dice.clase.Elefant;
import ro.ase.dice.clase.IngrijitorZOO;
import ro.ase.dice.clase.ZOO;
import ro.ase.dice.clase.Zebra;

import java.util.List;

public class Main {
    public static void main(String[] args){
        IngrijitorZOO ingrijitor=new IngrijitorZOO("Ligia");
        Zebra z1=new Zebra("Elena");
        Zebra z2=new Zebra("Alex");

        Elefant e1=new Elefant("Alexandra");
        Elefant e2=new Elefant("Mihai");

        ZOO zoo=new ZOO("Bucuresti Zoo",ingrijitor);
        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(e1);
        zoo.adaugaAnimal(e2);

        zoo.hranesteAnimale("banane");
    }
}
