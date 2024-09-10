public class TIposVariaveis {
  public static void main (String[] args) {
    
    System.out.println("Tipos primitivos");

    // Java é uma linguagem de tipagem forte, ou seja todas as vezes que eu for declarar um valor para uma variável, eu tenho que informar o tipo da variável. Por exemplo:
    //int numero  = 10;

    byte numero = 127; // Valor maximo de 127 8 bytes
    short numero2 = 32767; // Valor maximo de 32767 16 bytes
    int numero3 = 2147483647; // Valor maximo de 2147483647 32 bytes
    long numero4 = 9223372036854775807L; // Valor maximo de 9223372036854775807 64 bytes

    // Tipos numericos reais / Flutuante 
    float numero5 = 3.14F; 
    double numero6 = 3.14152131234;

    // Tipo char (Caractere)
    char caractere = 'a';

    // Tipo boolean (Booleano)
    boolean valor = true; // True or False

    System.out.println(numero);
    System.out.println(numero2);
    System.out.println(numero3);
    System.out.println(numero4);
    System.out.println(numero5);
    System.out.println(numero6);
    System.out.println(caractere);
    System.out.println(valor);

    // Tipos de variáveis Constantes

    // Esse caso eu fiz a definicao da var num com 10 incialmente e depois alterei ela para o valor 5. 
    // com uma constante eu nao consigo alterar esse valor ou seja
    // um exmplo para o valor de PI que nao pode ser alterado.
    int num = 10;

    num = 5;

    System.out.println(num);
    
    // Utilizamos o final para definir uma constante.
    final double valorPI = 3.14;

    System.out.println(valorPI);

 }
}