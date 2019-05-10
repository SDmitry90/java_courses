package by.itacademy.java.dserbunou.home.practice7.ui.commands;

import by.itacademy.java.dserbunou.home.practice7.ui.commands.edit.CmdEditDB;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.search.CmdSearch;

@Command(name = "home", description = "вернуться в домашнее меню")
public class CmdHome extends AbstractCmd {

	public CmdHome() {
		super(CmdEditDB.class, CmdSearch.class);
	}
}
