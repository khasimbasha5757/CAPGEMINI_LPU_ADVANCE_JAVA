package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import mockito.User;
import mockito.UserDao;
import mockito.UserService;
public class UserServiceTest {
		@Test
		public void typeOfUser() {
			UserDao daomock=mock(UserDao.class);
			User fakeObject=new User();
			fakeObject.setId(1);
			fakeObject.setBalance(2000);
			fakeObject.setName("Allen");
			
			when(daomock.findById(1)).thenReturn(fakeObject);
			User user1=new User();
			user1.setId(2);
			user1.setName("Miller");
			user1.setBalance(2000);
			when(daomock.findById(1)).thenReturn(user1);
			UserService service =new UserService(daomock);
			String res=service.typeOfUser(2);
			assertEquals("regular user",res);
		}
}