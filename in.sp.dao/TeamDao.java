package in.sp.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.beans.Team;

public interface TeamDao extends JpaRepository<Team, Integer>
{

}
