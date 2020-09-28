package Junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AddTest {

	@BeforeAll
	static void before() {
		System.out.println("テスト開始");
	}

	@AfterAll
	static void after() {
		System.out.println("テスト終了");
	}

	@Test
	void test() {
		Add ad = new Add();
		assertEquals(ad.add(1,3), 4);
	}

	@Test
	void test2() {
		Add ad = new Add();
		assertEquals(ad.add(2,3), 4);
	}

	@Test
	void test3() {
		Add ad = new Add();
		assertEquals(ad.add(4,5), 9);
	}

}
