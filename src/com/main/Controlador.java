/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main;

/**
 *
 * @author leandro.silva
 * Classe responsavel por controlar a quantidade de pedidos e 
 * libera ou nao o pedido para o consumidor
 */
public class Controlador {
 
    public static int quantidade_pedidos = 0;
    public static boolean disponivel;
    public static Pedido pedido  = new Pedido();
   
}
