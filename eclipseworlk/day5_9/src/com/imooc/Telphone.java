package com.imooc;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;
	public float getScreen() {
		return screen;
	}
	public void setScreen(float newScreen) {
		screen=newScreen;
	}
	
	public float getCpu() {
		return cpu;
	}
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public float getMem() {
		return mem;
	}
	public void setMem(float mem) {
		this.mem = mem;
	}
	public Telphone() {
		System.out.println("无参的构造方法执行了！");
	}
	public Telphone(float newScreen,float newCpu,float newMem) {
		if(newScreen<3.5f) {
			System.out.println("您输入的有问题，自动赋值3.5！");
			screen=3.5f;
		}else {
			screen=newScreen;
		}
		cpu=newCpu;
		mem=newMem;
		System.out.println("有参的构造方法执行了");
	}

}
