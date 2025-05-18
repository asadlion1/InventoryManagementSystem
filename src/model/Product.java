package model;
// Engineered by Asad Murad ***

public class Product {
//    The instance variables
    private String productName; // Product Name
    private double productPrice; // Product Price
    private int productQuantity; // The quantity of Product
    private int productId;
    private double productWeight;
    private boolean overweight;

//    The overloaded constructor
    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;

    }

    public Product(String productName, double productPrice, int productQuantity, int productId, double productWeight) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productId = productId;
        this.productWeight = productWeight;
    }


    //    Default Constructor (For Testing)
    public Product() {

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

    public int getProductId() {
        return this.productId;
    }

    public double getProductWeight() {
        return this.productWeight;
    }

//    Mutator Methods

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

//    The toString method
    @Override
    public String toString() {
        return String.format("Product Name: %s\nProduct Price: %.2f\nProduct Quantity: %d",
            this.productName, this.productPrice, this.productQuantity);
    }




}
