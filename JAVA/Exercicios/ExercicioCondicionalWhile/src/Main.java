import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    /*### 9. **Contador até 10**

                > Use while para contar de 1 até 10, mostrando cada número.
>

        int num = 1;

        while (num <= 10)
        {
            System.out.println(num);
            num++;
        }*/
        /*

        ### 10. **Validador de senha com tentativas**

> O usuário tem até 3 tentativas para digitar a senha correta.



        String senha = "senha123";
        String novaSenha;

        int tentativa = 3;
        do {
            System.out.println("Me informe a senha:");
            Scanner sc = new Scanner(System.in);
            novaSenha = sc.next();

            if (novaSenha == senha) {
                System.out.println("Senha correta!");
                break;
            } else
            {
                tentativa--;
                if(tentativa > 0)
                {
                    System.out.println("Senha incorreta, você só tem " + tentativa + "  tentativas");
                }
                else
                {
                    System.out.println("Tentativas acabaram!");
                    break;
                }


            }
        }while(novaSenha != senha);
*/


       /* **1 - Repetir Mensagem**

Pergunte uma senha para o usuário, enquanto ele não acertar a senha `123` pergunte novamente.
         int senha = 134;

         while(senha != 123)
         {
             System.out.println("Me informe a senha: ");
             Scanner sc = new Scanner(System.in);
             senha = sc.nextInt();

             if (senha == 123){
                 System.out.println("Senha correta!");
             }
             else
             {
                 System.out.println("Senha incorreta!");
             }
*/
        /*
        **2 - Contador Crescente**

Crie um programa que use um laço while para imprimir os números de 1 a 10 no console.


        int num = 1;

        while (num <= 10)
        {
            System.out.println(num);
            num++;
        }*/

    /* *3 - Jogo de Advinhação**

        Desenvolva um jogo onde o computador "pensa" em um número inteiro aleatório entre 1 e 100.
        O jogador deve tentar adivinhar qual é o número. A cada tentativa, o programa deve informar
        se o palpite do jogador é maior ou menor que o número secreto. O jogo continua até que o jogador
        acerte o número. No final, mostre quantas tentativas foram necessárias.

                *Dica: Para gerar um número aleatório, você pode usar `int
                numeroSecreto = new Random().nextInt(100) + 1;

        int num = 0;

        int numeroSecreto = new Random().nextInt(100) + 1;

        do{
            System.out.println("Me informe o número que foi escolhido pela maquina: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            if(num == numeroSecreto)
            {
                System.out.println("Parabéns, você acertou!!!");
            }
            else if (num > numeroSecreto)
            {
                System.out.println("Você errou! O numero informado é maior!");
            }
            else if (num < numeroSecreto)
            {
                System.out.println("Você errou! O numero informado é menor!");
            }
        } while(num != numeroSecreto);*/

        /*
        **4 - Simulador de Caixa Eletrônico (Saques)**

Crie um programa que simule um caixa eletrônico.

Inicie com um saldo em conta (por exemplo, R$ 2000,00). Solicite ao usuário que insira o valor que deseja sacar.

O laço while deve continuar executando e permitindo saques enquanto o saldo da conta for positivo.

Regras:

1. Não permita saques de valores maiores que o saldo atual. Se o usuário tentar, informe que o saldo é insuficiente.
2. O programa encerra (o laço `while` termina) quando o saldo se torna zero ou negativo.
3. Ao final de cada saque, mostre o novo saldo.


        double saldo = 2000.00;
        double saque;


        System.out.println("Você tem o saldo de " + "R$" + saldo + ". Qual valor você deseja sacar: ");

        do
        {

            Scanner sc = new Scanner(System.in);
            saque = sc.nextDouble();


            if(saque <= saldo)
            {
                saldo = saldo - saque;
                System.out.println("Seu saldo foi atualizado para " + "R$" + saldo + ". Deseja sacar qual valor:");
            }
            else if(saque > saldo)
            {
                System.out.println("Saldo insuficiente! Você tem o saldo de " + saldo + ". Qual seria o valor do " +
                        "saque:");
            }


        }while(saldo != 0);

        /*
        **1 - Repetição de Processo**

Escreva um programa que imprime a mensagem "Executando o processo..." e, em seguida, pergunta ao usuário se
* ele deseja executar o processo novamente. Se o usuário digitar 's' (ou 'S'), o processo se repete. Caso
* contrário, o programa é encerrado. O do-while é ideal aqui, pois o processo sempre executa pelo menos uma vez.


        String simNao;

        do{
            System.out.println("Excutando o processo...");

            System.out.println("Me infome se você quer que o processo se repita (S - Pra não)");
            Scanner sc = new Scanner(System.in);
            simNao = sc.nextLine();
        }while(!simNao.equals("S"));
*/
/*
**2 - Somador de Números**

Faça um programa que peça ao usuário para inserir números inteiros. O programa deve somar todos os números inseridos.
O laço deve parar quando o usuário inserir o número 0. No final, mostre a soma total dos números inseridos.


        int num;
        int resultado = 0;

        System.out.println("Me informe um número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        do{

            if(num > 0)
            {
                System.out.println("Me informe o proximo numero: ");
                num = sc.nextInt();
                resultado = resultado + num;
            }
            else if(num == 0)
            {
                System.out.println("Segue soma de todos números informados: " + resultado);
            }
            else if (num < 0)
            {
                System.out.println("Somente números inteiros!");
                System.out.println("Me informe o número inteiro novamente:");
                num = sc.nextInt();
            }
        }while(num != 0);*/

    }
}