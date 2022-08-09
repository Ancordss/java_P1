/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author james
 */
public class avion extends Vehiculo_aereo {
    private String ala,turbina,estabilizadores,helice;

    public avion(String ala, String turbina, String estabilizadores, String helice, String frenos_aerodinamicos, String Slats, String Alerones, String MotoP, String TrenDeAterrizaje, String forma, String tamanio, String material, String color, String anio, String marca, String tipodemotor, String pasajeros) {
        super(frenos_aerodinamicos, Slats, Alerones, MotoP, TrenDeAterrizaje, forma, tamanio, material, color, anio, marca, tipodemotor, pasajeros);
        this.ala = ala;
        this.turbina = turbina;
        this.estabilizadores = estabilizadores;
        this.helice = helice;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public String getTurbina() {
        return turbina;
    }

    public void setTurbina(String turbina) {
        this.turbina = turbina;
    }

    public String getEstabilizadores() {
        return estabilizadores;
    }

    public void setEstabilizadores(String estabilizadores) {
        this.estabilizadores = estabilizadores;
    }

    public String getHelice() {
        return helice;
    }

    public void setHelice(String helice) {
        this.helice = helice;
    }
    
    
    
}
