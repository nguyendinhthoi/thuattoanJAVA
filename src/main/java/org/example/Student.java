package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private double point;

    public Student(String name, double point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        if (this.name.compareTo(o.name) == 0) {
//            return (int) (this.point - o.point);
//        }
//        return this.name.compareTo(o.name);
//    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Blice", 8.5));
        students.add(new Student("Blice", 7.0));
        students.add(new Student("Aharlie", 9.2));

        PointComparator pointComparator = new PointComparator();
        Collections.sort(students, pointComparator);
        students.forEach(student -> System.out.println(student));
    }
}
