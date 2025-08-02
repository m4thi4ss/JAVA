import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*1. Verificador de Maioridade**

                Crie um programa que declare uma variável **`idade`**.

        Use uma estrutura **`if/else`** para verificar se a idade é **maior ou igual a 18**.

        O programa deve imprimir "*Você é maior de idade*" se a condição for verdadeira, e
        "*Você é menor de idade*" caso contrário

        int idade;

        System.out.println("Me informe sua idade: ");
        Scanner sc = new Scanner(System.in);
        idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de idade");
        }*/

        /*2. Verificador de Número (Positivo, Negativo ou Zero)**

                Crie um programa que declare uma variável **`numero`**;

        Utilize uma estrutura **`if/else if/else`** para verificar e imprimir uma das seguintes mensagens:
        "*O número é positivo.*", "*O número é negativo.*" ou "*O número é zero.*".

        int numero;

        System.out.println("Me informe um número: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        if(numero < 0)
        {
            System.out.println("O número é negativo.");
        }
        else if (numero == 0)
        {
            System.out.println("O número é zero.");
        }
        else
        {
            System.out.println("O número é positivo.");
        }*/


        /*3. Classificação de Aluno**

                Crie um programa que use a classe **`Scanner`** para pedir ao usuário que digite a nota de
        um aluno (um valor **`double`**).

        Em seguida, use uma estrutura **`if/else`** simples para imprimir "Aprovado" se a nota for maior ou
        igual a 7.0, e "Reprovado" caso contrário

        int nota;

        System.out.println("Me informe sua nota: ");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();

        if(nota >= 7)
        {
            System.out.println("Aprovado");
        }
        else if(nota < 7)
        {
            System.out.println("Reprovado");
        }*/
        /*
        **4. Status de Tarefa**

Declare uma variável **`boolean tarefaConcluida`**.

Usando uma estrutura **`if/else`**, exiba a mensagem "A tarefa está pendente!" se a variável for **`false`**,
* e "A tarefa foi finalizada com sucesso!" se for **`true`**.



        boolean tarefaConcluida;

        System.out.println("A tarefa foi concluida: true - Pra sim e False - Pra não!");
        Scanner sc = new Scanner(System.in);
        tarefaConcluida = sc.hasNextLine();

        if(tarefaConcluida == true)
        {
            System.out.println("A tarefa foi finalizada com sucesso!");
        }
        else
        {
            System.out.println("A tarefa foi finalizada com sucesso!");
        }*/

        /*5. Permissão para Entrar na Festa**

                Um evento permite a entrada de pessoas com 18 anos ou mais. No entanto, pessoas com 16
    ou 17 anos também podem entrar se estiverem acompanhadas por um responsável.

        Crie um programa que declare duas variáveis: **`idade`**; e **`boolean acompanhado`**;.
        Use uma estrutura **`if`** com operadores lógicos (**`||`** e **`&&`**) para imprimir "Entrada permitida."
         ou "Entrada negada." com base nessas condições.*/


        int idade;
        boolean autorizado;


        System.out.println("Você tem quantos anos?");
        Scanner sc = new Scanner(System.in);
        idade = sc.nextInt();

        System.out.println("Esta acompanhado?\n true - Pra SIM\n false - Pra não!");
        Scanner sc1 = new Scanner(System.in);
        autorizado = sc.nextBoolean();




        if(idade >= 18)
        {
            System.out.println("Você esta autorizado!");

        }
        else if (idade >= 16 && autorizado == true)
        {
            System.out.println("Você esta autorizado!");
        }
        else
        {
            System.out.println("Você não esta autorizado!");
        }

        /*6. Aprovação de Empréstimo**

                Para aprovar um empréstimo, um banco exige que o cliente tenha um salário mensal de pelo
        menos R$ 2.000,00 e não possua restrições de crédito.

        Crie um programa com as variáveis **`double salarioMensal`**; e **`boolean possuiRestricao`** .
        Use o operador lógico "E" (**`&&`**) em uma estrutura **`if`** para determinar e imprimir
        "Empréstimo aprovado." ou "Empréstimo negado."*/




    }
}