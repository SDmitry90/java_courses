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

import by.itacademy.java.dserbunou.home.practice7.datalayer.IBrandDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand;

public class BrandDBDaoImpl extends AbstractDBDao implements IBrandDao {

	private static final IBrandDao INSTANCE = new BrandDBDaoImpl();

	public static IBrandDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Brand insert(Brand entity) {
		try (Connection conn = createConnection();
				PreparedStatement stmt = conn.prepareStatement("insert into brand (name) values (?)",
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
	public void update(Brand entity) {
		try (Connection conn = createConnection();
				PreparedStatement stmt = conn.prepareStatement("update brand set name=?, updated=? where id=?");) {
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

			int rowsAffected = stmt.executeUpdate(String.format("delete from brand where id=%s", id));

			if (rowsAffected != 1)
				throw new IllegalArgumentException("unexpected deleted rows count:" + rowsAffected);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Brand> getAll() {

		try (Connection conn = createConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("select * from brand");) {

			List<Brand> list = new ArrayList<>();

			while (rs.next()) {
				Brand brand = new Brand();

				brand.setId(rs.getInt("id"));
				brand.setName(rs.getString("name"));
				brand.setCreated(rs.getDate("created"));
				brand.setUpdated(rs.getDate("updated"));
				list.add(brand);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Brand get(Integer id) {
		try (Connection conn = createConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(String.format("select * from brand where id=%s", id));) {

			while (rs.next()) {
				Brand brand = new Brand();

				brand.setId(rs.getInt("id"));
				brand.setName(rs.getString("name"));
				brand.setCreated(rs.getDate("created"));
				brand.setUpdated(rs.getDate("updated"));
				return brand;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return null;
	}
}
