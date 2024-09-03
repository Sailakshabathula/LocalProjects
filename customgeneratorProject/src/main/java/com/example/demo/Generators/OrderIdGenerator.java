package com.example.demo.Generators;

//import java.beans.Statement;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.sql.ast.tree.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Employee;
import com.example.demo.Repo.userRepo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
//import org.hibernate.SharedSessionContractImplementor;

//import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;




@Component
public class OrderIdGenerator  implements IdentifierGenerator{
	
	
	
	

	/*@Override
	public Object generate(SharedSessionContractImplementor session, Object object){
	    String prefix = "cli";
	    
	  JdbcConnectionAccess con = session.getJdbcConnectionAccess();
	                    try {
	                    	System.out.println("started");
	                JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
	                Connection connection = jdbcConnectionAccess.obtainConnection();
	                Statement statement = (Statement) connection.createStatement();
	                String query = "select count(client_id)  from employee";
	                ResultSet resultSet = ((java.sql.Statement) statement).executeQuery(query);
	                System.out.println(resultSet);
	                if (resultSet.next()) {
	                     int id=resultSet.getInt(1)+101;
	                     
						String generatedId = prefix + Integer.valueOf(id).toString();
	                     return generatedId;
	                }
	                resultSet.close();
	                ((Connection) statement).close();
	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	                
	                
	            }
	    
	   // List<Employee> findAll = repo.findAll();
	   
	return prefix+1;
	}

*/
	
	@SuppressWarnings("deprecation")
	public Object generate(SharedSessionContractImplementor session, Object object) {
	    String prefix = "cli";

	    try {
	        // Get the Hibernate session
	        Session hibernateSession = (Session) session;

	        // Use Hibernate Query to count the number of client records
	        Long count = (Long) hibernateSession.createQuery("select count(*) from Employee").uniqueResult();

	        if (count != null) {
	            // Add 101 to the count and create a unique identifier
	            int id = count.intValue() + 101;
	            String generatedId = prefix + id;
	            return generatedId;
	        }
	    } catch (HibernateException e) {
	        // Handle Hibernate exceptions, such as logging or printing the stack trace
	        e.printStackTrace();
	    }

	    // If there was an exception or no result, return null
	    return null;
	}


}
	


