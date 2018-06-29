package com.genil.healthapp;

import com.genil.healthapp.controllers.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthCareSpringApplicationTests {

	@Test
	public void contextLoads() {
		/**
		 * Test the controller..
		 */
		UserController userController = new UserController();
		MockMvc mockMvc = standaloneSetup(userController).build();
        try {
            mockMvc.perform(get("/users/sayHello")).andExpect(view().name("hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
