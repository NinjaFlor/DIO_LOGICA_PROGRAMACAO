public class trabalhandofuncoes {
    public static void main (String[] args) { //função principal do código
        torrar(); //declaração de função (método), utilizado para chamar as funções (métodos)
        getData();
        checkValues();
        enviarDados();
    }
       
	public static void torrar() { //função torrar
        System.out.println("Torrando pão");
    }

    public static void getData() { //função pegar dados
        System.out.println("Pegando dados do usuário");
        if (1<3) {
            System.out.println("Número encontrado");
        }
    }

    public static void checkValues() { //função checar valores
        System.out.println("Validadndo dados");
    }
    
    public static void enviarDados() { //função enviar dados
        String nomeDoBanco = "Banco-de-Dados";
        System.out.println("Salvando dados em: " + nomeDoBanco);

     //   if (3 == 3) {
     //       System.err.println("Senha validada");
     //   }
    }
    
}
