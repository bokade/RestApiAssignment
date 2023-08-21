package in.sp.beans;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User
{
	@Id
	private int id;
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	private Sport sports;
	private String users;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="team_id",referencedColumnName="id")
	private Team team;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Sport getSports() {
		return sports;
	}
	public void setSports(Sport sports) {
		this.sports = sports;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	
	
	
}
