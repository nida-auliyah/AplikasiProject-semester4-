package id.ac.polinema.aplikasiproject.models;

import android.view.SurfaceControl;

import java.util.ArrayList;
import java.util.List;

public class A {
    private String name;
    private List<Category> categories;

    public A(String name) {
        this.name = name;
        this.categories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Category> getCategory() {
        return categories;
    }

    public void addCategory(Category category) {
        this.categories.add(category);
    }

    public void removeCategory(int index) {
        Category category = categories.get(index);
        this.categories.remove(category);
    }

    public void updateCategory(int index, Category category) {
        this.categories.set(index, category);
    }
}
