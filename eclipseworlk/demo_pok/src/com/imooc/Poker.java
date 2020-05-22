package com.imooc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker {
	
	private int id;
	private String name;
	public static List<Poker> polerList;
	
	public Poker() {}
	public Poker(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[" + id + "," + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poker other = (Poker) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/**
	 * 生成扑克牌
	 */
	public void stePok() {
		polerList=new ArrayList<Poker>();
		int n=1;
		for(int i=0;i<13;i++) {
			for(int j=0;j<4;j++) {
				n++;
				switch(j) {
				case 0:
					polerList.add( new Poker(i,"方块"));
					break;
				case 1:
					polerList.add( new Poker(i,"梅花"));
					break;
				case 2:
					polerList.add( new Poker(i,"红桃"));
					break;
				case 3:
					polerList.add( new Poker(i,"黑桃"));
					break;
				}
			}
		}
	}
	
	/**
	 * 比较大小
	 */
	public int comparePoker(Poker po1,Poker po2) {
		int index1=polerList.indexOf(po1);
		int index2=polerList.indexOf(po2);
		if(index1<0 || index2<0) {
			return 0;
		}else if(index1>index2){
			return 1;
		}else if(index1==index2) {
			return 3;
		}
		return 2;
	}
	
	/**
	 * 随机发牌
	 */
	public Poker rSetPok() {
		Poker po=new Poker();
		Random re=new Random();
		po=polerList.get(re.nextInt(52));
		return po;
	}

}
