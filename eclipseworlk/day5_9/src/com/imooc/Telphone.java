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
		System.out.println("�޲εĹ��췽��ִ���ˣ�");
	}
	public Telphone(float newScreen,float newCpu,float newMem) {
		if(newScreen<3.5f) {
			System.out.println("������������⣬�Զ���ֵ3.5��");
			screen=3.5f;
		}else {
			screen=newScreen;
		}
		cpu=newCpu;
		mem=newMem;
		System.out.println("�вεĹ��췽��ִ����");
	}

}
