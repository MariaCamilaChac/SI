package seguridadInformatica;

public class Test {

	public char[] cifrado(String text) {
				
		char newText[] = text.toCharArray();
		
		for (int i = 0; i < newText.length; i++) {
			newText[i]='e';
		}
		
		return newText;
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		String texto = "Danilo";
		
		System.out.println(t.cifrado(texto));
	}
	
}
