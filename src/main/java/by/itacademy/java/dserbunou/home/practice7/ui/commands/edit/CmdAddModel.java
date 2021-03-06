package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IModelDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "add", description = "добавить модель")
public class CmdAddModel extends AbstractCmd {
	private IModelDao dao1 = ModelDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("введите название модели");
		String newModelName = readInput();

		Model model = new Model();
		model.setName(newModelName);

		Model newEntity = dao1.insert(model);

		System.out.println("Название новой модели сохранено:" + newEntity);
		return new CmdEditModel();
	}
}
