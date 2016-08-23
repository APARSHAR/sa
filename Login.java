import java.sql.*;  
  
public class Login {  
public static boolean validate(String email,String pass){  
boolean status=false;  

try {
   Driver myDriver = new oracle.jdbc.driver.OracleDriver();
   DriverManager.registerDriver( myDriver );
}
catch(ClassNotFoundException ex) {
   System.out.println("Error: unable to load driver class!");
   System.exit(1);
}

import java.util.*;

String URL = "jdbc:oracle:thin:@localhost:80:loginpage";
Properties info = new Properties( );
info.put( "email", "e-mail" );
info.put( "password", "password" );

Connection conn = DriverManager.getConnection(URL, info);
      
PreparedStatement ps=con.prepareStatement(  
"select * from login  where name=? and pass=?");  
ps.setString(1,email);  
ps.setString(2,password);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  
