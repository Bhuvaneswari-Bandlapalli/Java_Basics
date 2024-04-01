package com.filereader;
import java.io.*;
public class Test {

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C:\\Users\\bvnmp\\Desktop\\My_Files\\bhuvana.txt");
			int intValue=fileReader.read();
			char ch=(char)intValue;
			System.out.println(ch);
			
			int intValue1=fileReader.read();
			char ch1=(char)intValue1;
			System.out.println(ch1);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
