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
public class Produtor implements Runnable {

    public synchronized void produzir() {
        while (Controlador.disponivel == true) {
            try {
                System.out.println("Produtor  esperando...");

                //coloca a thread para dormir ate que o notifyAll() a acorde;
                wait();
            } catch (InterruptedException e) {
            }
        }
        Controlador.pedido = new Pedido(Controlador.pedido.getNumero() + 1, null);
        System.out.println("Produtor produzindo pedido " + (Controlador.pedido.getNumero()));
        Controlador.disponivel = true;
        notifyAll();
    }

    @Override
    public void run() {
        produzir();
    }
}
