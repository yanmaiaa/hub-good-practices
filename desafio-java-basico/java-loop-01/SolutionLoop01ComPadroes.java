import java.io.*;
/*Utilizei mais uma vez o Princípio da Responsabilidade Única (SRP)
criando um método para imprimir os múltiplos, além de usar o nome do método intuitivo e que descreve exatamente o que ele faz */

public class SolutionLoop01ComPadroes {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int numero = Integer.parseInt(bufferedReader.readLine().trim());
    imprimirMultiplos(numero);
    bufferedReader.close();
  }

  /* Um outro detalhe aqui é que o método imprimirMultiplos é chamado direto no método main pois,
   por ele ser static ele acaba dependendo apenas da classe e não do objeto e, por conta disso,
   eu não preciso instanciar um objeto para conseguir chamar o método. Assim, caso eu não utilizasse
   o static, o main só conseguiria chamá-lo se antes instanciasse o objeto da classe, o que acaba deixando
   o código mais simples e direto*/
  private static void imprimirMultiplos(int num){
   for(int i = 1; i <= 10; i++){
      int resultado = i * num;
      System.out.println(num + " x " + i + " = " + resultado);
    }
  }
}
