package by.itacademy.java.dserbunou.classroom.xmlmarshalling;

import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {

    public static void main(String[] args) throws JAXBException {
        Menu newMenu = new Menu();
        newMenu.setFoods(Arrays.asList(new Food("пельмени", "5BYN")));
        JAXBContext jaxbContext = JAXBContext.newInstance(Menu.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(newMenu, System.out);

    }

}
