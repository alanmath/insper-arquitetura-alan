package org.example;

import org.example.mensagem.MensagemArquivo;
// import the mensage class
import org.example.mensagem.MensagemTexto;


// make a main that test the classes mensagem, mensagemArquivo e mensagemTexto and autor
public class Main {
    public static void main(String[] args) {
        // make a new MensagemTexto
        MensagemTexto mensagem = new MensagemTexto("Olá, tudo bem?", "João", "Maria");
        // make a new MensagemArquivo
        MensagemArquivo mensagemArquivo = new MensagemArquivo("arquivo.txt", "João", "Maria");
        // print the mensage
        System.out.println(mensagem.getTexto());
        // print the mensage
        System.out.println(mensagemArquivo.getArquivo());
    }
}

