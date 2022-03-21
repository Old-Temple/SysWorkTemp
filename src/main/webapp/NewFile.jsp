<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	Connection conn = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Boolean connect = true;
	
	try{
		Class.forName(driver);
		conn = DriverManager.getConnection(url, "c##temp", "temp");
		connect = true;
		conn.close();
	} catch(Exception e) {
		connect = false;
		e.printStackTrace();
	}
%>
<%
	if(connect == true){%>
	연결됨
<%
	}else{ %>
	연결실패
<%
	} %>