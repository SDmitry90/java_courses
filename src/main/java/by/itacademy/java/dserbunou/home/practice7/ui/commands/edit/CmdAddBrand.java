package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import java.io.IOException;

import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "add", description = "добавить бренд")
public class CmdAddBrand extends AbstractCmd {

    public AbstractCmd execute() throws IOException {
        System.out.println("введите имя нового бренда");

        String newBrandName = readInput();
        System.out.println("Новый бренд сохранен");

        return new CmdEditBrand();
    }

}
