package in.sp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.beans.Sport;

import in.sp.dao.SportDao;

@Service
public class SportServiceImpl implements SportService
{
	@Autowired
	SportDao sportDao;
	
	
	@Override
	public List<Sport> getAllSports() 
	{
		// TODO Auto-generated method stub
		List<Sport> list_spt = sportDao.findAll();
		return list_spt;
	}


	@Override
	public Sport addSport(Sport spt) {
		// TODO Auto-generated method stub
		Sport sport = sportDao.save(spt);
		return sport;
	}

}
