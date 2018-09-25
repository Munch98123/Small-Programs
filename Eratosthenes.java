/*
	Exercise 1 - 2: Sieve of Eratosthenes
	Author: Daniel Munchbach
	Date: September 12, 2018
	Description: Use this method to determine prime numbers under 10,000
	
	Step 1: Initialize an array of type boolean with all values being true.
	Step 2: Starting at 2, determine whether each other true element in te array
	is a multiple of the index you started at. If they are, set them to false.
	If not then leave them as false. Then move onto the next index that is true. 
*/


public class Eratosthenes{
	public static final int TENTHOUSAND = 10000;
	public static boolean[] primes = new boolean[TENTHOUSAND];
	//creates the initial array of true values 
	public static void initializeTrue() {
	    for(int i = 0; i < TENTHOUSAND; i++){
	        primes[i] = true;
	    }
	}
	//core function; sets all non-prime values to false
	public static void sieveOfEratosthenes(int index){
	    int temp = index;
	    for(int i = index+index;i < TENTHOUSAND; i+=temp)
		primes[i-1] = false;
	}
	//used for printing out the 10 closest prime numbers to ten thousand
	public static void printPrimes(){
	    int count = 0;
	    //k is this value because of the way arrays are indexed and because
	    //we dont want to start at ten thousand
	    for(int k = TENTHOUSAND-2;k > 0;k--){
		//basic method of printing array elements backwards
		//only looking for indexes that are equal to true
	        if(primes[k] == true){
	            System.out.println("Index: " + (k+1) + " has value " + primes[k]);
		    count++;
	        }
		if(count == 10)
		    break;
	    }
	}
	//driver function to test other functions	
	public static void main(String args[]){
	    initializeTrue();
	    for(int i = 2;i < TENTHOUSAND;i++)
	        sieveOfEratosthenes(i);
	    printPrimes();
	}

}
