package com.ihojose.umb.flyweight;

public class MacBookAirFlyweight implements MacBookAir {
    private String id;
    private MacLigero macLigero;

    public MacBookAirFlyweight(String id, MacLigero macLigero) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getRam() {
        return macLigero.getRam();
    }

    @Override
    public int getDisco() {
        return macLigero.getDisco();
    }
}
