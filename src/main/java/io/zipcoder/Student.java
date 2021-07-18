package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName=firstName;
        this.lastName=lastName;
        this.examScores=new ArrayList<Double>(Arrays.asList(testScores));
    }
    public  void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getLastName() { return lastName; }

    public int getNumberOfExamsTaken(){
        int examsTaken = examScores.size();

        return examsTaken;
    }

    public String getExamScores(){
        String output= "Exam Scores: \n";

        for(int i=0; i<this.examScores.size(); i++){
            output+= String.format("  Exam %d -> %d\n", i+1, (int)Math.rint(this.examScores.get(i)));
        }

        return output;

    }
    public void addExamScore(double examScore){
        this.examScores.add(examScore);}

    public void setExamScores(int examNumber, double newScore){this.examScores.set(examNumber-1, newScore);

    }
    public double getAverageExamScore(){
        return examScores.size()/2;
    }
    public String toString(){
        return String.format("Student Name: %s %s\n> Average Score: %d\n> ",this.firstName, this.lastName, (int)Math.rint(this.getAverageExamScore())) + this.getExamScores();
    }

    }
