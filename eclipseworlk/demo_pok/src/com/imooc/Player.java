package com.imooc;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private int id;
	private String name;
	public List<Poker> playerPoke;
	
	public Player(int id,String name) {
		this.id=id;
		this.name=name;
		playerPoke=new ArrayList<Poker>();
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
	

}
