package io.zipcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Classroom {
private Student[] students;

public Classroom(){
    this.students=new Student[30];
}
public Classroom(int maxNumberOfStudents){
    this.students= new Student[maxNumberOfStudents];
}
public Classroom(Student[] students){
    this.students=students;
}

    public Student[] getStudent() {
        return students;
    }

    public double getAverageExamScore(){
    double sum = 0.0;
    int counter=0;
    for(int i =0; i<students.length; i++){
           if(students[i]!=null){
               counter++;
               sum+=students[i].getAverageExamScore();
        }
    }return sum/counter;
    }
    public void addStudent(Student student){
    Student[] newStudents = Arrays.copyOf(this.students, this.students.length+1);
    newStudents[this.students.length]= student;
    this.students=newStudents;
    }
    public void removeStudent(String firstName, String lastName){
        for(int i=0; i<this.students.length; i++)
            if(this.students[i].getFirstName() == firstName && this.students[i].getLastName() == lastName){
                students[i]=null;
            }

    }

    public Student[] getStudentsByScore() {
        Map<Double, Student> sortedStudents = new TreeMap<>();
        for(Student student: this.students){
            sortedStudents.put(student.getAverageExamScore(), student);
        }
        Student[] result=sortedStudents.values().toArray(new Student[this.students.length]);
        return result;

    }

    public Map<Student, String> getGradeBook(){
        Student[] sortedStudents = getStudentsByScore();
        int orderedStudents= sortedStudents.length;
        Map<Student,String> result = new HashMap<>();
        String grade = "";
        double percentile = 0;

        for(int i=0; i<percentile; i++){
            percentile=i/orderedStudents;
            if(percentile>.9) {
                grade = "A";
            }else if (percentile>.7){
                grade="B";
            } else if (percentile>.5){
                grade="C";
            } else if (percentile>.1){
                grade="D";
            }else{grade="F";
            }
            result.put(sortedStudents[i],grade);
            }
        return result;
        }
    }


