package com.kodilla.testing.collection;

import java.util.*;
public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        if(numbers.isEmpty()){
            System.out.println("ArrayList is empty!");
            return null;
        }
        for(int i = 0; i<numbers.size(); i++){
            Integer number = numbers.get(i);
            if(number%2==0){
                evenNumbers.add(number);
            }
        }
        System.out.println("Result: " + evenNumbers);
        return evenNumbers;
    }
}
