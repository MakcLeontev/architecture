package ru.geekbrains.lesson1.store3D.models;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {

    //TODO: Доработать в рамках ДР

    private int id;
    private List<PoligonalModel> models;
    private List<Flash>flashes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(List<PoligonalModel> models) {
        this.models = models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }

    public Scene(int id, List<PoligonalModel> models) {
        this.id = id;
        this.models = models;
    }

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public Type method1(Type type){
        type = new Type() {
            @Override
            public String getTypeName() {
                return Type.super.getTypeName();
            }
        };
        return type;
    }

    public Type method2(Type type){
        type = new Type() {
            @Override
            public String getTypeName() {
                return Type.super.getTypeName();
            }
        };
        return type;
    }

}
