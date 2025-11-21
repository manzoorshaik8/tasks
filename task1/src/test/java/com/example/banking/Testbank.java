package com.example.banking;

public class Testbank {
	    public static void main(String[] args)
	    {
	        Account sa = new Account(1000);
	        sa.initial(0.05);
	        sa.getbalance();
	        System.out.println("Balance after interest: " + sa.getbalance());
	        System.out.println("ravi your balance:");
	    }
}
