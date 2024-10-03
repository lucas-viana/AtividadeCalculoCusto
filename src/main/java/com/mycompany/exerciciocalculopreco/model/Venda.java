package com.mycompany.exerciciocalculopreco.model;

/**
 *
 * @author lucas
 */
public class Venda {
    private double frete;

    public Venda(double frete) {
        this.frete = frete;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        if(frete >= 0){
        this.frete = frete;
        }else
            this.frete = 0;
    }
    
        public double realizarVenda(Produto produto, Impostos imposto){
            System.out.println(produto.getPreco());
            System.out.println(produto.getMargemLucro());
            System.out.println(produto.getvSeguro());
            
        double custoProduto = (((produto.getPreco() * produto.getMargemLucro()) + produto.getvSeguro())+ frete);
            System.out.println(custoProduto);
        
        double total = custoProduto + (custoProduto*imposto.getIcms())+(custoProduto*imposto.getIpi())+(custoProduto*imposto.getIss());
        return total + produto.getPreco();
        
    }
}
