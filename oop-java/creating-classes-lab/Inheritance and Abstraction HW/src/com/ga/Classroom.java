package com.ga;

import java.util.LinkedList;

public interface Classroom {
    int getNumberOfStudents();
    int getClassroomNumber();
    String getGradeLevel();
    LinkedList<String> getSubjects();
    String headTeacher();
    String secondaryTeacher();
}
