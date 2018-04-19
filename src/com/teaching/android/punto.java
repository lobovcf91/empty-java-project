package com.teaching.android;

public class punto {

    // Atributos
    private int x;
    private int y;

    public punto (){

    }

    public punto (int px, int py) {
        x = px;
        y = py;
        System.out.println("creada formula" + x + "formula y" + y);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(int px, int py){
        int diferenciaX = px - x;
        int diferenciaY = py -y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);

        return resultado;

    }

    public double distancia(punto pdestino ) {
        int diferenciaX = pdestino.x - x;
        int diferenciaY = pdestino.y - y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);

        return resultado;
    }

    @Override
    public String toString() {
        return "punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
}
