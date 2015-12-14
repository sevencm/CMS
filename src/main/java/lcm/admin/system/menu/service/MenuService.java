package lcm.admin.system.menu.service;

import org.springframework.beans.factory.annotation.Autowired;

import lcm.admin.common.persistence.HibernateDao;
import lcm.admin.common.service.BaseService;
import lcm.admin.system.menu.dao.MenuDAO;
import lcm.admin.system.menu.domain.Menu;

public class MenuService extends BaseService<Menu, Integer> {
	
	@Autowired
	private MenuDAO menuDAO;
	
	@Override
	public HibernateDao<Menu, Integer> getEntityDao() {
		return menuDAO;
	}
	
	
}
