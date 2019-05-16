package by.itacademy.java.dserbunou.home.practice7.datalayer.xml;

import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IModelDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;
import by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table.ModelTable;

public class ModelXMLDaoImpl extends AbstractXMLDao<ModelTable> implements IModelDao {

    @Override
    public Model get(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

  /*  @Override
    public Model getBrand(Integer brand_id) {
        // TODO Auto-generated method stub
        return null;
    }*/

    @Override
    public Model insert(Model entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Model entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Model> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    String getFileName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    Class<ModelTable> getTableClass() {
        // TODO Auto-generated method stub
        return null;
    }

}
