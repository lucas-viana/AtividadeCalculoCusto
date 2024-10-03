/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciocalculopreco.model;

/**
 *
 * @author lucas
 */
public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private double vSeguro;
    private double margemLucro;
    

    public Produto(String nome, int quantidade, double preco, double margemLucro) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.vSeguro = preco*0.15;
        this.margemLucro =(margemLucro/100);
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getvSeguro() {
        return vSeguro;
    }

    public void setvSeguro(double vSeguro) {
        this.vSeguro = vSeguro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
