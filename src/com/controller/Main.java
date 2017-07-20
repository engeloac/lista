package com.controller;

public class Main {
    
    public Main() {
        com.view.MainWindow mainWindow = new com.view.MainWindow();
        com.controller.Controller controller = new com.controller.Controller();
        com.model.Model model = new com.model.Model();
        
        mainWindow.setController(controller);
        model.setController(controller);
        
        controller.setMainWindow(mainWindow);
        controller.setModel(model);
    }
    public static void main(String[] args) {
        new Main();
    }
}