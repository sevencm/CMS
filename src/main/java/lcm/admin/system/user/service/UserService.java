package lcm.admin.system.user.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lcm.admin.common.persistence.HibernateDao;
import lcm.admin.common.service.BaseService;
import lcm.admin.common.utils.security.Digests;
import lcm.admin.common.utils.security.Encodes;
import lcm.admin.system.user.dao.UserDAO;
import lcm.admin.system.user.domain.User;

@Service
public class UserService extends BaseService<User, Integer> {
	
	/**加密方法*/
	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;	//盐长度

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public HibernateDao<User, Integer> getEntityDao() {
		return userDAO;
	}

	/**
	 * 按登录名查询用户
	 * @param loginName
	 * @return 用户对象
	 */
	public User getUser(String loginName) {
		return userDAO.findUniqueBy("loginName", loginName);
	}
	
	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 */
	private void entryptPassword(User user) {
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		user.setSalt(Encodes.encodeHex(salt));

		byte[] hashPassword = Digests.sha1(user.getPlainPassword().getBytes(),salt, HASH_INTERATIONS);
		user.setPassword(Encodes.encodeHex(hashPassword));
	}
	
}
