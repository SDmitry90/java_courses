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

import by.itacademy.java.dserbunou.home.practice7.datalayer.IModelDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;

public class ModelDBDaoImpl extends AbstractDBDao implements IModelDao {
	private static final IModelDao INSTANCE = new ModelDBDaoImpl();

	public static IModelDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Model insert(Model entity) {
		try (Connection conn = createConnection();
				PreparedStatement stmt = conn.prepareStatement("insert into model (name) values (?)",
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
	public void update(Model entity) {
		try (Connection conn = createConnection();
				PreparedStatement stmt = conn.prepareStatement("update model set name=?, updated=? where id=?");) {
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

			int rowsAffected = stmt.executeUpdate(String.format("delete from model where id=%s", id));

			if (rowsAffected != 1)
				throw new IllegalArgumentException("unexpected deleted rows count:" + rowsAffected);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Model> getAll() {

		try (Connection conn = createConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("select * from model");) {

			List<Model> list = new ArrayList<>();

			while (rs.next()) {
				Model model = new Model();

				model.setId(rs.getInt("id"));
				model.setName(rs.getString("name"));
				model.setCreated(rs.getDate("created"));
				model.setUpdated(rs.getDate("updated"));
				list.add(model);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Model get(Integer id) {
		try (Connection conn = createConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(String.format("select * from model where id=%s", id));) {

			while (rs.next()) {
				Model model = new Model();

				model.setId(rs.getInt("id"));
				model.setName(rs.getString("name"));
				model.setCreated(rs.getDate("created"));
				model.setUpdated(rs.getDate("updated"));
				return model;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return null;
	}

	@Override
	public Model getBrandId(Integer brand_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}