package veiculo;

public class Main {

	public static void main(String[] args) {
		
		
		Uno uno = new Uno();
		System.out.println("O modelo do ve�culo � Uno");
		System.out.println("A marca do ve�culo �: " + uno.getMarca());
		System.out.println("A categoria do ve�culo �: " + uno.NomeDaCategoria);
		
		
		System.out.println("--------------------------------------------");
		
		
		JeepCompass jc = new JeepCompass(); 
		System.out.println("O modelo do ve�culo � Jeep Compass");
		System.out.println("A marca do ve�culo �: " + jc.getMarca());
		System.out.println("A categoria do ve�culo �: " + jc.NomeDaCategoria);


	}

}
