package w12;

import java.util.ArrayList;

public class Product {
    private static int count = 0;
    private int productId;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.productId = count++;
        this.name = name;
        if (price < 0) {
            System.out.println("Price cannot be negative.");
        } else {
            this.price = price;
        }

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
        } else {
            this.price = price;
        }
    }
}

class Customer {
    private static int count = 0;
    private int customerId;
    private String name;
    private String email;


    public Customer(String name, String email) {
        this.customerId = ++count;
        this.name = name;
        setEmail(email);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format.");
        } else {
            this.email = email;
        }
    }

    private boolean isValidEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            int atIndex = email.indexOf("@");
            int dotIndex = email.indexOf(".");
            return atIndex < dotIndex && dotIndex < email.length() - 1;
        }
        return false;
    }
}

class Order {
    private int count = 0;
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(p -> p.getProductId() == productId);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static void main(String[] args) {
        // Test the classes and their methods
        System.out.println("Testing classes and methods:");

        // Create a Product
        Product product = new Product("Apple", 2.99);
        System.out.println("Product details:");
        System.out.println("Product name: " + product.getName());
        System.out.println("Product price: " + product.getPrice());
        System.out.println();

        // Create a Customer
        Customer customer = new Customer("John Doe", "johndoe@example.com");
        System.out.println("Customer details:");
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer email: " + customer.getEmail());
        System.out.println();

        // Create an Order
        Order order = new Order(customer);
        System.out.println("Order details:");
        System.out.println("Order customer: " + order.getCustomer().getCustomerId() + ", " + order.getCustomer().getEmail() + ", " + order.getCustomer().getName());
        System.out.println("Order total price: " + order.getTotalPrice());
        System.out.println();

        // Add products to the Order
        order.addProduct(product);
        System.out.println("Order details after adding a product:");
        System.out.println("Order total price: " + order.getTotalPrice());
        System.out.println();

        // Remove a product from the Order
        order.removeProduct(product.getProductId());
        System.out.println("Order details after removing a product:");
        System.out.println("Order total price: " + order.getTotalPrice());
        System.out.println();

        // Test negative cases
        System.out.println("Testing negative cases:");

        // Set negative price for a product
        product.setPrice(-1.99);
        System.out.println("Product details with negative price:");
        System.out.println("Product price: " + product.getPrice());
        System.out.println();

        // Set invalid email for a customer
        customer.setEmail("invalid_email");
        System.out.println("Customer details with invalid email:");
        System.out.println("Customer email: " + customer.getEmail());
        System.out.println();
    }
}
