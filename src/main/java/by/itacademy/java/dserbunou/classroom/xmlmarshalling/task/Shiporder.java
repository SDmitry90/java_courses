package by.itacademy.java.dserbunou.classroom.xmlmarshalling.task;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shiporder")
public class Shiporder {
    private String orderId;
    private String orderPerson;
    private List<Item> items;
    private Shipto shipTo;

    public Shiporder() {
    }

    @XmlElement(name = "shipto")
    public Shipto getShipTo() {
        return shipTo;
    }

    public void setShipTo(Shipto shipTo) {
        this.shipTo = shipTo;
    }

    @XmlAttribute(name = "orderid")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @XmlElement(name = "orderperson")
    public String getOrderPerson() {
        return orderPerson;
    }

    public void setOrderPerson(String orderPerson) {
        this.orderPerson = orderPerson;
    }

    @XmlElement(name = "item")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(
                String.format("Shiporder %s ordered by %s%n%s", orderId, orderPerson, shipTo));
        String itemsList = items.stream().map(item -> item.toString()).collect(Collectors.joining("\n", "\n", ""));
        stringBuilder.append(itemsList);
        return stringBuilder.toString();

    }
}