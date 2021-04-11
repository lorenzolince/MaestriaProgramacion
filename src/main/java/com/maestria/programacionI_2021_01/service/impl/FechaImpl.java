/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.Fecha;

/**
 *
 * @author lorenzolince
 */
public class FechaImpl implements Fecha {

    private String nombre;
    private int edad;

    public FechaImpl(String xnom, int xedad) {
        this.nombre = xnom;
        this.edad = xedad;
    }

    @Override
    public void desplegar() {
        System.out.println(this.nombre + " Tu tienes " + this.edad + " anios ahora ");
        int anio = 2020 - this.edad;
        System.out.println("Probablemente naciste en " + anio);
    }

}
