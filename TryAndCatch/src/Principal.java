
public class Principal {
	
		static int numerador = 10;
		static Integer denominador = null;
		static float division;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Antes de la división");
		//division = numerador / denominador;
		//System.out.println("Después de la división");
		
		System.out.println("Antes de la división");
		try {
			division = numerador / denominador;
		} catch (ArithmeticException error) {//Lo que reciba en catch que sea una clase aritmética exception y lo atarpo en la variable ex.
			division = 0;
			System.out.println("Error:" + error.getMessage());
		}catch(NullPointerException ex) {
			division = 0;
			System.out.println("Error:" + ex.getMessage());	
			System.out.println("Segundo catch");
		} finally { //No importa lo que pase arriba, esto siempre se va a ejecutar
			System.out.println("Después de la división");
		}
		
		String fruits[] = {"Mango", "Pera", "Manzana", "Uva"};
		//Podemos recorrer listas a través de for, pero con una estructura diferente
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
	}

}
