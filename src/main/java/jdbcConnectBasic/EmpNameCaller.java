////package jdbcConnectBasic;
//
//import java.sql.*;
//
//public class EmpNameCaller {
//	
//
//	public static Empinfo callEmpOne() {
//		int empno = 7369; // Employee number to search for
//		String query = "SELECT ename FROM emp WHERE empno = ?";
//		Empinfo e1 = new Empinfo();
//
//		try (
//				// Get connection from DatabaseConnection class
//				Connection connection = DatabaseConnection.getConnection();
//				// Use PreparedStatement to prevent SQL injection
//				PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//			// Set parameter for the query
//			preparedStatement.setInt(1, empno);
//
//			// Execute query and process result
//			try (ResultSet resultSet = preparedStatement.executeQuery()) {
//				
//
//				e1.setEmpno(empno);
//				
//				
//				if (resultSet.next()) {
//					 e1.setEmpname(resultSet.getString("ename")) ;
//				
//					System.out.println("Employee Name: " + e1.getEmpname());
//				} else {
//					System.out.println("No employee found with empno " + e1.getEmpno());
//				}
//			}
//		} catch (SQLException e) {
//			System.err.println("Database error: " + e.getMessage());
//			e.printStackTrace();
//		}
//		return e1;
//
//	}
//
//}
