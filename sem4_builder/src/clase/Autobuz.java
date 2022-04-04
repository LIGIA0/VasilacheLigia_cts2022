package clase;

public class Autobuz {
    private String numeSofer;
    private String numarInmatriculare;
    private String numarLinie;
    private Boolean openDoors;
    private Boolean oprireCapatLinie;
    private String textulDerulat;
    private int numarLocuri;

     Autobuz() {
        this.numeSofer = "numeSofer";
        this.numarInmatriculare = "123";
        this.numarLinie = "2";
        this.openDoors = Boolean.TRUE;
        this.oprireCapatLinie = Boolean.TRUE;
        this.textulDerulat = "textulDerulat";
        this.numarLocuri = 20;
    }

     String getNumeSofer() {
        return numeSofer;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     String getNumarInmatriculare() {
        return numarInmatriculare;
    }

     void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

     String getNumarLinie() {
        return numarLinie;
    }

     void setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
    }

     Boolean getOpenDoors() {
        return openDoors;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     Boolean getOprireCapatLinie() {
        return oprireCapatLinie;
    }

     void setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

     String getTextulDerulat() {
        return textulDerulat;
    }

    public void setTextulDerulat(String textulDerulat) {
        this.textulDerulat = textulDerulat;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append(", numarLinie='").append(numarLinie).append('\'');
        sb.append(", openDoors=").append(openDoors);
        sb.append(", oprireCapatLinie=").append(oprireCapatLinie);
        sb.append(", textulDerulat='").append(textulDerulat).append('\'');
        sb.append(", numarLocuri=").append(numarLocuri);
        sb.append('}');
        return sb.toString();
    }

}
