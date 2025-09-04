import java.util.*;

public class SolutionDataType{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        int t = scan.nextInt(); //quantidade de casos de teste

        try{
            for(int i = 0; i < t; i++){
                long n = scan.nextLong();

                System.out.println(n + " can be fitted in:");

                if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }

                if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                    System.out.println("* short");
                }

                if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }

                System.out.println("* long");
            }

        }catch(Exception e){  
            String input = scanner.next();
            System.out.println(input + " can't be fitted anywhere.");

        }

      scan.close();
       
    }

}