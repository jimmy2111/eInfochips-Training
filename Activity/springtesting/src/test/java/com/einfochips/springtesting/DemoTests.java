package com.einfochips.springtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.test.web.servlet.MockMvc;

import com.einfochips.springtesting.model.Member;
import com.einfochips.springtesting.repository.MemberRepoClass;

@WebMvcTest
@ExtendWith(MockitoExtension.class)
public class DemoTests {
	@Autowired
	MockMvc mm;
	
	//@Autowired
	@MockBean
	MemberRepoClass mrc;
	
	@Test
	public void testHome() throws Exception {
		mm.perform(get("/home")).andExpect(status().isOk());
	}
	
	@Test
	public void testRepoClass() {
		//Given
		//When
		//Then
		when(mrc.getMemberByEmail("dh@dh.com")).thenReturn(new Member("dh@dh.com","Dhrumi","9986475788","Female"));
	
	}
	
//	@Test
//	public void testSizeOfRepoClass() {
//		MemberRepoClass mc = new MemberRepoClass();
//		List<Member> li = mc.getMembers();
//		System.out.println(li.size());
//		when(mrc.getMembers().size()).thenReturn(2);
//	}

}
