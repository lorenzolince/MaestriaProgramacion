/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XLeeData;
import javax.swing.JOptionPane;

/**
 *
 * @author lorenzolince
 */
public class XLeeDataImpl implements XLeeData {

    String nombre, apellido;

    public XLeeDataImpl() {
        nombre = JOptionPane.showInputDialog(null, "Escribe tu Nombre:", "Muestra de Dialogo de Entrada", JOptionPane.INFORMATION_MESSAGE);
        apellido = JOptionPane.showInputDialog(null, "Escribe tu Apellido:", "Muestra de Dialogo de Entrada ", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void desplegar() {
        String nombre_completo;
        nombre_completo = nombre + " " + apellido;
        JOptionPane.showMessageDialog(null, nombre_completo, "Tu Nombre Completoes:", JOptionPane.INFORMATION_MESSAGE);
    }

}
