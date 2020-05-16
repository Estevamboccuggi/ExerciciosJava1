package javateste;


public class Exercicio2 {
	public static void main(String args []){
		int i, fim = 1999;
		for(i=1000; i<=fim; i++) {
			if(i % 11 == 5)
				System.out.println(i);
		}
	}
}
