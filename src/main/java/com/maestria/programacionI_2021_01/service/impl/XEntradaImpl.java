/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.XEntrada;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lorenzolince
 */
public class XEntradaImpl implements XEntrada {

    String nombre;
    int edad;
    double saldo;

    @Override
    public void leer_cadena() {
        try {
            InputStreamReader lector = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(lector);
            System.out.println("Escribe tu nombre: ");
            this.nombre = br.readLine();
        } catch (Exception e) {
            System.out.println("Error de Lectura " + e.getMessage());
        }
    }

    @Override
    public void leer_entero() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe tu deposito: ");
            saldo = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Error de Lectura");
        }
    }

    @Override
    public void leer_doble() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe tu deposito: ");
            saldo = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Error de Lectura");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Hola, " + nombre + " tu edad es: " + edad + " y tu Deposito fue : " + saldo);
    }

}
