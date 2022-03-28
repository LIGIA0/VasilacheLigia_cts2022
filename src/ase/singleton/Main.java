package ase.singleton;
import ase.*;
import simple_factory.Autobuz;
import simple_factory.*;
import simple_factory.FabricaMijlocTransport;
import simple_factory.MijlocTransport;
import simple_factory.TipMijlocTransport;

public class Main {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstanta();
        Singleton s2 = Singleton.getInstanta();
        System.out.println(s1);
        System.out.println(s2);


        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.AUTOBUZ, "1");
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.TRAMVAI, "2");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.TROLEIBUZ, "3");

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());

    }
}
