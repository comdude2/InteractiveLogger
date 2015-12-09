package net.comdude2.plugins.interactivelogger.playback;

import org.bukkit.scoreboard.Objective;

import net.comdude2.plugins.interactivelogger.main.InteractiveLogger;
import net.comdude2.plugins.interactivelogger.recording.Recording;
import net.comdude2.plugins.interactivelogger.ui.ScoreboardUI;

public class RecordingPlayer {
	
	private InteractiveLogger il = null;
	private PlaybackArea area = null;
	private Recording recording = null;
	private ScoreboardUI scui = null;
	//scui sub vars
	private Objective main = null;
	//end
	private long currentTime = 0L;
	private int currentRecord = -1;
	
	public RecordingPlayer(PlaybackArea area, Recording recording){
		this.area = area;
		this.recording = recording;
		scui = new ScoreboardUI();
	}
	
	public void load(Recording recording){
		this.recording = recording;
	}
	
	public void play(){
		
	}
	
	public void pause(){
		
	}
	
	public void skipForward(Long milliseconds){
		
	}
	
	public void skipBackwards(Long milliseconds){
		
	}
	
	public void goToStart(){
		
	}
	
	//"Background" methods
	
	private void updateScoreboard(){
		
	}
	
}
