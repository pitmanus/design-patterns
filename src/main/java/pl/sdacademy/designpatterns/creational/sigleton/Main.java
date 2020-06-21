package pl.sdacademy.designpatterns.creational.sigleton;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        LocalDate d;
        UniverseV1 universeV1 = UniverseV1.INSTANCE;
        UniverseV2 universeV2 = UniverseV2.getInstance ();
        UniverseV3 universeV3 = UniverseV3.getInstance ();
        UniverseV4 universeV4 = UniverseV4.getInstance ();

        System.out.println (universeV3==UniverseV3.getInstance ());
        System.out.println (universeV4==UniverseV4.getInstance ());
    }
}
