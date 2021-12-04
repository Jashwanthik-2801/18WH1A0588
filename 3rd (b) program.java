import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int key = sc.nextInt();
		String encrypted = encrypt(str,key);
		System.out.println("Encrypted String = "+encrypted);
		String decrypted = decrypt(str,key);
		System.out.println("Decrypted String = "+decrypted);
	}
	public static String encrypt(String str,int key){
	    String encrypted = "";
	    for(int i = 0;i<str.length();i++){
	        int c = str.charAt(i);
	        if(Character.isUpperCase(c)){
	            c = c + (key % 26);
	            if(c > 'Z')
	                c = c - 26;
	        }
	        else if(Character.isLowerCase(c)){
	            c = c + (key % 26);
	            if(c > 'z')
	                c = c - 26;
	        }
	        encrypted += (char)c;
	    }
	    return encrypted;
	    
	}
	public static String decrypt(String str,int key){
	    String decrypted = "";
	    for(int i = 0;i<str.length();i++){
	        int c = str.charAt(i);
	        if(Character.isUpperCase(c)){
	            c = c - (key % 26);
	            if(c < 'A')
	                c = c + 26;
	        }
	        else if(Character.isLowerCase(c)){
	            c = c - (key % 26);
	            if(c < 'a')
	                c = c + 26;
	        }
	        decrypted += (char)c;
	    }
	    return decrypted;
    }
}

/*
Expected Output:
Enter any String: Hello World
Enter the Key: 5
Encrypted String is: MjqqtBtwqi
Decrypted String is: Hello World
*/
