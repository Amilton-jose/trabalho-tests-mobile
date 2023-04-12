package org.trabalho.automacao.mobile.bdd.actions;

import org.trabalho.automacao.mobile.bdd.pages.LoginPage;
import org.trabalho.automacao.mobile.bdd.pages.MasterPageFactory;
import org.junit.jupiter.api.Assertions;

public class LoginActions {

    public static LoginPage loginPage(){
        return MasterPageFactory.getPage(LoginPage.class);
    }

    public static void validarPaginaLogin() {
        Boolean loginPage = loginPage().getBtnComecarSemLogin().isDisplayed();
        Assertions.assertTrue(loginPage,"Não está na página de login");
    }

    public static void cliqueLoginSemCredenciais(){
        loginPage().getBtnComecarSemLogin().click();
    }

}
