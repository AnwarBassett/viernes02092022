package estructuradecontrol;
import java.util.Scanner;
public class EjemplosSwitch {

	public static void main(String[] args) {
		Scanner Lec=new Scanner(System.in);
		double a, b, respuesta;
		int Entrada;
		char potencial;
		
		System.out.println("Que operacion efectuara?");
		System.out.println("1-Suma\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Potencia\n6-Raiz Cuadrada\n7-Inverso Multiplicativo");
		Entrada=Lec.nextInt();
		switch(Entrada){
		case 1:
			System.out.println("Ingrese a");
			a=Lec.nextDouble();
			System.out.println("Ingrese b");
			b=Lec.nextDouble();
			respuesta=a+b;
			System.out.println("La suma de "+a+" mas "+b+" es igual a "+respuesta);
			break;
		case 2:
			System.out.println("Ingrese a");
			a=Lec.nextDouble();
			System.out.println("Ingrese b");
			b=Lec.nextDouble();
			respuesta=a-b;
			System.out.println("La resta de "+a+" menos "+b+" es igual a "+respuesta);
			break;
		case 3:
			System.out.println("Ingrese a");
			a=Lec.nextDouble();
			System.out.println("Ingrese b");
			b=Lec.nextDouble();
			respuesta=a*b;
			System.out.println("La Multiplicacion de "+a+" por "+b+" es igual a "+respuesta);
			break;
		case 4:
			System.out.println("Ingrese a");
			a=Lec.nextDouble();
			System.out.println("Ingrese b");
			b=Lec.nextDouble();
			if (b == 0)
			{
				System.out.println("No se puede dividir");
			}
			else
			{
			respuesta=a/b;
			System.out.println("La division de "+a+" entre "+b+" es igual a "+respuesta);
			}
			break;
		case 5:
			System.out.println("Ingrese a");
			a=Lec.nextDouble();
			System.out.println("Ingrese b");
			b=Lec.nextDouble();
			System.out.println("A o B es la potencia?");
			char potencia=Lec.next().charAt(0);
			switch(potencia) {
			case 'a'&'A':
				respuesta=Math.pow(b,a);
				System.out.println("La suma de "+a+" mas "+b+" es igual a "+respuesta);
				break;
			case 'b'&'B':
				respuesta=Math.pow(a,b);
				System.out.println("La suma de "+a+" mas "+b+" es igual a "+respuesta);
				break;
			}
			break;
		case 6:
			System.out.println("Ingrese a");
			a=Lec.nextDouble();
			if (a < 0)
			{
				System.out.println("No existe");
			}
			else
			{
			respuesta=Math.sqrt(a);
			System.out.println("La raiz cuadrada de "+a+" es igual "+respuesta);
			}
			break;
		case 7:
			break;
		default:
			System.out.println("No existe esa opcion");
		}
		
		
		
		Lec.close();
	}
}
