package com.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	private GamingConsole game;

	
	public GameRunner(GamingConsole game) {
		System.out.println("using constructor");
		this.game = game;
	}
	
//	public void setGame(GamingConsole game) {
//		System.out.println("using setter");
//		this.game = game;
//	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
