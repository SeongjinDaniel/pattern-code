package com.pattern.dependencyinjection;

import java.util.ArrayList;
import java.util.List;

interface Developer {
    void develop();
}

class BackendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
        System.out.println("Writing Java code");
    }
}

class FrontendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavascript();
    }

    private void writeJavascript() {
        System.out.println("Writing JavaScript code");
    }
}

public class DependencyInjection {
    private final List<Developer> developers;

    public DependencyInjection(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(Developer::develop);
    }

    public static void main(String[] args) {
        List<Developer> dev = new ArrayList<>();
        dev.add(new BackendDeveloper());
        dev.add(new FrontendDeveloper());
        DependencyInjection project = new DependencyInjection(dev);
        project.implement();
    }
}