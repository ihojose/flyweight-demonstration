package com.ihojose.umb;

import com.ihojose.umb.flyweight.FactoriaMacs;
import com.ihojose.umb.flyweight.MacBookAir;

public class Flyweight {

    public static void main(String[] args) {
        MacBookAir m1 = FactoriaMacs.crearMacBookAir("1", 4, 128);
        MacBookAir m2 = FactoriaMacs.crearMacBookAir("2", 4, 128);
        MacBookAir m3 = FactoriaMacs.crearMacBookAir("3", 8, 256);
        MacBookAir m4 = FactoriaMacs.crearMacBookAir("4", 8, 256);
        MacBookAir m5 = FactoriaMacs.crearMacBookAir("5", 12, 512);
        MacBookAir m6 = FactoriaMacs.crearMacBookAir("6", 12, 512);
        MacBookAir m7 = FactoriaMacs.crearMacBookAir("7", 12, 512);
        MacBookAir m8 = FactoriaMacs.crearMacBookAir("8", 12, 512);
        MacBookAir m9 = FactoriaMacs.crearMacBookAir("9", 4, 128);
    }
}
