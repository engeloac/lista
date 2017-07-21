/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;


/**
 *
 * @author SirBobby
 */
public class List {
    public List(){
        sInit = null;
        sSize = -1;
    }
    
    public Node getInit() {
        return sInit;
    }
    
    public int getSize() {
        return sSize;
    }
    
    public void setSize(int SIZE) {
        this.sSize = SIZE;
    }

    public void setInit(Node init) {
        this.sInit = init;
    }
    private Node sInit;
    private int sSize;

    
}
