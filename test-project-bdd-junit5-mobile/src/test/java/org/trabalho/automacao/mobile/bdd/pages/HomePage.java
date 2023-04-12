package org.trabalho.automacao.mobile.bdd.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.trabalho.automacao.mobile.bdd.Constants;
import org.trabalho.automacao.mobile.bdd.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@Getter
@NoArgsConstructor
public class HomePage {
    @AndroidFindBy(id = "br.com.petz:id/tv_toolbar_search_text")
    private WebElement btnBuscar;
    @AndroidFindBy(id = "br.com.petz:id/searchBox")
    private WebElement inserirBusca;
    @AndroidFindBy(id = "br.com.petz:id/TAB_SEARCH")
    private WebElement resultadosDaBusca;
    @AndroidFindBy(id = "br.com.petz:id/thumbnail")
    private WebElement ImgProduto;
    @AndroidFindBy(id = "br.com.petz:id/rv_products_search")
    private List<WebElement> listaProdutos;
    @AndroidFindBy(id = "br.com.petz:id/prodName")
    private WebElement nomeProduto;
    @AndroidFindBy(id = "br.com.petz:id/mainPrice")
    private WebElement precoProduto;
    @AndroidFindBy(id = "br.com.petz:id/ll_scroll_container")
    private WebElement detalhesDoProduto;


    public void validarPaginaHome() {
        new WebDriverWait(Hook.getDriver(), Constants.TEMPO_DE_PRESENCA_DO_ELEMENTO_LOCADO)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By
                                .xpath("//*[@resource-id='br.com.petz:id/tv_toolbar_search_text']")));
    }

}
