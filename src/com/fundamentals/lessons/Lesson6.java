package com.fundamentals.lessons;

/*
* The contents of this class is for the Lesson 6 slide deck
* Strings & More
* */
public class Lesson6 {

    String myString = "Hello";

    // Method shows string method for charAt
    public void exampleCharAt(){
        char myChar = myString.charAt(2);
        System.out.println(myChar);
    } // end method exampleCharAt

    // Method compares two stings to see if they are equal
    public void exampleEquals(String value){
        boolean myBoolean = myString.equals(value);
        System.out.println(myBoolean);
    } // end method exampleEquals

    // Method takes a string and converts it to all lowercase
    public String exampleLowerCase(){
        return myString.toLowerCase();
    } // end method exampleLowerCase

    // Method takes a string and converts it to all uppercase
    public String exampleUpperCase(){
        return myString.toUpperCase();
    } // end method exampleUpperCase

    // Method determines the length of a string
    public void exampleLength(){
        int length = myString.length();
        System.out.println(length);
    } // end method exampleLength

    // Example of how to use the StringBuilder class
    public void exampleBuilder(String food, int value){
        StringBuilder builder = new StringBuilder();
        builder.append("My favorite food is ");
        builder.append(food).append(" and I ate ");
        builder.append(value).append(" plates of it");
        String fav = builder.toString();
        System.out.println(fav);
    } // end method exampleBuilder

    // Method for showing the char data type
    public void exampleChar(){
        char c1 = 't'; // \u0074
        char c2 = '\u00A7';
        System.out.println(c2);
    } // end method exampleChar

    // Method shows escape sequences
    public void exampleEscape(){
        System.out.println("That\'s a cool toy. \tCan I\n play with it");
    } // end method example escape
} // end class
