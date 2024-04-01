package com.student;
import java.util.*;
import java.io.*;
public class TestFile {

	public ArrayList<Student> getStdData(int d2){
		ArrayList<Student> p=new ArrayList<>();
		
	
		try {
			FileReader fr=new FileReader("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\studentsmarks.txt");
			BufferedReader br=new BufferedReader(fr);
			for(String s=br.readLine();s!=null;s=br.readLine()) {
			String[] g=s.split(",");
			Student d=new Student();
			
		d.setSht(Integer.parseInt(g[0]));
		d.setSname(g[1]);
		d.setFl(Integer.parseInt(g[2]));
		d.setSl(Integer.parseInt(g[3]));
		d.setTl(Integer.parseInt(g[4]));
		d.setMaths(Integer.parseInt(g[5]));
		d.setScie(Integer.parseInt(g[6]));
		d.setSocio(Integer.parseInt(g[7]));
		p.add(d);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return p;
	}
	public static void main(String[] args) {
		TestFile t=new TestFile();
		 FileOne f=new  FileOne();
		 Scanner s=new Scanner(System.in);
		 int d=s.nextInt();
		 int avg;
		 ArrayList<Student> h=t.getStdData(d);
		 for(Student k:h) {
			 avg = (k.getMaths()+k.getFl()+k.getScie()+k.getSocio()+k.getSl()+k.getTl())/6;
			  
			 if(avg>=60 && avg<=69 && d>=60 && d<=69) {
				f.writeGradeC(k);
				System.out.println("c");
				System.out.println(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());
				
				
			}else if(avg>=70 && avg<=79 && d>=70 && d<=79) {
				f.writeGradeB(k);
				System.out.println("B");
				System.out.println(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());
				
			}else if(avg>=80 && avg<100 && d>=80 && d<100) {
				f.writeGradeC(k);
				System.out.println("A");
				System.out.println(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());
			
			}else if(avg<=59 && d<=59){
				f.writeGradeF(k);
				System.out.println("fail");	
				System.out.println(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());
				
			}
		 
		 
		 
		 
		 }
	}

}
