/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XUsoScanner;
import java.util.Scanner;

/**
 *
 * @author lorenzolince
 */
public class XUsoScannerImpl implements XUsoScanner {

    private String nombre;
    private int AnnodeNacimiento;
    private float altura;
    private double peso;
    private char opcion;

    @Override
    public void leer() {
        //Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
//Solicitar datos
        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese año de nacimiento: ");
        AnnodeNacimiento = sc.nextInt();
        System.out.print("Ingrese altura: ");
        altura = sc.nextFloat();
        System.out.print("Ingrese opcion: ");
        opcion = sc.next().charAt(0);
        System.out.print("Ingrese Peso: ");
        peso = sc.nextDouble();
        System.out.println("LA OPCION FUE "
                + opcion + " EL NOMBRE ES "
                + nombre + " AÑO DENACIMIENTO "
                + AnnodeNacimiento + " LA ALTURA ES "
                + altura + " SU PESO ES "
                + peso);
    }

}
