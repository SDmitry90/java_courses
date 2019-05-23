package by.itacademy.java.dserbunou.home.practice7.datalayer.xml;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IModelDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;
import by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table.ModelTable;

public class ModelXMLDaoImpl extends AbstractXMLDao<ModelTable> implements IModelDao {

	@Override
	public Model get(Integer id) {
		throw new RuntimeException("not implemented");
	}

	@Override
	public Model getBrandId(Integer brand_id) {
		throw new RuntimeException("not implemented");
	}

	@Override
	public Model insert(Model entity) {
		ModelTable table = read();

		Integer id = table.nextId();

		entity.setId(id);
		Date created = new Date();
		entity.setCreated(created);
		entity.setUpdated(created);
		table.getModels().add(entity);

		write(table);

		return entity;
	}

	@Override
	public void update(Model entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		ModelTable table = read();

		Iterator<Model> iterator = table.getModels().iterator();

		while (iterator.hasNext()) {
			Model model = iterator.next();
			if (model.getId().equals(id)) {
				iterator.remove();
			}
		}

		write(table);

	}

	@Override
	public List<Model> getAll() {
		ModelTable table = read();
		return table.getModels();
	}

	@Override
	String getFileName() {
		return "models-table.xml";
	}

	@Override
	Class<ModelTable> getTableClass() {
		return ModelTable.class;
	}

}
