package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);

		
		String [] mochila = new String [10];
		mochila[0]= "escudo";
		mochila[1]= "botiquin";
		mochila[2]= "vendas";
		mochila[3]= "armas";
		int posicion = 4;
		int opcion=0;
		String palabraBuscar;
		String nuevoNombre;
		int daño=0;
		Personaje p;
		p= new Personaje("pepe",100,0,mochila);
		
		do {
			System.out.println("1--ver inventario");
		System.out.println("2--añadir a la bolsa");
		System.out.println("3--dar golpe");
		opcion = s.nextInt();
		switch (opcion) {
		case 1:
			p.imprimirInventario();
			break;
		case 2:
			System.out.println("indica el nombre del elemento para añadir");
			nuevoNombre=s.next();
			p.addInventario(nuevoNombre,posicion);
			posicion++;
		
			break;
		case 3:
			System.out.println("indique el daño del golpe");
			daño=s.nextInt();
			System.out.println(p.recibirGolpe(daño));
			
			
			break;
		case 4:
			System.out.println("indique la palabra buscada");
			palabraBuscar= s.next();
			p.buscar(palabraBuscar);
			System.out.println(p.getPuntosDeVida());
			break;

		default:
			break;
		}
		} while (opcion!=0);
		
	}

}
