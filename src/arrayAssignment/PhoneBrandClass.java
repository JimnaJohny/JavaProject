package arrayAssignment;

import java.util.Scanner;

public class PhoneBrandClass {
	Scanner sc = new Scanner(System.in);
	String productName;
	int i;
	int j;
	int k;
	int flag=0;
	String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] apple = { "Iphone 12", "Iphone 12 mini", "Iphone 11", "Iphone 11 Pro" };

	void brandName() {
		System.out.println("Available products under Samsung brand are: ");
		for (i = 0; i < samsung.length; i++) {
			System.out.println(samsung[i]);
		}
		System.out.println("Available products under Google brand are: ");
		for (j = 0; j < google.length; j++) {
			System.out.println(google[j]);
		}
		System.out.println("Available products under Apple brand are: ");
		for (k = 0; k < samsung.length; k++) {
			System.out.println(apple[k]);
		}
		System.out.println("Enter the name of the product you want: ");
		productName = sc.nextLine();
		for (i = 0; i < samsung.length; i++) {
			if (samsung[i].equals(productName)) {
				System.out.println("Product selected is: " + samsung[i]);
				flag=1;
			}
		}
		for (j = 0; j < google.length; j++) {
			if (google[j].equals(productName)) {
				System.out.println("Product selected is: " + google[j]);
				flag=1;
			}
		}
		for (k = 0; k < apple.length; k++) {
			if (apple[k].equals(productName)) {
				System.out.println("Product selected is: " + apple[k]);
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("Please select a product from the list");
	}
}
