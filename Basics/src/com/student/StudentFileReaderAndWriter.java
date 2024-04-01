package com.student;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class StudentFileReaderAndWriter {
public List<StudentOne> readStudentData(String filePath) throws IOException {
	
	        List<StudentOne> studentList = new ArrayList<>();
	        FileReader fileReader = null;
	        BufferedReader bufferedReader = null;
	        try {
	            fileReader = new FileReader(filePath);
	            bufferedReader = new BufferedReader(fileReader);

	            for (String string = bufferedReader.readLine(); string != null; string = bufferedReader.readLine()) {
	                String[] studentDetails = string.split(",");
	                StudentOne student = new StudentOne();

	                student.setId(Integer.parseInt(studentDetails[0]));
	                student.setName(studentDetails[1]);
	                student.setFirstLanguageMarks(Integer.parseInt(studentDetails[2]));
	                student.setSecondLanguageMarks(Integer.parseInt(studentDetails[3]));
	                student.setThirdLanguageMarks(Integer.parseInt(studentDetails[4]));
	                student.setMathsMarks(Integer.parseInt(studentDetails[5]));
	                student.setScienceMarks(Integer.parseInt(studentDetails[6]));
	                student.setSocialMarks(Integer.parseInt(studentDetails[7]));
	                studentList.add(student);
	                System.out.println(student);
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        } finally {
	            fileReader.close();
	            bufferedReader.close();
	        }
	        return studentList;
	    }

	    private String writeStudentData(StudentOne student, String filePath) throws IOException {

	        FileWriter fileWriter = null;
	        BufferedWriter bufferedWriter = null;
	        StringBuilder stringBuilder = new StringBuilder();

	        try {
	            fileWriter = new FileWriter(filePath, true);
	            bufferedWriter = new BufferedWriter(fileWriter);

	            stringBuilder.append(student.getId());
	            stringBuilder.append(",");
	            stringBuilder.append(student.getName());
	            stringBuilder.append(",");
	            stringBuilder.append(student.getFirstLanguageMarks());
	            stringBuilder.append(",");
	            stringBuilder.append(student.getSecondLanguageMarks());
	            stringBuilder.append(",");
	            stringBuilder.append(student.getThirdLanguageMarks());
	            stringBuilder.append(",");
	            stringBuilder.append(student.getMathsMarks());
	            stringBuilder.append(",");
	            stringBuilder.append(student.getScienceMarks());
	            stringBuilder.append(",");
	            stringBuilder.append(student.getSocialMarks());

	            bufferedWriter.write(stringBuilder.toString());
	            bufferedWriter.newLine();
	            bufferedWriter.flush();
	        } catch (Exception e) {
	            System.out.println(e);
	        } finally {
	            fileWriter.close();
	            bufferedWriter.close();
	        }
	       
	        return stringBuilder.toString();
	    }

	    private int findAverageMarks(StudentOne student) {

	        int totalMarks = student.getFirstLanguageMarks()
	                + student.getSecondLanguageMarks()
	                + student.getThirdLanguageMarks()
	                + student.getMathsMarks()
	                + student.getScienceMarks()
	                + student.getSocialMarks();

	        return totalMarks / 6;
	    }

	    public void writeStudentDataToGrades(List<StudentOne> studentList, String gradeAPath, String gradeBPath, String gradeCPath) throws IOException {

	        for (StudentOne student : studentList) {
	            int averageMarks = findAverageMarks(student);

	            if (averageMarks >= 60 && averageMarks < 70) {
	                System.out.println(student.getName() + " is Grade C");
	                String studentDetails = writeStudentData(student, gradeCPath);
	                System.out.println(studentDetails);

	            } else if (averageMarks >= 70 && averageMarks < 80) {
	                System.out.println(student.getName() + " is Grade B");

	                String studentDetails = writeStudentData(student, gradeBPath);
	                System.out.println(studentDetails);

	            } else if (averageMarks >= 80 && averageMarks < 100) {
	                System.out.println(student.getName() + " is Grade A");

	                String studentDetails = writeStudentData(student, gradeAPath);
	                System.out.println(studentDetails);
	            }
	        }
	    }
	}



