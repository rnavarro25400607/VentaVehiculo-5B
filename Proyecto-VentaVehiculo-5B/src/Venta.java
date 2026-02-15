/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruben
 */
public class Venta {

    private int cantidad;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public static void main(String[] args) {

        Cliente cliente = new Cliente("rrr", "t5ee ", " efgeg");
        Vehiculo vehiculo = new Vehiculo("egefd", 0, "enjsnk ");
    }

    public Venta(int cantidad, Vehiculo vehiculo, Cliente cliente) {
        this.cantidad = cantidad;
        this.vehiculo = vehiculo;
        this.cliente = cliente;

    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = "La venta = " + this.cantidad + "\n"
                + "del vehiculo = " + this.vehiculo + "\n"
                + "al cliente = " + this.cliente + "\n";

        return cadena;
    }
}
