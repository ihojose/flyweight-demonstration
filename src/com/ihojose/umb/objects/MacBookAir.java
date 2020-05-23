package com.ihojose.umb.objects;

public class MacBookAir {
    private String id;
    private int ram;
    private int disco;
    private static int contador;

    public MacBookAir(String id, int ram, int disco) {
        this.id = id;
        this.ram = ram;
        this.disco = disco;

        contador++;
        System.out.println("ram: " + ram + ", disco: " + disco);
        System.out.println("creando datos en memoria: " + contador);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        MacBookAir.contador = contador;
    }
}
