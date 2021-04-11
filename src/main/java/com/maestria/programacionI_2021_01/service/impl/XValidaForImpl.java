/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XValidaFor;

/**
 *
 * @author lorenzolince
 */
public class XValidaForImpl implements XValidaFor {

    private int num;

    @Override
    public void mostrar() {
        System.out.println("Digitos del 0 al 9");
        for (num = 0; num <= 9; num++) {
            System.out.println("Numero: " + num);
        }
        System.out.println("Sali del Ciclo");
    }
}
