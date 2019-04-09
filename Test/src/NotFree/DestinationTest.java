package NotFree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DestinationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void test() {
		Destination test2=new Destination();
		double ActualResult;
		double ExpectResult;
	/*
	 * 国内测试
	 * 
	 */
	//根据代码，只需测试机票费用一个参数
	//费用为负数
		ActualResult=test2.Compute2("区域二",22,1,-1234,1,1,1,"经济舱");
		ExpectResult=450;
		assertEquals(ExpectResult,ActualResult,0.002);
		/*
		 * 区域一测试
		 * 
		 */
	}

}
