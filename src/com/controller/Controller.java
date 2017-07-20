/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Node;
import com.model.List;
import com.model.Model;
import com.progr.objects.Book;
import com.view.MainWindow;


/**
 *Este es controlador impletado en modelo-vista-controlador
 * @author SirBobby
 */
public class Controller {
    
    public Controller() {
        list = new List();
        model = new Model();
    }
    
    /**
     * Este metodo agrega un nodo al inicio de la lista
     * @param name Representa el nombre del libro
     * @param cost Representa el costo del libro
     * @return Retorna booleano usado para comprobar si se pudo realizar una conversion a entero
     */
    public boolean addNodeInit(String name, String cost) {
        if (validateString(cost)){
            list.setSize(list.getSize() + 1);
            list.setInit(model.addNodeInit(name,convertedString,list.getInit()));
            return true;
        }
        else return false;
    }
    
    public boolean addNodeAfter(String name, String cost,String position) {
        if (validateString(cost, position)) {
            list.setSize(list.getSize() + 1);
            list.setInit(model.addNodeAfter(name, convertedString, convertedString, convertedString, list.getInit()));
            return true;
        }
        else return false;
    }
    
    public boolean addNodeEnd(String name, String cost) {
        if (validateString(cost)) {
            list.setSize(list.getSize() + 1);
            list.setInit(model.addNodeEnd(name, convertedString, list.getInit()));
            return true;
        }
        else return false;
    }
    
    private boolean validateString(String cost) {
        try {
            convertedString = Integer.parseInt(cost);
            return true;
        } catch (Exception e) {
            return  false;
        }
    }
    
    private boolean validateString(String cost, String position) {
        try{
            convertedString = Integer.parseInt(cost);
            convertedString2 = Integer.parseInt(position);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
    
    /**
     * Este metodo muestra la lista
     * @return Devuelve en array de libros
     */
    public Book[] showList() {
        if(list.getSize() >= 0){
            Book[] book = new Book[sizeList()];
            book = model.showList(list.getInit(),list.getSize());
            return book;
        } 
        else return null;
    }    

    /**
     * Metodo retorna la longitud de la lista
     * @return size + 1
     */
    public int sizeList(){
        int size = model.sizeList(list.getInit());
        list.setSize(size);
        return size + 1;
    }
    /**
     * Metodo que establece el valor de la varible mainWindow
     * @param mainWindow Sera igualado a la variable del mismo nombre de la clase
     */
    void setMainWindow(com.view.MainWindow mainWindow) {
       this.mainWindow = mainWindow;
    }
    
    /**
     * Metodo que establece el valor de la varible mainWindow
     * @param model Sera igualado a la variable del mismo nombre de la clase
     */
    void setModel(com.model.Model model) {
        this.model = model;
    }
    
    
    private Model model;
    private MainWindow mainWindow;
    private List list;
    private int convertedString;
    private int convertedString2;
    private Book[] book;
}