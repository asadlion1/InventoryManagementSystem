package model;
// Engineered by Asad Murad ***

public class Product {
//    The instance variables
    private String productName; // Product Name
    private double productPrice; // Product Price
    private int productQuantity; // The quantity of Product

//    The overloaded constructor
    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;

    }

//    Accessor Methods
    public String getProductName() {
        return this.productName;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public int getProductQuantity() {
        return this.productQuantity;
    }


//    The toString method
    public String toString() {
        String s = String.format("Product Name: %s /n Product Price: %d /n Product Quantity: %d", this.productName, this.productPrice, this.productQuantity);
        return s;
    }



}
