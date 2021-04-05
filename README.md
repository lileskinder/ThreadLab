# ThreadLab

1)  a)  Study the code in the Threads1 directory.
     b)  Predict the output.
     c)  Now run the code to see what the computer gives you for output.

2)  Do the above three steps for the Threads2 directory.

3)  Do the above three steps for the Threads3 directory.

*****************************************************************

4)  You are trying to print out ALL of the prime numbers between 1  and  1,000,000.
     Write a program which wants to do this quickly, and so creates five Threads to do different ranges of 
      numbers.  Thread one prints all primes between 1 and 200,000.
      Thread two does the same for numbers between 200,001 and 400,000.
      Thread three does the same for numbers between 400,001 and 600,000,  etc.

      You ‘may’ have to write a method ‘isPrime’ which returns a boolean.  If its one argument is a prime,
       isPrime returns true.  Otherwise false is returned.

      boolean  isPrime (int anInt)     is the signature and return code.


5)  Same as problem 4 except create ten Threads.  Now each thread only does 100,000 numbers.


