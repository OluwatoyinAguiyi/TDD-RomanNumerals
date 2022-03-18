package com.oocode;

import org.hamcrest.Matchers.*;
import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.*;

public class RomanNumeralsTest {
	RomanNumeral rn = new RomanNumeral();

	@Test
	public void convertFromDecimal7ToRomanNumeral() {
		String result = rn.convertToRomanNumeral(7);
		assertThat(result, equalTo("VII"));
	}

	@Test
	public void checkForNumbersOver10() {
		String result = rn.convertToRomanNumeral(14);
		assertThat(result, equalTo("XIV"));

	}


	@Test
	public void checkForNumbers20orOver() {
		String result = rn.convertToRomanNumeral(20);
		assertThat(result, equalTo("XX"));

		assertThat(rn.convertToRomanNumeral(34), equalTo("XXXIV"));
		assertThat(rn.convertToRomanNumeral(39), equalTo("XXXIX"));

	}

	@Test
	public void checkForNumbersBetween40to90() {
		String result = rn.convertToRomanNumeral(51);
		assertThat(result, equalTo("LI"));

		assertThat(rn.convertToRomanNumeral(45), equalTo("XLV"));
		assertThat(rn.convertToRomanNumeral(70), equalTo("LXX"));
		assertThat(rn.convertToRomanNumeral(84), equalTo("LXXXIV"));
	}

	@Test
	public void checkForNumbersBetween90to399() {
		String result = rn.convertToRomanNumeral(91);
		assertThat(result, equalTo("XCI"));

		assertThat(rn.convertToRomanNumeral(105), equalTo("CV"));
		assertThat(rn.convertToRomanNumeral(390), equalTo("CCCXC"));
	}

	@Test
	public void checkForNumbersBetween400to899() {
		String result = rn.convertToRomanNumeral(400);
		assertThat(result, equalTo("CD"));

		assertThat(rn.convertToRomanNumeral(743), equalTo("DCCXLIII"));
		assertThat(rn.convertToRomanNumeral(899), equalTo("DCCCXCIX"));
	}

	@Test
	public void checkForNumbers900AndOver() {
		String result = rn.convertToRomanNumeral(901);
		assertThat(result, equalTo("CMI"));

		assertThat(rn.convertToRomanNumeral(1000), equalTo("M"));
		assertThat(rn.convertToRomanNumeral(3000), equalTo("MMM"));
	}




}
