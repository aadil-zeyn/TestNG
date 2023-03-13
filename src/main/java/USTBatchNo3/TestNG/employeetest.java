package USTBatchNo3.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class employeetest {
@Test
	public void emptest() {
		Employee em=new Employee(23,"Abu",45);
		assertEquals(em.getAge(),45);
	}
}
