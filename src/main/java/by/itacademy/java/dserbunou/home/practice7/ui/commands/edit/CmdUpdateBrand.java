package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IBrandDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "edit", description = "редакатировать бренд")
public class CmdUpdateBrand extends AbstractCmd {

    private IBrandDao dao = BrandDBDaoImpl.getInstance();

    @Override
    public AbstractCmd execute() {

        System.out.println("введите id для редактирования бренда");
        Integer id = Integer.parseInt(readInput());

        Brand brand = dao.get(id);
        System.out.println(brand);

        System.out.println("введите новое имя");
        String newName = readInput();
        brand.setName(newName);
        dao.update(brand);

        System.out.println(" бренд обновлен:" + dao.get(id));
        return new CmdEditBrand();
    }
}
