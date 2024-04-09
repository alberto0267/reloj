package Practica1;
import java.util.Scanner;
public class Practica4 {

	public static void main(String[] args) {
		Scanner da= new Scanner(System.in);
		
		/*Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado
		la hora, minutos y segundos, así como cuántos segundos se desea incrementar
		la hora introducida. La aplicación mostrará la nueva hora. */

			//creamos las variables
		int hour,minutes, seconds,secondsA;
		
		//pedimos datos a introducir
		System.out.println("Que hora es? ");
		hour=da.nextInt();
		System.out.println("Minutos");
		minutes =  da.nextInt();
		System.out.println("Seconds");
		seconds = da.nextInt();	
		
		System.out.println("cuantos segundos deseas incrementar? ");
		secondsA=da.nextInt();
		//secondsA--;
		//establecer el maximo de tiempo de cada variable si se sale la hora esta mal
		
		if((hour>=0 &&  hour<=24) && (minutes>=0 && minutes<=59) && (seconds>=0 && seconds<=59)) {	//si no entra aqui es false y da hora erronea						
			for(int i=1; i<=secondsA ;i++) {
			seconds++;//se le suma segundos por cada vuelta que da por el dato secondsA
			if(seconds>59) {
					seconds=0;
									
					minutes++;	
					}
				if(minutes>59) {
					minutes=0;
				
					hour++;				
						}
				if(hour >23) {
					hour=0;
						}						
				}
		System.out.println("la hora es = " + hour + " : " + minutes + " : " + seconds);		
		}else {//todo lo demas es erroneo
			System.out.println("hora erronea");
		}
		
	}

}
