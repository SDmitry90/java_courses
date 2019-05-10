package by.itacademy.java.dserbunou.home.practice7.ui.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractCmd {
    private static final BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

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
     * 
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws IOException 
     */
    public AbstractCmd execute() throws InstantiationException, IllegalAccessException, IOException {
        Class<? extends AbstractCmd> selectNextSubCommand = selectNextSubCommand();
        return selectNextSubCommand.newInstance();
    }

    protected Class<? extends AbstractCmd> selectNextSubCommand() {
        showSubCommands();
        Class<? extends AbstractCmd> selectedCmd = selectCommand();
        while (selectedCmd == null) {
            System.out.println("Неверный ввод. Попробуйте еще раз...");
            showSubCommands();
            selectedCmd = selectCommand();
        }
        return selectedCmd;
    }

    protected String readInput() throws IOException {
        return consoleReader.readLine();
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
            throw new IllegalArgumentException("Class should be annotated with metadata. Class:" + clazz);
        }
        return annotation;
    }

    private void showSubCommands() {
        if (subCommands.length != 0) {
            System.out.println("-----------выберите действие-----------");
            for (Class<? extends AbstractCmd> cmdClass : subCommands) {
                System.out.printf("%s - %s\n", getCommandName(cmdClass), getDescription(cmdClass));
            }
        } else {
            System.out.println("Нет подкоманд для показа. ");
            System.exit(1);
        }
    };

    private Class<? extends AbstractCmd> selectCommand() {
        String cmdName;
        try {
            cmdName = readInput();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        for (Class<? extends AbstractCmd> cmd : subCommands) {
            if (getCommandName(cmd).equalsIgnoreCase(cmdName)) {
                return cmd;
            }
        }
        return null;
    }

}
