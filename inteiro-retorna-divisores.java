import java.io.IOException;
import java.util.Scanner;

public class Inteiro{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
          for(int i=1; i <= N; i++){
            double resto = N % i;
        	if (resto == 0 ){
        	  System.out.println(i);
        	} 
          }
        
    }
	
}