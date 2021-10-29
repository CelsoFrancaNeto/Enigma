/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enigma;

/**
 *
 * @author Celso Franca Neto
 */
public class Chave {

    private int deslocamento;
    private String alfabeto = "abcdefghijklmnopqrstuvwxyz";

    public Chave(int deslocamento) {
        this.deslocamento = deslocamento;
    }

    public int getDeslocamento() {
        return this.deslocamento;
    }
    
    public String getAlfabeto() {
        return alfabeto;
    }
}
