package simple_factory;

import javax.print.DocFlavor;

public class FabricaMijlocTransport {
    public static MijlocTransport getMijlocTransport(TipMijlocTransport tipMijlocTransport, String numarInmatriculare){
        switch (tipMijlocTransport){
            case TRAMVAI:
                return new Tramvai(numarInmatriculare);
            case AUTOBUZ:
                return new Autobuz(numarInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(numarInmatriculare);
            default:
                return null;
        }
    }
}
