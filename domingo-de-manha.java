import java.io.IOException;
import java.util.Scanner;

public class Bino{
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	while (    leitor.hasNext()  ) {
    		String[] relogio = leitor.nextLine().split(":");    		
    		int hora = Integer.parseInt(relogio[0]);
    		int min = Integer.parseInt(relogio[1]);
    		
    		switch (hora) {
    		  // atraso pra 7 +60 é sem atrasos
    			case(7): System.out.println("Atraso maximo: " + min); break;
    			// atraso pra 6 é mais 60 minutos de atraso
    			case(8): System.out.println("Atraso maximo: " + (60 + min)); break;
    			// atraso pra 9 é mais 120 minutso de atraso
    			case(9): System.out.println("Atraso maximo: " + (120 + min)); break;
    			default: System.out.println("Atraso maximo: 0");
    		}
    	}
    }
	
}