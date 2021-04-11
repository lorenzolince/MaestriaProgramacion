/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XAreaCirculo;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author lorenzolince
 */
public class XAreaCirculoJOptionPaneImpl implements XAreaCirculo {

    private float radio;

    public XAreaCirculoJOptionPaneImpl() {
        this.radio = 0;
    }

    @Override
    public void calcular() throws IOException {
        String str_radio;

        str_radio = JOptionPane.showInputDialog("Escribe el Radio:");

        radio = Float.parseFloat(str_radio);

        System.out.print("El area del circulo de radio " + this.radio);
        double area = Math.PI * this.radio * this.radio;
        System.out.println(" es " + area);
    }

}
