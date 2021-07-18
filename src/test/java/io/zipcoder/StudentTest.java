package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void setFirstNameTest(){
        //given
        Student student = new Student;
        String firstName= "Saitama";
        String expected= firstName;
        student.setFirstName(firstName);
        //when
        String actual= student.getFirstName();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getExamScoresTest(){
        // : Given
        Double[] testScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(null, null, testScores );
        // When


        // Then
        Assert.assertEquals(expected, actual);
    }

}