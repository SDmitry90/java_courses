package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IBrandDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "add", description = "добавить бренд")
public class CmdAddBrand extends AbstractCmd {

	private IBrandDao dao = BrandDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		System.out.println("введите имя нового бренда");
		String newBrandName = readInput();

		Brand brand = new Brand();
		brand.setName(newBrandName);

		Brand newEntity = dao.insert(brand);

		System.out.println("Новый бренд сохранен:" + newEntity);
		return new CmdEditBrand();
	}
}
