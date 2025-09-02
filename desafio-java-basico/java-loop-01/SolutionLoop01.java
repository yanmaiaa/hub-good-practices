import java.io.*;

public class SolutionLoop01 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(bufferedReader.readLine().trim());
    for(int i = 1; i <= 10; i++){
      int resultado = i * num;
      System.out.println(num + " x " + i + " = " + resultado);
    }
    bufferedReader.close();
  }
}
