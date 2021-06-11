/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Integrantes: Fabian Montaya, Gianfranco Sachez 


package paquete1;

import java.util.Scanner;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreB;
        String apellidB;
        int mesesP;
        String ciudad;
        int op;
        int opcion2;
        do {
            System.out.println("Digite la opción:\n"
                    + "(1) Ingresar prestamo automóvil.\n"
                    + "(2) Ingresar prestamo educativo.");
            op = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingresar el nombre del beneficiario: ");
            nombreB = sc.nextLine();
            System.out.println("Ingresar el apellido del beneficiario: ");
            apellidB = sc.nextLine();
            Persona pB = new Persona(nombreB, apellidB);
            System.out.println("Ingresar el tiempo de prestamo en meses: ");
            mesesP = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingresar ciudad donde se hace el prestamo: ");
            ciudad = sc.nextLine();
            switch (op) {
                case 1:
                    ingresarPrestamoAutomovil(pB, mesesP, ciudad);
                    break;
                case 2:
                    ingresarPrestamoEducativo(pB, mesesP, ciudad);
                    break;
                default:
                    opcion2 = 1;
                    break;
            }
            opcion2 = sc.nextInt();
        } while (opcion2 != 0);
    }

    public static void ingresarPrestamoAutomovil(Persona beneficiario,
            int meses, String ciudad) {
        Scanner sc = new Scanner(System.in);
        String tipoA;
        String marcaA;
        String nombreG;
        String apellidoG;
        double valorA;
        System.out.println("Ingresar el tipo de automóvil: ");
        tipoA = sc.nextLine();
        System.out.println("Ingresar marca del automóvil: ");
        marcaA = sc.nextLine();
        System.out.println("Ingresar nombre del garante: ");
        nombreG = sc.nextLine();
        System.out.println("Ingresar apellido del garante: ");
        apellidoG = sc.nextLine();
        Persona pG = new Persona(nombreG, apellidoG);
        System.out.println("Ingresar el valor del automóvil: ");
        valorA = sc.nextDouble();
        PrestamoAutomovil prestamoA = new PrestamoAutomovil(beneficiario,
                meses, ciudad, tipoA, marcaA, pG, valorA);
        prestamoA.establecerValorMesPrestamoAuto();
        System.out.printf("%s", prestamoA);
        
    }

    public static void ingresarPrestamoEducativo(Persona beneficiario,
            int meses, String ciudad) {
        Scanner sc = new Scanner(System.in);
        String nivelE;
        String nombreCEducativo;
        double valorC;
        System.out.println("Ingresar el nivel de educación: ");
        nivelE = sc.nextLine();
        System.out.println("Ingresar el nombre del centro educativo: ");
        nombreCEducativo = sc.nextLine();
        System.out.println("Ingresar el valor de la carrera: ");
        valorC = sc.nextDouble();
        PrestamoEducativo prestamoE = new PrestamoEducativo(beneficiario,
                meses, ciudad, nivelE, nombreCEducativo, valorC);
        prestamoE.establecerValorMesPrestamoCarrera();
        System.out.printf("%s", prestamoE);
    }
}
