import org.example.ECommercePlatform;
import org.example.Order;
import org.example.Product;
import org.example.User;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ECommerceTest {
    @Test
    void productToString() {
        Product product = new Product(1, "TestProduct", 19.99, 50);
        assertEquals("Product{id=1, name='TestProduct', price=19.99, stock=50}", product.toString());
    }
    @Test
    void addToCart() {
        User user = new User(1, "john_doe");
        Product product = new Product(1, "TestProduct", 19.99, 50);

        user.addToCart(product, 2);
        assertEquals(2, user.getCart().get(product));
    }

    @Test
    void removeFromCart() {
        User user = new User(1, "john_doe");
        Product product = new Product(1, "TestProduct", 19.99, 50);

        user.addToCart(product, 3);
        user.removeFromCart(product, 2);
        assertEquals(1, user.getCart().get(product));
    }

    @Test
    void modifyCart() {
        User user = new User(1, "john_doe");
        Product product = new Product(1, "TestProduct", 19.99, 50);

        user.addToCart(product, 3);
        user.modifyCart(product, 5);
        assertEquals(5, user.getCart().get(product));
    }
    @Test
    void addProductToOrder() {
        Order order = new Order(1, 1);
        Product product = new Product(1, "TestProduct", 19.99, 50);

        order.addProductToOrder(product, 2);
        assertEquals(2, order.getOrderDetails().get(product));
    }

    @Test
    void calculateTotalPrice() {
        Order order = new Order(1, 1);
        Product product1 = new Product(1, "TestProduct1", 19.99, 50);
        Product product2 = new Product(2, "TestProduct2", 29.99, 30);

        order.addProductToOrder(product1, 2);
        order.addProductToOrder(product2, 1);

        assertEquals(69.97, order.calculateTotalPrice());
    }
    @Test
    void addUser() {
        ECommercePlatform platform = new ECommercePlatform();
        User user = new User(1, "john_doe");

        platform.addUser(user);
        assertEquals(user, platform.getUsers().get(1));
    }

    @Test
    void addProduct() {
        ECommercePlatform platform = new ECommercePlatform();
        Product product = new Product(1, "TestProduct", 19.99, 50);

        platform.addProduct(product);
        assertEquals(product, platform.getProducts().get(1));
    }

    @Test
    void createOrder() {
        ECommercePlatform platform = new ECommercePlatform();
        User user = new User(1, "john_doe");
        Product product = new Product(1, "TestProduct", 19.99, 50);

        platform.addUser(user);
        platform.addProduct(product);
        user.addToCart(product, 2);
        platform.createOrder(1);

        assertEquals(1, platform.getOrders().size());
    }

    @Test
    void updateProductStock() {
        ECommercePlatform platform = new ECommercePlatform();
        Product product = new Product(1, "TestProduct", 19.99, 50);

        platform.addProduct(product);
        platform.updateProductStock(product, 40);

        assertEquals(40, platform.getProducts().get(1).getStock());
    }
}
