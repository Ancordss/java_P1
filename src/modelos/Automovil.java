/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author james
 */
public class Automovil extends Vehiculo_terrestre {
    private String chasis,carroceria;

    public Automovil(String chasis, String carroceria, int nollantas, int noasientos, String transmicion, String forma, String tamanio, String material, String color, String anio, String marca, String tipodemotor, String pasajeros) {
        super(nollantas, noasientos, transmicion, forma, tamanio, material, color, anio, marca, tipodemotor, pasajeros);
        this.chasis = chasis;
        this.carroceria = carroceria;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

  
    
    
}
