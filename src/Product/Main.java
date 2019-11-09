package Product;

import java.util.Scanner;

public class Main extends Product {

    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Apple");
        product.setPrice(10);

        //System.out.println(product.getName() + " " + product.getPrice());

        //array of Objects
        Product[] products = new Product[5];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter product:");
            products[i]=new Product();
            products[i].setName(scanner.nextLine());
            products[i].setPrice(Math.random() * 9 + 1);

            System.out.println(products[i].getName()+ " "+products[i].getPrice());
        }

    }


}
