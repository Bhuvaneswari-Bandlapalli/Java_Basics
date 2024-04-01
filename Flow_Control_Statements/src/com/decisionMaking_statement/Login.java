package com.decisionMaking_statement;

public class Login {
	/*
	 * if(condition){
	 * 		statements
	 * }else{
	 * 		if(condition){
	 * 			statement
	 * 		}else{
	 *          statement
	 *      }
	 * }
	 * 
	 */

	public static void main(String[] args) {
		String userName="bhuvana";
		String password="123@Bhuvana";
		String favoriteSport="Cricket";
		if(userName.equals("rukku") &&  password.equals("123@bhuvi") ) {
			System.out.println("Login succsess");
		}else {
			System.out.println("Login credentials wrong");
			System.out.println("Security question display");
			if(favoriteSport.equals("Cricket")) {
				System.out.println("UserName");
				System.out.println("Password");
			}else {
				System.out.println("wrong answer");
			}
		}

	}

}
