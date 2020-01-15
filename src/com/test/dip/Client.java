package com.test.dip;

public class Client {

    public static void main(String[] args){

        IDriver zhangsan = new Driver();
        ICar benz = new Benz();
        zhangsan.drive(benz);
    }
}
