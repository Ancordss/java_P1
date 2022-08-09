/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author james
 */
public class helicopter extends Vehiculo_aereo{
    private String rotor,pala,resistencia,pedal,helice;

    public helicopter(String rotor, String pala, String resistencia, String pedal, String helice, String frenos_aerodinamicos, String Slats, String Alerones, String MotoP, String TrenDeAterrizaje, String forma, String tamanio, String material, String color, String anio, String marca, String tipodemotor, String pasajeros) {
        super(frenos_aerodinamicos, Slats, Alerones, MotoP, TrenDeAterrizaje, forma, tamanio, material, color, anio, marca, tipodemotor, pasajeros);
        this.rotor = rotor;
        this.pala = pala;
        this.resistencia = resistencia;
        this.pedal = pedal;
        this.helice = helice;
    }

    public String getRotor() {
        return rotor;
    }

    public void setRotor(String rotor) {
        this.rotor = rotor;
    }

    public String getPala() {
        return pala;
    }

    public void setPala(String pala) {
        this.pala = pala;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public String getPedal() {
        return pedal;
    }

    public void setPedal(String pedal) {
        this.pedal = pedal;
    }

    public String getHelice() {
        return helice;
    }

    public void setHelice(String helice) {
        this.helice = helice;
    }
    
    
    
}
