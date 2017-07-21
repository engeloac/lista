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
        this.sBook = book;
        this.sNext = null;
    }

    public Book getBook() {
        return sBook;
    }

    public void setBook(Book book) {
        this.sBook = book;
    }

    public com.model.Node getNext() {
        return sNext;
    }

    public void setNext(com.model.Node next) {
        this.sNext = next;
    }
    
    private Book sBook;
    private Node sNext;
}
