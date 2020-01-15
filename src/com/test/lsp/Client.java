package com.test.lsp;

public class Client {

    public static void main(String[] args){

        Solder sanMao = new Solder();
        sanMao.setGun(new HandGun());
        sanMao.killEnemy();
    }
}
