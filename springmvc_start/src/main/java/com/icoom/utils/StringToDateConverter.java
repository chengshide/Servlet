package com.icoom.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

//���ַ���ת��������
public class StringToDateConverter implements Converter<String, Date> {

	public Date convert(String source) {
		if(source == null) {
			throw new RuntimeException("������������");
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return df.parse(source);
		}catch(Exception e) {
			throw new RuntimeException("��������ת�����ִ���");
		}
	}

}
