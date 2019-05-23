package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.ICarDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "delete", description = "удалить авто")
public class CmdDeleteCar extends AbstractCmd {
	private ICarDao dao = CarDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("введите id для удаления авто");
		Integer id = Integer.parseInt(readInput());

		dao.delete(id);

		System.out.println("авто удален");
		return new CmdEditCar();
	}

}
