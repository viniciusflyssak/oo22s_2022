package br.edu.utfpr;
/*
Criar programa orientado à objetos para solucionar os seguintes casos de uso:
- Será o controle de uma biblioteca
- Desenvolver método para a locação de livro
- deverá validar se livro está disponível
- Método para reserva de livro
- Validá se há alguma reserva para data e se estará disponível
- Método para devolução do livro
- Válida se a data da entrega é anterior a data máxima
- caso tenha vencido calcular 50 centavos ao dia até 20 reais, depois 1 real por dia

 */
public class Main {

    public static void main(String[] args) {
	    System.out.println("Sistema básico para locação");
        System.out.println("Escolha a opção desejada:");
        System.out.println("1 - Locar um livro");
        System.out.println("2 - Consultar locação");
        System.out.println("3 - Consultar locação por entidade");
        System.out.println("4 - Sair");
    }
}
