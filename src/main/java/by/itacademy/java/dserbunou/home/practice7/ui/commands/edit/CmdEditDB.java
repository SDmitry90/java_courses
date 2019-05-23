package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "edit", description = "редактировать базу данных")
public class CmdEditDB extends AbstractCmd {

	public CmdEditDB() {
		super(CmdEditBrand.class, CmdEditModel.class, CmdEditCar.class);
	}
}
