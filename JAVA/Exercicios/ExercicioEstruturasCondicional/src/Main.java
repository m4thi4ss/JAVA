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
         ou "Entrada negada." com base nessas condições.


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
        }*/

        /*6. Aprovação de Empréstimo**

                Para aprovar um empréstimo, um banco exige que o cliente tenha um salário mensal de pelo
        menos R$ 2.000,00 e não possua restrições de crédito.

        Crie um programa com as variáveis **`double salarioMensal`**; e **`boolean possuiRestricao`** .
        Use o operador lógico "E" (**`&&`**) em uma estrutura **`if`** para determinar e imprimir
        "Empréstimo aprovado." ou "Empréstimo negado."

        double salario;
        boolean aprovado;

        System.out.println("Me informe seu salario:");
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();

        System.out.println("Tem retrições no banco? \n true - Pra sim \n false - Pra não");
        Scanner scc = new Scanner(System.in);
        aprovado = sc.nextBoolean();

        if(salario > 2000.00 && aprovado == true)
        {
            System.out.println("Empréstimo aprovado");
        }
        else
        {
            System.out.println("Empréstimo negado");
        }
*/



        /*7. Classificação de Média Escolar Completa**

         Crie um programa que solicita ao usuário que digite uma nota (um valor

         **`double`**). Utilizando uma estrutura **`if/ else if /else`**, classifique a nota da seguinte forma:

         - Se a nota for 7.0 ou maior, imprima "Aprovado!".
         - Se a nota for maior ou igual a 5.0, mas menor que 7.0, imprima "Recuperação.".
         - Se a nota for menor que 5.0, imprima "Reprovado.".

        double nota;

        System.out.println("Me informe a nota: ");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextDouble();

        if(nota < 0 || nota > 10)
        {
            System.out.println("Esse número não é uma nota!");
        }
        else if (nota >= 7.0) {
            System.out.println("Aprovado!");
        } else if (nota == 5.0) {
            System.out.println("Recuperação!");
        }
        else
        {
            System.out.println("Reprovado!");
        }*/

        /*8. Par ou Ímpar com Operador Ternário**

        Declare uma variável **`numero`**; Utilizando o operador ternário (**`? :`**), crie uma variável String
        resultado que receba o texto "Par" se o número for par, ou "Ímpar" se for ímpar. Ao final, imprima o resultado.

                **Dica:** O operador de módulo **`%`** (resto da divisão), apresentado no material, é perfeito para isso.


        int num;
        int resultado;

        System.out.println("Me informe um número:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        resultado = num % 2;

        if(resultado == 0)
        {
            System.out.println("Par");
        }
        else if(resultado == 1)
        {
            System.out.println("Impar");
        }
        */

        /*9. Cálculo de Desconto Progressivo**

        Uma loja oferece descontos baseados no valor da compra. Crie um programa que declare uma variável

`double valorCompra = 150.0;` e aplique as seguintes regras usando `if/else if/else`:

        - Compras acima de R$ 200,00 têm 20% de desconto.
                - Compras entre R$ 100,00 (inclusive) e R$ 200,00 (exclusive) têm 10% de desconto.
                - Compras abaixo de R$ 100,00 não têm desconto.

                O programa deve usar os operadores aritméticos para calcular e exibir o valor final a ser pago.

        double valorCompra;

        System.out.println("Quanto deu a compra: ");
        Scanner sc = new Scanner(System.in);
        valorCompra = sc.nextDouble();

        if(valorCompra > 200)
        {
            System.out.println("Você ganhou um desconto de 20%!");
        }
        else if(valorCompra > 100)
        {
            System.out.println("Tem desconto de 10%!");
        }
        else
        {
            System.out.println("Não tem desconto!");
        }*/

    /*10. O Erro da Comparação de Textos**

        Analise o código abaixo. Sem executá-lo, qual será a saída impressa no console? Explique por que o resultado
        ocorre e, em seguida, corrija o código para que ele compare o conteúdo dos textos corretamente.

```java
        String senha1 = new String("admin123");
        String senha2 = new String("admin123");

        System.out.println("As senhas são iguais? " + (senha1 == senha2));
```

**Dica:** O material alerta que o operador **`==`** compara a referência de memória dos objetos, não o seu conteúdo
    textual.

        String senha1 = new String("admin123"); //String - Seria um tipo de dado; senha1 - Seria o nome da
        //variavel; new - Informa que esta sendo criado um objeto; String - Seria o objeto criado; "admin123" - Seria
        //o valor da string. Sendo assim foi criado uma variavel com o tipo de dado String onde se chama senha1, e o admin123
        //seria o valor

        String senha2 = new String("admin123");//String - Seria um tipo de dado; senha1 - Seria o nome da
        //variavel; new - Informa que esta sendo criado um objeto; String - Seria o objeto criado; "admin123" - Seria
        //o valor da string. Sendo assim foi criado uma variavel com o tipo de dado String onde se chama senha1, e o admin123
        //seria o valor

        System.out.println("As senhas são iguais? " + (senha1 == senha2)); //Aqui foi criado uma mensagem no console, onde vai
        //verificar se a senha1 ou 2 são iguais, se for da false se não da true;*/

        /*11. Cálculo de Média Exata**

        Crie um programa que peça ao usuário duas notas inteiras (int) e calcule a média exata entre elas. O desafio
        é que o resultado deve ser um double e exibir a parte decimal corretamente (ex: a média entre 7 e 8 deve ser
        7.5, e não 7).

**Dica:** Verifique no material o trecho referente a **Casting

        int nota1;
        int nota2;
        double media;

        System.out.println("Me informe as 2 notas!");
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();

        media = (double)(7 + 8)/2;

        System.out.println("A media seria:" + media);*/






    }
}