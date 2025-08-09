import desafio1.ClassificadorHeroi;
import desafio2.NovaClassificacaoHeroi;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Classificador de Nível de Herói (Desafio 1)");
            System.out.println("2 - Calculadora de Partidas Rankeadas (Desafio 2)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    ClassificadorHeroi.main(new String[]{}); 
                    break;
                case 2:
                    NovaClassificacaoHeroi.main(new String[]{}); 
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
