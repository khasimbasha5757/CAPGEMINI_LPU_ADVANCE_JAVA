package MockitoPractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

import MockitoPractice.UserDao;
import MockitoPractice.UserService;

public class UserServiceTest {
	@Test
	public void testGetTypeOfCustomer() {	
	UserDao userdao=new UserDao();
	UserService userservice=new UserService(userdao);
	String actualRes=userservice.typeOfUser(1);
	assertEquals("Regular user",actualRes);
	}
	@Test
	public void testDoubleAddition() {
		//step 1 :: createFakeObject
		Calculator calmock=mock(Calculator.class);
		//Step2: what mock object should return
		when(calmock.add(5, 5)).thenReturn(20);
		//step3: inject the mock reference
		MathService service=new MathService(calmock);
		int res=service.doubleAddition(5,5);
		assertEquals(20,res);
	}
}
