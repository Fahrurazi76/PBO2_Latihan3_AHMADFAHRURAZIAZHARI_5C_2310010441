import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Kelolakontak extends javax.swing.JFrame {

   
    public Kelolakontak() {
        initComponents();
  java.sql.Connection conn = Koneksi.getConnection();
        if (conn != null) {
            System.out.println("Koneksi berhasil, database ditemukan!");
        } else {
            System.out.println("Koneksi gagal, database tidak ditemukan!");
        }
    }  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblTelepon = new javax.swing.JLabel();
        lblKategori = new javax.swing.JLabel();
        txtNamaKontak = new javax.swing.JTextField();
        txtNomorTelepon = new javax.swing.JTextField();
        cmbKategoriKontak = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKontak = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPencarian = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJudul.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblJudul.setText("APLIKASI PENGELOLA KONTAK");

        lblNama.setText("Nama Kontak");

        lblTelepon.setText("Nomor Telepon");

        lblKategori.setText("Kategori");

        txtNamaKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaKontakActionPerformed(evt);
            }
        });

        cmbKategoriKontak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "Kantor" }));

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tabelKontak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Kontak", "Nomor Telepon", "Kategori"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKontakMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKontak);

        jLabel1.setText("Pencarian");

        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnExport.setText("Export CSV");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnImport.setText("Import CSV");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblJudul))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNama)
                                    .addComponent(lblTelepon)
                                    .addComponent(lblKategori)
                                    .addComponent(jLabel1))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUbah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnHapus))
                                    .addComponent(txtNamaKontak)
                                    .addComponent(txtNomorTelepon)
                                    .addComponent(cmbKategoriKontak, 0, 248, Short.MAX_VALUE)
                                    .addComponent(txtPencarian))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari)))))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnImport)
                .addGap(18, 18, 18)
                .addComponent(btnExport)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblJudul)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txtNamaKontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelepon)
                    .addComponent(txtNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKategori)
                    .addComponent(cmbKategoriKontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExport)
                    .addComponent(btnImport))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaKontakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaKontakActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
String nama = txtNamaKontak.getText();
    String telepon = txtNomorTelepon.getText();
    String kategori = cmbKategoriKontak.getSelectedItem().toString();

    String sql = "INSERT INTO kontak (nama, telepon, kategori) VALUES (?, ?, ?)";

    try (Connection conn = Koneksi.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setString(1, nama);
        pst.setString(2, telepon);
        pst.setString(3, kategori);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
        tampilData(); // nanti kita buat di langkah berikutnya
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal simpan data: " + e.getMessage());
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
int baris = tabelKontak.getSelectedRow();
    if (baris == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data di tabel yang ingin diubah dulu!");
        return;
    }

    // Ambil data lama dari tabel (sebagai acuan)
    String namaLama = tabelKontak.getValueAt(baris, 0).toString();

    // Ambil data baru dari input
    String namaBaru = txtNamaKontak.getText();
    String teleponBaru = txtNomorTelepon.getText();
    String kategoriBaru = cmbKategoriKontak.getSelectedItem().toString();

    try {
        Connection conn = Koneksi.getConnection();
        String sql = "UPDATE kontak SET nama=?, telepon=?, kategori=? WHERE nama=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, namaBaru);
        pst.setString(2, teleponBaru);
        pst.setString(3, kategoriBaru);
        pst.setString(4, namaLama);

        int rows = pst.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            tampilData(); // refresh tabel
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal diubah (tidak ditemukan).");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mengubah data: " + e.getMessage());
    }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
