package ejercicio1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Personaje {
	private String nombre;
	private int puntosDeVida;
	private int puntosConseguidos;
	private String [] mochila;
	
	
	public Personaje () {
		
	}
	
	public Personaje(String nombre) {
		this.nombre=nombre;
	}


	public Personaje(String nombre, int puntosDeVida, int puntosConseguidos, String[] mochila) {
		super();
		this.nombre = nombre;
		this.puntosDeVida = puntosDeVida;
		this.puntosConseguidos = puntosConseguidos;
		this.mochila = mochila;
	}

	public void addInventario(String cosa,int posicion) {
		if (posicion==mochila.length) {
			System.out.println("mochila llena");
		} else {
			for (int i = 0; i < mochila.length; i++) {
		
			if (mochila[posicion] == null) {
			mochila[posicion]=cosa;
		
		}
		
	}
		}
	
	
		
	}
	
	public void buscar(String palabraBuscar) {
		if (Arrays.asList(mochila).contains(palabraBuscar)) {
			System.out.println("encontrado");
			if (puntosDeVida>91) {
				
			}else {
				puntosDeVida+=10;
				System.out.println(puntosDeVida);
			}
		}else {
			System.out.println("no encontrado");
		}
		
	}
		
	
	public void imprimirInventario() {
		for (int i = 0; i < mochila.length && mochila[i]!=null; i++) {
			System.out.println(i+", "+mochila[i]);
		}
	}
	
	public int recibirGolpe(int cantidadGolpe) {
		int total =0;
		if (cantidadGolpe >=100) {
			System.out.println("no puedes dar un golpe tan alto");
		} else {
			
			total=puntosDeVida-cantidadGolpe;
			
		}
		return total;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosDeVida() {
		return puntosDeVida;
	}

	public void setPuntosDeVida(int puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}

	public int getPuntosConseguidos() {
		return puntosConseguidos;
	}

	public void setPuntosConseguidos(int puntosConseguidos) {
		this.puntosConseguidos = puntosConseguidos;
	}

	public String[] getMochila() {
		return mochila;
	}

	public void setMochila(String[] mochila) {
		this.mochila = mochila;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", puntosDeVida=" + puntosDeVida + ", puntosConseguidos="
				+ puntosConseguidos + ", mochila=" + Arrays.toString(mochila) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(mochila);
		result = prime * result + Objects.hash(nombre, puntosConseguidos, puntosDeVida);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Arrays.equals(mochila, other.mochila) && Objects.equals(nombre, other.nombre)
				&& puntosConseguidos == other.puntosConseguidos && puntosDeVida == other.puntosDeVida;
	}
	
	
	
}
