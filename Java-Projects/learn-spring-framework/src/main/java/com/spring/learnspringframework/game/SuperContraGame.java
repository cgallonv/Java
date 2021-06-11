package com.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("shoot");
	}
	
	public void down() {
		System.out.println("crouch");
	}
	
	public void left() {
		System.out.println("jump");
	}
	
	public void right() {
		System.out.println("hide");
	}
}
