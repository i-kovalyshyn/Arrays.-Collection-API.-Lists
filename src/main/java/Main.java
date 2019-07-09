package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] arg) {

        Integer[] array = new Integer[]{2, 3, 1, 7, 11};
        System.out.println("*TASK#1\nCreate array of Integer with value: " + Arrays.toString(array) + " Sort by DESC");
        Arrays.sort(array, Collections.reverseOrder());
        System.out.print("result is: " + Arrays.toString(array));
        System.out.print("\n===============================\n");


        List<String> arrList = new ArrayList<>();
        arrList.add("One");
        arrList.add("Two");
        arrList.add("Tree");
        arrList.add("Four");
        System.out.println("*Task#2\nCreate an ArrayList  " + arrList + " Replace value 'Tree' by 'Three");
        ArrayListAssign replace = new ArrayListAssign();
        replace.replaceArrayList(arrList);
        System.out.print("\n===============================\n");

        Calculations arrayNum = new Calculations();

        // You get an array of numbers (positive and negative) and return the sum of all positive ones.(If there are nothing to sum, sum should be o)
        Integer[] arrNumber = new Integer[]{-2, -3, 2, 3, 10};
        System.out.println("*Task#3\n array of numbers  " + Arrays.toString(arrNumber) + " return the sum of all positive ones");

        System.out.print("positive sum is: " + arrayNum.positiveSum(arrNumber));
        System.out.print("\n===============================\n");

        Integer[] arrNumber1 = new Integer[]{1, 2, 3, 4, 5, 6};
        System.out.println("*Task#4\nreturn the average of a list of numbers  " + Arrays.toString(arrNumber1));
        System.out.print("Average is:" + arrayNum.averageNum(arrNumber1));
        System.out.print("\n===============================\n");


        List<Integer> division = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
        System.out.println("*Task#5\n we have ArrayList" + division + " remove all number which are divisible by 3");
        ArrayListAssign deleteDivisionBy3 = new ArrayListAssign();
        deleteDivisionBy3.deleteDivisionInArrayList(division);

    }

}

