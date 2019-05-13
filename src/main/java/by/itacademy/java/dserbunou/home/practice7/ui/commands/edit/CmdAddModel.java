package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IModelDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.ModelDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "add", description = "добавить модель")
public class CmdAddModel extends AbstractCmd {
	private IModelDao dao = ModelDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("введите имя нового бренда");
		String newBrandName = readInput();

		Model brand = new Model();
		brand.setName(newBrandName);

		Model newEntity = dao.insert(brand);

		System.out.println("Новый бренд сохранен:" + newEntity);
		return new CmdEditBrand();
	}
}
