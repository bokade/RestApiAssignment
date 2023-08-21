package in.sp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import in.sp.beans.User;
import in.sp.dao.UserDao;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	UserDao userDao;
	
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> list_usr = userDao.findAll();
		return list_usr;
	}

}
