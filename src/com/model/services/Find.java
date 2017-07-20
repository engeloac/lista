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
public class Find {
    
    public Find() {
        
    }
    
    public Book[] showList(Node node, int size) {
        int position = 0;
        Book[] book = new Book[size + 1];
        while(node != null && position <= size) {
            book[position] = node.getBook();
            node = node.getNext();
            position++;
        }
        return book;
    }
    
    public void showList(Node node){
        int position = 0;
        while(node != null) {
            System.out.println(node.getBook().getName());
            node = node.getNext();
        }
    }
    
    public int sizeList(com.model.Node node){
        int size = -1;
        if (node != null){
            while(node != null){
                node = node.getNext();
                size++;
            }
        }
        else System.out.println("Sin longitud");
        return size;
    }
}
