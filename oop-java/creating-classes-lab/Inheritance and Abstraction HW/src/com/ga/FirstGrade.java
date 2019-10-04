package com.ga;

import java.util.Arrays;
import java.util.LinkedList;

public class FirstGrade implements Classroom {
    private String chairType = "leather";
    private boolean hasMacbooks = true;

    public LinkedList<String> advancedStudents() {
        LinkedList<String> apStudents = new LinkedList<String>();
        apStudents.add("Alex");
        apStudents.add("Bobby");
        apStudents.add("Chad");
        apStudents.add("Derek");
        apStudents.add("Edgar");
        return apStudents;
    }

    @Override
    public int getNumberOfStudents() {
        return 26;
    }

    @Override
    public int getClassroomNumber() {
        return 104;
    }

    @Override
    public String getGradeLevel() {
        return "First";
    }

    @Override
    public LinkedList<String> getSubjects() {
        LinkedList<String> subjects = new LinkedList<String>(Arrays.asList(
                "History", "Math", "Social Studies", "Science"));
        return subjects;
    }

    @Override
    public String headTeacher() {
        return "Mrs. Firston";
    }

    @Override
    public String secondaryTeacher() {
        return "Mrs. Segundo";
    }
}
