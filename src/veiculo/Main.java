package veiculo;

public class Main {

	public static void main(String[] args) {
		
		
		Uno uno = new Uno();
		System.out.println("O modelo do veículo é Uno");
		System.out.println("A marca do veículo é: " + uno.getMarca());
		System.out.println("A categoria do veículo é: " + uno.NomeDaCategoria);
		
		
		System.out.println("--------------------------------------------");
		
		
		JeepCompass jc = new JeepCompass(); 
		System.out.println("O modelo do veículo é Jeep Compass");
		System.out.println("A marca do veículo é: " + jc.getMarca());
		System.out.println("A categoria do veículo é: " + jc.NomeDaCategoria);


	}

}
