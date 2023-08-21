package in.sp.beans;
import jakarta.persistence.Entity;



import jakarta.persistence.Id;

@Entity
public class Sport 
{
	@Id
	private int id;
	private String name;
	private boolean isTeamGame;
	private int minPlayer;
	private int maxPlayer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTeamGame() {
		return isTeamGame;
	}
	public void setTeamGame(boolean isTeamGame) {
		this.isTeamGame = isTeamGame;
	}
	public int getMinPlayer() {
		return minPlayer;
	}
	public void setMinPlayer(int minPlayer) {
		this.minPlayer = minPlayer;
	}
	public int getMaxPlayer() {
		return maxPlayer;
	}
	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}
}
