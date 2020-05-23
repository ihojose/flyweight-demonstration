package com.ihojose.umb.flyweight;

public class FactoriaMacs {

    public static MacBookAir crearMacBookAir(String id, int ram, int disco) {
        MacLigero macLigero = ContenedorMacLigero.getMacLigero(ram, disco);

        return new MacBookAirFlyweight(id, macLigero);
    }
}
