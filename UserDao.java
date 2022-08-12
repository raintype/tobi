
package user;
//import user.User;

public class UserDao {
    public void add(User user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql,jdbc,Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");

        PreparedStatement ps = cs.prepareStatement(
            "insert into users(id, name, password) values(?,?,?)"
        );
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());
        
        ps.executeUpdate();

        ps.close();
        c.close();
    }

    // public User get(String id) throws ClassNotFoundException, SQLException {
    //     Class.forName("com.mysql,jdbc,Driver");
    //     Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");

    //     PrepatedStatement ps = c.prepareStatement(
    //         "select * from users where id = ?"
    //     );
    //     ps.setString(1, id);

    //     ResultSet rs = ps.executeQuery();
    //     rs.next();
    //     User user = new User();
    //     user.setId(rs.getString("id"));
    //     user.setName(rs.getString("name"));
    //     user.setPassword(rs.getString("password"));

    //     rs.close();
    //     ps.close();
    //     c.close();

    //     return user;
    // }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new UserDao();

        user user = new User();
        user.setId("whiteship");
        user.setName("???");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " ?? ??");

        // User user2 = dao.get(user.getId());
        // System.outpringln(user2.getName());

        // System.out.println(user2.getPassword());

        // System.out.pringln(user2.getId() + " ?? ??");

    }
}