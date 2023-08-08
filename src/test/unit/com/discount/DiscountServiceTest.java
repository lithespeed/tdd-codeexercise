package test.unit.com.discount;

import main.com.discount.DiscountService;
import main.com.discount.Product;
import main.com.discount.ProductRepository;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class DiscountServiceTest {

    @Mock
    private ProductRepository stub;

    @InjectMocks
    private DiscountService sut;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);  // Initializes annotated mocks
    }

    @Test
    public void testApplyDiscountForCategory() {
        List<Product> products = Arrays.asList(
                new Product("product1", "category1", 10.0),
                new Product("product2", "category1", 20.0),
                new Product("product3", "category1", 30.0)
        );

        when(stub.getProductsByCategory(anyString())).thenReturn(products);

        double totalDiscount = sut.applyDiscountForCategory("category1");

        assertEquals(60.0, totalDiscount, 0.001); // Check that the correct total discount is calculated
        verify(stub, times(1)).getProductsByCategory(eq("category1")); // Verify method call
    }
}

