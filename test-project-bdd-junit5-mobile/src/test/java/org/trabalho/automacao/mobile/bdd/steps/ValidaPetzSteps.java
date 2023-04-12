package org.trabalho.automacao.mobile.bdd.steps;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import org.trabalho.automacao.mobile.bdd.actions.CarrinhoActions;
import org.trabalho.automacao.mobile.bdd.actions.HomeActions;
import org.trabalho.automacao.mobile.bdd.actions.LoginActions;
import org.trabalho.automacao.mobile.bdd.actions.ProdutoActions;

@Slf4j
public class ValidaPetzSteps {
    public static String selecionaPorNomeProduto = "";
    public static String preco = "";
    public static String produto = "";


    @Given("acesso a pagina inicial do app")
    public void acesso_a_pagina_inicial_do_app() {
        log.info("Validar página inicial.");
        LoginActions.validarPaginaLogin();
        LoginActions.cliqueLoginSemCredenciais();
    }

    @When("faco uma busca por um produto {string}")
    public void facoUmaBuscaPorUmProdutoProduto(String produto) {
        log.info("Validar inserção de produto");
        HomeActions.validarHomePage();
        this.produto = produto;
        HomeActions.inserirBusca(this.produto);
    }

    @Then("vejo uma lista de produtos correspondentes")
    public void vejo_uma_lista_de_produtos_correspondentes() {
        log.info("Validar lista de produtos correspondentes a busca.");
        HomeActions.validaResultadoDaBusca();
    }

    @Given("vejo a lista de produtos")
    public void vejo_a_lista_de_produtos() {
        log.info("Valida a lista de produtos");
        HomeActions.listaDeProdutos(this.produto);
    }

    @When("seleciono um produto {string}")
    public void seleciono_um_produto(String produto) {
        log.info("Seleciona um produto da lista");
        this.selecionaPorNomeProduto = produto;
        HomeActions.selecionarProduto(this.selecionaPorNomeProduto);
    }

    @Then("vejo os detalhes do produto como preco {string}")
    public void vejo_os_detalhes_do_produto_selecionado(String preco) {
        log.info("Valida detalhes do produto como o preço");
        this.preco = preco;
        HomeActions.validaPaginaDoProduto();
        ProdutoActions.validaDetalhesProduto(this.preco);
    }

    @Given("vejo os detalhes do produto")
    public void vejo_os_detalhes_do_produto() {
        log.info("Valida detalhes do produto");
        HomeActions.validarDetalhesDoProduto(this.produto, this.preco, this.selecionaPorNomeProduto);
    }

    @When("adiciono ao carrinho")
    public void adiciono_ao_carrinho() {
        log.info("adiciona produto ao carrinho");
        ProdutoActions.adicionaNoCarrinho();
        CarrinhoActions.irCarrinho();
    }

    @Then("vejo o produto no carrinho")
    public void vejo_o_produto_no_carrinho() {
        log.info("valida o produto no carrinho");
        CarrinhoActions.validaCarrinhoPage();
    }

    @Given("que exista um produto no carrinho")
    public void que_exista_um_produto_no_carrinho() {
        log.info("valida se existe um produto no carrinho");
        CarrinhoActions.ValidarCarrinhoPage(this.produto,this.preco,this.selecionaPorNomeProduto);
    }

    @When("removo o produto carrinho")
    public void removo_o_produto_carrinho() {
        log.info("valida remoção de produto");
        CarrinhoActions.removerProduto();
    }

    @Then("vejo o produto no carrinho vazio")
    public void vejo_o_produto_no_carrinho_vazio() {
        log.info("valida se o carrinho está vazio");
        CarrinhoActions.validaCarrinhoVazio();
    }

}
