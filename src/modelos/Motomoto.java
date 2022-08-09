/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author james
 */
public class Motomoto extends Vehiculo_terrestre {
    private String caso,estriberas,guantera,manilla;

    public Motomoto(String caso, String estriberas, String guantera, String manilla, int nollantas, int noasientos, String transmicion, String forma, String tamanio, String material, String color, String anio, String marca, String tipodemotor, String pasajeros) {
        super(nollantas, noasientos, transmicion, forma, tamanio, material, color, anio, marca, tipodemotor, pasajeros);
        this.caso = caso;
        this.estriberas = estriberas;
        this.guantera = guantera;
        this.manilla = manilla;
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getEstriberas() {
        return estriberas;
    }

    public void setEstriberas(String estriberas) {
        this.estriberas = estriberas;
    }

    public String getGuantera() {
        return guantera;
    }

    public void setGuantera(String guantera) {
        this.guantera = guantera;
    }

    public String getManilla() {
        return manilla;
    }

    public void setManilla(String manilla) {
        this.manilla = manilla;
    }
    
    
    
}
