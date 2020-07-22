/**
 * 
 */
package com.hotel.master.product;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author User
 *
 */
//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookingResourceTest {

	@Autowired
	private MockMvc mvc;

	
    @BeforeEach
    void setMockOutput() {
    }

	@Test
	@WithMockUser(username = "staff", authorities = { "ADMIN", "USER" })
	public void getAll() throws Exception {

		mvc.perform(get("/api/booking/bookings").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
			      .andExpect(jsonPath("$[0].name", is("Rajesh")));
	}
	
	@Test
	public void getAllService()throws Exception {
	}
 }
