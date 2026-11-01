package com.kopdes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class MainFrame extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JTextField txtSku, txtNama, txtHarga, txtStok;
    private ProdukDAO dao = new ProdukDAO();

    public MainFrame() {
        setTitle("Kopdes KMP - Management Product");
        setSize(750, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        model = new DefaultTableModel(new String[]{"SKU", "Nama Produk", "Harga", "Stok"}, 0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        formPanel.add(new JLabel("SKU:")); txtSku = new JTextField(); formPanel.add(txtSku);
        formPanel.add(new JLabel("Nama Produk:")); txtNama = new JTextField(); formPanel.add(txtNama);
        formPanel.add(new JLabel("Harga:")); txtHarga = new JTextField(); formPanel.add(txtHarga);
        formPanel.add(new JLabel("Stok:")); txtStok = new JTextField(); formPanel.add(txtStok);

        JButton btnAdd = new JButton("Tambah");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Hapus");
        
        JPanel btnPanel = new JPanel();
        btnPanel.add(btnAdd); btnPanel.add(btnUpdate); btnPanel.add(btnDelete);

        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.add(formPanel, BorderLayout.CENTER);
        southPanel.add(btnPanel, BorderLayout.SOUTH);
        add(southPanel, BorderLayout.SOUTH);

        loadData();

        btnAdd.addActionListener(e -> {
            try {
                Produk p = new Produk(txtSku.getText(), txtNama.getText(), 1, "Deskripsi", 
                        Double.parseDouble(txtHarga.getText()), Integer.parseInt(txtStok.getText()), "pcs");
                dao.insertProduk(p);
                loadData();
                clearForm();
            } catch (Exception ex) { JOptionPane.showMessageDialog(this, "Error Insert: " + ex.getMessage()); }
        });

        btnUpdate.addActionListener(e -> {
            try {
                Produk p = new Produk(txtSku.getText(), txtNama.getText(), 1, "Deskripsi", 
                        Double.parseDouble(txtHarga.getText()), Integer.parseInt(txtStok.getText()), "pcs");
                dao.updateProduk(p);
                loadData();
                clearForm();
            } catch (Exception ex) { JOptionPane.showMessageDialog(this, "Error Update: " + ex.getMessage()); }
        });

        btnDelete.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus produk ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    dao.deleteProduk(txtSku.getText());
                    loadData();
                    clearForm();
                } catch (Exception ex) { JOptionPane.showMessageDialog(this, "Error Delete: " + ex.getMessage()); }
            }
        });

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table.getSelectedRow();
                txtSku.setText(model.getValueAt(row, 0).toString());
                txtNama.setText(model.getValueAt(row, 1).toString());
                txtHarga.setText(model.getValueAt(row, 2).toString());
                txtStok.setText(model.getValueAt(row, 3).toString());
            }
        });
    }

    private void loadData() {
        model.setRowCount(0);
        try {
            List<Produk> list = dao.getAllProduk();
            for (Produk p : list) {
                model.addRow(new Object[]{p.getSku(), p.getNamaProduk(), p.getHarga(), p.getStok()});
            }
        } catch (Exception e) { e.printStackTrace(); }
    }

    private void clearForm() {
        txtSku.setText(""); txtNama.setText(""); txtHarga.setText(""); txtStok.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}