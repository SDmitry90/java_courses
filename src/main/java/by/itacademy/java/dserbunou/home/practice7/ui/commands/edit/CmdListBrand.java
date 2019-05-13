package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import java.util.List;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IBrandDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "list", description = "вывести список")
public class CmdListBrand extends AbstractCmd {

	private IBrandDao dao = BrandDBDaoImpl.getInstance();

	@Override
	public AbstractCmd execute() {

		List<Brand> newEntity = dao.getAll();

		for (Brand brand : newEntity) {
			System.out.println(brand);
		}
		return new CmdEditBrand();
	}
}
