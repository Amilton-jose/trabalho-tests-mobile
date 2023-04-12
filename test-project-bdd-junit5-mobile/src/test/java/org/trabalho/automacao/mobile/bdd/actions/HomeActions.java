package org.trabalho.automacao.mobile.bdd.actions;

import com.google.common.collect.ImmutableMap;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.trabalho.automacao.mobile.bdd.Hook;
import org.trabalho.automacao.mobile.bdd.pages.HomePage;
import org.trabalho.automacao.mobile.bdd.pages.MasterPageFactory;
import org.junit.jupiter.api.Assertions;


public class HomeActions {

    public static HomePage homePage() {
        return MasterPageFactory.getPage(HomePage.class);
    }

    public static void validarHomePage() {
        homePage().validarPaginaHome();
    }

    public static void inserirBusca(String produto) {
        homePage().getBtnBuscar().click();
        homePage().getInserirBusca().sendKeys(produto);
        Hook.getDriver().executeScript("mobile: performEditorAction", ImmutableMap.of("action", "done"));
    }

    public static void validaResultadoDaBusca() {
        boolean resultados = homePage().getResultadosDaBusca().isDisplayed();
        Assertions.assertTrue(resultados, "Resultados não encontrados.");
    }

    public static void selecionarProduto(String produto) {
        if (homePage().getNomeProduto()
                .getText()
                .contains(produto))
            homePage().getNomeProduto().click();
    }

    public static void listaDeProdutos(String produto) {
        LoginActions.validarPaginaLogin();
        LoginActions.cliqueLoginSemCredenciais();
        HomeActions.validarHomePage();
        HomeActions.inserirBusca(produto);
    }


    public static void validaPaginaDoProduto() {
        boolean telaProduto = homePage().getDetalhesDoProduto().isDisplayed();
        Assertions.assertTrue(telaProduto, "Não está na tela do produto.");
    }

    public static void validarDetalhesDoProduto(String produto,String preco,String nomeProduto){
        HomeActions.listaDeProdutos(produto);
        HomeActions.selecionarProduto(nomeProduto);
        ProdutoActions.validaDetalhesProduto(preco);
    }
}
