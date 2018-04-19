package com.teaching.android;

public class persona {

    private String nombre;
    private float dinero;

    public persona(String pnombre, float pdinero) {
        nombre = pnombre;
        dinero = pdinero;
    System.out.println("Creada persona con nombre" + nombre + "y dinero" + dinero);

    }

    public void pagar(persona quienpaga, float cantidad) {
        this.dinero = this.dinero + cantidad;
        quienpaga.dinero = quienpaga.dinero - cantidad;
        System.out.println(quienpaga.nombre + "pagar 100" + this.nombre + "pagar 400");

    }

    public String getNombre() {
        return nombre;

    }

    public float getDinero() {
        return dinero;
    }
}
