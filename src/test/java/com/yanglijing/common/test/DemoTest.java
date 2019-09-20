package com.yanglijing.common.test;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.yanglijing.util.utils.DateUtil;
/**
 * 
 * @ClassName: DemoTest 
 * @Description: TODO
 * @author:ylj 
 * @date: 2019年9月20日 上午8:32:51
 */
public class DemoTest {
	
	@Test
	public void test1() {
		
		Date src = new Date();
		System.out.println(src);
		
		
		String sql = "select * from t_order where create_time>="+DateUtil.getDateByInitMonth(src)+"and create_time<="+DateUtil.getDateByFullMonth(src);

		System.out.println(sql);
	}
	
}
