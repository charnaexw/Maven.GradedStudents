package io.zipcoder;

import java.util.Arrays;
import java.util.Map;

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


    public Map<Student, String> getGradeBook(){

    }
}

