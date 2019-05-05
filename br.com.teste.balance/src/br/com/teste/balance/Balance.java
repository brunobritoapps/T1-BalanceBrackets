package br.com.teste.balance;
import br.com.teste.controller.BracketController;
import java.util.Scanner;


public class Balance {
	public static void main(String[] args) {
            BracketController bracket = new BracketController();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data for validation");
            String s = sc.next();
            System.out.println(bracket.CheckParentesis(s));
            sc.close();
	}

	
}