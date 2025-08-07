//Program to demonstrate method overloading
package oops_polymorphsim.overloading.v1;

public class Executioner {

	public static void main(String[] args) {

		System.out.println("Is 121 Palindrome? "+Operatiiors.isPalindrome(121));
		System.out.println("Is 123 Palindrome? "+Operatiiors.isPalindrome(123));
		
		System.out.println("Is CAR Palindrome? "+Operatiiors.isPalindrome("CAR"));
		System.out.println("Is RACECAR Palindrome? "+Operatiiors.isPalindrome("RACECAR"));

	}

}
