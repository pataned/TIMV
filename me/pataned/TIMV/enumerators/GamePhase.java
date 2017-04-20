package me.pataned.TIMV.enumerators;

public enum GamePhase {
	
	CEKANI(true), HLEDANI_CHEST(false), ENDERCHEST_TIME(false), HRA(false), RESET(false); 
	
	public static GamePhase currentPhase;
	private boolean canJoin;
	
	GamePhase(boolean canJoinn){
		this.canJoin = canJoinn;
	}
	
	public boolean canJoin(){
		return canJoin;
	}
	
	public static GamePhase getPhase(){
		return currentPhase;
		
	}
	
	public static void setPhase(GamePhase ph){
		currentPhase = ph;
	}
	
}
