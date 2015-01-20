import java.util.Random;
public class SortingApp extends javax.swing.JFrame {
    int[] Numbers;
    Random r;
    public SortingApp() {
        initComponents();
        this.Numbers = new int[50000];
        r = new Random();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jbGenerate = new javax.swing.JButton();
        jbBubble = new javax.swing.JButton();
        jbExchange = new javax.swing.JButton();
        jbInsertion = new javax.swing.JButton();
        jbQuick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jTextPane1);

        jbGenerate.setText("Generate Numbers");
        jbGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerateActionPerformed(evt);
            }
        });

        jbBubble.setText("Bubble Sort");
        jbBubble.setEnabled(false);
        jbBubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBubbleActionPerformed(evt);
            }
        });

        jbExchange.setText("Exchange Sort");
        jbExchange.setEnabled(false);
        jbExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExchangeActionPerformed(evt);
            }
        });

        jbInsertion.setText("Insertion Sort");
        jbInsertion.setEnabled(false);
        jbInsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertionActionPerformed(evt);
            }
        });

        jbQuick.setText("Quick Sort");
        jbQuick.setEnabled(false);
        jbQuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbGenerate)
                    .addComponent(jbBubble)
                    .addComponent(jbExchange)
                    .addComponent(jbInsertion)
                    .addComponent(jbQuick))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbGenerate)
                        .addGap(18, 18, 18)
                        .addComponent(jbBubble)
                        .addGap(18, 18, 18)
                        .addComponent(jbExchange)
                        .addGap(18, 18, 18)
                        .addComponent(jbInsertion)
                        .addGap(18, 18, 18)
                        .addComponent(jbQuick)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerateActionPerformed
        String numbers = "";
        // I've made a seperate method for setting the text, but we'll
        // combine the two "for" loops into one.
        for (int x=0;x<this.Numbers.length;x++){
            this.Numbers[x] = r.nextInt(this.Numbers.length)+1;
            numbers += this.Numbers[x] + "\n";
        }
        jTextPane1.setText(numbers);
        // Disabling the ability to sort numbers we haven't generated yet just
        // helps with the flow of the program for the user.
        jbBubble.setEnabled(true);
        jbInsertion.setEnabled(true);
        jbExchange.setEnabled(true);
        jbQuick.setEnabled(true);
        
    }//GEN-LAST:event_jbGenerateActionPerformed

    private void jbBubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBubbleActionPerformed
        // Realistically, instead of passing the integer array, everything could
        // just be referenced internally (through this.*) But for expandability's
        // sake, we'll just pass through our "Numbers" array.
        bubbleSort(this.Numbers);
        updateNumbers(this.Numbers);
    }//GEN-LAST:event_jbBubbleActionPerformed

    private void jbExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExchangeActionPerformed
        selectionSort(this.Numbers);
        updateNumbers(this.Numbers);
    }//GEN-LAST:event_jbExchangeActionPerformed

    private void jbInsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertionActionPerformed
        insertionSort(this.Numbers);
        updateNumbers(this.Numbers);
    }//GEN-LAST:event_jbInsertionActionPerformed

    private void jbQuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuickActionPerformed
        quickSort(this.Numbers, 0, Numbers.length-1);
        updateNumbers(this.Numbers);
    }//GEN-LAST:event_jbQuickActionPerformed
    public void updateNumbers(int[] x){
        String z = "";
        for (int y=0;y<x.length;y++){
            z += x[y] + "\n";
        }
        jTextPane1.setText(z);
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SortingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingApp().setVisible(true);
            }
        });
    }
    public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++){  
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}
		}
	}
    }

    public static void swap(int[] a, int x, int y){
       int temp = a[x];
       a[x] = a[y];
       a[y] = temp;
    }

    public static void selectionSort(int[] a){
       for (int i = 0; i < a.length - 1; i++){
          int minIndex = findMinimum(a, i);
          if (minIndex != i)
             swap(a, i, minIndex);
       }
    }  

    public static int findMinimum(int[] a, int first){
       int minIndex = first; 
       for (int i = first + 1; i < a.length; i++)
          if (a[i] < a[minIndex])
             minIndex = i;
       return minIndex;
    }

    public static void insertionSort(int a[]){
            int itemToInsert, j;
            boolean stillLooking;
            for (int k=1; k<a.length; k++){
                    itemToInsert = a[k];
                    j=k-1;
                    stillLooking=true;
                    while(j >=0 && stillLooking){
                            if (itemToInsert < a[j]){
                                    a[j+1] = a[j];
                                    j--;
                            }else{
                                    stillLooking=false;
                            }
                            a[j+1]=itemToInsert;
                    }
            }
    }
    public static void quickSort(int[] a, int left, int right){
        if (left >= right) return;
        int x = left;
        int y = right;
        int pivot = a[(x+y)/2];
        while (x < y){
            while (a[x] < pivot)x++;
            while (a[y] > pivot)y--;
            if (x<=y){
                int temp = a[x];
                a[x] = a[y];
                a[y] = temp;
                x++;
                y--;
            }
        }
        quickSort(a, left, y);
        quickSort(a, x, right);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jbBubble;
    private javax.swing.JButton jbExchange;
    private javax.swing.JButton jbGenerate;
    private javax.swing.JButton jbInsertion;
    private javax.swing.JButton jbQuick;
    // End of variables declaration//GEN-END:variables
}
