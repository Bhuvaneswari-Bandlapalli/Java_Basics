package com.student;
import java.io.IOException;
import java.util.List;
public class Main {




    public static void main(String[] args) {
    	StudentFileReaderAndWriter studentFileReaderAndWriter = new StudentFileReaderAndWriter();
        String filePath = "C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\studentsmarks.txt";
        String gradeAPath = "C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\studentA.txt";
        String gradeBPath = "C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\studentB.txt";
        String gradeCPath = "C:\\Users\\bvnmp\\Desktop\\My_Files\\Student\\studentC.txt";

       

        try {
        	 
            List<StudentOne> studentList = studentFileReaderAndWriter.readStudentData(filePath);
            studentFileReaderAndWriter.writeStudentDataToGrades(studentList, gradeAPath, gradeBPath, gradeCPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        
    }
}
}
