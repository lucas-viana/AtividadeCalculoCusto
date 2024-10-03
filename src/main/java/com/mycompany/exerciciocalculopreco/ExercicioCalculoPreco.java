/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciocalculopreco;

import com.mycompany.exerciciocalculopreco.model.Impostos;
import com.mycompany.exerciciocalculopreco.model.Produto;
import com.mycompany.exerciciocalculopreco.model.Venda;

/**
 *
 * @author lucas
 */
public class ExercicioCalculoPreco {

    public static void main(String[] args) {
        System.out.println("Cadastre um produto: ");
        Produto produto = new Produto("Celular", 1, 1000, 10);
        Impostos imposto = new Impostos(10, 10, 5, produto);
        Venda venda = new Venda(50);
        
        System.out.println(venda.realizarVenda(produto, imposto));       
        
    }
}
