package org.trabalho.automacao.mobile.bdd.actions;


import org.trabalho.automacao.mobile.bdd.pages.MasterPageFactory;
import org.trabalho.automacao.mobile.bdd.pages.ProdutoPage;
import org.junit.jupiter.api.Assertions;


public class ProdutoActions {


    public static ProdutoPage produtoPage(){
        return MasterPageFactory.getPage(ProdutoPage.class);
    }

    public static void validaDetalhesProduto(String preco){
        boolean valor = produtoPage().getPrecoProduto().getText().contains(preco);
        Assertions.assertTrue(valor, "Valores divergentes.");
    }

    public static void adicionaNoCarrinho(){
        produtoPage().getBtnAddCarrinho().click();
    }
}
