/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XValidaWhile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lorenzolince
 */
public class XValidaWhileDo2Impl implements XValidaWhile {

    private int valida, clave;

    public XValidaWhileDo2Impl() {
        this.valida = 711;
        this.clave = 0;
    }

    @Override
    public void desplegar() throws IOException {
        do {
            System.out.println("Introduzca su clave numerica:");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            this.clave = Integer.parseInt(entrada.readLine());
            if (this.clave != this.valida) {
                System.out.println("Clave no valida!");
            }
        } while (this.clave != this.valida);
        System.out.println("Sali del Ciclo");
    }
}
