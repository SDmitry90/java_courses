package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "model", description = "редактировать модели")
public class CmdEditModel extends AbstractCmd {
	
	public CmdEditModel() {
		super(CmdListModel.class, CmdAddModel.class, CmdDeleteModel.class, CmdUpdateModel.class);
	}

}
