package forTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForTest extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Boolean connect = false;
		
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##temp", "temp");
			connect = true;
			conn.close();
		} catch(Exception e) {
			connect = false;
			e.printStackTrace();
		}
		PrintWriter printWriter = resp.getWriter();
		
		if (connect) {
			printWriter.println("Connected");
		} else {
			printWriter.println("Disconnected");
		}
	}
	
	public String getString() {
		return "A";
	}

}
