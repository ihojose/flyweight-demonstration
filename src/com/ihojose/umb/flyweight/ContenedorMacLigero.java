package com.ihojose.umb.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ContenedorMacLigero {

    private static final Map<String, MacLigero> macLigeros = new HashMap<>();

    public static MacLigero getMacLigero(int ram, int disco) {
        String clave = "ram: " + ram + ", disco: " + disco;

        System.out.println(clave);

        if (!macLigeros.containsKey(clave)) {
            macLigeros.put(clave, new MacLigero(ram, disco));
        }

        return macLigeros.get(clave);
    }
}
