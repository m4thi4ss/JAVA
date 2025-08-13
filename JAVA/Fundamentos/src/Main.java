import java.util.Scanner;

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


        /*
        ESTRUTURAS DE REPETIÇÃO

        WHILE - O While significa "ENQUANTO", sendo enquanto nao for a regra do parametro ele vai continuar rodando o
        codigo, ele sozinho é diferente do DO, pois primeiro ele executa a informação que esta na variavel, então ele
        nem executa o bloco de codigo e sim ja do resultado do mesmo usando a informação guardada na varivel antes que
        ele foi criado.
        ex.:
                String nome = "Vini";
                Scanner sc = new Scanner(System.in)

                 nome.equals = "Fulano";
                 while(!nome.equals("Vini"))
                {
                    System.out.println("Incorreto");
                    System.ou.println("Me informe o nome novamente: ")
                    nome = sc.nextLine();
                 }
                    ou
                int num = 1;

                while (num <= 10)
                {
                    System.out.println(num);
                    num++;

        OBS: O os operadores de compração != e == não é usado para texto.

        DO WHILE - Ele seria a mesma coisa que o While, so que o Do
         */
        /*
        VETORES(ARRAY)

        Um Array ele guarda diversas informações dentro dela. Todo array tem um limite de coisas. Por que você precisa
        guardar uma memoria pra ele.
        ex.:
        #Guardando espaco na memoria
        int[] idades = new int[5];
        String[] nomes = new String[10];

        Pra verificar uma informacao dentro desse array, voce vai precisar pegar pelo "id" de cada informacao, comecando
        pelo 0, e indo ate o numero que foi informado, fazendo a conta em quantidade, como por exemplo: se for 5
        informacoes, o ultimo vai ter "id" - 4.
        Ex.:
        #Como guardar as informacoes
        idades[0] = 12;
        idades[1] = 11;
        idades[2] = 10;
        idades[3] = 9;
        idades[4] = 8;

        #Pra mostrar seria
        System.out.println(idades[1])

        #Mostrar diversos id com FOR
        for(int i = 0; i < 5; i++)
        {
            System.out.println(idades[i])
        }

        FUNCOES

        Na funcao ele tem o escopo, classe, tipo de dado e nome da variavel, tendo o parametro que seria os valores que
        variavel vai guardar e no final teria o return que seria basicamente o metodo daquela funcao.
        ex.:

        public class Main{
        public static int somar( int valor1, int valor2)
        {
            return valor1 + valor2;
        }

        O void ele e usado quando voce nao vai ter return, ele sempre vai ter um valor acao chumbada e nunca vai
        poder ser usado em outra classe.
        ex.:

        public class Main{
        public static void subtrair(int valor1, int valor2)
        {
            System.out.println(valor1 - valor2);
        }

        Ja sem ele, voce ja coloca o tipo de dado no lugar dele e ja faz um return pra retornar um metodo, fazendo com
        que use ele futuramente.

        Alguns exemplos:

        /*1. Exibir uma mensagem de boas-vindas
Crie uma função chamada mostrarMensagem que imprima no console a seguinte frase:
"Bem-vindo(a) ao programa!"
Dicas:
A função não deve ter parâmetros.
A função não precisa retornar nenhum valor (tipo void).
Exemplo esperado ao chamar a função:
mostrarMensagem(); // Saída: Bem-vindo(a) ao programa!

public class Main { //public - Aqui esta informando que qualquer um pode ver essa classe; class - Esta informando que
    //uma classe; Main - Seria o nome da Classe;
    public static void mostrarMensagem() {
        System.out.println("Bem-vindo(a) ao program!");
    }
    public static void main(String[] args)
    {
        mostrarMensagem();
    }

}*/

/*### **2. Método com Retorno**

Um método pode retornar um valor usando a palavra-chave `return`. O tipo de retorno é especificado antes do nome
do método.

**Exemplo:

public class Main {
    public static int somar (int num1, int num2)
    {
        return  num1 + num2;
    }
    public static void main(String[] args)
    {
        int resultado = somar(5, 2);
        System.out.println("Resultado da soma:" + resultado);
    }

}*/
/*
### **3. Método com Parâmetros**

Os parâmetros permitem passar valores para o método, tornando-o reutilizável e flexível. Em Java, tipos como
`String` são classes, por isso se escreve com `S` maiúsculo.

- O método `exibirMensagem` recebe um parâmetro `nome` do tipo `String`.
- Ao chamá-lo, passamos valores diferentes como argumento.

public class Main{
    public static void exibirMensagem (String nome ){
        System.out.println("Bem-vindo " + nome + "!");
    }
    public static void main(String[] args){
       exibirMensagem("Joao");
    }
}
*/
/*
### **4. Método com Múltiplos Parâmetros**

Podemos passar vários parâmetros para um método, separando-os por vírgulas.

**Exemplo:**
calcularMedia recebe dois parâmetros do tipo double e retorna a média.

public class Main {
    public static double calcularMedia(double num1, double num2)
    {
        return (num1 + num2) / 2;
    }
    public static void main(String[] args){
        double resultado = calcularMedia(5, 6);
        System.out.println("O resultado da media seria:" + resultado);
    }
}

        }

Pra fazer um funcao e sempre bom, fazer um esqueleto:

1 - Criar esqueleto da funcao;
2 - Definir se tem retirno ou nao;
3 - Definir se tem parametro ou nao;
4 - Escrever o codigo da funcao (o que faz);

         */
/*

 */
    }
}