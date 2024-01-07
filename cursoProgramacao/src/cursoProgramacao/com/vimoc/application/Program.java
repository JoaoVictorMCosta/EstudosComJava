package cursoProgramacao.com.vimoc.application;

import java.util.Locale;
import java.util.Scanner;

import cursoProgramacao.com.vimoc.entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter Product Data: ");
		System.out.print("Name: ");
		product.name=sc.nextLine();
		System.out.println("Price: ");
		product.price=sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity=sc.nextInt();
		
		System.out.println(product);
		sc.close();
	}

}
