public class FuncoesComParametros {

    public static void main(String[] args) {
    //    int resultado = somar(5,6);
    //    torrar("pão de forma", "Felipe", 10.90);
    //    torrar("pão integral", 15.90);
    //    System.out.println("O valor da soma é " + resultado);

    
    String userName = getFirstName("Carlos-De-Almeida-Oliveira-Santoro", "-");
    System.out.println("Seja bem vindo " + userName + "!");

    userName = getFirstName("Felipe Almeida Campelo", " ");
    System.out.println("Seja bem vindo " + userName + "!");
        
    }

    public static String getFirstName(String name, String splitChar){
        String[] parts = name.split(splitChar);
        return parts[0];

    }

    public static void torrar (String pao, String nome, Double valor){ //função deve ter o nome de uma ação
        //void = função sem retorno
        System.out.println("Torrada feita com " + pao);
        System.out.println("Pedido feito por " + nome);
        System.out.println("Pedido feito por " + valor);


    }

    public static void torrar (String pao, Double valor){ //sobrecarga de função, para definir valores padrão  (sobrecargar (overload))
        torrar(pao, "Cliente", valor);

    }

    public static int somar (int numA, int numB){
        //para função com retorno não pode utilizar void
        //Para o exemplo em somar o retorno é um número inteiro portanto int na função para retornar o valor
        int somatorio = numA+numB;
        return somatorio; //cada função pode ter apenas  retorno
        

    }

}