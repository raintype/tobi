package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;


public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);


        User user = new User();
        user.setId("raintype01");
        user.setName("raintype");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " ?? ??");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());

        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " ?? ??");

    }
}
