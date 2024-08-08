package jenkinsTest.JenkinsTest;

import org.testng.annotations.Test;

public class PageLayerJenkinTest {

	@Test(priority = 1)
	public void hehe() {
		System.out.println("hehe");
	}
	@Test(priority = 2)
	public void hihi() {
		int a = 10;
		int b =10;
		if(a>b) {
			System.out.println("good");
		}else {
			System.out.println("result failed with testcase2");
		}
	}
}
