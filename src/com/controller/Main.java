package com.controller;

public class Main {
    
    public Main() {
        com.view.MainWindow sMainWindow = new com.view.MainWindow();
        com.controller.Controller sController = new com.controller.Controller();
        com.model.Model sModel = new com.model.Model();
        
        sMainWindow.setController(sController);
        sModel.setController(sController);
        System.out.println("He sido escrito desde git");
        sController.setMainWindow(sMainWindow);
        sController.setModel(sModel);
    }
    public static void main(String[] args) {
        new Main();
    }
}
