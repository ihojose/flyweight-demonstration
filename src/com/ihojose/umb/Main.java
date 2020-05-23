package com.ihojose.umb;

import com.ihojose.umb.objects.MacBookAir;

public class Main {

    public static void main(String[] args) {

        // Sin Flyweight
        MacBookAir m1 = new MacBookAir("1", 4, 128);
        MacBookAir m2 = new MacBookAir("2", 4, 128);
        MacBookAir m3 = new MacBookAir("3", 8, 256);
        MacBookAir m4 = new MacBookAir("4", 8, 256);
        MacBookAir m5 = new MacBookAir("5", 12, 512);
        MacBookAir m6 = new MacBookAir("6", 12, 512);
        MacBookAir m7 = new MacBookAir("7", 12, 512);
        MacBookAir m8 = new MacBookAir("8", 12, 512);
    }
}
