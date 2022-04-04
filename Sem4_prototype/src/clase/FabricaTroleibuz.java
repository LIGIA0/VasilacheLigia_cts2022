package clase;
import clase.MijlocTransport;
import clase.Troleibuz;

public class FabricaTroleibuz implements Fabrica{

    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
