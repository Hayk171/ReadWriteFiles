package service;

import model.Student;

import java.io.File;

public class StudentService {

    public static Student[] convert(String[] text) {
        Student[] students = new Student[text.length];
        for (int i = 0; i < text.length; i++) {
            students[i] = new Student(text[i]);
        }
        return students;
    }

    public static Student maxAge(Student[] students){
        Student max = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getYear() < max.getYear()) {
                max = students[i];
            }

        }
        return max;
    }

    public static Student maxMark(Student[] students) {
        Student maxMark = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMark() > maxMark.getMark()) {
                maxMark = students[i];
            }
        }
        return maxMark;
    }

    public static File createFileAndWrite(Student[] students) throws Exception {
        File newFile = null;
        for (int i = 0; i < students.length; i++) {
            String BaseURl = "C:\\ProgramData\\test\\";
            BaseURl = BaseURl + students[i].getName() + ".txt";
            newFile = new File(BaseURl);
            newFile.createNewFile();
            FileService.write(BaseURl, students[i].toString());
        }
        return newFile;
    }

}
