package main.java;


class Calculations {


     Integer positiveSum(Integer[] arrNumber) {
        int sum = 0;
        for (Integer i : arrNumber) {
            if (i > 0) {
                sum += i;
            }
        }

        return sum;
    }
    //=================================================

     Float averageNum(Integer[] array) {
        int sum = 0;
        float num = 0f;
        for (Integer i : array) {
            sum += i;
            num = sum / (float) array.length;
        }
        return num;
    }


}
