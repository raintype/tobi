package user;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        UserDao dao = new DaoFactory().userDao();


        User user = new User();
        user.setId("whiteship8");
        user.setName("연웅");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " ?? ??");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());

        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " ?? ??");

    }
}
