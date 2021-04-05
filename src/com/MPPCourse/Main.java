package com.MPPCourse;


public class Main {

    public static void main(String[] args) {

        //The below is for the question number 4, You can uncomment and check it

    /*  long startNum = 2;
        long endNum = 200000;
        long finalNum = 1000000;
        while (endNum <= finalNum) {
            PrimeThread primeThread = new PrimeThread(startNum, endNum);
            primeThread.start();

            startNum = endNum + 1;
            endNum = endNum + 200000;
        }*/


          long startNum = 2;
          long endNum = 100000;
          long finalNum = 1000000;
          while (endNum <= finalNum) {
              PrimeThread primeThread = new PrimeThread(startNum, endNum);
              primeThread.start();

              startNum = endNum + 1;
              endNum = endNum + 100000;
          }

    }

}
