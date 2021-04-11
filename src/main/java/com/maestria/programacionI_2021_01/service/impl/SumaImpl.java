/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacionI_2021_01.service.impl;

import com.maestria.programacionI_2021_01.service.Suma;

/**
 *
 * @author lorenzolince
 */
public class SumaImpl implements Suma {

    @Override
    public int desplegar(int numero1, int numero2) {
        return numero1 + numero2;
    }

}
