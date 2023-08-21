package in.sp.service;

import java.util.List;
import in.sp.beans.Team;

public interface TeamService
{
	public Team addTeam(Team tm,int id);
	public List<Team> getTeams(String sportName);
	public List<Team> getTeamsByCity(String city);
	
	
}
