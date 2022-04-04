package clase;
import clase.MijlocTransport;
import clase.Tramvai;

public class FabricaTramvai implements Fabrica{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}