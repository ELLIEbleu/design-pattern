package com.design.pattern.structual.composite;

import com.clearspring.analytics.util.Lists;

import java.util.List;

public class Composite implements Component{
    private List<Component> components = Lists.newArrayList();

    @Override
    public void operation() {
        for (Component component : components){
            component.operation();
        }
    }

    public void addComponent(Component component){
        components.add(component);
    }
    public void removeComponent(Component component){
        components.remove(component);
    }
}
