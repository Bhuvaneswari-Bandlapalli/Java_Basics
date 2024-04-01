package com.filereader;

import java.io.FileReader;

public class TestOne {{
	


	try {
	FileReader fileReader =new FileReader("C:\\Users\\bvnmp\\Desktop\\My_Files\\bhuvana.txt");
	for(int i=fileReader.read();i!=-1;i=fileReader.read()) {
		if((i>=97 && i<=122) || (i>=65 && i<=90)) {
			char ch=(char)i;
			System.out.println(ch);
		}
	}
	}catch(Exception e) {
		System.out.println(e);
	}

}
}

