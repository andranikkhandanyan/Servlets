package am.aca.servlet;

import am.aca.servlet.model.Item;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemsServletTest {

    @Test
    public void assertJson() throws JsonProcessingException {
        ItemsServlet itemsServlet = new ItemsServlet();
        Item item = new Item(1, "Visualize");
        assertEquals("{\"id\":1,\"name\":\"Visualize\"}",
                itemsServlet.getItemAsJson(item));
    }
}
