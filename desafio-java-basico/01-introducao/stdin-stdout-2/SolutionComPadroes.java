import java.util.Scanner;

//Lembrando que aqui é um exercício de exemplo do desafio, uma possibilidade para que você possa praticar
// as boas práticas de programação. Neste caso, utilizamos mais uma vez o Princípio da Responsabilidade Única (SRP)
//criando um método para imprimir os valores lidos do Scanner, além de usar nomes de métodos intuitivos e que descrevem exatamente o que eles fazem,
//uma prática que é bem comentada no clean code.
public class SolutionComPadroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        scan.close();
        imprimirValores(i, d, s);
    }

    private static void imprimirValores(int a, double b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
