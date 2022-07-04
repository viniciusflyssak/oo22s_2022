package br.edu.utfpr.model;

public class Identificador {
    private int codigo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Identificador(int codigo) { //Exemplo de polimorfismo horizontal(sobrecarga)
        this.codigo = codigo;
    }

    public Identificador(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
