import java.sql.*;

public class Q1Connection {
    public Q1Connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:330/companydb";
            String user = "root";
            String password ="";

            Connection conn = DriverManager.getConnection(url, user, password);
            
            if(conn!=null){
                System.out.println("Connected");
            }
            else{
                System.out.println("Error to connect database");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    public static void main(String[] args) throws Exception {
        new Q1Connection();
    }
}
