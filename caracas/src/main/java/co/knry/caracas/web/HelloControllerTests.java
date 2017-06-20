package co.knry.caracas.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTests {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
    public void testHandleRequestView() throws Exception{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        //assertEquals("WEB-INF/views/hello.jsp", modelAndView.getViewName());
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("nows");
        assertNotNull(nowValue);
    }

}
