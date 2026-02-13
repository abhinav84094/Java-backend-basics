package db;
import java.sql.*;

public class dbConnection {
    public static void main(String[] args) throws SQLException {

        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbName",
                    "MySQL username",
                    "password"
            );

            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO students VALUES (1, 'Abhinav')");

            ResultSet result = statement.executeQuery("SELECT * FROM students");

            while(result.next()){
                System.out.println(result.getInt("id")+" "+ result.getString("name"));
            }

            connection.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
