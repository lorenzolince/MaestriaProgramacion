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
public class XValidacion3Impl implements XValidacion {

    private int puntuacion;

   public XValidacion3Impl() {
        this.puntuacion = Integer.parseInt(JOptionPane.showInputDialog("Escribe la notade un examen: "));
    }

    @Override
    public void validar() {
        if (this.puntuacion >= 90) {
            System.out.print("Sobresaliente");
        } else if (this.puntuacion >= 80) {
            System.out.print("Notable");
        } else if (this.puntuacion >= 70) {
            System.out.print("Bien");
        } else if (this.puntuacion >= 60) {
            System.out.print("Sufienciente");
        } else {
            System.out.print("Insufienciente");
        }
    }
}
