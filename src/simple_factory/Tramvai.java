package simple_factory;

public class Tramvai extends MijlocTransport{
    public Tramvai(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append('}');
        return sb.toString();
    }
}
