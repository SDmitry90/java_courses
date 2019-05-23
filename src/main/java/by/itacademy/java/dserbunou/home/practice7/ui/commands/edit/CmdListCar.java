package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.ICarDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "list", description = "вывести список")
public class CmdListCar extends AbstractCmd {

	private ICarDao dao = CarDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		List<Car> newEntity = dao.getAll();

		for (Car car : newEntity) {
			System.out.println(car);
		}
		return new CmdEditCar();
	}

}
