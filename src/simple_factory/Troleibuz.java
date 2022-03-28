package simple_factory;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append('}');
        return sb.toString();
    }
}
