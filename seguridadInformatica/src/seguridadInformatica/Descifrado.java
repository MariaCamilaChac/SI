package seguridadInformatica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Descifrado {
	
	char abecedario[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','%','&','/','-','*','+','$','=','¡','!','>','<'};
	
	public char[] descifrado(String text) {
		
		char input[] = text.toCharArray();
		char output[] = new char[input.length];
		//int counter = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			if(input[i] == '+') {
				output[i] = 'a';
			}else if(input[i] == 'a') {
				output[i] = 'b';
			}else if (input[i] == '-') {
				output[i] = 'c';
			}else if (input[i] == 'c') {
				output[i] = 'd';
			}else if (input[i] == '*') {
				output[i] = 'e';
			}else if (input[i] == 'e') {
				output[i] = 'f';
			}else if (input[i] == '/') {
				output[i] = 'f';
			}else if (input[i] == 'g') {
				output[i] = 'h';
			}else if (input[i] == '=') {
				output[i] = 'i';
			}else if (input[i] == 'i') {
				output[i] = 'j';
			}else if (input[i] == '!') {
				output[i] = 'k';
			}else if (input[i] == 'k') {
				output[i] = 'l';
			}else if (input[i] == '¡') {
				output[i] = 'm';
			}else if (input[i] == 'm') {
				output[i] = 'n';
			}else if (input[i] == '<') {
				output[i] = 'ñ';
			}else if (input[i] == 'ñ') {
				output[i] = 'o';
			}else if (input[i] == '>') {
				output[i] = 'p';
			}else if (input[i] == 'p') {
				output[i] = 'q';
			}else if (input[i] == '$') {
				output[i] = 'r';
			}else if (input[i] == 'r') {
				output[i] = 's';
			}else if (input[i] == '&') {
				output[i] = 't';
			}else if (input[i] == 't') {
				output[i] = 'u';
			}else if (input[i] == '[') {
				output[i] = 'v';
			}else if (input[i] == 'v') {
				output[i] = 'w';
			}else if (input[i] == ']') {
				output[i] = 'x';
			}else if (input[i] == 'x') {
				output[i] = 'y';
			}else if (input[i] == '%') {
				output[i] = 'z';
			}else if (input[i]==' ') {
				output[i]=' ';
			}
			
		}
		
		return output;
		
	}
	
	public void descifrado1(String text) {
		
	}
	
	public int eleccion(int e) {
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Descifrado cripto = new Descifrado();
		
		String textoEnClaro = br.readLine();
		
		System.out.println(cripto.descifrado(textoEnClaro));
		
		
		
	}

}
