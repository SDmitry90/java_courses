package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IBrandDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "delete", description = "удалить бренд")
public class CmdDeleteBrand extends AbstractCmd {
    private IBrandDao dao = BrandDBDaoImpl.getInstance();

    @Override
    public AbstractCmd execute() {

        System.out.println("введите id для удаления нового бренда");
        Integer id = Integer.parseInt(readInput());

        dao.delete(id);

        System.out.println("бренд удален");
        return new CmdEditBrand();
    }
}
