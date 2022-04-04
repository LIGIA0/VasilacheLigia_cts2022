package clase;
import clase.MijlocTransport;


public interface Fabrica {
    public abstract MijlocTransport getMijlocTransport(String nrInmatriculare);
}

