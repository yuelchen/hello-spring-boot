package com.yuelchen.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/* Below annotation allows us to only instantiate at the web layer 
 * and only for HomeController.class.
 * 
 * This is extremely useful for testing an application with multiple controllers. 
 */
@WebMvcTest(HomeController.class)
public class WebApplicationTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void defaultMessageBody() throws Exception {
		this.mvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello World!")));
	}
	
	@Test
	public void notDefaultMessageBody() throws Exception {
		this.mvc.perform(get("/Yue")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello Yue!")));
	}
}
