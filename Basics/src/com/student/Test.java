package com.student;
import java.util.*;
import java.io.*;
public class Test {
	BufferedReader getData() {
		BufferedReader br=null;
		FileReader fr=null;
		try {
			fr=new FileReader("C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\studentsmarks.txt");
			br=new BufferedReader(fr);
		}catch(Exception e) {
			System.out.println(e);
		}
		return br;
		}
	public ArrayList<Student> getStdData(double percent){
		ArrayList<Student> p=new ArrayList<>();
		BufferedReader b=getData();
		ArrayList<Double> o=data();
		try {
			for(String s=b.readLine();s!=null;s=b.readLine()) {
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
	
	public ArrayList<Double> data(){
		ArrayList<Double> s=new ArrayList<>();
		BufferedReader j=getData() ;
		
		int sum=0;
		double perc=0;
		try{
			for(String w=j.readLine();w!=null;w=j.readLine()) {
				
				String[] g=w.split(",");
				int i1=(Integer.parseInt(g[2]));
				int i2=(Integer.parseInt(g[3]));
				int i3=(Integer.parseInt(g[4]));
				int i4=(Integer.parseInt(g[5]));
				int i5=(Integer.parseInt(g[6]));
				int i6=(Integer.parseInt(g[7]));	
				
				sum=i1+i2+i3+i4+i5+i6;
				perc=sum/6;
				s.add(perc);	
		}
			}catch(Exception e) {
			System.out.println(e);
		}
			
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int avg;
		
		Test t=new Test();
		double d=sr.nextDouble();
		ArrayList<Student> h=t.getStdData(d);
			for(Student k:h) {
					avg = (k.getMaths()+k.getFl()+k.getScie()+k.getSocio()+k.getSl()+k.getTl())/6;
					
					
					if(avg>=60 && avg<=69 && d>=60 && d<=69) {
						
						System.out.println("c");
						System.out.println(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());
						
						
					}else if(avg>=70 && avg<=79 && d>=70 && d<=79) {
						System.out.println("B");
						System.out.println(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());
						
					
					}
					else if(avg>=80 && d>=80) {
						System.out.println("A");
						System.out.println(k.getSht()+","+k.getSname()+","+k.getFl()+","+k.getSl()+","+k.getTl()+","+k.getMaths()+","+k.getScie()+","+k.getSocio());
					
					}
					else if(avg<=59 && d<=59){
						System.out.println("fail");	
					}
				}
			}
		}
	

