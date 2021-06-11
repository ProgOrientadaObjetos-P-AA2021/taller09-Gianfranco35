/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {
    
    private String nivelEstudio;
    private String nombreCentroEducativo;
    private double valorCarrera;
    private double valorMesPrestamoCarrera;
    
    public PrestamoEducativo(Persona be, int tiempo, String ciu,
            String nivelE, String nombreC, double vCarrera){
        super(be, tiempo);
        establecerCiudadPrestamo(ciu);
        nivelEstudio = nivelE;
        nombreCentroEducativo = nombreC;
        valorCarrera = vCarrera;
    }
    
    @Override
    public void establecerCiudadPrestamo(String c){
        ciudadPrestamo = c.toUpperCase();
    }
    
    public void establecerNivelEstudio(String n){
        nivelEstudio = n;
    }
    
    public void establecerNombreCentroEducativo(String n){
        nombreCentroEducativo = n;
    }
    
    public void establecerValorCarrera(double v){
        valorCarrera = v;
    }
    
    public void establecerValorMesPrestamoCarrera(){
        double operacion = valorCarrera / prestamoMeses;
        valorMesPrestamoCarrera = operacion - (operacion * 0.1);
    }
    
    public String obtenerNivelEstudio(){
        return nivelEstudio;
    }
    
    public String obtenerNombreCentroEducativo(){
        return nombreCentroEducativo;
    }
    
    public double obtenerValorCarrera(){
        return valorCarrera;
    }
    
    public double obtenerValorMesPrestamoCarrera(){
        return valorMesPrestamoCarrera;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%sInformación del préstamo educativo:\n"
                + " - Nivel de estudio: %s\n"
                + " - Nombre del Centro educativo: %s\n"
                + " - Valor de la carrera: %.2f\n"
                + " - Valor mensual de pago: %.2f\n",
                super.toString(),
                obtenerNivelEstudio(),
                obtenerNombreCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMesPrestamoCarrera());
        return cadena;
    }

}
