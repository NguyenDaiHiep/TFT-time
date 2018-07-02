package ndhiep.sbsecurityhibernate.dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ndhiep.sbsecurityhibernate.entities.User;
@Repository(value = "userDao")
@Transactional(rollbackFor = Exception.class)
public class UserDao {
  @Autowired
  private SessionFactory sessionFactory;
  public User loadUserByUsername(final String username) {
    List<User> users = new ArrayList<User>();
    Session session = this.sessionFactory.getCurrentSession();
    users = session.createQuery("from User where username=?", User.class).setParameter(0, username).list();
    if (users.size() > 0) {
      return users.get(0);
    } else {
      return null;
    }
  }
}