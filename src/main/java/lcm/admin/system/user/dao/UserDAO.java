package lcm.admin.system.user.dao;

import org.springframework.stereotype.Repository;

import lcm.admin.common.persistence.HibernateDao;
import lcm.admin.system.user.domain.User;

/**
 * 用户 数据访问组件
 * @author cm
 *
 */
@Repository
public class UserDAO extends HibernateDao<User, Integer> {

}
