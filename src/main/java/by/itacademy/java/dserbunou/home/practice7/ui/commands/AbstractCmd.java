package by.itacademy.java.dserbunou.home.practice7.ui.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractCmd {
    private static final BufferedReader consoleReader = new BufferedReader(
            new InputStreamReader(System.in));

    private Class<? extends AbstractCmd>[] subCommands;

    @SafeVarargs
    public AbstractCmd(Class<? extends AbstractCmd>... cmd) {
        if (this.getClass() != CmdHome.class) {
            Class<? extends AbstractCmd>[] allSubcommands = new Class[cmd.length + 1];
            for (int i = 0; i < cmd.length; i++) {
                allSubcommands[i] = cmd[i];
            }
            allSubcommands[cmd.length] = CmdHome.class; // add default
            this.subCommands = allSubcommands;
        } else {
            this.subCommands = cmd;
        }
    }

    /**
     * Contains code to be executed when user selected current command and also
     * returns the next command
     */
    public AbstractCmd execute() {
        Class<? extends AbstractCmd> selectNextSubCommand = selectNextSubCommand();
        try {
            return selectNextSubCommand.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    protected Class<? extends AbstractCmd> selectNextSubCommand() {
        showSubCommands();
        Class<? extends AbstractCmd> selectedCmd = selectCommand();
        while (selectedCmd == null) {
            System.out.println("неверный ввод, попробуйте еще раз...");
            showSubCommands();
            selectedCmd = selectCommand();
        }
        return selectedCmd;
    }

    protected String readInput() {
        try {
            return consoleReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getDescription(Class<? extends AbstractCmd> clazz) {
        return getMetadata(clazz).description();
    };

    private String getCommandName(Class<? extends AbstractCmd> clazz) {
        return getMetadata(clazz).name();
    }

    private Command getMetadata(Class<? extends AbstractCmd> clazz) {
        Command annotation = clazz.getAnnotation(Command.class);
        if (annotation == null) {
            throw new IllegalArgumentException(
                    "Class should be annotated with metadata. Class:" + clazz);
        }
        return annotation;
    }

    private void showSubCommands() {
        if (subCommands.length != 0) {
            System.out.println("-----------выберите действие-----------");
            for (Class<? extends AbstractCmd> cmdClass : subCommands) {
                System.out.printf("%s - %s\n", getCommandName(cmdClass),
                        getDescription(cmdClass));
            }
        } else {
            System.out.println("нет подкоманд для показа");
            System.exit(1);
        }
    };

    private Class<? extends AbstractCmd> selectCommand() {
        String cmdName;
        cmdName = readInput();

        for (Class<? extends AbstractCmd> cmd : subCommands) {
            if (getCommandName(cmd).equalsIgnoreCase(cmdName)) {
                return cmd;
            }
        }
        return null;
    }

}
