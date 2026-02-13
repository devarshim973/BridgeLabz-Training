package com.assesment2;

import java.util.Scanner;

public class LexicalTwistApp {
private static boolean isVowel(char ch) {
	ch=Character.toUpperCase(ch);
	return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
}
private static boolean isLetter(char ch) {
	return Character.isLetter(ch);
}


public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter first word");
	String first=sc.nextLine();
	System.out.println("enter second word");
	String second = sc.nextLine();
	
	if(first.trim().split("\\s+").length>1) {
		System.out.println(first+"invalid word");
		return ;
	}
	if(second.trim().split("\\s+").length>1) {
		System.out.println(second+"invalid word");
		return;
	}
	first=first.trim();
	second=second.trim();
	
	String reversedFirst= new StringBuilder(first).reverse().toString();
	
	if(reversedFirst.equals(second)) {
		String lower =reversedFirst.toLowerCase();
		
		StringBuilder transfor=new StringBuilder();
		
		for(int i=0;i<lower.length();i++) {
	char ch=lower.charAt(i);
	if(isVowel(ch)) {
		transfor.append('@');
	}
	else {
		transfor.append(ch);
	}
	
	}
		System.out.println(transfor);
}
	else {
		String combine =(first+second).toUpperCase();
		
		int vowelcount=0;
		int consocount=0;
		
		for(int i=0;i<combine.length();i++) {
			char ch=combine.charAt(i);
			if(isLetter(ch)) {
				if(isVowel(ch))
					vowelcount++;
				else
					consocount++;
			}
		}
		 if (vowelcount > consocount) {
             // print first 2 DISTINCT vowels
             StringBuilder ans = new StringBuilder();
             boolean foundA = false, foundE = false, foundI = false, foundO = false, foundU = false;

             for (int i = 0; i < combine.length() && ans.length() < 2; i++) {
                 char ch = combine.charAt(i);

                 if (isLetter(ch) && isVowel(ch)) {
                     if (ch == 'A' && !foundA) { ans.append('A'); foundA = true; }
                     else if (ch == 'E' && !foundE) { ans.append('E'); foundE = true; }
                     else if (ch == 'I' && !foundI) { ans.append('I'); foundI = true; }
                     else if (ch == 'O' && !foundO) { ans.append('O'); foundO = true; }
                     else if (ch == 'U' && !foundU) { ans.append('U'); foundU = true; }
                 }
             }
             System.out.println(ans);
	}
		 else if(consocount>vowelcount) {
			 StringBuilder ans= new StringBuilder();
			 boolean[] seen=new boolean[26];
			 for(int i=0;i<combine.length() && ans.length()<2;i++) {
				 char ch=combine.charAt(i);
				 if(isLetter(ch) &&!isVowel(ch)) {
					 int idx= ch-'A';
					 if(!seen[idx]) {
						 ans.append(ch);
						 seen[idx]=true;
					 }
				 }
			 }
			 System.out.println(ans);
		 }
		 else {
			 System.out.println("vowel and consonent equal");
		 }
}
	sc.close();
}
}
