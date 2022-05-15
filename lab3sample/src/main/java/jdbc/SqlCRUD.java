package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import items.Gamepad;
import servlets.LabCRUDInterface;

public class SqlCRUD implements LabCRUDInterface<Gamepad> {

	
	Connection connection;
	
	
	public SqlCRUD() {
		
		this.connection = new Connect().getCon();
		System.out.println(connection);
		
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Gamepad t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection.prepareStatement("INSERT INTO items (name,price,description,link) " + "VALUES (?,?,?,?)")) {
			st.setString(1, t.getName());
			st.setInt(2, t.getPrice());
			st.setString(3, t.getDescription());
			st.setString(4, t.getLink());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Override
	public List<Gamepad> read() {
		// TODO Auto-generated method stub
		List<Gamepad> list = new ArrayList<>();

		try (Statement st = connection.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM items;");) {
			while (rs.next()) {
				list.add(new Gamepad(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void update(int id, Gamepad t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
				.prepareStatement("UPDATE items " + "SET \"name\"=?, \"price\"=?, \"description\"=?, \"link\"=? WHERE id=?;")) {
			st.setString(1, t.getName());
			st.setInt(2, t.getPrice());
			st.setString(3, t.getDescription());
			st.setString(4, t.getLink());
			st.setInt(5, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
				.prepareStatement("DELETE FROM items WHERE id=?;")) {
			st.setInt(1, id);			
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
