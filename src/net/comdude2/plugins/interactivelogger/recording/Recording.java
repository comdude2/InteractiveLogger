package net.comdude2.plugins.interactivelogger.recording;

import java.io.Serializable;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Recording implements Serializable{

	private static final long serialVersionUID = -1160579031273336162L;
	private int type = -1;
	private ConcurrentLinkedQueue <Record> records = new ConcurrentLinkedQueue <Record>();
	
	public Recording(int type){
		this.type = type;
	}
	
	public int getRecordingType(){
		return this.type;
	}
	
	public ConcurrentLinkedQueue <Record> getRecords(){
		return this.records;
	}
	
}
