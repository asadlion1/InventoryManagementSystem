package model;
/* Engineered by Asad Murad - Computer Engineering *** */

public class Entry {
    private Product[] products;
    private int nop; // This is number of products
    private final int MAX = 20;
    public Entry() {
        this.products = new Product[MAX];

    }

    public Product getProduct(int productId) {
        Product p = new Product();
        for (int i = 0; i < this.nop; i++) {
            if (this.products[i].getProductId() == productId) {
                p = this.products[i];

            }
        }
        return p;
    }


    public void addProduct(Product p) {
        this.products[this.nop] = p;
        this.nop++;
    }


    //    Mutator Methods



//    Accessor Methods
    public int getNumberOfEntries() {
        return this.nop;
    }

    public Product[] getProducts() {
        return this.products;
    }









}
