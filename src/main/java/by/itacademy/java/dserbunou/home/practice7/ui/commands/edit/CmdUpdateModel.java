package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IModelDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "edit", description = "редакатировать модель")
public class CmdUpdateModel extends AbstractCmd {
	private IModelDao dao1 = ModelDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("введите id для редактирования модели");
		Integer id = Integer.parseInt(readInput());

		Model model = dao1.get(id);
		System.out.println(model);

		System.out.println("введите новое название");
		String newName = readInput();
		model.setName(newName);
		dao1.update(model);

		System.out.println(" модель обновлена:" + dao1.get(id));
		return new CmdEditModel();
	}

}
