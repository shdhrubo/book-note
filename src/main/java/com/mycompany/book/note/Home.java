/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.book.note;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shori
 */
public class Home extends javax.swing.JFrame {
  

private DefaultTableModel model;

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

        table.setAutoCreateRowSorter(true);
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
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(genreField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(notesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesButtonActionPerformed
       
        notes nw=new notes();
        nw.setVisible(true);
        
    }//GEN-LAST:event_notesButtonActionPerformed

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
    
        if(nameField.getText().equals("Name")){
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
       
            if(nameField.getText().equals("")){
            nameField.setText("Name");
        }
    }//GEN-LAST:event_nameFieldFocusLost

    private void authorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFieldActionPerformed
        
    }//GEN-LAST:event_authorFieldActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void authorFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFieldFocusGained
    if(authorField.getText().equals("Author")){
            authorField.setText("");
        }
    }//GEN-LAST:event_authorFieldFocusGained

    private void authorFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_authorFieldFocusLost

          if(authorField.getText().equals("")){
            authorField.setText("Author");
        }
    }//GEN-LAST:event_authorFieldFocusLost

    private void genreFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genreFieldFocusGained
 if(genreField.getText().equals("Genre")){
            genreField.setText("");
        }
    }//GEN-LAST:event_genreFieldFocusGained

    private void genreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genreFieldFocusLost
   if(genreField.getText().equals("")){
            genreField.setText("Genre");
        }
    }//GEN-LAST:event_genreFieldFocusLost

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        try {
             FileWriter nameWriter=new FileWriter("D:\\name.txt",true);
             FileWriter authorWriter=new FileWriter("D:\\author.txt",true);
             FileWriter genreWriter=new FileWriter("D:\\genre.txt",true);

             FileReader sizeReader=new FileReader("D:\\size.txt");
             BufferedReader br=new BufferedReader(sizeReader);
       
             String s;
              String size = null;
          while((s=br.readLine())!=null){
             size=s;
          }
          br.close();

        String nameValue=nameField.getText();
        String authorValue=authorField.getText();
        String genreValue=genreField.getText();

                   nameWriter.append(size+"/////"+nameValue+"\n");
                   authorWriter.append(size+"/////"+authorValue+"\n");
                   genreWriter.append(size+"/////"+genreValue+"\n");
                   
                   
                   int sizeInInteger =Integer.parseInt(size);
                   sizeInInteger++;
                   FileWriter sizeWriter=new FileWriter("D:\\size.txt");
                   BufferedWriter bw=new BufferedWriter(sizeWriter);
                   bw.write(sizeInInteger+"");
            nameWriter.flush();
            authorWriter.flush();
            genreWriter.flush();
            bw.close();
            String rows[] = new String[3];
           rows[0]=nameValue;
                rows[1]=authorValue;
                rows[2]=genreValue;
                model.addRow(rows);
       
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        model=new DefaultTableModel();
        String columns[]={"Name","Author","Genre","Notes"};
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        String name[],author[],genre[];
        BufferedReader readerName,readerAuthor,readerGenre;
    try {
        readerName = new BufferedReader(new FileReader(
                "D:\\name.txt"));
          readerAuthor = new BufferedReader(new FileReader(
                "D:\\author.txt"));
          readerGenre = new BufferedReader(new FileReader(
                "D:\\genre.txt"));
        String nameReaderLine = readerName.readLine();
         String authorReaderLine = readerAuthor.readLine();
                 String genreReaderLine = readerGenre.readLine();

		while (nameReaderLine != null) {
                      // read next line
                       name = nameReaderLine.split("/////");
                        author=authorReaderLine.split("/////");
                       genre=genreReaderLine.split("/////");

                       String row[]={name[1],author[1],genre[1]};

                      nameReaderLine = readerName.readLine();
                       genreReaderLine = readerGenre.readLine();
                       authorReaderLine = readerAuthor.readLine();
                        model.addRow(row);
			}
			readerName.close();                     
			readerAuthor.close();                       
			readerGenre.close();
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JTextField genreField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton notesButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
  
}


