package controller;

import model.*;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Spelen in het meetkundedomein.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        int integer1 = 3;
        Integer integer2 = Integer.valueOf(3);
        Integer integer3 = 3;
        int integer4 = Integer.valueOf(3);

        Oppervlak oppervlak2 = new Oppervlak(10, 7);
        oppervlak2.voegFiguurToe(new Rechthoek(4, 3, new Punt(0, 7), "rood"));
        oppervlak2.voegFiguurToe(new Cirkel(4, new Punt(1.5, 1.5), "geel"));
        oppervlak2.voegFiguurToe(new Rechthoek(9, 8, new Punt(3, 2), "groen"));
        oppervlak2.voegFiguurToe(new Rechthoek(4, 1, new Punt(5, 7), "oranje"));
        oppervlak2.voegFiguurToe(new Cirkel(2, new Punt(8, 5), "paars"));
        oppervlak2.voegFiguurToe(new Rechthoek(11, 3, new Punt(5, 3), "blauw"));
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

    public static void toonInformatieAlleFiguren(ArrayList<Figuur> figuren) {
        for (Figuur figuur : figuren) {
            toonInformatie(figuur);
        }
    }

}
