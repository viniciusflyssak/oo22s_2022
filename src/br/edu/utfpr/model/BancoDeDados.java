package br.edu.utfpr.model;

import java.util.List;

public class BancoDeDados {
    public List<Livro> Livros = List.of(
            new Livro(1, "Pica-Pau aventuras mortais", 1992, "Jonas", 10),
            new Livro(2, "Hora de aventura: o livro", 2012, "W.", 5),
            new Livro(3, "Regular Show", 2013, "J.G. Quintel", 6),
            new Livro(4, "Guia de Redstone no minecraft", 2016, "Josef", 3),
            new Livro(5, "Como domar um elfo selvagem", 1992, "Alena", 9),
            new Livro(6, "Imortalidade: uma aventura sobre a vida", 1998, "Ellie", 3),
            new Livro(7, "Como coordenar uma rede de restaurantes de sucesso", 2008, "Gus", 1),
            new Livro(8, "Como produzir substâncias altamente lucrativas", 2011, "Mr. white", 2),
            new Livro(9, "Como matar seu professor de química", 2013, "Jessy", 6),
            new Livro(10, "Atumalaca e suas aventuras risonhas", 2008, "cRaZy FrOg", 8)
    );
    public List<Pessoa> Pessoas = List.of(
            new Pessoa(1,"Jonas", 18, null),
            new Pessoa(2,"Julia", 22, null),
            new Pessoa(3,"Peter", 25, null),
            new Pessoa(4,"Simone", 32, null),
            new Pessoa(5,"Jeribaldo", 40, null),
            new Pessoa(6,"Fausto Salvo", 89, null)
    );
}
