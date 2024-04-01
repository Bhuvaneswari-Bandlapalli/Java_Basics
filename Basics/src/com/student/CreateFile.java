package com.student;
import java.io.*;
import java.util.*;
public class CreateFile {



	public ArrayList<Student> readdata ()
	{
		System.out.println("file reading started");
		ArrayList<Student> k = new ArrayList<>();
		try {
		FileReader fr = new FileReader ("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\productOne.txt");
		BufferedReader br = new BufferedReader(fr);
		for (String s=br.readLine(); s!=null; s=br.readLine())
		{
			String [] n = s.split(",");
		    
			Student std = new Student();
			std.setSht(Integer.parseInt(n[0]));
			std.setSname(n[1]);
			std.setFl(Integer.parseInt(n[2]));
			std.setSl(Integer.parseInt(n[3]));
			std.setTl(Integer.parseInt(n[4]));
			std.setMaths(Integer.parseInt(n[5]));
			std.setScie(Integer.parseInt(n[6]));
			std.setSocio(Integer.parseInt(n[7]));
			k.add(std);
			}
		}catch (Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("file reading completed");
		
		return k;
	}
	
	public void  writedata (ArrayList<Student> p)
	
	{
		System.out.println("file writing started");
		try {
		FileWriter fw = new FileWriter("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\One2.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		for(Student k:p) {
		bw.write(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());
		bw.newLine();
		bw.flush();
		}
		
		}catch (Exception e)
		{
			System.out.println(e);
		}
	       System.out.println("file writing completed");
	}

	public static void main(String[] args) {
		
		CreateFile t = new CreateFile();
	
		
	   ArrayList<Student> v =t.readdata();
	   t.writedata(v);	

	     
		
	}

}