package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "car", description = "редактировать car")
public class CmdEditCar extends AbstractCmd {
	public CmdEditCar() {
		super(CmdListCar.class, CmdAddCar.class, CmdDeleteCar.class, CmdUpdateCar.class);
	}

}
