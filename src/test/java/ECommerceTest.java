import org.example.Cart;
import org.example.Order;
import org.example.Product;
import org.example.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ECommerceTest {
    @Mock
    private Product product1;
    @Mock
    private Product product2;
    @Mock
    private Product product3;
    @Mock
    private Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();

        cart.add(product1);
        cart.add(product2);
    }

    @Test
    void testAddProductsToCart() {
        assertTrue(cart.add(product1).isEmpty());
        assertTrue(cart.add(product3).isPresent());
    }

    @Test
    void testRemoveProductsFromCart() {
        assertTrue(cart.remove(product3).isEmpty());
        assertTrue(cart.remove(product1).isPresent());
    }

    @Test
    void testMakeOrder() {
        Order order = cart.order();

        assertEquals(2, order.getProducts().size());
    }

    @Test
    void testIsOrderShipped() {
        Order order = cart.order();

        assertEquals(Status.Pending, order.getStatus());

        order.setStatusShipped();

        assertEquals(Status.Shipped, order.getStatus());
    }
}
