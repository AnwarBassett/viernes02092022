package estructuradecontrol;
import java.util.Scanner;
public class EstructuraSwitch {
	public static void main(String[] args) {
		//Estructuras condicionales
		//Estructuras condicional simple "if"
		//estructura condicional double(if else)
		//estructura condicional anidada(multiple, if else if)
		//para hoy-Estructura condicional multiple (switch)
		
		Scanner Lector=new Scanner(System.in);
		int op=2;
		
		//System.out.println("Ingrese el color del semaforo");
		//char car=Lector.next().charAt(0);
		System.out.print("Cual es su nombre: ");
		String nombre=Lector.nextLine();
		
		switch (nombre){
		case "Danilo"/*'a'&'A'*/:
			System.out.println( "Hola Danilo" /*"El valor es amarillo"*/);
			break;
		case "Ironman" /*'v'&'V'*/:
			System.out.println( "Hola sr.Stark"/*"El valor es verde"*/);
			break;
		case "WonderWoman"/*'r'&'R'*/:
			System.out.println( "Hola srta. Princess"/*"El valor es rojo"*/);
			break;
		default:
			System.out.println("Caracter incorrecto");
		}
		System.out.println("Fin del programa");
		
		Lector.close();
	}
}