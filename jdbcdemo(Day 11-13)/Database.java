package jdbcdemo;

import java.sql.*;

public class Database {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/Employee"; 
        String user = "root";
        String password = "Prakhar123@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Try connecting
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
            Statement state= con.createStatement();
            String sql = "UPDATE patient SET name=? WHERE name=?";
            
            PreparedStatement pstmt=con.prepareStatement(sql);
//            pstmt.setString(1, "Prakhar Singh Chauhan"); 
//            pstmt.setString(2, "Prakhar"); 
//            pstmt.executeUpdate();
            String[][] names = {
            	    {"ABC", "ABC2"},
            	    {"Prakhar Singh Chauhan", "Prakhar"}
            	};
            for(String[] row: names)
            {
                pstmt.setString(1, row[1]); 
                pstmt.setString(2, row[0]); 
                int rows= pstmt.executeUpdate();
                if(rows>0)
                {
                	System.out.println("Record Updated");
                }
                else
                {
                	System.out.println("No record found");
                }

            }
            System.out.println("All patients updated");
            


            // Close connection after use
            con.close();
        }  catch (Exception e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }
}
