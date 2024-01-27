package string;

import java.util.Arrays;

public class Allmethods {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s.length());//it checks how many characters are there in a string
		
		//concat()-joining strings
		String s1="welcome";
		String s2="to java";
		String s3="to selenium";
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		
		//trim()- remove spaces from left and right
		s="   welcome   ";
		System.out.println(s);//   welcome   
		System.out.println(s.trim());//welcome
		System.out.println(s.length());//13
		System.out.println("before trimmed:"+s.length());//before trimmed:13
		System.out.println(s.trim());//welcome
		System.out.println("after trimmed:"+s.trim().length());//after trimmed:7
		
		//charAt- returns a character from a string based on index
		//index starts from 0
		s="welcome";
		System.out.println(s.charAt(2));//l
		
		//contains- returns true or false
		//check string is a part  of main string or not
		s="welcome";
		System.out.println(s.contains("wel"));//true
		System.out.println(s.contains("elc"));//true
		System.out.println(s.contains("wwel"));//false
		
		//equals(),equalsignorecase()- compare to strings
		s1="welcome";
		s2="welcome";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals("Welcome"));//false
		System.out.println(s1.equalsIgnoreCase("Welcome"));//true- it does not see case sensitivity it checks the string
		
		
		//replace()-  replace single/multiple(sequence) of characters in a string
		s="welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace("o","d"));//welcdme td selenium java selenium pythdn selenium c#
		System.out.println(s.replace("selenium", "playwright"));//welcome to playwright java playwright python playwright c#
		
		//substring-extract substring from the main string
		//stsrting index-0
		//ending index-1
		s="selenium";
		System.out.println(s.substring(0,3));//sel
		
		//touppercase(),tolowercase()
		s="welcome";
		System.out.println(s.toUpperCase());//WELCOME
		System.out.println(s.toLowerCase());//welcome
		
		//split()-split the string into multiple partsbased on delimeter
		s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);//abc
		System.out.println(a[1]);//gmail.com
		System.out.println(Arrays.toString(a));
		//ex-1
		String amount="$15,20,55";//print values like 152055
		System.out.println(amount.replace("$", ""));//15,20,55
		System.out.println(amount.replace("$","").replace(",",""));//152055
		//ex-2
		s="abc,123@xyz";//abc 123 xyz
		String arr[]=s.split(",");//abc 123@xyz
		System.out.println(Arrays.toString(arr));//[abc, 123@xyz]
		
		String arr1[]=arr[1].split("@");
		System.out.println(Arrays.toString(arr1));//[123, xyz]
		
		System.out.println(arr[0]);//abc
		System.out.println(arr1[0]);//123
		System.out.println(arr1[1]);//xyz
		
		//ex-3
		s="abc 123";
		String ar[]=s.split(" ");
		System.out.println(Arrays.toString(ar));//[abc, 123]
		//* % ^ & ( ) - you cannot use as delimeters

		
		
				

		
		
		
		
		
		
		


		

		



		

	}

}
