//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //main ele é obrigatorio sempre ter.
    public static void main(String[] args) {
        //Esse codigo abaixo faz x

        //Escreve uma mensagem na tela do console
        //System.out.printf("Hello and welcome!");

        //Atalho sout - pra criar um print, mensagem na tela
        System.out.println("");

        /* VARIAVEIS
         Toda variavel no JAVA tem que ter um tipo e um nome

         Tipo de variaveis

         int - números inteiros;
         ex.: int idade = 22

         long - Números inteiros, porém somente para números inteiros.
         E tem que sempre terminar com um L no final do número inteiro. Ele ocupa muita memoria então a melhor
         opção é colocar se realmente precisar.
         ex.: long populacao = 80000000000000000L

         double - números decimais, números quebrados. Padrão americano, que seria sempre usado "."
         ex.: double preco = 20.90;

         float - Ele é decimal também, porém ele cabe mais números que o double.
         ex.: float altura = 1.76f;

         String - Ele é usado para textos, tendo que ter "" duplas. Não pode colocar aspas simples '', por que é
         usado no carteres. É obrigatorio ter S maisculo.
         ex.: String nome = "Vinicio";

         char - Seria para caracter, guardando caracteres. Podendo guardar somente uma letra ou caracter. Ele é usado com aspas
         simples ''.
         ex.: char letra = 'A'

         boolean - Seria o SIM ou NÃO
         ex.: boolean maiorDeIdade = true; //podendo ser false também.
         */

        /*
        OPERADORES
        Os operadores logicos ele serve para comparar, concatenar, atribuir e contas lógicas.

        = - Ele seria o valor de algo, ele vai atribuir alguma coisa pra algo.
        ex.: int idade = 22

        + - Seria um operador aritmético, servindo pra fazer contas.
        ex.: int soma = 8 + 5;

        - - para subtrair.
        ex.: int subtracao = 8 - 5;

        * - multiplicação
        ex.: int multiplicacao = 8 * 2;

        / - divisão
        ex.: int divisao = 10 / 2;

        % - resto. ELe é o famoso true e falso da conta aritmetica.
        ex.: int resto = 10 % 2;

        == - Seria o igual =.
        ex.: System.out.println(10 == 6);

        < - menor.
        ex.: System.out.println(10 < 2)

        > - maior.
        ex.: System.out.println(2 > 10)

        => - Seria igual ou maior.
        ex.: System.out.pritnln(10 => 10)

        =< - Seria igual ou menor.
        ex.: System.out.pritnln(10 =< 10)

        != - Ele informa que se for diferente.
        ex.: System.out.println(10 != 5)

        Casting - Seria quando você quer que o resultado da seja outro tipo de dado
        ex.: double media = "(double)"(num1 + num2 + num3) / 3;
        O (double) seria o Casting, ele que transforma o resultado dessa variavel em double
         */
        /*
        VARIAVEIS - TRANSFORMANDO O TIPO DE DADOS

        Scanner - Ele serve pra fazer a leitura de uma informação que vai ser passada pelo usuario. Ele seria a mesma
        coisa que o ReadLine.
        ex.:    System.out.println("Me informe os números: ");
                Scanner sc = new Scanner(System.in);

         sc.nextInt() - Esse ele vai avisa que vai ser um int e não uma string. Mas caso queira fazer uma string você
         tem que colocar o nextLine. Vai ser a mesma coisa que o Parse.
         ex.:   System.out.println("Me informe os números: ");
                Scanner sc = new Scanner(System.in);
                int num1 = sc.nextInt();
         ex.:   System.out.println("Me informe seu nome: ")
                Scanner sc = new Scanner(System.in)
                String nome = sc.nextLine();
         */
        /*
        ESTRUTURAS CONDICIONAIS

        IF - Seria o "SE", usado pra SE a informação for a regra do parametro desse IF ele vai rodar o bloco de codigo.
        éx.:    int num = 5;
                if(num < 10)
                {
                    System.out.Println("Num é menor que 10!!")
                }

        ELSE IF - Ele seriaa mesma coisa que IF, mas quando ja existe o IF, por questão de nomenclatura, quando ter um
        segundo IF, vai ser ELSE IF.
        ex.:    int num = 5;
                if(num < 10)
                {
                    System.out.Println("Num é menor que 10!!")
                }
                else if(10 < num)
                {
                    System.out.Println("num é maior que 10!");
                }
        ELSE - Ele seria o SE NAO, ele basicamente vai ver todas as regras dos parametros dos if e else if e vai criar
        o seu proprio parametro com qualquer informação que foi diferente do IF e ELSE IF.
        ex.:    int num = 5;
                if(num < 10)
                {
                    System.out.Println("Num é menor que 10!!")
                }
                else if(10 < num)
                {
                    System.out.Println("num é maior que 10!");
                }
                else
                {
                    System.out.println("Isso não é um numero inteiro!")
                }



         */

    }
}