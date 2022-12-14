/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.book.note;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shori
 */

public class Home extends javax.swing.JFrame {
       //model declaration for table
        private DefaultTableModel model;

         //declaration of name tree
        BST<String, Book> nameTree = new BST<>();
        //declaration of author and genre tree with ArrayList 
        BST<String, ArrayList<Book>> authorTree = new BST<>();
        BST<String, ArrayList<Book>> genreTree = new BST<>();
        //arraylist for books
        ArrayList<Book> books = new ArrayList<>();
        //function for building tree
        public void treeBuild(){
         //initialization of name tree
        nameTree = new BST<>();
        //initialization of author and genre tree with ArrayList
        authorTree = new BST<>();
        genreTree = new BST<>();
        

        for (Book book : books) {
            //name tree
            nameTree.insert(book.getName().toLowerCase(), book);

            //author tree
            if(authorTree.search(book.getAuthor().toLowerCase())!=null){
                authorTree.search(book.getAuthor().toLowerCase()).getValue().add(book);
            }else {
                authorTree.insert(book.getAuthor().toLowerCase(), new ArrayList<>());
                authorTree.search(book.getAuthor().toLowerCase()).getValue().add(book);
            }

            //genre tree
            if(genreTree.search(book.getGenre().toLowerCase())!=null){
                genreTree.search(book.getGenre().toLowerCase()).getValue().add(book);
            }else {
                genreTree.insert(book.getGenre().toLowerCase(), new ArrayList<>());
                genreTree.search(book.getGenre().toLowerCase()).getValue().add(book);
            }
        }
}
    /**
     * Creates new form Home
     */
  
