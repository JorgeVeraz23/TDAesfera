/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tdaesfera;

/**
 *
 * @author USER
 */
public class Principal {

    public static void main(String[] args) {
        TDA_esfera esferita = new TDA_esfera(3);
        System.out.println("Radio: "+ esferita.getRadio());
        System.out.println("Diametro: "+ esferita.getDiametro());
        System.out.println("Circunferencia: "+esferita.getCircunferencia());
        System.out.println("Area: "+esferita.getArea());
        System.out.println("Volumen"+esferita.getVolumen());
    }
}
