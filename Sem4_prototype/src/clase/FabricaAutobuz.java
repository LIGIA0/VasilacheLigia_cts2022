package clase;
import clase.Autobuz;
import clase.MijlocTransport;

public class FabricaAutobuz implements Fabrica{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