    public Home() {
        initComponents();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        genreField = new javax.swing.JTextField();
        notesButton = new javax.swing.JButton();
        addBookButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        searchTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        viewNoteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book-note");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(130, 30, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 950));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        nameField.setForeground(new java.awt.Color(51, 51, 51));
        nameField.setText("Name");
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });

        authorField.setForeground(new java.awt.Color(51, 51, 51));
        authorField.setText("Author");
        authorField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                authorFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                authorFieldFocusLost(evt);
            }
        });
        authorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFieldActionPerformed(evt);
            }
        });

        genreField.setForeground(new java.awt.Color(51, 51, 51));
        genreField.setText("Genre");
        genreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                genreFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                genreFieldFocusLost(evt);
            }
        });

        notesButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        notesButton.setForeground(new java.awt.Color(102, 102, 255));
        notesButton.setText("Notes");
        notesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesButtonActionPerformed(evt);
            }
        });

        addBookButton.setBackground(new java.awt.Color(102, 102, 255));
        addBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBookButton.setForeground(new java.awt.Color(255, 255, 255));
        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        table.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder()));
        table.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Author", "Genre", "Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(30);
        table.setSelectionBackground(new java.awt.Color(153, 153, 255));
        table.setShowGrid(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Search Your Added Books");

        searchButton.setBackground(new java.awt.Color(102, 102, 255));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editButton.setForeground(new java.awt.Color(102, 102, 255));
        editButton.setText("Edit Book");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(102, 102, 255));
        deleteButton.setText("Delete Book");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewNoteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewNoteButton.setForeground(new java.awt.Color(102, 102, 255));
        viewNoteButton.setText("View Note");
        viewNoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNoteButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resetButton.setForeground(new java.awt.Color(102, 102, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(genreField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(notesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(searchButton))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(viewNoteButton)
                    .addComponent(deleteButton)
                    .addComponent(resetButton))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void notesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesButtonActionPerformed
                note.setVisible(true);
                note.getNoteTextArea().setText(userNote);
                note.getSaveButton().addActionListener(e->{
                userNote = note.getNoteTextArea().getText();
                note.setVisible(false);
        });
    }//GEN-LAST:event_notesButtonActionPerformed
    //function for name field focus gain
    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
         if(nameField.getText().equals("Name")){
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldFocusGained
    //function for name field focus lost
    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost

        if(nameField.getText().equals("")){
            nameField.setText("Name");
        }
    }//GEN-LAST:event_nameFieldFocusLost
    
    private void authorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFieldActionPerformed

    }//GEN-LAST:event_authorFieldActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained
    //function for author field focus gain
    private void authorFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFieldFocusGained
        if(authorField.getText().equals("Author")){
            authorField.setText("");
        }
    }//GEN-LAST:event_authorFieldFocusGained
    //function for name field focus lost
    private void authorFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFieldFocusLost

        if(authorField.getText().equals("")){
            authorField.setText("Author");
        }
    }//GEN-LAST:event_authorFieldFocusLost
    //function for genre field focus gain
    private void genreFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genreFieldFocusGained
        if(genreField.getText().equals("Genre")){
            genreField.setText("");
        }
    }//GEN-LAST:event_genreFieldFocusGained
    //function for name field focus lost
    private void genreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genreFieldFocusLost
        if(genreField.getText().equals("")){
            genreField.setText("Genre");
        }
    }//GEN-LAST:event_genreFieldFocusLost
   //function for add book button
    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        String nameValue = nameField.getText();
            String authorValue = authorField.getText();
            String genreValue = genreField.getText();
        if (nameValue.equals("Name")||authorValue.equals("Author")||genreValue.equals("Genre")||userNote == null || userNote.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields");
            return;
        }

        try {
            String[] rows = new String[5];
            rows[0] = nameValue;
            rows[1] = authorValue;
            rows[2] = genreValue;
            rows[3] = userNote;
            Book book=new Book(rows[0], rows[1], rows[2], rows[3]);
           
    
             if(nameTree.search(book.getName().toLowerCase())==null){
                nameTree.insert(book.getName().toLowerCase(), book);
                 books.add(book);
                 model.addRow(rows);
                 JOptionPane.showMessageDialog(null, "Book Added Successfully");
        }
    else{
            JOptionPane.showMessageDialog(null, "Same Book Already Added");
            return;
        }
           

            //author
            if(authorTree.search(book.getAuthor().toLowerCase())!=null){
                authorTree.search(book.getAuthor().toLowerCase()).getValue().add(book);
            }else {
                authorTree.insert(book.getAuthor().toLowerCase(), new ArrayList<>());
                authorTree.search(book.getAuthor().toLowerCase()).getValue().add(book);
            }

            //genre
            if(genreTree.search(book.getGenre().toLowerCase())!=null){
                genreTree.search(book.getGenre().toLowerCase()).getValue().add(book);
            }else {
                genreTree.insert(book.getGenre().toLowerCase(), new ArrayList<>());
                genreTree.search(book.getGenre().toLowerCase()).getValue().add(book);
            }
            nameField.setText("Name");
            authorField.setText("Author");
            genreField.setText("Genre");
            userNote = "";
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addBookButtonActionPerformed
    
        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                    model=new DefaultTableModel();
                    String columns[]={"Name","Author","Genre","Notes"};
                    model.setColumnIdentifiers(columns);
                    table.setModel(model);
       

                    String data[];
                    BufferedReader reader;
                try {
                    reader = new BufferedReader(new FileReader(
                            "books.txt"));

                    String nameReaderLine = reader.readLine();
                        while (nameReaderLine != null) {
                          // read next line
                          data = nameReaderLine.split(";");
                          String row[]={data[0],data[1],data[2],data[3]};
                           //adding for searching in the arraylist
                           books.add(new Book(data[0], data[1], data[2], data[3]));
                           nameReaderLine = reader.readLine();
                           model.addRow(row);
                        }
                        reader.close();                     
              //tree build
                      treeBuild();



                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_formWindowOpened
    //function for mouse click in table
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
          // TODO add your handling code here:
                int numberOfRow=table.getSelectedRow();
                String name=model.getValueAt(numberOfRow, 0).toString();
                String author=model.getValueAt(numberOfRow, 1).toString();
                String genre=model.getValueAt(numberOfRow, 2).toString();
                userNote=model.getValueAt(numberOfRow, 3).toString();
                nameField.setText(name);
                authorField.setText(author);
                genreField.setText(genre);
                note.getNoteTextArea().setText(userNote);

            
    }//GEN-LAST:event_tableMouseClicked
    //function for search button
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
                    String k = searchTextField.getText().toLowerCase();
                    if(!k.equals("")){
                        model.getDataVector().removeAllElements();
                         model.fireTableDataChanged();
                        System.out.println(books);
                       if (nameTree.search(k)!=null) {
                        Book book=nameTree.search(k).getValue();
                        model.addRow(new String[]{book.getName(),book.getAuthor(),book.getGenre(),book.getNote()});
                        }

                        if (authorTree.search(k)!=null) {
                        ArrayList<Book> books=authorTree.search(k).getValue();
                        for(Book book: books){
                              model.addRow(new String[]{book.getName(),book.getAuthor(),book.getGenre(),book.getNote()});
                        }
                       }

                        if(genreTree.search(k)!=null) {
                        ArrayList<Book> books=genreTree.search(k).getValue();
                        for(Book book: books){
                              model.addRow(new String[]{book.getName(),book.getAuthor(),book.getGenre(),book.getNote()});
                        }
                        }
                      } 
                else{
                      model.getDataVector().removeAllElements();
                      model.fireTableDataChanged();
                        for(Book book:books){
                        String row[]={book.getName(),book.getAuthor(),book.getGenre(),book.getNote()};
                        model.addRow(row);
                        }

          }
    }//GEN-LAST:event_searchButtonActionPerformed
    //functon for edit button
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
                 int numberOfRow=table.getSelectedRow();
        String oldName=model.getValueAt(numberOfRow, 0).toString();
              Book book=  nameTree.search(oldName).getValue();
              
                    String nameValue = nameField.getText();
            String authorValue = authorField.getText();
            String genreValue = genreField.getText();
            userNote=note.getNoteTextArea().getText();
            
            System.out.println(book.getName());
              System.out.println(nameValue);
            if(book.getName().equals(nameValue)){
                book.setAuthor(authorValue);
                book.setGenre(genreValue);
                book.setNote(userNote);
                    
                
            }
            else if(!book.getName().equals(nameValue) && nameTree.search(nameValue.toLowerCase())==null){
                book.setName(nameValue);
                book.setAuthor(authorValue);
                book.setGenre(genreValue);
                book.setNote(userNote);
             }
                 else{
            JOptionPane.showMessageDialog(null, "Same Book Already Added");
            return;
        }
        treeBuild();
          model.setValueAt(book.getName(), numberOfRow, 0);
          
                   model.setValueAt(book.getAuthor(), numberOfRow, 1);
                   model.setValueAt(book.getGenre(), numberOfRow, 2);
                   model.setValueAt(book.getNote(), numberOfRow, 3);
    }//GEN-LAST:event_editButtonActionPerformed
