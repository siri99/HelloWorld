package com.example.helloworld;
import java.util.*;

public class HelloWorld {  // Class/enum names must be nouns and written in PascalCase.
    public static void main(String[] args) {

        String introVariable="Welcome"; // Variable names must be in camelCase.

        // verb for method name
        // 1. short method name below
        nameDisplayer("cs2103"); // Names representing methods must be verbs and written in camelCase.

        System.out.println(introVariable);

        nameDisplayer("cs2103", "cg2271", "ee2020" //Place line break to improve readability intermediate rule
                        + "ges1002","geh1034"); //four arguments

        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        int firstNumber=2; // names follow intermediate guidelines, names are NOT misleading
        int secondNumber=5;
        // 3. simple expression below
        int sumNumbers= firstNumber + secondNumber; // White space within a statement intermediate rule

        if(sumNumbers==7){
            System.out.println("Welcome again");
        }

        // 2. no depe nesting below
        for(String obj:al) { // Single statement conditionals should still be wrapped by curly brackets.
            // Comments should be indented relative to their position in the code.
            System.out.println(obj);
        }
    }

    static void nameDisplayer(String... values){
        System.out.println("names of modules will be printed ");
        for(String s:values){
            System.out.println(s+"HI");
        }
    }

    static void printShapes(){
        String firstShape="circle";
        System.out.println(firstShape);
    }
}