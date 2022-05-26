package br.edu.utfpr;

import br.edu.utfpr.model.BancoDeDados;
import br.edu.utfpr.model.LocacaoService;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        LocacaoService locacaoService = new LocacaoService();
        int opcao = -1;
        while (opcao != 4){
            System.out.println("Sistema básico para locação");
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Locar um livro");
            System.out.println("2 - Consultar locação");
            System.out.println("3 - Consultar locação por entidade");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    //locar um livro
                    locacaoService.locarLivro(scanner);
                    break;
                case 2:
                    //consultar locacao
                    break;
                case 3:
                    //consultar locacao entidade
                    break;
                case 4:
                    //sair
                    break;
                default:
                    System.out.println("Opção inválida! reiniciando menu...");
            }
        }
    }
}
