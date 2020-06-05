package com.icoom.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

//把字符串转换成日期
public class StringToDateConverter implements Converter<String, Date> {

	public Date convert(String source) {
		if(source == null) {
			throw new RuntimeException("请您传入数据");
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return df.parse(source);
		}catch(Exception e) {
			throw new RuntimeException("数据类型转换出现错误");
		}
	}

}
