package org.example;

import java.util.Comparator;

public class PointComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return (int) (o2.getPoint() - o2.getPoint());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
