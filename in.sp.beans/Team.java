package in.sp.beans;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Team
{
	@Id
	private int id;
	private String teamName;
	private String city;
	private int noOfPlayingPlayers;
	private int sportsId;
	
	@OneToOne(mappedBy="team")
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNoOfPlayingPlayers() {
		return noOfPlayingPlayers;
	}
	public void setNoOfPlayingPlayers(int noOfPlayingPlayers) {
		this.noOfPlayingPlayers = noOfPlayingPlayers;
	}
	public int getSportsId() {
		return sportsId;
	}
	public void setSportsId(int sportsId) {
		this.sportsId = sportsId;
	}
}
