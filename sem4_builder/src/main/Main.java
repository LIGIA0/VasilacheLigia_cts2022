package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args){
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumarInmatriculare("b-numar");
        autobuzBuilder.setOprireCapatLinie(Boolean.FALSE);
        autobuzBuilder.setNumarLocuri(80);
      Autobuz autobuz = new AutobuzBuilder().setOpenDoors(true).build();
      Autobuz autobuz1 = autobuzBuilder.build();
      System.out.println(autobuz);
      System.out.println(autobuz1);
    }
}
