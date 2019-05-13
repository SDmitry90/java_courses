package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IModelDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "list", description = "вывести список")
public class CmdListModel extends AbstractCmd {

	private IModelDao dao = ModelDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		List<Model> newEntity = dao.getAll();

		for (Model brand : newEntity) {
			System.out.println(brand);
		}
		return new CmdEditBrand();
	}
}