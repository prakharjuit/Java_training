package jdbcdemo;
import java.sql.*;
import java.util.Scanner;
public class UserinputJDBC {
public static void main(String[] args)
{
    String url = "jdbc:mysql://127.0.0.1:3306/Employee";  
    String user = "root";
    String password = "Prakhar123@";
    Scanner sc=new Scanner(System.in);
    try
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection(url,user,password);
    	Statement smt=con.createStatement();
        String createTable = "CREATE TABLE IF NOT EXISTS patientss (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(100), " +
                "age INT, " +
                "disease VARCHAR(100), " +
                "admission_date DATE, " +
                "doctor_assigned VARCHAR(100))";
        smt.executeUpdate(createTable);
        String insertSQL = "INSERT INTO patientss (name, age, disease) " +
                "VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertSQL);

//        System.out.println("How many patients do you want to enter");
//        int count=sc.nextInt();
//        sc.nextLine();
//        for(int i=1;i<=count;i++)
//        {
//        	System.out.println("\nEnter details for Patient " + i + ":");
//
//            System.out.print("Name: ");
//            String name = sc.nextLine();
//
//            System.out.print("Age: ");
//            int age = Integer.parseInt(sc.nextLine());
//
//            System.out.print("Disease: ");
//            String disease = sc.nextLine();
//            pstmt.setString(1, name);
//            pstmt.setInt(2, age);
//            pstmt.setString(3, disease);
//            int rowinserted=pstmt.executeUpdate();
//            if(rowinserted>0)
//            {
//            	System.out.println("patient inserted");
//            }
//       }
        
        //pstmt.close();
        System.out.println("\nAll Patients in Database:");
        ResultSet rs = smt.executeQuery("SELECT * FROM patientss");
        System.out.println("object"+rs);
        while (rs.next()) {
            int id = rs.getInt("id");
            String pname = rs.getString("name");
            int page = rs.getInt("age");
            String pdisease = rs.getString("disease");
            

            System.out.println(id + ":" + pname + " " + page + " " + pdisease );
        }
        System.out.print("Do you want to delete any patient? (1 for yes/0 for no): ");
        int choice = sc.nextInt();
        sc.nextLine();
        
        if(choice==1) {
        System.out.print("Enter Patient Name to delete: ");
        String nameToDelete = sc.nextLine();

        String deleteSQL = "DELETE FROM patientss WHERE name = ?";
        pstmt = con.prepareStatement(deleteSQL);
        pstmt.setString(1, nameToDelete);

        int rows = pstmt.executeUpdate();
        pstmt.close();
        System.out.println(rows > 0 ? "Patient(s) deleted successfully." : "⚠️ No patient found with that name.");
        }
        System.out.println("\nAll Patients in Database:");
        ResultSet rs1 = smt.executeQuery("SELECT * FROM patientss");
        System.out.println("object"+rs1);
        while (rs1.next()) {
            int id = rs1.getInt("id");
            String pname = rs1.getString("name");
            int page = rs1.getInt("age");
            String pdisease = rs1.getString("disease");
            

            System.out.println(id + ":" + pname + " " + page + " " + pdisease );
        }
        smt.close();
        pstmt.close();
        con.close();
        sc.close();
    }
    catch(Exception e)
    {
    	System.out.println("Error");
    	e.printStackTrace();
    }
}
}
