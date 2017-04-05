package mathematik.functions;

public class ProdottoSomma {

	public static void main(String[] args){
		
		System.out.println(sommaprodotto(5,9));
		
	}
	
	public static int sommaprodotto(int x, int y){
		int prodotto = 0;
		int riporto = x;
		
		while(riporto != 0){
			prodotto = prodotto +y;
			riporto--;
		}
		return prodotto;
	}
	
}
