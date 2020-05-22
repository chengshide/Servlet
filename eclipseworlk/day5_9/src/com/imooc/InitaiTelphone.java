package com.imooc;

import com.imooc.Demo2_6.Inner;
import com.imooc.SOuter.SInner;

public class InitaiTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone phone=new Telphone();
		Telphone phone2=new Telphone(1.5f,1.4f,2.0f);
		Demo2_6 d=new Demo2_6();
		Inner inn=d.new Inner();
		inn.show();
		SInner si=new SInner();
		si.test();
		Fangneibu fa=new Fangneibu();
		fa.show();

	}

}
