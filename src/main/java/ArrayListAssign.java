package main.java;

import java.util.List;

class ArrayListAssign {

    /*this method replace value 'Tree' by 'Three"*/
    void replaceArrayList(List<String> arrList){
        for (String i : arrList) {
            if (i.contentEquals("Tree")) {
                arrList.set(arrList.indexOf(i), "Three");
            }
        }
        System.out.print("result is: " + arrList);
    }



    /* this method remove all number which are divisible by 3 */
    void deleteDivisionInArrayList(List<Integer> division){
        division.removeIf(n -> n % 3 == 0);
        System.out.println("result is: "+division);
    }
}
