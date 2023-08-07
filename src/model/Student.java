package model;

public class Student {
    private  String name;
    private int year;
    private  double mark;

    @Override
    public String toString() {
        return name + " " + year + " " + mark;
    }

    public Student(String s) {
        String[] split = s.split(",");
        name = split[0];
        year = Integer.parseInt(split[1]);
        mark = Double.parseDouble(split[2]);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
