/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XTiposDatos;

/**
 *
 * @author lorenzolince
 */
public class XTiposDatosImpl implements XTiposDatos {

    private boolean b;
    private char c;
    private byte j;
    private short k;
    private int m;
    private long n;
    private float x;
    private double y;
    private String facultad;

    public XTiposDatosImpl() {
        this.b = false;
        this.c = 'R';
        this.j = 127;
        this.k = 32767;
        this.m = 2147483647;
        this.n = 9223372036854775807L; // L es por long
        this.x = 3.14159265F; // F es por flota
        this.y = 3.141592653589793238;
        this.facultad = "Sistemas Computacionales";
    }

    @Override
    public void desplegar() {
        System.out.println("b = " + this.b);
        System.out.println("c = " + this.c);
        System.out.println("j = " + this.j);
        System.out.println("k = " + this.k);
        System.out.println("m = " + this.m);
        System.out.println("n = " + this.n);
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
        System.out.println("Fac = " + this.facultad);
    }

}
