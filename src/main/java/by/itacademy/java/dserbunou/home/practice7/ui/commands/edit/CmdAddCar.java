package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.ICarDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "add", description = "добавить авто")
public class CmdAddCar extends AbstractCmd {
	private ICarDao dao = CarDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("введите имя нового авто");
		String newCarName = readInput();

		Car car = new Car();
		car.setName(newCarName);

		Car newEntity = dao.insert(car);

		System.out.println("Новый авто сохранен:" + newEntity);
		return new CmdEditCar();
	}

}
