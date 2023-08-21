package in.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.beans.Team;
import in.sp.dao.TeamDao;


@Service
public class TeamServiceImpl implements TeamService
{
	@Autowired
	TeamDao teamDao;

	@Override
	public Team addTeam(Team tm, int id) {
		// TODO Auto-generated method stub
		Team team = teamDao.save(tm,id);
		return team;
	}

	@Override
	public List<Team> getTeams(String sportName) {
		// TODO Auto-generated method stub
		List<Team> list_tm = teamDao.findAll(sportName);
		return list_tm;
	}

	@Override
	public List<Team> getTeamsByCity(String city) {
		// TODO Auto-generated method stub
		List<Team> list_tmc = teamDao.findAll(city);
		return list_tmc;
	}

}
