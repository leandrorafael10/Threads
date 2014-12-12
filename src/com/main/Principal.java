/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

/**
 *
 * @author leandro.silva
 */
public class Principal {

    private static final int NUMERO_PEDIDOS = 5000;

    public static void main(String[] args) {
        Produtor produtor = new Produtor();
        Consumidor consumidor = new Consumidor();
        //cira um laço para determinado numero de pedidos
        for (int i = NUMERO_PEDIDOS; i > 0; i--) {
            new Thread(consumidor).start();
            new Thread(produtor).start();

        }

    }

}
