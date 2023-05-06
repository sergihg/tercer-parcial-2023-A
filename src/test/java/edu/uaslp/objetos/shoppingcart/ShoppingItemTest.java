package edu.uaslp.objetos.shoppingcart;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/*Un shopping item es un producto que puede añadirse al carrito de compras */
public class ShoppingItemTest {

    @Test
    public void testItemCreation(){
        // Given
        String name = "Computadora";
        String description = "Articulo de trabajo";
        String code = "15782";
        int unitCostInCents = 2587900;

        // When
        ShoppingItem item = new ShoppingItem(name, description, code, unitCostInCents);

        // Then
        assertThat(item.getName()).isEqualTo(name);
        assertThat(item.getDescription()).isEqualTo(description);
        assertThat(item.getCode()).isEqualTo(code);
        assertThat(item.getUnitCostInCents()).isEqualTo(unitCostInCents);
        assertThat(item.getUnitCostInPesos()).isEqualTo(25879.00);
    }
}
