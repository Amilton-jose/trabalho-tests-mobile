package org.trabalho.automacao.mobile.bdd.actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.trabalho.automacao.mobile.bdd.pages.CarrinhoPage;

import org.trabalho.automacao.mobile.bdd.pages.MasterPageFactory;

public class CarrinhoActions {

    public static CarrinhoPage carrinhoPage() {
        return MasterPageFactory.getPage(CarrinhoPage.class);
    }

    public static void validaCarrinhoPage() {
        boolean titulo = carrinhoPage().getTituloCarrinho().isDisplayed();
        Assertions.assertTrue(titulo, "Não está na página do carrinho.");
    }

    public static void irCarrinho() {
        carrinhoPage().getBtnIrCarrinho().click();
    }

    public static void ValidarCarrinhoPage(String produto,String preco,String selecionaPorNomeProduto) {
        HomeActions.validarDetalhesDoProduto(produto,preco,selecionaPorNomeProduto);
        ProdutoActions.adicionaNoCarrinho();
        CarrinhoActions.irCarrinho();
        CarrinhoActions.validaCarrinhoPage();
    }

    public static void removerProduto(){
        carrinhoPage().getBtnDeleteProduto().click();
        carrinhoPage().getConfirmaDelete().click();
    }

    public static void validaCarrinhoVazio(){
        boolean vazio = carrinhoPage().getCarrinhoVazio().isDisplayed();
        Assertions.assertTrue(vazio,"O carrinho não esta vazio.");
    }

}