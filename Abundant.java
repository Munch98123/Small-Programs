/*
	Exercise1 : Abundant Numbers
	Author: Daniel Munchbach
	Date: September 7, 2018
	Description: Calculate all of the odd abundant numbers below 10,000
	Abundant numbers are those that the sum of their divisors is greater then the
	Number itself.
*/

class Abundant
{	//gathers all factors for a number and adds them together
	public static int factorize(int K){
	    int total = 0;
	    for(int i = 1;i < K;i++){
	        if(K%i == 0){
	            total += i;	
		}
	}
	    return total;}
	//function that sorts out the odd numbers and puts them through the factorization process
	public static void Abundant(int N){
	    int sum = 0;
	    for(int i = 1; i < N;i++)
	    {	//ensures odd numbers only
	        if(i%2 != 0){
	            sum = factorize(i);
	            if(sum > i){
	                System.out.println("Number:  " + i + "; " + "Sum of factors: " + sum);
		    }
	        }
	    }
	}
	//driver function for testing logic
	public static void main(String args []){	
	    Abundant(10000);
	}

}
