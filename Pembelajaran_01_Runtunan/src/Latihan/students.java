package Latihan;
public class students {

    Integer NPM;
    String Fullname;
    String ClassName;
    Integer Semester;
    Float GPA;

    Integer getNPM(Integer value) {
        NPM = value;
        return NPM;
    }

    String getFullname(String value) {
        Fullname = value;
        return Fullname;
    }

    String getClassName(String value) {
        ClassName = value;
        return ClassName;
    }

    Integer getSemester(Integer value) {
        Semester = value;
        return Semester;
    }

    Float getGPA(Float value) {
        GPA = value;
        return GPA;
    }
}