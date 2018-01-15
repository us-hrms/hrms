package com.hfp.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class Testaaa {

	@Test
	public void DateTest(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		Calendar calender = Calendar.getInstance();
		calender.set(2017, 8, 20);
	}
}
