package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
//	int[] myArray = new int[2];
//        System.out.println(myArray[5]);

//        anotherMethod();
//        myMethod();

//        int a = 10;
//        int b = 0;
//
//        try {
//            int result = divide(a, b);
//            System.out.println("result = " + result);
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }

        String[] array = new String[5];
        array[0] = "John";

        try {
            String element = firstToUpperCase(array);
            System.out.println("element = " + element);
        }catch (NullPointerException e){
           // e.printStackTrace();

            System.out.println("error message = " + e.getMessage());
        }finally {
            System.out.println("finally block");
        }

    }

    public static String firstToUpperCase(String[] array){
       return array[0].toUpperCase();
    }

//    public static int divide(int a, int b){
//        return a/b;
//    }

//    public static void myMethod() throws Exception {
//        throw new Exception("Failed to load");
//    }
//
//    public static void anotherMethod() throws RuntimeException{
//        throw new RuntimeException("Wrong parameter");
//    }

    }
