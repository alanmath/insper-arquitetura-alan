package org.example.mensagem;


public class MensagemArquivo extends Mensagem {
    private String arquivo;

    public MensagemArquivo(String arquivo, String destinatario, String autor) {
        super(arquivo, destinatario, autor);
        this.arquivo = arquivo;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
