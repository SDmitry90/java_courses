package by.itacademy.java.dserbunou.classroom.xmlmarshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshalling {

    public static void main(String[] args) throws JAXBException {
        File file = new File("sample.xml");
        JAXBContext jaxbContent = JAXBContext.newInstance(Menu.class);
        Unmarshaller jaxbUnmarshller = jaxbContent.createUnmarshaller();
        Menu menu = (Menu) jaxbUnmarshller.unmarshal(file);
        System.out.println(menu);
    }
}
