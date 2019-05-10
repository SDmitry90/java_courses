package by.itacademy.java.dserbunou.home.practice7.ui.commands.edit;

import by.itacademy.java.dserbunou.home.practice7.ui.commands.AbstractCmd;
import by.itacademy.java.dserbunou.home.practice7.ui.commands.Command;

@Command(name = "brand", description = "редактировать бренд")
public class CmdEditBrand extends AbstractCmd {

    public CmdEditBrand() {
        super(CmdAddBrand.class, CmdDelBrand.class);
    }

}
