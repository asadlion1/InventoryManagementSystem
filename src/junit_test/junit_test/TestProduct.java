//package junit_test;
//
//import model.Product;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TestProduct {
//
//    @Test
//    public void testDefaultConstructorAndSetters() {
//        Product p = new Product();
//        p.setProductName("iPhone");
//        p.setProductPrice(1099.99);
//        p.setProductQuantity(10);
//
//        assertEquals("iPhone", p.getProductName());
//        assertEquals(1099.99, p.getProductPrice(), 0.01);
//        assertEquals(10, p.getProductQuantity());
//    }
//
//    @Test
//    public void testToStringFormat() {
//        Product p = new Product("MacBook", 1299.99, 5);
//        String expected = "Product Name: MacBook\nProduct Price: 1299.99\nProduct Quantity: 5";
//        assertEquals(expected, p.toString().trim());
//    }
//
//
//
//
//}
