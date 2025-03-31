package test2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerOrderTest {

	private CustomerOrder order;
    private Inventory inventory;

    @Before
    public void setUp() {
        order = new CustomerOrder();
        inventory = new Inventory();

        // Initialize the inventory with some items
        inventory.addItem("Pepperoni Pizza", 10);
        inventory.addItem("Cheese Pizza", 8);
        inventory.addItem("Garlic Bread", 15);
    }
	
	// ToDo: Test placing a valid order
	// Add items to the order, verify the number of items, and check if the total cost is calculated correctly.


    // ToDo: Test paying for the order
 	// Add an item to the order, pay using a method, and verify that the order is marked as paid.
     
@Test
    public void testInventoryUpdate() {
	    order.addItem("Pepperoni Pizza", 12.50);
	    inventory.updateStock("Pepperoni Pizza", 1);
	    assertEquals(9, inventory.getItemStock("Pepperoni Pizza"));
	}

	// ToDo: Test low stock alert
	// Reduce the stock of an item and verify that the system triggers a low stock alert when the quantity falls below the threshold.


	// ToDo: Test order status updates
	// Set the status of the order and verify that the status is updated correctly.


}
