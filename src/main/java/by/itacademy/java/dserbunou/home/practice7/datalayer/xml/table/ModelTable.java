package by.itacademy.java.dserbunou.home.practice7.datalayer.xml.table;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Model;

@XmlRootElement
public class ModelTable {

    private Integer nextId = 1;

    private List<Model> models = new ArrayList<>();

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public Integer nextId() {
        nextId++;
        return nextId;
    }

}
