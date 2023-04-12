package org.trabalho.automacao.mobile.bdd;

public class Util {
    public static void deley(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
