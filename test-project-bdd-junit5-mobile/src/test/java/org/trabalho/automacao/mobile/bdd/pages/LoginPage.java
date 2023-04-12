package org.trabalho.automacao.mobile.bdd.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.trabalho.automacao.mobile.bdd.Hook;

@Getter
@NoArgsConstructor
public class LoginPage {
    @AndroidFindBy(id = "br.com.petz:id/tv_start_without_login")
    private WebElement btnComecarSemLogin;


}
