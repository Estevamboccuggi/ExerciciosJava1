package javateste;

public class exercicio3 {

	public static void main(String args []) {
		int i, fim = 456;
		for(i = 233; i <= fim; i += 5) {
			System.out.println(i);
			if(i >= 300 && i <= 400) {
				int inter;
				for(inter = i; inter <= 400; inter += 3) {
					i += 3;
					System.out.println(i);
				}
			}	
		} 
	}
}
