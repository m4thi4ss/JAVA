import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*1. Exibir uma Mensagem**

        Escreva um programa que use o comando `System.out.println()` para exibir a frase "Olá, Mundo!" no console.

        System.out.println("Olá, mundo!");
        */

        /*2. Declarar e Usar uma Variável**

                Crie um programa que declare uma variável inteira chamada numero com o valor 10. Em seguida, imprima o valor dessa variável no console.

        int numero = 10;

        System.out.println(numero);
        */

        /*3. Fazer uma Soma**

         Escreva um programa que declare duas variáveis inteiras, a = 5 e b = 3. Calcule a soma das duas e imprima o resultado.

        int a = 5;
        int b = 3;
        int resultado = a + b;

        System.out.println(resultado);
        */

        /*4. Produto de dois números
        Declare duas variáveis, num1 = 8 e num2 = 7. Calcule o produto (multiplicação) entre elas e imprima o resultado.

        int num1 = 8;
        int num2 = 7;
        int resultado = num1 + num2;

        System.out.println(resultado);
        */

        /*5. Saudação Personalizada
        Crie um programa que declare uma variável String chamada nome com o valor "Ana". Depois, exiba uma mensagem de boas-vindas, como "Olá, Ana!".

        String nome = "Ana";

        System.out.println("Olá " + nome + "!");
        */

        /*6. Calcular o Dobro
        Declare uma variável inteira valor. Em seguida, calcule o dobro desse número utilizando a variável e exiba o resultado.

        int num = 5;
        int resultado = num * 2;

        System.out.println(resultado);
        */

        /*7. Média de três números**

        Escreva um programa que recebe três números e imprime a média aritmética deles.



        System.out.println("Me informe os números: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        double media = (double)(num1 + num2 + num3) / 3;

        System.out.println("Segue média dos números informados:" + media);*/

        /*8. Comparar Dois Números**

                Escreva um programa que declare duas variáveis inteiras, x = 10 e y = 20. O programa deve comparar se `x` é menor que `y` (`<`) e imprimir o resultado (`true` ou `false`) no console.

        int x = 10;
        int y = 20;

        boolean resultado = x > y;

        System.out.println(resultado);
        */

        /*9. Verificação de Idade para Votar**

                Peça ao usuário para digitar sua idade. O programa deve usar um operador de comparação para verificar se a idade é maior ou igual a 16 e imprimir o resultado (

`true` ou `false`).

        - **Extra:** Adicione um comentário de uma linha (`//`) explicando o que a comparação faz.

        boolean resultado;

        System.out.println("Me informe a sua idade:");
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();
        if (idade >= 16)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        System.out.println(resultado);*/

/*10. Usando o Operador Lógico "E" (&&)**

        Declare uma variável int temperatura = 28. Escreva uma expressão lógica que verifique se a

`temperatura` é maior que 25 **E** menor que 30. Imprima o resultado `true` ou `false` no console.

        int temperatura = 28;
        boolean resultado;

        if(temperatura > 25 && temperatura < 30)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        System.out.println(resultado);*/

        /*11. Usando o Operador Lógico "OU" (||)**

        Declare uma variável booleana temCartao = true e uma variável double compra = 50.0. O cliente ganha um desconto se temCartao for verdadeiro
        OU se o valor da compra for maior que 100.0. Escreva a expressão lógica e imprima o resultado (`true` ou `false`).

        boolean temCartao = true;
        double compra = 50.0;
        boolean resultado = true;

        if(temCartao == true)
        {
            System.out.println("Você tem desconto!");
        }
        else if(temCartao == false)
        {
            System.out.println("Você não tem desconto!" );;
        }
        else if (compra > 100.0)
        {
            System.out.println("Você tem desconto!");
        }
        else
        {
            System.out.println("Você não tem desconto!");
        }

*/



    }
}