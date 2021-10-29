/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enigma;

import Arquivo.ArquivoTexto;
import java.util.ArrayList;

/**
 *
 * @author Celso Franca Neto
 */
public class Enigma {

    public static void main(String[] args) {
        Chave c = new Chave(3);
        CifraDeCesar game = new CifraDeCesar(c);
        ArquivoTexto.openFile();

        String mensagem = game.cifrar("dia ensolarado");
        String mensagem2 = game.cifrar("muita inflacao");
        String mensagem3 = game.cifrar("programacao");

        ArquivoTexto.writer(mensagem, String.valueOf(game.getChave().getDeslocamento()), game.getChave().getAlfabeto());
        ArquivoTexto.writer(mensagem2, String.valueOf(game.getChave().getDeslocamento()), game.getChave().getAlfabeto());
        ArquivoTexto.writer(mensagem3, String.valueOf(game.getChave().getDeslocamento()), game.getChave().getAlfabeto());

        ArrayList<String> conteudo = ArquivoTexto.reader();

        for (int i = 0; i < conteudo.size(); i++) {
            System.out.println("\n***********************************\n");
            System.out.println("Mensagem Cifrada: " + conteudo.get(i).split(";")[0] + "\nDeslocamento: " + conteudo.get(i).split(";")[1] + "\nAlfabeto: " + conteudo.get(i).split(";")[2]);
        }
        //Limpa arquivo, caso nao queira guardar as outras execuções (Nao achei um metodo concreto, usei a gambiarra)...
        ArquivoTexto.cleaner();
        //Fecha as instacias do arquivo que foram abertas...
        ArquivoTexto.close();

        //Teste Decifrar...
        System.out.println("\n***********************************\n");
        System.out.println("Mensagem 01 decifrada: " + game.decifrar(mensagem));
        System.out.println("\n***********************************\n");
        System.out.println("Mensagem 02 decifrada: " + game.decifrar(mensagem2));
        System.out.println("\n***********************************\n");
        System.out.println("Mensagem 03 decifrada: " + game.decifrar(mensagem3));

    }
}
