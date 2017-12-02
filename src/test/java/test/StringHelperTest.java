package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import helper.StringHelper;

public class StringHelperTest {

	StringHelper helper;

	@Before
	public void before() {
		helper = new StringHelper();
	}

	/* TruncateAInFirst2Positions */
	@Test
	public void testTruncateAInFirst2Positions_test_AAbcd() {
		assertEquals("bcd", helper.truncateAInFirst2Positions("AAbcd"));
	}

	@Test
	public void testTruncateAInFirst2Positions_test_AA() {
		assertEquals("", helper.truncateAInFirst2Positions("AA"));
	}

	@Test
	public void testTruncateAInFirst2Positions_test_A() {
		assertEquals("", helper.truncateAInFirst2Positions("A"));
	}

	@Test
	public void testTruncateAInFirst2Positions_test() {
		assertEquals(" ", helper.truncateAInFirst2Positions(" "));
	}

	@Test
	public void testTruncateAInFirst2Positions_xA() {
		assertEquals("& ", helper.truncateAInFirst2Positions("&A "));
	}

	/* AreFirstAndLastTwoCharactersTheSame */
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_ABcdeAB() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("ABcdeAB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_2chars() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("df"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_1char() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("f"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_xDakjsdhkjsaxd() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("xDakjsdhkjsaxd"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_xdaaaaxd() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("xdaaaaxd"));
	}
}
