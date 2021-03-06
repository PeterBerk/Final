import javax.swing.*;

public class TaskApp extends javax.swing.JFrame {
    // Declare the TaskHandler and index integer.
    TaskHandler th;
    int index;

    public TaskApp() {
        initComponents();
        // Support for 100 tasks. Index is 0 or "empty"
        this.th = new TaskHandler(100);
        // When telling the TaskHandler to add, remove, replace, etc, we always
        // pass through this.index-1, to counter the fact that the first entry
        // in a list is always [0]. Essentially, to help differentiate
        // whether we're accessing the first item or if no items exist.
        // You will see this throughout the code.
        this.index = 0;
        // Methods and ActionListeners are below GUI construction code.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRestore = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCurrent = new javax.swing.JTextField();
        jtTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmShowAll = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmReplaceCurrent = new javax.swing.JMenuItem();
        jmDelete = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmNewBefore = new javax.swing.JMenuItem();
        jmNewPrior = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Title:");

        jLabel2.setText("Note:");

        btnRestore.setText("Restore Task");
        btnRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoreActionPerformed(evt);
            }
        });

        btnClear.setText("Clear Fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Current Task:");

        jLabel4.setText("Total:");

        jtCurrent.setEditable(false);
        jtCurrent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCurrent.setText("0");

        jtTotal.setEditable(false);
        jtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtTotal.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jtCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFirst.setText("  <<  ");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("   <   ");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnLast.setText("  >>  ");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setText("   >   ");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnFirst)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext)
                                .addGap(18, 18, 18)
                                .addComponent(btnLast)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFirst)
                                        .addComponent(btnPrev)
                                        .addComponent(btnLast)
                                        .addComponent(btnNext))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jMenu1.setText("File");

        jmShowAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmShowAll.setText("Show All Tasks");
        jmShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmShowAllActionPerformed(evt);
            }
        });
        jMenu1.add(jmShowAll);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jmReplaceCurrent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmReplaceCurrent.setText("Replace Current Task");
        jmReplaceCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmReplaceCurrentActionPerformed(evt);
            }
        });
        jMenu2.add(jmReplaceCurrent);

        jmDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jmDelete.setText("Delete This Task");
        jmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDeleteActionPerformed(evt);
            }
        });
        jMenu2.add(jmDelete);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        jmNewBefore.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmNewBefore.setText("Task After");
        jmNewBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNewAfterActionPerformed(evt);
            }
        });
        jMenu3.add(jmNewBefore);

        jmNewPrior.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jmNewPrior.setText("Task Before");
        jmNewPrior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNewPriorActionPerformed(evt);
            }
        });
        jMenu3.add(jmNewPrior);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRestore, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRestore)
                        .addGap(14, 14, 14)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // ==================================ACTION PERFORMED METHODS=============================================

    private void jmShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmShowAllActionPerformed
        // "Show all" action.
        // Start by making a temporary string
        String echo = "";
        // Then go through the entire TaskHandler bank and extract each Task
        for (int x=0;x<th.getVirtSize();x++){
            // Temp task to shorten next line of code
            Task temp = th.getTask(x);
            // Append information to echo string.
            echo += "Task #"+(x+1)+"\nTitle: "+temp.getTitle()+"\nDescription: "+temp.getDesc()+"\n#########\n";
        }
        // Make a popup with all this info
        JOptionPane.showMessageDialog(this, echo);
    }//GEN-LAST:event_jmShowAllActionPerformed

    private void jmReplaceCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmReplaceCurrentActionPerformed
        // "Replace current" action.
        // We have a verify() method that checks the text fields and sees if they're empty or not.
        if (verify()) {
            // If all is good...
            // Do we actually have any tasks?
            if (th.getVirtSize() > 0) {
                // Make a new temp task with the verified info.
                Task temp = new Task(jTextField1.getText(), jTextArea1.getText());
                // Append that, "false" because we're not creating a NEW task.
                th.add(temp, this.index-1, false);
            }
        }
        else{
            // Display error
            JOptionPane.showMessageDialog(this, "Please fill out both fields");
        }
    }//GEN-LAST:event_jmReplaceCurrentActionPerformed

    private void jmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDeleteActionPerformed
        // "Delete current" action
        // If we actually have a task to delete...
        if (th.getVirtSize() > 0){
            // Remove it.
            th.remove(this.index - 1);
            // If we've removed the last item...
            if (th.getVirtSize() < this.index){
                // Bring out index down by 1 to stay within bounds.
                index--;
            }
            // If we've deleted the last task...
            if (this.index == 0){
                // Clear the fields. It's less confusing.
                jTextField1.setText("");
                jTextArea1.setText("");
            }
            // If not the last task...
            else{
                // Display new current task
                display(th.getTask(this.index-1));
            }
            // Change "Total" and "Current" counters appropriately
            jtTotal.setText("" + th.getVirtSize());
            jtCurrent.setText("" + this.index);
        }

    }//GEN-LAST:event_jmDeleteActionPerformed

    private void jmNewAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNewBeforeActionPerformed
        // "New Task After" action.
        if (verify()) {
            Task temp = new Task(jTextField1.getText(), jTextArea1.getText());
            // Add new verified task.
            th.add(temp, this.index, true);
            // Push our current index up to match the new task.
            // Helps with flow of program, too. Especially with the
            // keyboard shortcuts
            this.index++;
            // Update counters.
            jtTotal.setText("" + th.getVirtSize());
            jtCurrent.setText("" + this.index);
        }
        else{
            JOptionPane.showMessageDialog(this, "Please fill out both fields");
        }
    }//GEN-LAST:event_jmNewBeforeActionPerformed

    private void jmNewPriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNewPriorActionPerformed
        // "New Task Before" action
        if (verify()) {
            Task temp = new Task(jTextField1.getText(), jTextArea1.getText());
            // If no tasks exist...
            if (th.getVirtSize() == 0) {
                // We can't really add a task before nothing.
                JOptionPane.showMessageDialog(this, "Can't add task before if no tasks exist!\n\n\nUse 'Insert > Task After' instead.");
            } else {
                // By adding this task behind, it pushes everything else forward.
                // Therefore, the index remains the same.
                th.add(temp, this.index - 1, true);
            }
            jtTotal.setText("" + th.getVirtSize());
        }
        else{
            JOptionPane.showMessageDialog(this, "Please fill out both fields");
        }
    }//GEN-LAST:event_jmNewPriorActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // "First item" button
        // If there is 1 or more tasks...
        if (th.getVirtSize() > 0){
            // Set index to 1, update fields, update counter.
            this.index = 1;
            display(th.getTask(this.index-1));
            jtCurrent.setText("" + this.index);
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // "Previous" button
        // If we're not already at the beginning (or empty)...
        if (this.index > 1){
            // Decrement index, update fields and counter.
            this.index--;
            display(th.getTask(this.index-1));
            jtCurrent.setText("" + this.index);
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // "Next" button
        // If There's at least one task and we're not already at the end...
        if (th.getVirtSize() > 0 && this.index < th.getVirtSize()){
            // Increment index, update fields and counter.
            this.index++;
            display(th.getTask(this.index-1));
            jtCurrent.setText("" + this.index);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // "Last" button
        // If there's at least one task...
        if (th.getVirtSize() > 0){
            // Set index to the size, update.
            this.index = th.getVirtSize();
            display(th.getTask(this.index-1));
            jtCurrent.setText("" + th.getVirtSize());
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // "Clear Fields" button
        // Simply sets fields to nothing.
        jTextField1.setText("");
        jTextArea1.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoreActionPerformed
        // "Restore Fields" button
        // If we have at least one task...
        if (th.getVirtSize() > 0) {
            // Update fields with task at index.
            display(th.getTask(this.index - 1));
        }
    }//GEN-LAST:event_btnRestoreActionPerformed

    private void display(Task t){
        // Quick update method to save code.
        // Takes in a task, and updates Title and Description
        // fields with what's in the task.
        jTextField1.setText(t.getTitle());
        jTextArea1.setText(t.getDesc());
    }
    private boolean verify(){
        // Simple field verification
        // As long as both fields aren't empty, they are good,
        // and this method returns "true"
        if (jTextField1.getText().equals("") || jTextArea1.getText().equals("")){
            return false;
        }
        else{
            return true;
        }
    }
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
            java.util.logging.Logger.getLogger(TaskApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnRestore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem jmDelete;
    private javax.swing.JMenuItem jmNewBefore;
    private javax.swing.JMenuItem jmNewPrior;
    private javax.swing.JMenuItem jmReplaceCurrent;
    private javax.swing.JMenuItem jmShowAll;
    private javax.swing.JTextField jtCurrent;
    private javax.swing.JTextField jtTotal;
    // End of variables declaration//GEN-END:variables
}
