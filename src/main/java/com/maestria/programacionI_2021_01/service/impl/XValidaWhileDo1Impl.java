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
public class XValidaWhileDo1Impl implements XValidaWhile {

    private int opc;

    @Override
    public void desplegar() throws IOException {
        do {
            System.out.println("1:Suma ");
            System.out.println("2:Rsta ");
            System.out.println("3:Multiplica ");
            System.out.println("4:Divide ");
            System.out.println("Introduzca la opcion: ");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            this.opc = Integer.parseInt(entrada.readLine());
        } while (this.opc < 1 || this.opc > 4);
        System.out.println("Sali del Ciclo");
    }
}
