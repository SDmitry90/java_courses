package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.ICarDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "edit", description = "редакатировать car")
public class CmdUpdateCar extends AbstractCmd {

	private ICarDao dao = CarDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("введите id для редактирования car");
		Integer id = Integer.parseInt(readInput());

		Car car = dao.get(id);
		System.out.println(car);

		System.out.println("введите новое имя");
		String newName = readInput();
		car.setName(newName);
		dao.update(car);

		System.out.println(" car обновлен:" + dao.get(id));
		return new CmdEditCar();
	}

}
