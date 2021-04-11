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
public class XValidacion2Impl implements XValidacion {

    private int numero;

  public  XValidacion2Impl() {
        String str;
        str = JOptionPane.showInputDialog("Escribe un Numero:");
        this.numero = Integer.parseInt(str);
    }

    @Override
    public void validar() {
        if (this.numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            if (this.numero == 0) {
                System.out.println("El numero es cero.");
            } else {
                System.out.println("El numero es Positivo.");
            }

        }
    }

}
