package javateste;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String args [])
{
	Scanner leitor = new Scanner(System.in);
	int i,somaimpar=0,valor;
	System.out.println("Entre com um valor:");
	valor=leitor.nextInt();
	for(i=0;i<=valor;i++)
	{
		if(i%2!=0 && i%3==0)
			somaimpar=somaimpar+i;

			
	}
	System.out.println("soma de impares: "+somaimpar);
	
}
}
