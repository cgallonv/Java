package com.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PackManGame implements GamingConsole {

	public void up() {
		System.out.println("Packman up");
	}
	
	public void down() {
		System.out.println("Down");
	}
	
	public void left() {
		System.out.println("jump");
	}
	
	public void right() {
		System.out.println("hide");
	}
}
