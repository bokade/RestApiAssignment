package in.sp.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.beans.User;

public interface UserDao extends JpaRepository<User, Integer>
{

}
