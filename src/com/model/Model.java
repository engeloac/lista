/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.controller.Controller;
import com.model.services.Delete;
import com.model.services.Find;
import com.model.services.Update;
import com.model.services.Write;
import com.progr.objects.Book;

/**
 *
 * @author SirBobby
 */
public class Model {
    public Model() {
        write = new com.model.services.Write();
        find = new com.model.services.Find();
    }
    
    public void setController(Controller controller) {
        this.controller = controller;
    }
    
    public Node addNodeInit(String name, int cost, Node init) {
        Book book = new Book(name, cost);
        return write.addNodeInit(book, init);
    }
    
    public Node addNodeAfter(String name, int cost,int position, int size, Node node) {
        return write.addNodeAfter(new Book(name, cost), position, node);
    }
    
    public Node addNodeEnd(String name, int cost, Node init) {
        Book book = new Book(name, cost);
        return write.addNodeEnd(book, init);
    }
    
    public Book[] showList(Node node, int size) {
        if( size >= 0 ){
            Book[] book;
            int position = 0;
            book = find.showList(node,size);
            return book;
        }
        return null;
    }
    
    public int sizeList(Node init) {
        int size = find.sizeList(init);
        return size;
    }
    
    private List list;
    private Controller controller;
    private Delete delete;
    private Find find;
    private Update update;
    private Write write;
}
