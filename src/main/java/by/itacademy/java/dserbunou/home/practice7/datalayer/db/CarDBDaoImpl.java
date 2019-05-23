package by.itacademy.java.dserbunou.home.practice7.datalayer.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.ICarDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;

public class CarDBDaoImpl extends AbstractDBDao implements ICarDao {

	private static final ICarDao INSTANCE = new CarDBDaoImpl();

	public static ICarDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Car get(Integer id) {
		try (Connection conn = createConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(String.format("select * from car where id=%s", id));) {

			while (rs.next()) {
				Car car = new Car();

				car.setId(rs.getInt("id"));
				car.setName(rs.getString("name"));
				car.setCreated(rs.getDate("created"));
				car.setUpdated(rs.getDate("updated"));
				return car;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return null;
	}

	@Override
	public Car get1(String vin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car get2(Integer model_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car insert(Car entity) {
		try (Connection conn = createConnection();
				PreparedStatement stmt = conn.prepareStatement("insert into car (name) values (?)",
						Statement.RETURN_GENERATED_KEYS);)

		{
			stmt.setString(1, entity.getName());
			stmt.executeUpdate();

			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				// Retrieve the auto generated key(s).
				int generatedId = rs.getInt(1);
				entity.setId(generatedId);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return entity;
	}

	@Override
	public void update(Car entity) {
		try (Connection conn = createConnection();
				PreparedStatement stmt = conn.prepareStatement("update car set name=?, updated=? where id=?");) {
			stmt.setString(1, entity.getName());
			stmt.setObject(2, new Date(), Types.TIMESTAMP);
			stmt.setInt(3, entity.getId());

			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void delete(Integer id) {
		try (Connection conn = createConnection(); Statement stmt = conn.createStatement();) {

			int rowsAffected = stmt.executeUpdate(String.format("delete from car where id=%s", id));

			if (rowsAffected != 1)
				throw new IllegalArgumentException("unexpected deleted rows count:" + rowsAffected);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public List<Car> getAll() {
		try (Connection conn = createConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("select * from car");) {

			List<Car> list = new ArrayList<>();

			while (rs.next()) {
				Car car = new Car();

				car.setId(rs.getInt("id"));
				car.setName(rs.getString("name"));
				car.setCreated(rs.getDate("created"));
				car.setUpdated(rs.getDate("updated"));
				list.add(car);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
