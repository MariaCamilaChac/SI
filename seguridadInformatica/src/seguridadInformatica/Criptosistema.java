package seguridadInformatica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Criptosistema {
	
	char abecedario[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','�','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public char[] cifrado(String text) {
		
		char input[] = text.toCharArray();
		char output[] = new char[input.length];
		//int counter = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			if(input[i] == 'a') {
				output[i] = '+';
			}else if(input[i] == 'b') {
				output[i] = 'a';
			}else if (input[i] == 'c') {
				output[i] = '-';
			}else if (input[i] == 'd') {
				output[i] = 'c';
			}else if (input[i] == 'e') {
				output[i] = '*';
			}else if (input[i] == 'f') {
				output[i] = 'e';
			}else if (input[i] == 'g') {
				output[i] = '/';
			}else if (input[i] == 'h') {
				output[i] = 'g';
			}else if (input[i] == 'i') {
				output[i] = '=';
			}else if (input[i] == 'j') {
				output[i] = 'i';
			}else if (input[i] == 'k') {
				output[i] = '!';
			}else if (input[i] == 'l') {
				output[i] = 'k';
			}else if (input[i] == 'm') {
				output[i] = '�';
			}else if (input[i] == 'n') {
				output[i] = 'm';
			}else if (input[i] == '�') {
				output[i] = '<';
			}else if (input[i] == 'o') {
				output[i] = '�';
			}else if (input[i] == 'p') {
				output[i] = '>';
			}else if (input[i] == 'q') {
				output[i] = 'p';
			}else if (input[i] == 'r') {
				output[i] = '$';
			}else if (input[i] == 's') {
				output[i] = 'r';
			}else if (input[i] == 't') {
				output[i] = '&';
			}else if (input[i] == 'u') {
				output[i] = 't';
			}else if (input[i] == 'v') {
				output[i] = '[';
			}else if (input[i] == 'w') {
				output[i] = 'v';
			}else if (input[i] == 'x') {
				output[i] = ']';
			}else if (input[i] == 'y') {
				output[i] = 'x';
			}else if (input[i] == 'z') {
				output[i] = '%';
			}else if (input[i]==' ') {
				output[i]=' ';
			}
			
		}
		
		return output;
		
	}
	
	public void descifrado(String text) {
		
	}
	
	public int eleccion(int e) {
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Criptosistema cripto = new Criptosistema();
		
		String textoEnClaro = br.readLine();
		
		System.out.println(cripto.cifrado(textoEnClaro));
		
		
		
	}

}
