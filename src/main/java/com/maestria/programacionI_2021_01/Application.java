/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01;

import com.maestria.programacionI_2021_01.service.Operaciones;
import com.maestria.programacionI_2021_01.service.Suma;
import com.maestria.programacionI_2021_01.service.XAreaCirculo;
import com.maestria.programacionI_2021_01.service.XCadena1;
import com.maestria.programacionI_2021_01.service.XEntrada;
import com.maestria.programacionI_2021_01.service.XLeeData;
import com.maestria.programacionI_2021_01.service.XMatematica;
import com.maestria.programacionI_2021_01.service.XTiposDatos;
import com.maestria.programacionI_2021_01.service.XUsoScanner;
import com.maestria.programacionI_2021_01.service.XValidaFor;
import com.maestria.programacionI_2021_01.service.XValidaWhile;
import com.maestria.programacionI_2021_01.service.XValidacion;
import com.maestria.programacionI_2021_01.service.impl.OperacionesImpl;
import com.maestria.programacionI_2021_01.service.impl.SumaImpl;
import com.maestria.programacionI_2021_01.service.impl.XAreaCirculoImpl;
import com.maestria.programacionI_2021_01.service.impl.XAreaCirculoJOptionPaneImpl;
import com.maestria.programacionI_2021_01.service.impl.XCadena1Impl;
import com.maestria.programacionI_2021_01.service.impl.XEntradaImpl;
import com.maestria.programacionI_2021_01.service.impl.XLeeDataImpl;
import com.maestria.programacionI_2021_01.service.impl.XMatematicaImpl;
import com.maestria.programacionI_2021_01.service.impl.XTiposDatosImpl;
import com.maestria.programacionI_2021_01.service.impl.XUsoScannerImpl;
import com.maestria.programacionI_2021_01.service.impl.XValidaForImpl;
import com.maestria.programacionI_2021_01.service.impl.XValidaWhile1Impl;
import com.maestria.programacionI_2021_01.service.impl.XValidaWhile2Impl;
import com.maestria.programacionI_2021_01.service.impl.XValidaWhileDo1Impl;
import com.maestria.programacionI_2021_01.service.impl.XValidaWhileDo2Impl;
import com.maestria.programacionI_2021_01.service.impl.XValidacion1Impl;
import com.maestria.programacionI_2021_01.service.impl.XValidacion2Impl;
import com.maestria.programacionI_2021_01.service.impl.XValidacion3Impl;
import com.maestria.programacionI_2021_01.service.impl.XValidacion4Impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lorenzolince
 */
public class Application {

    private static final String menuInfo = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ MENU DE OPCIONES $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"
            + "$$$$$$$$$$ Seleccione el número de opción que desee para ejecutar la prueba $$$$$$$$\n"
            + "1 --> Suma de dos números enteros\n"
            + "2 --> Tipos de Datos en java\n"
            + "3 --> Operaciones en java\n"
            + "4 --> Ejemplo matemáticos usando la librería Math de java\n"
            + "5 -->   EJEMPLOS USANDO LA CLASE BufferedReader\n"
            + "6 -->   EJEMPLOS USANDO LA CLASE Scanner\n"
            + "7 --> EJEMPLOS USANDO LA CLASE JOptionPane  (AreaCirculo1)\n"
            + "8 --> EJEMPLOS USANDO LA CLASE JOptionPane (XLeeData)\n"
            + "9 --> Manejo de Excepciones en java\n"
            + "10 --> operaciones con cadenas en java \n"
            + "11 --> ESTRUCTURAS SELECTIVAS (IF)\n"
            + "12 --> ESTRUCTURAS SELECTIVAS (IF y ELSE)\n"
            + "13 --> ESTRUCTURAS SELECTIVAS (IF y ELSE IF)\n"
            + "14 --> ESTRUCTURAS SELECTIVAS (SWITCH)\n"
            + "15 --> ESTRUCTURAS DE CONTROL (While BufferedReader)\n"
            + "16 --> ESTRUCTURAS DE CONTROL (While )\n"
            + "17 --> ESTRUCTURAS DE CONTROL (DO While sentencia O --> || )\n"
            + "18 --> ESTRUCTURAS DE CONTROL (DO While coincidenca de clave)\n"
            + "19 --> ESTRUCTURAS DE CONTROL (FOR)";

    public static void main(String args[]) throws IOException {
        System.out.println(menuInfo);
        BufferedReader entradaManu = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(entradaManu.readLine());
        switch (num) {
            case 1:
                Suma suma = new SumaImpl();
                System.out.println(" PRIMER PROGRAMA REALIZADO EN JAVA ");
                System.out.println(" SUMATORIA DE DOS NUMEROS: " + suma.desplegar(2, 3));
                System.out.println();
                break;
            case 2:
                XTiposDatos tipo = new XTiposDatosImpl();
                tipo.desplegar();
                break;
            case 3:
                Operaciones op = new OperacionesImpl(25, 7);
                op.ejecutar();
                break;
            case 4:
                XMatematica mate = new XMatematicaImpl();
                mate.calcular();
                break;
            case 5:
                XAreaCirculo circulo = new XAreaCirculoImpl();
                circulo.calcular();
                break;
            case 6:
                XUsoScanner scam = new XUsoScannerImpl();
                scam.leer();
                break;
            case 7:
                XAreaCirculo circuloOption = new XAreaCirculoJOptionPaneImpl();
                circuloOption.calcular();
                break;
            case 8:
                XLeeData data = new XLeeDataImpl();
                data.desplegar();
                break;
            case 9:
                XEntrada entrada = new XEntradaImpl();
                entrada.leer_cadena();
                entrada.leer_entero();
                entrada.leer_doble();
                entrada.imprimir();
                break;
            case 10:
                XCadena1 cadena = new XCadena1Impl();
                cadena.valida();
                break;
            case 11:
                XValidacion valada1 = new XValidacion1Impl();
                valada1.validar();
                break;
            case 12:
                XValidacion valada2 = new XValidacion2Impl();
                valada2.validar();
                break;
            case 13:
                XValidacion valada3 = new XValidacion3Impl();
                valada3.validar();
                break;
            case 14:
                XValidacion valada4 = new XValidacion4Impl();
                valada4.validar();
                break;
            case 15:
                XValidaWhile valadaWhile = new XValidaWhile1Impl();
                valadaWhile.desplegar();
                break;
            case 16:
                XValidaWhile valadaWhile2 = new XValidaWhile2Impl();
                valadaWhile2.desplegar();
                break;
            case 17:
                XValidaWhile valadaWhileDo1 = new XValidaWhileDo1Impl();
                valadaWhileDo1.desplegar();
                break;
            case 18:
                XValidaWhile valadaWhileDo2 = new XValidaWhileDo2Impl();
                valadaWhileDo2.desplegar();
                break;
            case 19:
                XValidaFor valadaFOr = new XValidaForImpl();
                valadaFOr.mostrar();
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }
    }

}
