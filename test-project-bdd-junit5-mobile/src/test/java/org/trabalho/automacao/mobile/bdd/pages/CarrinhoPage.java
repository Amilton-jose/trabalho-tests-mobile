package org.trabalho.automacao.mobile.bdd.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;

@Getter
@NoArgsConstructor
public class CarrinhoPage {
    @AndroidFindBy(id = "br.com.petz:id/toolbar_title")
    private WebElement tituloCarrinho;
    @AndroidFindBy(id = "br.com.petz:id/iv_product_delete")
    private WebElement btnDeleteProduto;
    @AndroidFindBy(id = "br.com.petz:id/rl_qty_plus")
    private WebElement aumentarQuantidadeProduto;
    @AndroidFindBy(id = "br.com.petz:id/rl_qty_minus")
    private WebElement diminuirQuantidadeProduto;
    @AndroidFindBy(id = "br.com.petz:id/tv_prod_name")
    private WebElement tituloProduto;
    @AndroidFindBy(id = "br.com.petz:id/tv_prod_main_price")
    private WebElement precoProduto;
    @AndroidFindBy(id = "br.com.petz:id/et_zip_code_shopping_cart")
    private WebElement lblCEP;
    @AndroidFindBy(id = "br.com.petz:id/rl_btn_continue_to_checkout")
    private WebElement btnContinueCheckout;
    @AndroidFindBy(id = "br.com.petz:id/btnGotoCart")
    private WebElement btnIrCarrinho;
    @AndroidFindBy(id = "br.com.petz:id/rl_continue_shopping")
    private WebElement btnContinuarComprando;
    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageButton']")
    private WebElement btnVoltar;
    @AndroidFindBy(id = "android:id/button1")
    private WebElement confirmaDelete;
    @AndroidFindBy(id = "android:id/button2")
    private WebElement naoConfirmaDelete;
    @AndroidFindBy(id = "br.com.petz:id/textView16")
    private WebElement carrinhoVazio;

}
