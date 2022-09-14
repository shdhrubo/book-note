/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book.note;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author shori
 */
public class Button {
    JButton j = new JButton();
    public String view_notes;
//    Button(String s){
//        j.setText(s);
//        j.setSize(60, 30);
//        j.setBackground(Color.red);
//    }

    Button(String view_notes) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.view_notes = view_notes;
        j.setSize(60, 30);
        j.setBackground(Color.red);
    }
}
