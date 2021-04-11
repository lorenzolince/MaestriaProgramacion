/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XAreaCirculo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lorenzolince
 */
public class XAreaCirculoImpl implements XAreaCirculo {

    private float radio;

    public XAreaCirculoImpl() {
        this.radio = 0;
    }

    @Override
    public void calcular() throws IOException {
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(lector);

        System.out.println("Escribe el radio : ");
        String cadena = entrada.readLine();
        radio = Float.parseFloat(cadena);
        System.out.print("El area del circulo de radio " + this.radio);
        double area = Math.PI * this.radio * this.radio;
        System.out.println(" es " + area);

    }

}
