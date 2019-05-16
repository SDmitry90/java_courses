package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IModelDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "delete", description = "удалить модель")
public class CmdDeleteModel extends AbstractCmd {
	private IModelDao dao1 = ModelDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("введите id для удаления модели авто");
		Integer id = Integer.parseInt(readInput());

		dao1.delete(id);

		System.out.println("модель удалена");
		return new CmdEditModel();
	}
}
