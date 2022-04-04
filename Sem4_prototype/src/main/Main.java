package main;
import clase.MijlocTransport;
import clase.Fabrica;
import clase.FabricaAutobuz;
import clase.FabricaTramvai;
import clase.FabricaTroleibuz;

public class Main {

    public static void afisareMijlocTransport(Fabrica fabrica, String nrInmatriculare){
        MijlocTransport mijlocTransport = fabrica.getMijlocTransport(nrInmatriculare);
        mijlocTransport.afiseazaDescriere();
    }

    public static void main(String[] args) {
        afisareMijlocTransport(new FabricaAutobuz(), "B 100 AAA");
        MijlocTransport troleibuz = new FabricaTroleibuz().getMijlocTransport("B100000");
        troleibuz.afiseazaDescriere();

        new FabricaTramvai().getMijlocTransport("B 200000").afiseazaDescriere();
    }
}
