/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marcaAuto;
    private Persona garante1;
    private double valorAuto;
    private double valorMesPrestamoAuto;

    public PrestamoAutomovil(Persona be, int tiempo, String ciu, String tipoA,
            String marcaA, Persona gar, double valorA) {
        super(be, tiempo, ciu);
        tipoAuto = tipoA;
        marcaAuto = marcaA;
        garante1 = gar;
        valorAuto = valorA;
    }

    public void establecerTipoAuto(String tipo) {
        tipoAuto = tipo;
    }

    public void establecerMarcaAuto(String marca) {
        marcaAuto = marca;
    }

    public void establecerGarante1(Persona gar) {
        garante1 = gar;
    }

    public void establecerValorAuto(double vAuto) {
        valorAuto = vAuto;
    }

    public void establecerValorMesPrestamoAuto() {
        valorMesPrestamoAuto = valorAuto / prestamoMeses;
    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }
    
    public String obtenerMarcaAuto() {
        return marcaAuto;
    }
    
    public Persona obtenerGarante1() {
        return garante1;
    }
    
    public double obtenerValorAuto() {
        return valorAuto;
    }
    
    public double obtenerValorMesPrestamoAuto() {
        return valorMesPrestamoAuto;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%sInformación del préstamo automovil:\n"
                + " - Tipo automóvil: %s\n"
                + " - Marca automóvil: %s\n"
                + " - Garante: %s %s\n"
                + " - Valor automóvil: %.2f\n"
                + " - Valor mensula de pago: %.2f",
                super.toString(),
                obtenerTipoAuto(),
                obtenerMarcaAuto(),
                obtenerGarante1().obtenerNombre(),
                obtenerGarante1().obtenerApellido(),
                obtenerValorAuto(),
                obtenerValorMesPrestamoAuto());
        return cadena;
    }

}
