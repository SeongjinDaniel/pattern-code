package com.pattern.dependency;

class BackendDeveloper {
    public void writeJava() {
        System.out.println("Writing Java code");
    }
}

class FrontendDeveloper {
    public void writeJavascript() {
        System.out.println("Writing JavaScript code");
    }
}

public class Dependency {
    private BackendDeveloper backendDeveloper;
    private FrontendDeveloper frontendDeveloper;

    public Dependency(BackendDeveloper backendDeveloper, FrontendDeveloper frontendDeveloper) {
        this.backendDeveloper = backendDeveloper;
        this.frontendDeveloper = frontendDeveloper;
    }

    public void implement() {
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavascript();
    }

    public static void main(String[] args) {
        Dependency project = new Dependency(new BackendDeveloper(), new FrontendDeveloper());
        project.implement();
    }
}