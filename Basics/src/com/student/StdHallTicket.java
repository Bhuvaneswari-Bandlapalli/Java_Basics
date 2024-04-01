package com.student;
import java.io.*;
import java.util.*;
public class StdHallTicket {
	public Student getDetails(int sht) {
		Student s=new Student();
		try {
			FileReader fr=new FileReader("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\studentsmarks.txt");
			BufferedReader br=new BufferedReader(fr);
			for(String k=br.readLine();k!=null;k=br.readLine()) {
				String[] d=k.split(",");
				if(sht==Integer.parseInt(d[0])) {
					s.setSht(Integer.parseInt(d[0]));
					s.setSname(d[1]);
					s.setFl(Integer.parseInt(d[2]));
					s.setSl(Integer.parseInt(d[3]));
					s.setTl(Integer.parseInt(d[4]));
					s.setMaths(Integer.parseInt(d[5]));
					s.setScie(Integer.parseInt(d[6]));
					s.setSocio(Integer.parseInt(d[7]));
					}
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return s;
	}
	

	public static void main(String[] args) {
		StdHallTicket m=new StdHallTicket();
		Scanner s=new Scanner(System.in);
		
		Student k=m.getDetails(s.nextInt());
		System.out.println(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());

	}

}
