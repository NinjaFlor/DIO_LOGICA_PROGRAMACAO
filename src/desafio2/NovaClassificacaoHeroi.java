package desafio2;

import java.util.Scanner;

/* # 2️⃣ Calculadora de partidas Rankeadas
**O Que deve ser utilizado**

- Variáveis
- Operadores
- Laços de repetição
- Estruturas de decisões
- Funções

## Objetivo:

Crie uma função que recebe como parâmetro a quantidade de vitórias e derrotas de um jogador,
depois disso retorne o resultado para uma variável, o saldo de Rankeadas deve ser feito através do calculo (vitórias - derrotas)

Se vitórias for menor do que 10 = Ferro
Se vitórias for entre 11 e 20 = Bronze
Se vitórias for entre 21 e 50 = Prata
Se vitórias for entre 51 e 80 = Ouro
Se vitórias for entre 81 e 90 = Diamante
Se vitórias for entre 91 e 100= Lendário
Se vitórias for maior ou igual a 101 = Imortal

## Saída

Ao final deve se exibir uma mensagem:
"O Herói tem de saldo de **{saldoVitorias}** está no nível de **{nivel}**" 
*/


public class NovaClassificacaoHeroi {
        
    public static String calculoNivel(int vitorias, int derrotas) {

        int saldo = vitorias - derrotas;
        String nivel;

        if (vitorias <= 10 ){
            nivel = "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        return "O Herói tem saldo de " + saldo + " está no nível de " + nivel;
    }

    @SuppressWarnings("resource")
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o quantidade de vitórias: ");
            int vitorias = scanner.nextInt();

            System.out.print("Digite a quantidade de derrotas: ");
            int derrotas = scanner.nextInt();
            scanner.nextLine(); 

            String resultado = calculoNivel(vitorias, derrotas);
            System.out.println(resultado);
            System.out.println();

            System.out.print("Deseja classificar outro herói? (s/n): ");
            continuar = scanner.nextLine();

            System.out.println();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Nenhuma classificação realizada.");
    }
}