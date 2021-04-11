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
public class XValidaWhile1Impl implements XValidaWhile {

    @Override
    public void desplegar() throws IOException {
        int num;
        System.out.println("Introduzca un numero: ");

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(entrada.readLine());
        while (num <= 100) {
            System.out.println("Introduzca un numero: ");
            num = Integer.parseInt(entrada.readLine());
        }
        System.out.println("Sali del Ciclo");
    }

}
