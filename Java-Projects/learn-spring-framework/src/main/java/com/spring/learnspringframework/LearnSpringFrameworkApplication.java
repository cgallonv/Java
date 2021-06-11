package com.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
//@ComponentScan("com.spring.learnspringframework") @SpringBootApplication runs by default an scan on this package.
//check @SpringBootApplication class
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		// create MarioGame and GameRunner
		GameRunner runner = context.getBean(GameRunner.class);
		// MarioGame game = context.getBean(MarioGame.class);
		// GamingConsole game = new MarioGame();
		// GameRunner runner = new GameRunner(game);
		runner.runGame();

		/*
		 * Spring realize dependency injection or IOC - Inversion of control: Spring is
		 * Responsible of creating all Spring beans (objects) like MarioGame or GameRunner
		 * IoC Container: manages lifecycle of beans and dependencies -> implements dependency injection logic.
		 * 	Types of IoC Container: ApplicationContext***(most used) and BeanFactory
		 * IoC containers do the autowiring
		 */
	}

}
