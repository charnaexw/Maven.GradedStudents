package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void setFirstNameTest(){
        //given
        Student student = new Student(null,null,null);
        String firstName= "Saitama";
        String expected= firstName;
        student.setFirstName(firstName);
        //when
        String actual= student.getFirstName();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setLastNameTest(){
        //given
        Student student = new Student(null,null,null);
        String lastName= "Genos";
        String expected= lastName;

        student.setLastName(lastName);
        //when
        String actual= student.getLastName();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setExamScoreTest(){
        //given
        String firstName= "Karma";
        String lastName="Akabane";
        Double[] testScore = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName,lastName,testScore);
        student.setExamScores(null,);
        //when
        String actual= student.getLastName();
        //then
        Assert.assertEquals(expected, actual);
    }

    }

