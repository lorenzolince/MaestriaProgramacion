/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XMatematica;

/**
 *
 * @author lorenzolince
 */
public class XMatematicaImpl implements XMatematica {

    double a;
    double b;

    public XMatematicaImpl() {
        this.a = 25;
        this.b = 5;
    }

    @Override
    public void calcular() {
        double pi = Math.PI;
        double raiz = Math.sqrt(this.a);
        double elevar = Math.pow(this.b, 2);
        System.out.println("El valor de PI es: " + pi);
        System.out.println("La raiz de a:" + raiz);
        System.out.println("El cuadrado de b:" + elevar);
        double x = 72.35699993;
        System.out.println(x + " es aprox. " + (double) Math.round(x * 100) / 100);
        System.out.println(x + " es aprox. " + Math.floor(x * 100) / 100);
    }
}
