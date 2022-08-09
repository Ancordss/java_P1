/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author james
 */
public class Vehiculo_aereo extends Vehiculo{
    private String frenos_aerodinamicos,Slats,Alerones,MotoP,TrenDeAterrizaje;

    public Vehiculo_aereo(String frenos_aerodinamicos, String Slats, String Alerones, String MotoP, String TrenDeAterrizaje, String forma, String tamanio, String material, String color, String anio, String marca, String tipodemotor, String pasajeros) {
        super(forma, tamanio, material, color, anio, marca, tipodemotor, pasajeros);
        this.frenos_aerodinamicos = frenos_aerodinamicos;
        this.Slats = Slats;
        this.Alerones = Alerones;
        this.MotoP = MotoP;
        this.TrenDeAterrizaje = TrenDeAterrizaje;
    }

    public String getFrenos_aerodinamicos() {
        return frenos_aerodinamicos;
    }

    public void setFrenos_aerodinamicos(String frenos_aerodinamicos) {
        this.frenos_aerodinamicos = frenos_aerodinamicos;
    }

    public String getSlats() {
        return Slats;
    }

    public void setSlats(String Slats) {
        this.Slats = Slats;
    }

    public String getAlerones() {
        return Alerones;
    }

    public void setAlerones(String Alerones) {
        this.Alerones = Alerones;
    }

    public String getMotoP() {
        return MotoP;
    }

    public void setMotoP(String MotoP) {
        this.MotoP = MotoP;
    }

    public String getTrenDeAterrizaje() {
        return TrenDeAterrizaje;
    }

    public void setTrenDeAterrizaje(String TrenDeAterrizaje) {
        this.TrenDeAterrizaje = TrenDeAterrizaje;
    }
    
    
    
}
