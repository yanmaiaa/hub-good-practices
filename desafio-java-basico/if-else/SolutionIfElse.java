import java.util.Scanner;

/**
 * Task
Given an integer, , perform the following conditional actions:

If N is odd, print "Weird"
If N is even and in the inclusive range of 2 to 5, print "Not Weird"
If N is even and in the inclusive range of 6 to 20 , print "Weird"
If N is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not N is "weird".

Input Format

A single line containing a positive integer, .
 */

 //Abaixo está uma solução básica sem usar boas práticas para deixar o código mais legível e manutenível.
public class SolutionIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //Nos if's temos estruturas que se repetem e poderiam ser agrupadas já que existem condições que deveriam retornar o mesmo resultado impresso no console. Com isso, podemos ajustar de forma mais eficiente na próxima classe.
        if(n % 2 == 0 && n >= 2 && n <= 5){ 
            System.out.println("Not Weird");
        }else if(n % 2 == 0 && n >= 6 && n <= 20){
            System.out.println("Weird");
        }else if(n % 2 == 0 &&  n > 20){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }

        scanner.close();
    }

}
