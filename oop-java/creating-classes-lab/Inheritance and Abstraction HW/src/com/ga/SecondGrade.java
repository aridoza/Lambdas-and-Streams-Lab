package com.ga;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SecondGrade implements Classroom {
    @Override
    public int getNumberOfStudents() {
        return 25;
    }

    @Override
    public int getClassroomNumber() {
        return 106;
    }

    @Override
    public String getGradeLevel() {
        return "Second";
    }

    @Override
    public LinkedList<String> getSubjects() {
        LinkedList<String> subjects = new LinkedList<>(Arrays.asList("Math", "Science", "History", "Social Studies"));
        return subjects;
    }

    @Override
    public String headTeacher() {
        return "Mr. Secondman";
    }

    @Override
    public String secondaryTeacher() {
        return "Mr. Segundoman";
    }
}
