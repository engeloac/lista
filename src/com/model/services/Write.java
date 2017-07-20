/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.services;

import com.model.Node;
import com.progr.objects.Book;

/**
 *
 * @author SirBobby
 */
public class Write {
    
    public Write() {
    }
    
    public Node addNodeInit(Book book, Node init) {
        Node node = new Node(book);
        if(init == null) {
            init = node;
        }
        else{
            node.setNext(init);
            init = node;
        }
        return init;
    }
    
    public Node addNodeEnd(Book book, Node init) {
        Node node = new Node(book);
        if(init == null) init = node;
        else {
            Node temporalNode = init;
            while (temporalNode.getNext() != null) {
                temporalNode = temporalNode.getNext();
            }
            temporalNode.setNext(node);
        }
        return init;
    }
    
    public Node addNodeAfter(Book book, int position, Node init) {
        Node node = new Node(book);
        int counter = 0;
        if (init == null) init = node;
        else {
            Node temporalNode = init;
            while (temporalNode != null && counter <= position) {
                counter++;
                temporalNode = temporalNode.getNext();
            }
            if((counter - 1) == position) {
                node.setNext(temporalNode.getNext().getNext());
                temporalNode.setNext(node);
            }
        }
        return init;
    }
}