int baris = tabelKontak.getSelectedRow();
    if (baris == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus dari tabel dulu!");
        return;
    }

    // Ambil nama kontak dari baris yang dipilih
    String nama = tabelKontak.getValueAt(baris, 0).toString();

    // Konfirmasi penghapusan
    int konfirmasi = JOptionPane.showConfirmDialog(this,
            "Apakah yakin ingin menghapus kontak '" + nama + "'?",
            "Konfirmasi", JOptionPane.YES_NO_OPTION);

    if (konfirmasi == JOptionPane.YES_OPTION) {
        try {
            Connection conn = Koneksi.getConnection();
            String sql = "DELETE FROM kontak WHERE nama=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nama);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            tampilData(); // refresh tabel
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKontakMouseClicked
 int baris = tabelKontak.getSelectedRow();
    if (baris != -1) {
        txtNamaKontak.setText(tabelKontak.getValueAt(baris, 0).toString());
        txtNomorTelepon.setText(tabelKontak.getValueAt(baris, 1).toString());
        cmbKategoriKontak.setSelectedItem(tabelKontak.getValueAt(baris, 2).toString());
     }
    }//GEN-LAST:event_tabelKontakMouseClicked

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        cariData();


    }//GEN-LAST:event_txtPencarianKeyReleased

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
       cariData();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
 JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Simpan Data Kontak ke CSV");
    FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
    chooser.setFileFilter(filter);

    int userSelection = chooser.showSaveDialog(this);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        String filePath = chooser.getSelectedFile().getAbsolutePath();
        if (!filePath.toLowerCase().endsWith(".csv")) {
            filePath += ".csv";
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // header
            bw.write("Nama Kontak,Nomor Telepon,Kategori");
            bw.newLine();

            // isi data dari tabel
            for (int i = 0; i < tabelKontak.getRowCount(); i++) {
                String nama = tabelKontak.getValueAt(i, 0).toString();
                String telepon = tabelKontak.getValueAt(i, 1).toString();
                String kategori = tabelKontak.getValueAt(i, 2).toString();
                bw.write(nama + "," + telepon + "," + kategori);
                bw.newLine();
            }

            JOptionPane.showMessageDialog(this, "Data berhasil diexport ke: " + filePath);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal export data: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
 JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Pilih File CSV untuk Diimpor");
    FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
    chooser.setFileFilter(filter);

    int userSelection = chooser.showOpenDialog(this);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        String filePath = chooser.getSelectedFile().getAbsolutePath();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // lewati baris header

            Connection conn = Koneksi.getConnection();
            PreparedStatement pst = conn.prepareStatement(
                "INSERT INTO kontak (nama, telepon, kategori) VALUES (?, ?, ?)"
            );

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    pst.setString(1, data[0]);
                    pst.setString(2, data[1]);
                    pst.setString(3, data[2]);
                    pst.executeUpdate();
                }
            }

            JOptionPane.showMessageDialog(this, "Data berhasil diimpor dari file CSV!");
            tampilData(); // refresh tabel setelah import
        } catch (IOException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal import data: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnImportActionPerformed

    private void tampilData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Kontak");
        model.addColumn("Nomor Telepon");
        model.addColumn("Kategori");

        try {
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM kontak");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nama"),
                    rs.getString("telepon"),
                    rs.getString("kategori")
                });
            }

            tabelKontak.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal tampil data: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(Kelolakontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelolakontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelolakontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelolakontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelolakontak().setVisible(true);
            }
        });
    }
private void cariData() {
    String keyword = txtPencarian.getText();

    try (Connection conn = Koneksi.getConnection()) {
        String sql = "SELECT * FROM kontak WHERE nama LIKE ? OR telepon LIKE ? OR kategori LIKE ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, "%" + keyword + "%");
        pst.setString(2, "%" + keyword + "%");
        pst.setString(3, "%" + keyword + "%");

        ResultSet rs = pst.executeQuery();
        DefaultTableModel model = (DefaultTableModel) tabelKontak.getModel();
        model.setRowCount(0); // hapus isi tabel sebelum menampilkan hasil pencarian

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("nama"),
                rs.getString("telepon"),
                rs.getString("kategori")
            });
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal cari data: " + e.getMessage());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbKategoriKontak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTelepon;
    private javax.swing.JTable tabelKontak;
    private javax.swing.JTextField txtNamaKontak;
    private javax.swing.JTextField txtNomorTelepon;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables
}
