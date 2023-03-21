package com.einfochips.springtesting;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;
import static org.mockito.ArgumentMatchers.contains;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class SpringtestingApplicationTests {

	@Autowired
	private MockMvc mm;
	
	@Test
	void testController() throws Exception {
		mm.perform(get("/home")).andExpect(status().isOk());
	}
	@Test
	void negativeController() throws Exception {
		mm.perform(get("/index123")).andExpect(status().isNotFound());
	}
	@Test
	void checkvalue() throws Exception {
		mm.perform(get("/index")).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Hello Index Page")));
	}

}
