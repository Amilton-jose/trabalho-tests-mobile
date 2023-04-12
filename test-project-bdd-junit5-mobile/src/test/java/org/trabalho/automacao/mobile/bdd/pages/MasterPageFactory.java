package org.trabalho.automacao.mobile.bdd.pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.extern.slf4j.Slf4j;
import org.trabalho.automacao.mobile.bdd.Hook;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class MasterPageFactory {
    public static <T> T getPage(Class<T> cls){
        T page;

        try {
            page = cls.newInstance();
            PageFactory.initElements(new AppiumFieldDecorator(Hook.getDriver()), page);

        }catch (Exception e){
            log.error("Error on page instantiation", e);
            throw new RuntimeException(e);
        }

        return page;
    }
}
