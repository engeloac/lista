/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.progr.objects.Book;

/**
 *
 * @author SirBobby
 */
public class Node {
    public Node(Book book) {
        this.book = book;
        this.next = null;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public com.model.Node getNext() {
        return next;
    }

    public void setNext(com.model.Node next) {
        this.next = next;
    }
    
    private Book book;
    private com.model.Node next;
}
