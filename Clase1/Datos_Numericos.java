package Clase1;

public class Datos_Numericos {

	public static void main(String[] args) {


		byte b; // 1 byte complementos a 2 (8 bits)
		 // [-128 a +127]
		
		short s; // 2 bytes complementos a 2 (16 bits)
		 // [-32768, 32767]
		 
		int i; // 4 bytes complementos a 2 (32 bits)
		 // [-2147483648, 2147483647]
		 
		 b = -1;
		 System.out.println("byte " + b);
		 b++;
		 System.out.println("byte++ " + b);
		 b++;
		 System.out.println("byte++ " + b);
		 b = 127;
		 System.out.println("byte " + b);
		 b++;
		 System.out.println("byte++ " + b);
		 b++;
		 System.out.println("byte++ " + b);
		 b--;
		 System.out.println("byte-- " + b);
		 b--;
		 System.out.println("byte-- " + b + "\n");
		 
		 
		 s = -1;
		 System.out.println("short " + s);
		 s++;
		 System.out.println("short++ " + s);
		 s++;
		 System.out.println("short++ " + s);
		 s = 32767;
		 System.out.println("short " + s);
		 s++;
		 System.out.println("short++ " + s);
		 s++;
		 System.out.println("short++ " + s);
		 s--;
		 System.out.println("short-- " + s);
		 s--;
		 System.out.println("short-- " + s + "\n");
		 
		 
		 i = -1;
		 System.out.println("int " + i);
		 i++;
		 System.out.println("int++ " + i);
		 i++;
		 System.out.println("int++ " + i);
		 i = 2147483647;
		 System.out.println("int " + i);
		 i++;
		 System.out.println("int++ " + i);
		 i++;
		 System.out.println("int++ " + i);
		 i--;
		 System.out.println("int-- " + i);
		 i--;
		 System.out.println("int-- " + i);

	}

}