//function for view note button
    private void viewNoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNoteButtonActionPerformed

        
                 String line;
                 String oldName=model.getValueAt(table.getSelectedRow(), 0).toString();

                                ViewNote viewNote=new ViewNote();
                                viewNote.setVisible(true);
                                viewNote.getNoteTextArea().setText(nameTree.search(oldName).getValue().getNote());

               
    }//GEN-LAST:event_viewNoteButtonActionPerformed
        //function for delete button
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int numberOfRow=table.getSelectedRow();
            if(numberOfRow>=0){
             String nameOfDeletingBook=model.getValueAt(table.getSelectedRow(), 0).toString();
             int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the book "+"\""+nameOfDeletingBook+"\"?");
            if(input==0){
                  books.remove(nameTree.search(nameOfDeletingBook).getValue());
                  treeBuild();
                  model.removeRow(numberOfRow);
                  nameField.setText("Name");
                  authorField.setText("Author");
                  genreField.setText("Genre");
                  userNote="";
            }
            else{
                return;
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "No row selected");
            }
    }//GEN-LAST:event_deleteButtonActionPerformed
    //function for reset button
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:nameField.setText("Name");
                    nameField.setText("Name");
                    authorField.setText("Author");
                    genreField.setText("Genre");
                    userNote="";
                    table.clearSelection();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed
    //function for form window closing
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try {
            FileWriter fw=new FileWriter("books.txt");
            for(Book book:books){
            fw.append(book.getName()+";"+book.getAuthor()+";"+book.getGenre()+";"+book.getNote()+"\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JTextField authorField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField genreField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton notesButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable table;
    private javax.swing.JButton viewNoteButton;
    // End of variables declaration//GEN-END:variables
    private String userNote = "";
    notes note=new notes();
 
}