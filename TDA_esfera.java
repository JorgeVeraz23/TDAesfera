/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tdaesfera;

/**
 *
 * @author USER
 */
public class TDA_esfera {
  private double radio;
  //constructor
  public TDA_esfera(double radioInicial){
      if(radioInicial > 0){
          this.radio = radioInicial;
      }else{
          this.radio = 0.0;
      }
  }
  public double getRadio(){
      return this.radio;
  }
  public double getDiametro(){
      return(radio*2);
  }
  public double getCircunferencia(){
      return (Math.PI*getDiametro());
  }
  public double getArea(){
      return (4*Math.PI*radio*radio);
  }
  public double getVolumen(){
      return (4*Math.PI*Math.pow(radio, 3))/3;
  }
}
