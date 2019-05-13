package by.itacademy.java.dserbunou.home.practice7.datalayer.xml;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IBrandDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand;
import by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table.BrandTable;

public class BrandXMLDaoImpl extends AbstractXMLDao<BrandTable> implements IBrandDao {

	private static final IBrandDao INSTANCE = new BrandXMLDaoImpl();

	public static IBrandDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Brand insert(Brand entity) {
		BrandTable table = read();

		Integer id = table.nextId();

		entity.setId(id);
		Date created = new Date();
		entity.setCreated(created);
		entity.setUpdated(created);
		table.getBrands().add(entity);

		write(table);

		return entity;
	}

	@Override
	public void update(Brand entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Integer id) {
		BrandTable table = read();

		Iterator<Brand> iterator = table.getBrands().iterator();

		while (iterator.hasNext()) {
			Brand brand = iterator.next();
			if (brand.getId().equals(id)) {
				iterator.remove();
			}
		}

		write(table);

	}

	@Override
	public List<Brand> getAll() {
		BrandTable table = read();
		return table.getBrands();
	}

	@Override
	String getFileName() {
		return "brands-table.xml";
	}

	@Override
	Class<BrandTable> getTableClass() {
		return BrandTable.class;
	}

	@Override
	public Brand get(Integer id) {
		throw new RuntimeException("not implemented");
	}

}
