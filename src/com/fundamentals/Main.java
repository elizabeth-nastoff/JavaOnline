package com.fundamentals;

import com.fundamentals.lessons.Lesson5;
import com.fundamentals.exercises.*;
import com.fundamentals.lessons.Lesson6;

/*
* The main class is the entry point to the application
* */
public class Main {

    public static void main(String[] args) {
    // This prints hello Java
        //System.out.println("Hello Java");

        //House myHouse = new House();
        //lesson5Examples();
        //lesson5Exercises();
        lesson6Examples();
    } // end main method


    public static void lesson6Examples(){
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleEquals("happy");
        String myStr1 = myLesson6.exampleLowerCase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exampleUpperCase());
        myLesson6.exampleLength();
        myLesson6.exampleBuilder("pizza",3);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    } // end method lesson6Examples

    public static void lesson5Examples(){
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,15);
        int value = myLesson5.showLocalWithReturn(25,19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5,8));
        myLesson5.showInstancedVariable();
        myLesson5.showConversion();
    } // end lesson5Example method

    public static void lesson5Exercises(){
        Lesson5Exercises myExercise = new Lesson5Exercises();
        myExercise.wideningConversion();
        myExercise.narrowingConversions();
    }

} // end class
