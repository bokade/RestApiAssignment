package in.sp.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.beans.Sport;

public interface SportDao extends JpaRepository<Sport, Integer>
{

}
