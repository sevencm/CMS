package lcm.admin.system.menu.dao;

import org.springframework.stereotype.Repository;

import lcm.admin.common.persistence.HibernateDao;
import lcm.admin.system.menu.domain.Menu;

@Repository
public class MenuDAO extends HibernateDao<Menu, Integer> {

}
