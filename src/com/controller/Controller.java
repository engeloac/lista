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
        sList = new List();
        sModel = new Model();
    }
    
    /**
     * Este metodo agrega un nodo al inicio de la lista
     * @param name Representa el nombre del libro
     * @param cost Representa el costo del libro
     * @return Retorna booleano usado para comprobar si se pudo realizar una conversion a entero
     */
    public boolean addNodeInit(String name, String cost) {
        if (validateString(cost)){
            sList.setSize(sList.getSize() + 1);
            sList.setInit(sModel.addNodeInit(name,sConvertedString,sList.getInit()));
            return true;
        }
        else return false;
    }
    
    public boolean addNodeAfter(String name, String cost,String position) {
        if (validateString(cost, position)) {
            sList.setSize(sList.getSize() + 1);
            sList.setInit(sModel.addNodeAfter(name, sConvertedString, sConvertedString, sConvertedString, sList.getInit()));
            return true;
        }
        else return false;
    }
    
    public boolean addNodeEnd(String name, String cost) {
        if (validateString(cost)) {
            sList.setSize(sList.getSize() + 1);
            sList.setInit(sModel.addNodeEnd(name, sConvertedString, sList.getInit()));
            return true;
        }
        else return false;
    }
    
    private boolean validateString(String cost) {
        try {
            sConvertedString = Integer.parseInt(cost);
            return true;
        } catch (Exception e) {
            return  false;
        }
    }
    
    private boolean validateString(String cost, String position) {
        try{
            sConvertedString = Integer.parseInt(cost);
            sConvertedString2 = Integer.parseInt(position);
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
        if(sList.getSize() >= 0){
            Book[] book = new Book[sizeList()];
            book = sModel.showList(sList.getInit(),sList.getSize());
            return book;
        } 
        else return null;
    }    

    /**
     * Metodo retorna la longitud de la lista
     * @return size + 1
     */
    public int sizeList(){
        int size = sModel.sizeList(sList.getInit());
        sList.setSize(size);
        return size + 1;
    }
    /**
     * Metodo que establece el valor de la varible sMainWindow
     * @param mainWindow Sera igualado a la variable del mismo nombre de la clase
     */
    void setMainWindow(com.view.MainWindow mainWindow) {
       this.sMainWindow = mainWindow;
    }
    
    /**
     * Metodo que establece el valor de la varible sMainWindow
     * @param model Sera igualado a la variable del mismo nombre de la clase
     */
    void setModel(com.model.Model model) {
        this.sModel = model;
    }
    
    
    private Model sModel;
    private MainWindow sMainWindow;
    private List sList;
    private int sConvertedString;
    private int sConvertedString2;
    private Book[] sBook;
}