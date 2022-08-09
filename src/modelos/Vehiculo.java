/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author james
 */
public class Vehiculo {
    private String forma,tamanio,material,color,anio,marca,tipodemotor,pasajeros;

    public Vehiculo(String forma, String tamanio, String material, String color, String anio, String marca, String tipodemotor, String pasajeros) {
        this.forma = forma;
        this.tamanio = tamanio;
        this.material = material;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
        this.tipodemotor = tipodemotor;
        this.pasajeros = pasajeros;
    }

  

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipodemotor() {
        return tipodemotor;
    }

    public void setTipodemotor(String tipodemotor) {
        this.tipodemotor = tipodemotor;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    


  
    
}
