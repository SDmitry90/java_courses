package by.itacademy.java.dserbunou.classroom.xmlmarshalling.task;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshalling {

    public static void main(String[] args) throws JAXBException {
        File file = new File("resources/shiporder.xml");
        JAXBContext jaxbContent = JAXBContext.newInstance(Shiporder.class);
        Unmarshaller jaxbUnmarshller = jaxbContent.createUnmarshaller();
        Shiporder shiporder = (Shiporder) jaxbUnmarshller.unmarshal(file);
        System.out.println(shiporder);
    }
}
