package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test Ok");
        } else {
            System.out.println("Error!");
        }

        //calculator test

        Calculator calc = new Calculator();
        int result1 = calc.add(2, 10);
        int result2 = calc.subtract(67, 23);

        if(result1 == 12){
            System.out.println("test1 ok");
        } else {
            System.out.println("Test1 error");
        }

        if(result2 == 44){
            System.out.println("test2 ok");
        } else {
            System.out.println("test2 error");
        }
    }
}
