package com.student;
import java.util.*;
import java.io.*;

public class FileOne {
	public void writeGradeA(Student p)	{
	try {
		FileWriter f=new FileWriter("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\AStudent.txt",true);
		BufferedWriter b=new BufferedWriter(f);
	
		
			b.write(p.getSht()+","+p.getSname()+","+p.getFl()+","+p.getSl()+","+p.getTl()+","+p.getMaths()+","+p.getScie()+","+p.getSocio());
			b.newLine();
			b.flush();
		

	}catch(Exception e) {
		System.out.println(e);
	}
}
	public void writeGradeB(Student p)	{
		try {
			FileWriter f=new FileWriter("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\BStudent.txt",true);
			BufferedWriter b=new BufferedWriter(f);
			
			
				b.write(p.getSht()+","+p.getSname()+","+p.getFl()+","+p.getSl()+","+p.getTl()+","+p.getMaths()+","+p.getScie()+","+p.getSocio());
				b.newLine();
				b.flush();
				

			}catch(Exception e) {
			System.out.println(e);
			}
		}
	public void writeGradeC(Student p)	{
		try {
			FileWriter f=new FileWriter("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\CStudent.txt",true);
			BufferedWriter b=new BufferedWriter(f);
			
				
					b.write(p.getSht()+","+p.getSname()+","+p.getFl()+","+p.getSl()+","+p.getTl()+","+p.getMaths()+","+p.getScie()+","+p.getSocio());
					b.newLine();
					b.flush();
				

			}catch(Exception e) {
				System.out.println(e);
			}
		}
	public void writeGradeF(Student p)	{
		try {
			FileWriter f=new FileWriter("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\FStudent.txt",true);
			BufferedWriter b=new BufferedWriter(f);
			
				
					b.write(p.getSht()+","+p.getSname()+","+p.getFl()+","+p.getSl()+","+p.getTl()+","+p.getMaths()+","+p.getScie()+","+p.getSocio());
					b.newLine();
					b.flush();
		

			}catch(Exception e) {
				System.out.println(e);
			}
		}
	
}
