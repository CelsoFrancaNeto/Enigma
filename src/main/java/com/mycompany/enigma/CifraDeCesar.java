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
public class CifraDeCesar {

    public Chave chave;

    public CifraDeCesar(Chave chave) {
        this.chave = chave;
    }

    public String cifrar(String mensagem) {
        String resultado = "";

        for (int i = 0; i < mensagem.length(); i++) {
            for (int j = 0; j < chave.getAlfabeto().length(); j++) {
                if (mensagem.charAt(i) == chave.getAlfabeto().charAt(j) || (int) mensagem.charAt(i) == 32) {
                    try {
                        if ((int) mensagem.charAt(i) == 32) {
                            resultado = resultado + " ";
                            i++;
                        } else {
                            resultado = resultado + String.valueOf(chave.getAlfabeto().charAt(j + chave.getDeslocamento()));
                        }
                    } catch (Exception StringIndexOutOfBoundsException) {

                        resultado = resultado + String.valueOf(chave.getAlfabeto().charAt(j - (26 - chave.getDeslocamento())));

                    }
                }

            }
        }

        return resultado;
    }

    public String decifrar(String mensagem) {
        String resultado = "";

        for (int i = 0; i < mensagem.length(); i++) {
            for (int j = 0; j < chave.getAlfabeto().length(); j++) {
                if (mensagem.charAt(i) == chave.getAlfabeto().charAt(j) || (int) mensagem.charAt(i) == 32) {
                    try {
                        if ((int) mensagem.charAt(i) == 32) {
                            resultado = resultado + " ";
                            i++;
                        } else {
                            resultado = resultado + String.valueOf(chave.getAlfabeto().charAt(j - chave.getDeslocamento()));
                        }

                    } catch (Exception StringIndexOutOfBoundsException) {

                        resultado = resultado + String.valueOf(chave.getAlfabeto().charAt(j + (26 - chave.getDeslocamento())));
                    }
                }

            }
        }

        return resultado;
    }

    public Chave getChave() {
        return chave;
    }

}
