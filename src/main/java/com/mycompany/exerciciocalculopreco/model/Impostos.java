/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciocalculopreco.model;

/**
 *
 * @author lucas
 */
public class Impostos {
    private double icms;
    private double iss;
    private double ipi;

    public Impostos(double icms, double iss, double ipi, Produto produto) {
        this.icms = icms/100;
        this.iss = iss/100;
        this.ipi = ipi/100;
    }

    
    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        if(icms >= 0){
        this.icms = icms;
        }else
            System.out.println("Insira um valor válido.");
    }

    public double getIss() {
        return iss;
    }

    public void setIss(double iss) {
        if(iss >= 0){
        this.iss = iss;
        }else
            System.out.println("Insira um valor válido.");
    }

    public double getIpi() {
        return ipi;
    }

    public void setIpi(double ipi) {
       if(ipi >= 0){
        this.ipi = ipi;
        }else
            System.out.println("Insira um valor válido.");
    } 
}
