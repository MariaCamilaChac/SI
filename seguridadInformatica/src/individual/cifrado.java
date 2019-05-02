package individual;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cifrado {
	
	char abecedario[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public String cifrado(String text) {
		
		char input[] = text.toCharArray();
		char output[] = new char[input.length];
		char output1[] = new char[input.length];
		String mensaje = null;
		int value = 0;
		int counter=input.length;
		System.out.println("key " + counter);
		
		for (int i = 0; i < input.length; i++) {
			

			
			if(input[i] == 'a') {
				char j=output[i] ;
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 27);
			}else if(input[i] == 'b') {
				char j=output[i] = '2';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 26);
			}else if (input[i] == 'c') {
				char j=output[i] = '3';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 25);
			}else if (input[i] == 'd') {
				char j=output[i] = '4';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 24);
			}else if (input[i] == 'e') {
				char j=output[i] = '5';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 23);
			}else if (input[i] == 'f') {
				char j=output[i] = '6';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 22);
			}else if (input[i] == 'g') {
				char j=output[i] = '7';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 21);
			}else if (input[i] == 'h') {
				char j=output[i] = '8';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 20);
			}else if (input[i] == 'i') {
				char j=output[i] = '9';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 19);
			}else if (input[i] == 'j') {
				char j=output[i] = '8';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 18);
			}else if (input[i] == 'k') {
				char j=output[i] = '7';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 17);
			}else if (input[i] == 'l') {
				char j=output[i] = '6';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 16);
			}else if (input[i] == 'm') {
				char j=output[i] = '5';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 15);
			}else if (input[i] == 'n') {
				char j=output[i] = '4';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 14);
			}else if (input[i] == 'ñ') {
				char j=output[i] = '3';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 13);
			}else if (input[i] == 'o') {
				char j=output[i] = '2';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 12);
			}else if (input[i] == 'p') {
				char j=output[i] = '1';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 11);
			}else if (input[i] == 'q') {
				char j=output[i] = '2';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 10);
			}else if (input[i] == 'r') {
				char j=output[i] = '3';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 9);
			}else if (input[i] == 's') {
				char j=output[i] = '4';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 8);
			}else if (input[i] == 't') {
				char j=output[i] = '5';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 7);
			}else if (input[i] == 'u') {
				char j=output[i] = '6';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 6);
			}else if (input[i] == 'v') {
				char j=output[i] = '7';		
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 5);
			}else if (input[i] == 'w') {
				char j=output[i] = '8';			
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 4);
			}else if (input[i] == 'x') {
				char j = output[i] = '9';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 3);
			}else if (input[i] == 'y') {
				char j = output[i] = '8';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 2);
				mensaje = Integer.toString(value);
			    output1 = mensaje.toCharArray();
			}else if (input[i] == 'z') {
				char j = output[i] = '7';
				String num = Character.toString(j);
				value = (int) Math.pow(Integer.parseInt(num), 1);
				mensaje = Integer.toString(value);
			  //  output1[i] = mensaje.toCharArray();
				
			}else if (input[i]==' ') {
				output1[i]=' ';
			}
			
		}
		
	
		return mensaje;
	}
	

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		cifrado cripto = new cifrado();
		
		String textoEnClaro = br.readLine();
		System.out.println(cripto.cifrado(textoEnClaro));
		
		
		
	}

}
