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
        init = null;
        size = -1;
    }
    
    public Node getInit() {
        return init;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int SIZE) {
        this.size = SIZE;
    }

    public void setInit(Node init) {
        this.init = init;
    }
    private Node init;
    private int size;

    
}
