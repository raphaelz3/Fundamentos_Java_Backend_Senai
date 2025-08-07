import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        //Fundamentais
//        //Repetir Mensagem
//        String senha;
//        boolean passou = false;
//
//        while (!passou){
//            System.out.printf("Digite sua senha: ");
//            senha = scan.next();
//            if(senha.equals("123")){
//                passou = true;
//            }
//        }
//
//        //Contador Crescente
//        int n = 1;
//        while ( n <= 10){
//            System.out.println(n);
//            n++;
//        }
//
//        //Intermediario
//        //Do-Wile
//        String continua = "s";
//
//
//        do {
//            System.out.println("Execultando Processo...");
//            System.out.println("Continuar Execultando processo? Digite \"s\" para sim: ");
//            continua = scan.next();
//        }while (continua.equals("s") || continua.equals("S"));
//
//
//        //Somador de numeros
//        int numero = 0,result;
//        do {
//            System.out.printf("Digite um numero inteiro para efetuar a soma ou 0 para finalizar: ");
//            result = scan.nextInt();
//            numero += result;
//        }while (result != 0);
//        System.out.println("a soma é " + numero);

        //intermediario
        //validacao de senha
//        String criarSenha;
//
//        do {
//            System.out.println("Crie uma senha com pelo menos 8 caracteres: ");
//            criarSenha = scan.nextLine();
//            if (criarSenha.length() < 8)
//                System.out.println("Erro, sua senha tem menos de 8 caracteres!\n");
//        }while(criarSenha.length() < 8);
//        System.out.println("Senha Criada com sucesso!\n");
//
//        //Calculadora interativa
//        double num1, num2, opcao;
//
//        do{
//            System.out.printf("Selecione a operação que deseja efetuar: \n1 - Soma(+)\n2 - Subtração(-)\n" +
//                    "3 - Multiplicação(*)\n4 - Divisão(/)\n0 - Sair\n opção: ");
//            opcao = scan.nextInt();
//            if (opcao != 0 && opcao >= 0 && opcao <= 4){
//                System.out.printf("Digite o primeiro numero: ");
//                num1 = scan.nextInt();
//                System.out.printf("Digite o segundo numero: ");
//                num2 = scan.nextInt();
//                if (opcao == 1)
//                    print(soma(num1, num2));
//                else if (opcao == 2)
//                    print(subtracao(num1, num2));
//                else if (opcao == 3)
//                    print(multiplicacao(num1, num2));
//                else
//                    print(divisao(num1, num2));
//            }
//        }while(opcao != 0);
//
//        //For
//        //Contagem
//        for (int n = 1; n <= 10; n++ )
//            System.out.println(n);

//        //tabuada
//        int multiplicador;
//
//        System.out.printf("Digite um numero para ser multiplicado: ");
//        multiplicador = scan.nextInt();
//        for (int n = 1; n < 11; n++){
//            System.out.printf(multiplicador + " x " + n + " = " + multiplicacao(multiplicador, n) + "\n");
//        }
//
//        //Calculo de fatorial
//        long fatorial, result = 1;
//
//
//        System.out.printf("Digite um numero para ser fatorado: ");
//        fatorial = scan.nextInt() - 1;
//        for (int n = 0; fatorial != n; fatorial--) {
//            result += result * fatorial;
//        }
//        System.out.println("Resultado: " + result);
//

//        //Verificar numero Primo
//        int primo;
//        boolean ePrimo =true;
//
//        System.out.printf("Digite um inteiro para verificar se é primo: ");
//        primo = scan.nextInt();
//
//        if (primo > 0) {
//            for (int n = 2; n < primo - 1; n++) {
//                if (primo % n == 0)
//                    ePrimo = false;
//            }
//            System.out.println("O número é primo: " + ePrimo);
//        }else
//            System.out.println("Digite um numero maior que 0.");

        //Listar todos os primos de 1 a 100

        for (int n = 2 ; n <= 99; n++){
            for (int i = 1 ; i <= 99; i++){
                if (n % i == 0){

                }
            }
        }

        scan.close();
    }
    public static double soma(double a, double b){
        return a + b;
    }
    public static double subtracao(double a, double b){
        return a - b;
    }
    public static double multiplicacao(double a, double b){
        return a * b;
    }
    public static double divisao(double a, double b){
        return a / b;
    }
    public static void print(double result)
    {
        System.out.println("\nO resultado é: " + result + "\n");
    }
}
