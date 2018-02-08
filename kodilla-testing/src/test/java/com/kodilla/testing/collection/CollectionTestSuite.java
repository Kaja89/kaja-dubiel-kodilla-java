package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.*;
public class CollectionTestSuite {


    @Before
    public void before(){
        System.out.println("Starting test... ");
    }

    @After
    public void after(){
        System.out.println("End of test...");
    }

    @Test
    public void testOddNumbersExterminationEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(emptyList);
        ArrayList<Integer> expected = null;
        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);

        //When
        ArrayList<Integer> result = exterminator.exterminate(normalList);

        //Then
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        Assert.assertEquals(expected, result);
    }
}
