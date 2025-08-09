import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

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



        do{
            System.out.println("Me informe um número: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            resultado = num + resultado;

            System.out.println(resultado);

            if(num == 0)
            {
                System.out.println("Segue soma de todos números informados: " + resultado);
            }
            else if (num < 0)
            {
                System.out.println("Somente números inteiros!");
                System.out.println("Me informe o número inteiro novamente:");
                num = sc.nextInt();
            }
        }while(num != 0);
*/
/*
**3 - Validação de Senha**

Crie um sistema de cadastro simples que peça ao usuário para criar uma senha. O programa deve usar um laço do-while para
*  garantir que a senha inserida tenha pelo menos 8 caracteres. Enquanto a senha não atender a esse critério, o programa
*  deve informar "Senha muito curta. A senha deve ter no mínimo 8 caracteres." e pedir a senha novamente. Quando uma
* senha válida for inserida, exiba "Senha cadastrada com sucesso!".

*Dica: Você pode verificar o tamanho de uma String com o método `.length()`.*



        String senha;

        do {
            System.out.println("Me informe a senha:");
            Scanner sc = new Scanner(System.in);
            senha = sc.nextLine();

            if (senha.length() < 9)
            {
                System.out.println("Senha cadastrada!");
            }
            else
            {
                System.out.println("Senha maior que 8 caracteres!");
            }

        }while (senha.length() > 8);

    } */
        /*
        **4 - Calculadora Interativa**

Desenvolva uma calculadora que realiza as quatro operações básicas (soma, subtração, multiplicação, divisão). O programa
*  deve:

1. Apresentar um menu com as opções e a opção de sair.
2. Pedir ao usuário para escolher uma operação.
3. Pedir ao usuário para inserir dois números.
4. Realizar a operação e mostrar o resultado.
5. O laço `do-while` deve garantir que, após cada operação, o menu seja exibido novamente, até que o usuário escolha a
* opção "Sair".


        double num = 0;
        double num2 = 0;
        double calculo = 0;
        double menu;

        do {
            System.out.println("Menu \n 1 - Soma\n 2 - Resto\n 3 - Subtracao\n 4 - Divisao\n 5 - Multiplicacao\n 6 - Sair");
            Scanner sc = new Scanner(System.in);
            menu = (int) sc.nextDouble();


            if (menu == 1) {
                System.out.println("Me informe o primeiro numero:");
                Scanner scc = new Scanner(System.in);
                num = scc.nextDouble();

                System.out.println("Me informe o segundo numero:");
                Scanner sccc = new Scanner(System.in);
                num2 = sccc.nextDouble();

                calculo = num + num2;

                System.out.println("O resultado seria: " + calculo);

            } else if (menu == 2) {
                System.out.println("Me informe o primeiro numero:");
                Scanner sc1 = new Scanner(System.in);
                num = sc1.nextDouble();

                System.out.println("Me informe segundo numero:");
                Scanner sc2 = new Scanner(System.in);
                num = sc2.nextDouble();

                calculo = num % num2;

                System.out.println("O resultado seria: " + calculo);
            } else if (menu == 3) {
                System.out.println("Me informe o primeiro numero:");
                Scanner sc3 = new Scanner(System.in);
                num = sc3.nextDouble();

                System.out.println("Me informe o segundo numero:");
                Scanner sc4 = new Scanner(System.in);
                num2 = sc4.nextDouble();

                calculo = num - num2;

                System.out.println("O resultado seria: " + calculo);

            } else if (menu == 4) {
                System.out.println("Me informe o primeiro numero:");
                Scanner sc5 = new Scanner(System.in);
                num = sc5.nextDouble();

                System.out.println("Me informe o segundo numero:");
                Scanner sc6 = new Scanner(System.in);
                num2 = sc6.nextDouble();

                calculo = num / num2;

                System.out.println("O resultado seria: " + calculo);
            } else if (menu == 5) {
                System.out.println("Me informe o primeiro numero:");
                Scanner sc7 = new Scanner(System.in);
                num = sc7.nextDouble();

                System.out.println("Me informe o segundo numero:");
                Scanner sc8 = new Scanner(System.in);
                num2 = sc8.nextDouble();

                calculo = num * num2;

                System.out.println("O resultado seria: " + calculo);
            } else if (menu < 1 || menu > 6) {
                System.out.println("Esse numero nao tem no menu!");
            } else {
                System.out.println("Muito obrigado, ate logo!");
            }

        } while (menu != 6); */

        /*
        **1 - Contagem**

Escreva um programa que use um laço for para fazer uma contagem de 1 até 10 e, no final, imprima "Tempo!".

        for(int i = 1; i < 11; i++)
        {
            System.out.println(i);
        }
        System.out.println("Tempo!");*/

        /*
        **2 - Tabuada de Multiplicação**

Peça ao usuário para inserir um número inteiro. Em seguida, use um laço for para calcular e imprimir a tabuada de
* multiplicação desse número, do 1 ao 10.

Exemplo de saída para o número 7:

        System.out.println("Me informe o primeiro numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i < 11; i++)
        {
            int resultado = num * i;
            System.out.println(i + "*" + num + "=" + resultado );
        }
        */
        /*
        **3 - Cálculo de Fatorial**

Crie um programa que peça ao usuário um número inteiro não negativo e calcule seu fatorial. O fatorial de um número n
* (representado por n!) é o produto de todos os inteiros positivos menores ou iguais a n.
* Por exemplo, 5! = 5 * 4 * 3 * 2 * 1 = 120. Use um laço for para realizar a multiplicação.

*Dica: Comece com uma variável de resultado igual a 1 e multiplique-a pelos números de `n` até 1.*
         */
        

    }
}