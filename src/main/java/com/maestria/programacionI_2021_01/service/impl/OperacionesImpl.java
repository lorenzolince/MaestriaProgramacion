/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.Operaciones;

/**
 *
 * @author lorenzolince
 */
public class OperacionesImpl implements Operaciones {

    private int m, n;

  public  OperacionesImpl(int xm, int xn) {
        this.m = xm;
        this.n = xn;
    }

    @Override
    public void ejecutar() {
        System.out.println("m = " + this.m);
        System.out.println("n = " + this.n);
        int suma = this.m + this.n;
        System.out.println("m + n = " + suma);
        int resta = this.m - this.n;
        System.out.println("m - n = " + resta);
        int multiplicacion = this.m * this.n;
        System.out.println("m * n = " + multiplicacion);
        int division = this.m / this.n;
        System.out.println("m / n = " + division);
        int residuo = this.m % this.n;
        System.out.println("m % n = " + residuo);
    }

}
