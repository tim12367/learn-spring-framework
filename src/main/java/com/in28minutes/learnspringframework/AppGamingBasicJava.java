package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		MarioGame marioGame = new MarioGame();
		GameRunner gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}
}
