import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String str = sc.nextLine();
		String encrypted = encrypt(str);
		System.out.println("Encrypted String = "+encrypted);
		String decrypted = decrypt(str);
		System.out.println("Decrypted String = "+decrypted);
	}
	public static String encrypt(String str){
		int key = 3;
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
	public static String decrypt(String str){
		int key = 3;
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
Encrypted String is = Khoor Zroug
Decrypted String is = Ebiil Tloia

*/
