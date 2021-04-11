/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XValidaWhile;
import java.io.IOException;

/**
 *
 * @author lorenzolince
 */
public class XValidaWhile2Impl implements XValidaWhile {

    private int num;

    public XValidaWhile2Impl() {
        this.num = 0;
    }

    @Override
    public void desplegar() throws IOException {
        System.out.println("Despliega digitos del 0 al 9");

        while (this.num <= 9) {
            System.out.println("Numero: " + this.num);
            this.num++;
        }
        System.out.println("Sali del Ciclo");
    }
}
