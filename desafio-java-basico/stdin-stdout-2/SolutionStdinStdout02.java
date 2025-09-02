import java.util.Scanner;

/**
 * In this challenge, you must read an integer, a double, and a String from
 * stdin, then print the values according to the instructions in the Output
 * Format section below. To make the problem a little easier, a portion of the
 * code is provided for you in the editor.
 * Note: We recommend completing Java Stdin and Stdout I before attempting this
 * challenge.
 * Input Format
 * There are three lines of input:
 * The first line contains an integer.
 * The second line contains a double.
 * The third line contains a String.
 */

public class SolutionStdinStdout02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.nextLine(); // adicionar uma chamada extra a scan.nextLine() logo após ler o double, para
                         // consumir essa quebra de linha pendente.
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }

}
