
public class Principal {
	
		static int numerador = 10;
		static Integer denominador = null;
		static float division;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Antes de la divisi�n");
		//division = numerador / denominador;
		//System.out.println("Despu�s de la divisi�n");
		
		System.out.println("Antes de la divisi�n");
		try {
			division = numerador / denominador;
		} catch (ArithmeticException error) {//Lo que reciba en catch que sea una clase aritm�tica exception y lo atarpo en la variable ex.
			division = 0;
			System.out.println("Error:" + error.getMessage());
		}catch(NullPointerException ex) {
			division = 0;
			System.out.println("Error:" + ex.getMessage());	
			System.out.println("Segundo catch");
		} finally { //No importa lo que pase arriba, esto siempre se va a ejecutar
			System.out.println("Despu�s de la divisi�n");
		}
		
		String fruits[] = {"Mango", "Pera", "Manzana", "Uva"};
		//Podemos recorrer listas a trav�s de for, pero con una estructura diferente
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
	}

}
