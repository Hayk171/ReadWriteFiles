import model.Student;
import service.FileService;
import service.StudentService;

import java.io.File;

public class Test {

    public static final String URL = "C:\\Users\\user\\OneDrive\\Desktop\\test.txt";

    public static void main(String[] args) throws Exception {

        String[] read = FileService.read(URL);
        Student[] convert = StudentService.convert(read);
        Student student = StudentService.maxAge(convert);
        FileService.write(URL, "\nMax = " + student.toString());
        Student maxMarkStudent = StudentService.maxMark(convert);
        FileService.write(URL, "\nMax Mark = " + maxMarkStudent.toString());
        File newFile = StudentService.createFileAndWrite(convert);

    }
}
