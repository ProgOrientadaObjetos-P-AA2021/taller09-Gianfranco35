/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int prestamoMeses;
    protected String ciudadPrestamo;

    public Prestamo(Persona ben, int presMes, String ciuPres) {
        beneficiario = ben;
        prestamoMeses = presMes;
        ciudadPrestamo = ciuPres;
    }
    
    public Prestamo(Persona ben, int presMes) {
        beneficiario = ben;
        prestamoMeses = presMes;
    }

    public void establecerBeneficiario(Persona ben) {
        beneficiario = ben;
    }

    public void establecerPrestamoMes(int presM) {
        prestamoMeses = presM;
    }

    public void establecerCiudadPrestamo(String ciudP) {
        ciudadPrestamo = ciudP;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }
    
    public int obtenerPrestamoMeses(){
        return prestamoMeses;
    }
    
    public String obtenerCiudadPresta(){
        return ciudadPrestamo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Información del beneficiario:\n"
                + " - Nombre: %s\n - Apellido: %s\n"
                + "Tiempo del préstamo: %d meses\n"
                + "Ciudad del préstamo: %s\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                obtenerPrestamoMeses(),
                obtenerCiudadPresta());
        return cadena;
    }

}
