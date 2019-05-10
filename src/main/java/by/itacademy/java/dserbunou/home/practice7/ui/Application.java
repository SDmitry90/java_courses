package by.itacademy.java.dserbunou.home.practice7.ui;

import java.io.IOException;

import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.CmdHome;

public class Application {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IOException {
		System.out.println("старт программы");

		AbstractCmd nextCommand = new CmdHome();
		while (nextCommand != null) {
			nextCommand = nextCommand.execute();
		}

		System.out.println("конец программы");
		System.exit(0);
	}
}
