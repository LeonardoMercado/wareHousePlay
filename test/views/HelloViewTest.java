package views;

import org.junit.Test;
import play.twirl.api.Content;
import static junit.framework.TestCase.assertEquals;

public class HelloViewTest {

    @Test
    public void renderTemplate(){
        Content html = views.html.hello.render("Entrando por Testing");
        assertEquals("text/html",html.contentType());
        assertEquals(true,html.body().toString().contains("hola"));
        assert(html.body().toString().contentEquals("hola"));
    }

}
