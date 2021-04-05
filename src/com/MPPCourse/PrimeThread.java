package com.MPPCourse;

import java.util.ArrayList;
import java.util.List;

public class PrimeThread extends Thread {
    private long startNum;
    private long endNum;

    public PrimeThread(long startNum, long endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    public void run() {

        List<Long> primes = new ArrayList<>();
        for (long i = this.startNum; i <= this.endNum; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        System.out.println(primes);
    }

    public boolean isPrime(long n) {
        if (n <  2) {
            return false;
        }

        boolean checker = true;
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                checker = false;
                break;
            }
        }

        return checker;
    }
}
