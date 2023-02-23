package org.example.mensagem;

public class MensagemTexto extends Mensagem {
    private String texto;

    public MensagemTexto(String texto, String destinatario, String autor) {
        super(texto, destinatario, autor);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
