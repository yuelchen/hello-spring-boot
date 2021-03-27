package com.yuelchen.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

/* Below annotation allows us to instantiate and test at the application level; whole context. 
 * 
 * Notice the parameter to provide a random port for web environment when testing. 
 * This is useful in the sense that we can avoid conflicting ports in our test environment.
 * Conflicting ports in the same environment will cause our application to fail at start-up. 
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HomeControllerTest {

	@Autowired
	private HomeController controller;

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate template;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void defaultMessage() throws Exception {
		assertThat(template.getForObject("http://localhost:" + port + "/",
				String.class)).contains("Hello World!");
	}
}