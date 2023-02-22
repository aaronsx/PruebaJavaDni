package Prueba;

import java.util.Scanner;

public class DNI 
{
	//<-------------------------------------------METODOS----------------------------------->
	public void ComprobarDNI()
	{
		 
		
		boolean ok;
		Scanner pedir = new Scanner(System.in);
		char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
		DNI Dni = new DNI();
		//El do{}while con los if transformo en en false para que se repita y empiezo con true para que empiece siempre en true 
		do 
		{
			
			ok=true;
			//Pedimos el dni y comprobamos si dni es mayor que 99999999 o menor que 0
			System.out.println("Introduce el dni: ");
			int dni=pedir.nextInt();
			if(dni>0&&dni<99999999)
			{

				do 
				{
					ok=true;
					//Pedimos la letra y vemos si la letra introducida es igual a la letra que tiene que tener ese dni
					System.out.println("Introduce la letra: ");
					char letra=pedir.next().charAt(0);
					letra=Character.toUpperCase(letra);
					if(letra==letras[dni%23])
					{
						Dni.setNumero(dni);
						Dni.setLetra(letras[dni%23]);
						System.out.println("Felicidades el dni se ha guardado correctamente");
						
					}
					else 
					{
						System.out.println("El Dni no coincide con la letra");
						ok=false;
					}
				}while(!ok);
			}
			else
			{
				System.out.println("El Dni tiene que ser menor que 0 o mayot que 99999999");
				ok=false;
			}
			
		}while(!ok);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	//<-------------------------------------------ATRIBUTOS y LOS GETTERS Y SETTERS----------------------------------->
	private char letra='a';
	private int numero=0;
	//Son los setter y los getters para acceder a los atributos privado
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
