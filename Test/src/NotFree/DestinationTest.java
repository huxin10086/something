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
	 * ���ڲ���
	 * 
	 */
	//���ݴ��룬ֻ����Ի�Ʊ����һ������
	//����Ϊ����
		ActualResult=test2.Compute2("�����",22,1,-1234,1,1,1,"���ò�");
		ExpectResult=450;
		assertEquals(ExpectResult,ActualResult,0.002);
		/*
		 * ����һ����
		 * 
		 */
	}

}
