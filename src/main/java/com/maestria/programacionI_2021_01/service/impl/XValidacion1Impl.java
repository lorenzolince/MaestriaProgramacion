/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XValidacion;
import javax.swing.JOptionPane;

/**
 *
 * @author lorenzolince
 */
public class XValidacion1Impl implements XValidacion {

    private int numero;

    public XValidacion1Impl() {
        String str;
        str = JOptionPane.showInputDialog("Escribe un Numero:");
        this.numero = Integer.parseInt(str);
    }

    @Override
    public void validar() {
        if ( this.numero < 0) {
            System.out.println("El numero es negativo.");
        }
        if ( this.numero == 0) {
            System.out.println("El numero es cero.");
        }
        if ( this.numero > 0) {
            System.out.println("El numero es positivo.");
        }
    }

}
