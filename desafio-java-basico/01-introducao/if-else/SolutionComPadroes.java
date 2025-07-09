
//Aqui vamos refatorar o código para facilitar a legibilidade melhorando a maneira como o escrevemos.
//O que vamos usar: Princípio da Responsabilidade Única para criar métodos que tenham apenas uma única responsabilidade, Object Calisthenics onde passaremos a não usar mais o else, pois a ideia é usar o if com retorno já que a premissa aqui é o retorno antecipado evitando complexidade excessiva de blocos else aninhados
//além de praticas vistas no Clean Code onde devemos usar nomes de métodos intuitivos e que descrevem exatamente o que eles fazem. Tem outras abordagens, mas para faciltiar a sintaxe iremos fazer tudo aqui nesta classe.

import java.util.Scanner;

public class SolutionComPadroes {
  private static final Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    scanner.close();
    imprimirClassificacaoNumerica(n);
  }

  private static void imprimirClassificacaoNumerica(int n){
    String intervaloNumerico = verificaIntervaloNumerico(n);
      if(numeroEhPar(n) && intervaloNumerico.equals("intervalo2A5") ||
          numeroEhPar(n) && intervaloNumerico.equals("maiorQue20")){
            System.out.println("Not Weird");
            return;
      }
      
      if (numeroEhPar(n) && intervaloNumerico.equals("intervalo6A20") ||
          !numeroEhPar(n)) {
        System.out.println("Weird");
        return; //Este if pode retirado desde que não tenha mais código para ser executado após este ponto,
                 //mas é uma boa prática usar o return para deixar claro que não há mais nada a ser executado
      }
  }

  private static String verificaIntervaloNumerico(int num){
    if(num >= 2 && num <= 5) return "intervalo2A5";
    if(num >= 6 && num <= 20) return "intervalo6A20";
    if(num > 20) return "maiorQue20";
    return "foraDoEscopo";
  }

  private static boolean numeroEhPar(int num){
    return num % 2 == 0;
  }  

  
}
