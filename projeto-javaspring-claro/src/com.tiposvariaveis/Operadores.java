public class Operadores {
  public static void main(String[] args) {
    int a = 10;
    int b = 3;

    // Operadores aritméticos básicos
    System.out.println("a + b = " + (a + b));  // Soma
    System.out.println("a - b = " + (a - b));  // Subtração
    System.out.println("a * b = " + (a * b));  // Multiplicação
    System.out.println("a / b = " + (a / b));  // Divisão (inteira)
    System.out.println("a % b = " + (a % b));  // Resto da divisão

    System.out.println(" ");
    
    // Operadores de incremento e decremento
    int c = 5;
    System.out.println("c = " + c);       // Valor original
    System.out.println("++c = " + ++c);   // Pré-incremento: incrementa antes de usar
    System.out.println("c++ = " + c++);   // Pós-incremento: usa, depois incrementa
    System.out.println("Após c++: " + c); // Valor de c após o pós-incremento

    System.out.println(" ");

    int d = 8;
    System.out.println("--d = " + --d);   // Pré-decremento: decrementa antes de usar
    System.out.println("d-- = " + d--);   // Pós-decremento: usa, depois decrementa
    System.out.println("Após d--: " + d); // Valor de d após o pós-decremento
    

  }
}