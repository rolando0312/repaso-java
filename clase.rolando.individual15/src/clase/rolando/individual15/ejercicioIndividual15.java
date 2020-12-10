package clase.rolando.individual15;
import java.util.Scanner;



public class ejercicioIndividual15 {

	public static void main(String[] args) {
	// declarando  variables//
	Scanner sc = new Scanner(System.in);
		double valor1;
		double valor2;
		int valor3;
		double resultado;
		
		    System.out.println("Escriba un numero");
		    valor1= sc.nextInt();
		    
		    System.out.println("Digite una de las sigioemtes opciones");
		    System.out.println("Presiones: (1)suma (2) resta (3) Multiplicacion (4) Division");
		    valor3= sc.nextInt(); 
		    System.out.println("Escriba otro numero");
		    valor2=sc.nextInt();
	
	switch (valor3) {
	case (1): resultado= valor1+ valor2;
	         System.out.println("Su  resultado es:"+ resultado + " ya que escojio la opcion suma");
		   
	case (2): resultado= valor1-valor2;	
	System.out.println("Su  resultado es: "+ resultado + " ya que escojio la opcion resta");
	case (3): resultado= valor1*valor2;	
	System.out.println("Su  resultado es: "+ resultado + " ya que escojio la opcion multiplicar");
	case (4): resultado= valor1/valor2;	
	System.out.println("Su  resultado es: "+ resultado + " ya que escojio la opcion Division");
	break;	
	}
	 
	}
	

}
