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
public class Consumidor implements Runnable {
    public synchronized void consumir() {
        while (Controlador.disponivel == false) {
            try {
                System.out.println("Consumidor esperado...");
                //coloca a thread para dormir ate que o notifyAll() a acorde;
                wait();
            } catch (InterruptedException e) {
            }
        }
        //informa qual pedido foi removido e qual thread efetuou o serviço
        System.out.println("Consumindo removido:" + Controlador.pedido.getNumero() + " --Quem Removeu: " + Thread.currentThread().getName());
        Controlador.disponivel = false;
        notifyAll();
    }

    @Override
    public void run() {
        consumir();
    }
}
