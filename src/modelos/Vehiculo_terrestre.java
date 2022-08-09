/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author james
 */
public class Vehiculo_terrestre extends Vehiculo{
    private int nollantas,noasientos;
    private String transmicion;

    public Vehiculo_terrestre(int nollantas, int noasientos, String transmicion, String forma, String tamanio, String material, String color, String anio, String marca, String tipodemotor, String pasajeros) {
        super(forma, tamanio, material, color, anio, marca, tipodemotor, pasajeros);
        this.nollantas = nollantas;
        this.noasientos = noasientos;
        this.transmicion = transmicion;
    }

    public int getNollantas() {
        return nollantas;
    }

    public void setNollantas(int nollantas) {
        this.nollantas = nollantas;
    }

    public int getNoasientos() {
        return noasientos;
    }

    public void setNoasientos(int noasientos) {
        this.noasientos = noasientos;
    }

    public String getTransmicion() {
        return transmicion;
    }

    public void setTransmicion(String transmicion) {
        this.transmicion = transmicion;
    }
    
}
