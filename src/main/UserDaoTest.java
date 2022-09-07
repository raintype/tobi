import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;


public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);



        User user = new User();
        user.setId("ID01");
        user.setName("raintype");
        user.setPassword("married");

        dao.add(user);

        System.out.println("ID : " + user.getId());

        User user2 = dao.get(user.getId());
        System.out.println("Name : " + user2.getName());

        System.out.println("Password : " + user2.getPassword());

        System.out.println("ID : " + user2.getId());


    }
}
