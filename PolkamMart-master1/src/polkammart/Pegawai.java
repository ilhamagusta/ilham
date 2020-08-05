/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oryza
 */
public class Pegawai extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pegawai
     */
    private DefaultTableModel model;
    Object[ ] obj;
    public Pegawai() {
        initComponents();
        jPanel1.setSize(50*Pegawai.HEIGHT/100,50);
        
        AmbilData();
        this.setTitle("Data Karyawan");
        
    }
public void AmbilData(){
    
        model=new DefaultTableModel();
        jTable2.setModel(model);
        model.addColumn("NO");
        model.addColumn("Nama");
        model.addColumn("Level Pengguna");
        
    model.getDataVector( ).removeAllElements( );
    model.fireTableDataChanged( );
    int i=1;
    try{
    //membuat statemen pemanggilan data pada table tblGaji dari database
    Statement stat = (Statement) Koneksi.getKoneksi().createStatement( );
    
    String sql = "Select * from pengguna, level where pengguna.level=level.no";
    ResultSet res = stat.executeQuery(sql);
    //penelusuran baris pada tabel tblGaji dari database
    while(res.next ()){
    obj= new Object[3];
    
    obj[0] =i;
    obj[1] = res.getString("nama");
    obj[2] = res.getString("nama_lvl");
    
    model.addRow(obj);
    i++;
}
}catch(SQLException err){
JOptionPane.showMessageDialog(null, err.getMessage() );
}
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tambah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        rubah = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 102));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jTable2.setBackground(new java.awt.Color(153, 255, 153));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 162, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        rubah.setText("Rubah");
        rubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapus)
                .addGap(12, 12, 12)
                .addComponent(rubah)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        TambahPegawai tamb=new TambahPegawai();
        this.getParent().add(tamb);
        tamb.setVisible(true);
        tamb.setSize(this.getWidth(),this.getHeight());
        
        tamb.setLocation(0,0);
        this.setVisible(false);
    }//GEN-LAST:event_tambahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        try{
            int column = 1;
            int selectedRowIndex=jTable2.getSelectedRow();
            String value = jTable2.getModel().getValueAt(selectedRowIndex, column).toString();
            JOptionPane.showMessageDialog(null, value);
            String query="Delete from pengguna where nama='"+value+"'";
//            JOptionPane.showMessageDialog(null, value);
            //membuat statemen pemanggilan data pada table tblGaji dari database
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            stat.executeUpdate(query);
            AmbilData();          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void rubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubahActionPerformed
        // TODO add your handling code here:
        int column = 1;
        
        try{
           int selectedRowIndex=jTable2.getSelectedRow();
            
            if(selectedRowIndex<-1){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Data Terlebih Dahulu");
        }else{
            String value = jTable2.getModel().getValueAt(selectedRowIndex, column).toString();
            GetDataPengguna.setUserLogin(value);
            RubahPegawai rbh=new RubahPegawai();
            this.getParent().add(rbh);
            rbh.setVisible(true);
            rbh.setSize(this.getWidth(),this.getHeight());
            rbh.setLocation(0,0);
            this.setVisible(false);
        }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_rubahActionPerformed

    public void refresh(){
        this.AmbilData();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton rubah;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables

}
