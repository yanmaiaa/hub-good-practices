import java.util.*;

//Lembrando mais uma vez que é um exercício de exemplo do desafio, uma possibilidade para que você possa praticar
// as boas práticas de programação e usar em estruturas maiores e mais complexas. Neste caso, utilizamos mais uma vez o Princípio 
// da Responsabilidade Única (SRP)
//criando um método para imprimir os valores lidos do Scanner, além de usar nomes de métodos intuitivos e que descrevem exatamente o que eles fazem,
//uma prática que é bem comentada no clean code.
public class SolutionStdinStdout03ComPadroes {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("================================");
       
       for(int i = 0; i < 3; i++){
        String s = scan.next();
        int x = scan.nextInt();
        formatarValores(s, i);
       }
       
       System.out.println("================================");

       scan.close();
    }

    private static void formatarValores(String valor1, int valor2){
        System.out.printf("%-15s%03d%n", valor1, valor2);
    }
}