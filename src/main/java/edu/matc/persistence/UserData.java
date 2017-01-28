package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Access users in the user table.
 *
 * @author pwaite
 */
public class UserData {

    private final Logger logger = Logger.getLogger(this.getClass());

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT * FROM users";

        accessDatabase(users, sql, "<ALL>");
        return users;
    }

    public List<User> getOneUser(String lastName) {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT * FROM users WHERE last_name = ?";

        accessDatabase(users, sql, lastName);
        return users;
    }


    /**
     * This method is used in accessing Database
     * @param users is the output of this method
     * @param sql is what is used to query
     * @param lastName is the last name if supplied
     */
    private void accessDatabase(List<User> users, String sql, String lastName) {
        Database database = Database.getInstance();
        Connection connection = null;

        try {
            database.connect();
            connection = database.getConnection();
            PreparedStatement selectStatement = connection.prepareStatement
                    (sql);
            selectStatement = connection.prepareStatement(sql);

            if (!lastName.equals("<ALL>")) {
                selectStatement.setString(1, lastName);
            }

            ResultSet results = selectStatement.executeQuery();
            while (results.next()) {
                User employee = createUserFromResults(results);
                users.add(employee);
            }
            database.disconnect();
        } catch (SQLException e) {
            logger.error("SearchUser.accessDatabase()...SQL Exception: ", e);
        } catch (Exception e) {
            logger.error("SearchUser.accessDatabase()...Exception: ", e);
        }
    }


    private User createUserFromResults(ResultSet results) throws SQLException {
        User user = new User();
        user.setLastName(results.getString("last_name"));
        user.setFirstName(results.getString("first_name"));
        user.setUserid(results.getString("id"));
        user.setBirthDate(results.getDate("date_of_birth"));
        return user;
    }

}