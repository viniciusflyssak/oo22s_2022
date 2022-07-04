package br.edu.utfpr.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.*;

public class Pessoa extends Identificador{ //herança
    private int idade;
    private ArrayList<LivroLocacao> codigoLivrosLocados;


    public int getCodigoPessoa() {
        return getCodigo();
    }

    public void setCodigoPessoa(int codigoPessoa) {
        this.setCodigo(codigoPessoa);
    }

    public ArrayList<LivroLocacao> getCodigoLivrosLocados() {
        return codigoLivrosLocados;
    }

    public void addCodigoLivrosLocados(LivroLocacao livroLocar) {
        this.codigoLivrosLocados.add(livroLocar);
    }

    public void removeCodigoLivrosLocados(int codLivro) {
        for (int i = 0; i < this.codigoLivrosLocados.size(); i++){
            if (codLivro  == this.codigoLivrosLocados.get(i).getCodigoLivro()){
                Duration diasPassados = Duration.between(this.codigoLivrosLocados.get(i).getDataLocacao().atStartOfDay(), LocalDate.now().atStartOfDay());
                if (diasPassados.toDays() >= 30) {
                    System.out.println("A data de entrega está vencida! terá de pagar multa!");
                    double multa = 0;
                    for(int j = 0; j < (diasPassados.toDays() - 30); j++){
                        if (multa < 20){
                            multa = multa + 0.5;
                        }else{
                            multa = multa + 1;
                        }
                    }
                    System.out.println("O valor da multa é: " + multa);
                }
                this.codigoLivrosLocados.remove(i);
            }
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(int codigoPessoa, String nome, int idade) {
        super(codigoPessoa, nome);
        this.idade = idade;
        this.codigoLivrosLocados = new ArrayList<>();
    }
}
