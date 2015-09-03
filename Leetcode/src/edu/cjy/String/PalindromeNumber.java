package edu.cjy.String;

public class PalindromeNumber {
	public boolean isPalindrome(int x){
		int div=1;
		if(x<0)
			return false;
		
		while(x/div>=10){
			div*=10;
		}
		while(x>0){
			int right=x%10;
			int left = x/div;
			if(left!=right)
				return false;
			x=(x%div)/10;
			div/=100;
		}
		return true;
	}
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		int a=0;
		long start=System.nanoTime();
		System.out.println("result of "+a+" :"+palindromeNumber.isPalindrome(a));
		System.out.println(System.nanoTime()-start);
		
	}
}
