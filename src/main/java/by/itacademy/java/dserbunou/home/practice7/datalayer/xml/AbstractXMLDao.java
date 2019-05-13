package by.itacademy.java.dserbunou.home.practice7.datalayer.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public abstract class AbstractXMLDao<T> {
    private static final String ROOT_FOLDER = "d:/xmldb";

    abstract String getFileName();

    abstract Class<T> getTableClass();

    static {
        File root = new File(ROOT_FOLDER);
        if (!root.exists()) {
            root.mkdirs();
        }
    }

    protected AbstractXMLDao() {
        super();
        File file = getFile();
        if (!file.exists()) {
            try {
                file.createNewFile();
                write(getTableClass().newInstance()); // create new empty
            } catch (IOException | InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected File getFile() {
        return new File(ROOT_FOLDER + "/" + getFileName());
    }

    protected T read() {
        final File file = getFile();
        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(getTableClass());
            final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return (T) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            throw new RuntimeException(e);// TODO
        }
    }

    protected void write(T table) {
        JAXBContext jaxbContext;
        try (FileOutputStream os = new FileOutputStream(getFile());) {
            jaxbContext = JAXBContext.newInstance(getTableClass());

            final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(table, os);
        } catch (JAXBException | IOException e) {
            throw new RuntimeException(e);// TODO
        }
    }
}
