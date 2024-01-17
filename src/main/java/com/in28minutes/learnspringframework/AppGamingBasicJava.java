package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackMan;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//		GamingConsole game = new MarioGame();
//		GamingConsole game= new SuperContraGame();
		GamingConsole game = new PackMan();
//		GameRunner gameRunner = new GameRunner(marioGame);
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
