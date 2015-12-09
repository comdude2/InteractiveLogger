package net.comdude2.plugins.interactivelogger.ui;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreboardUI {
	
	private Scoreboard board = null;
	
	public ScoreboardUI(){
		createNewBoard();
	}
	
	public Scoreboard getScoreboard(){
		return this.board;
	}
	
	public void createNewBoard(){
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		board = manager.getNewScoreboard();
	}
	
	public Objective createNewObjective(String name){
		Objective o = board.registerNewObjective(name, "dummy");
		o.setDisplayName(name);
		return o;
	}
	
	public void updateScore(Objective o, String name, int value){
		Score s = o.getScore(name);
		s.setScore(value);
	}
	
}
