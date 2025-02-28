import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public void displayDetails() {
        System.out.println("::::: Product Details :::::");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();

        Product p1 = new Product(id, name, price);
        p1.displayDetails();
        scanner.close();
    }
}
