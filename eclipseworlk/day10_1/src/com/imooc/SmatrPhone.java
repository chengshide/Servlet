package com.imooc;

public class SmatrPhone extends Telphone implements IPlayGame {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过语音打电话");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过语音发短信");

	}

	@Override
	public void platGame() {
		// TODO Auto-generated method stub
		System.out.println("具有了玩游戏的功能");
		
	}

}
