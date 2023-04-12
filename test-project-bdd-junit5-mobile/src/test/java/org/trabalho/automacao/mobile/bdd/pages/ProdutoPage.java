package org.trabalho.automacao.mobile.bdd.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;
@Getter
@NoArgsConstructor
public class ProdutoPage {
    @AndroidFindBy(id = "br.com.petz:id/tv_prod_name")
    private WebElement nomeProduto;
    @AndroidFindBy(id = "br.com.petz:id/image")
    private WebElement imgProduto;
    @AndroidFindBy(id = "br.com.petz:id/tv_prod_main_price")
    private WebElement precoProduto;
    @AndroidFindBy(id = "br.com.petz:id/rl_qty_plus")
    private WebElement btnAumentarQuantidade;
    @AndroidFindBy(id = "br.com.petz:id/rl_qty_minus")
    private WebElement btnDiminuirQuantidade;
    @AndroidFindBy(id = "br.com.petz:id/btnAddToCart")
    private WebElement btnAddCarrinho;
    @AndroidFindBy(id = "br.com.petz:id/btnGotoCart")
    private WebElement btnIrParaOCarrinho;

}
