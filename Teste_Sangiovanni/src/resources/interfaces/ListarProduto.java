
package resources.interfaces;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.table.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;
import io.github.cdimascio.dotenv.Dotenv;

/**
 * @author rafaj
 */
public class ListarProduto extends javax.swing.JFrame {
    private final Dotenv dotenv;
    /**
     * Creates new form CadastrarProduto
     */
    public ListarProduto() {
        this.dotenv = Dotenv.load();
        initComponents();
        getProduct();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(500, 0), new java.awt.Dimension(50, 32767));
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 243, 223));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1366, 770));

        jPanel1.setBackground(new java.awt.Color(243, 243, 223));

        jPanel2.setBackground(new java.awt.Color(243, 243, 223));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Cinzel", 0, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Casa San'Giovanni");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(128, 0, 32));
        jPanel3.setMaximumSize(new java.awt.Dimension(1366, 35));
        jPanel3.setMinimumSize(new java.awt.Dimension(1366, 35));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 50, 10);
        flowLayout1.setAlignOnBaseline(true);
        jPanel3.setLayout(flowLayout1);

        jButton1.setBackground(new java.awt.Color(128, 0, 32));
        jButton1.setFont(new java.awt.Font("Cormorant Garamond SemiBold", 0, 18));
        jButton1.setForeground(new java.awt.Color(225, 235, 43));
        jButton1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/images/wine.png"))));
        jButton1.setText("Produtos");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setBackground(new java.awt.Color(128, 0, 32));
        jButton2.setFont(new java.awt.Font("Cormorant Garamond SemiBold", 0, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/images/caminhao.png"))));
        jButton2.setText("Fornecedores");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setBackground(new java.awt.Color(128, 0, 32));
        jButton3.setFont(new java.awt.Font("Cormorant Garamond SemiBold", 0, 18));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/images/sacola.png"))));
        jButton3.setText("Vendas");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setBackground(new java.awt.Color(128, 0, 32));
        jButton4.setFont(new java.awt.Font("Cormorant Garamond SemiBold",Font.BOLD,18));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/images/clientes.png"))));
        jButton4.setText("Clientes");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jPanel4.setBackground(new java.awt.Color(243, 243, 223));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.darkGray));

        jLabel2.setFont(new java.awt.Font("Cormorant Garamond SemiBold", 0, 30));
        jLabel2.setText("Listar Produto");

        jSeparator1.setBackground(new java.awt.Color(128, 0, 32));
        jSeparator1.setForeground(new java.awt.Color(128, 0, 32));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(392, 50));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setFont(new Font("Cormorant Garamond",Font.BOLD,14));
        jTextField4.setText("Pesquisar produto");
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jTextField4.setToolTipText("");
        jTextField4.setPreferredSize(new java.awt.Dimension(200, 40));
        jTextField4.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (jTextField4.getText().equals("Pesquisar produto")) {
                    jTextField4.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (jTextField4.getText().isEmpty()) {
                    jTextField4.setText("Pesquisar produto");
                }
            }
        });
        jPanel8.add(jTextField4);
        jPanel8.add(filler1);

        jButton8.setFont(new java.awt.Font("Cormorant Garamond", Font.BOLD, 20));
        jButton8.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/images/criar.png"))));
        jButton8.setText("Cadastrar Produto");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton8);

        jButton9.setFont(new java.awt.Font("Cormorant Garamond", Font.BOLD, 20));
        jButton9.setForeground(new java.awt.Color(6, 6, 10));
        jButton9.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/images/filter.png"))));
        jButton9.setText("Filtrar");
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setPreferredSize(new java.awt.Dimension(90, 40));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                        "Código", "Nome", "Fornecedor", "Preço Unitário", "Qtd. em Estoque", "Ações"
                }
        ));

        jTable2.setIntercellSpacing(new Dimension(0, 0));
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        jTable2.setFont(new java.awt.Font("Cormorant Garamond",Font.BOLD,14));
        jTable2.setShowGrid(false);
        jTable2.setIntercellSpacing(new Dimension(0, 0));
        jTable2.setRowHeight(30);
        jTable2.setFocusable(false);

        JTableHeader header = jTable2.getTableHeader();
        header.setFont(new java.awt.Font("Cormorant Garamond",Font.BOLD,18));
        header.setBackground(Color.WHITE);
        header.setForeground(new java.awt.Color(128, 0, 32));
        header.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(128, 0, 32)));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(128, 0, 32)));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(128, 0, 32)));
        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setSelectionBackground(new java.awt.Color(228, 236, 242));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));

        for (int i = 0; i < jTable2.getColumnCount(); i++) {
            if (!jTable2.getColumnName(i).equals("Ações")) {
                jTable2.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        }

        jTable2.getColumn("Ações").setCellRenderer(new ButtonRendererProduct());
        jTable2.getColumn("Ações").setCellEditor(new ButtonEditorProduct(jTable2, this.rootPane,this.dotenv.get("API_HOST")));

        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(504, 504, 504)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(565, 565, 565)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(138, 138, 138)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(707, 707, 707)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame tela = new ListarProduto();
        SwingUtilities.invokeLater(() -> {
            this.setVisible(false);
            tela.setVisible(true);
        });
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrame tela = new ListarFornecedor();
        SwingUtilities.invokeLater(() -> {
            this.setVisible(false);
            tela.setVisible(true);
        });
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFrame tela = new ListarVenda();
        SwingUtilities.invokeLater(() -> {
            this.setVisible(false);
            tela.setVisible(true);
        });
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame tela = new ListarCliente();
        SwingUtilities.invokeLater(() -> {
            this.setVisible(false);
            tela.setVisible(true);
        });
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt){
        JFrame tela = new CadastrarProduto();
        SwingUtilities.invokeLater(() -> {
            this.setVisible(false);
            tela.setVisible(true);
        });
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    public void getProduct(){
        try {
            String urlAPI = this.dotenv.get("API_HOST");
            URL url = new URL(urlAPI + "/product");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                Gson gson = new Gson();
                JsonArray products = JsonParser.parseString(response.toString()).getAsJsonArray();

                DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
                tableModel.setRowCount(0);

                for (int i = 0; i < products.size(); i++) {
                    JsonObject product = products.get(i).getAsJsonObject();
                    BigInteger id = product.get("id").getAsBigInteger();
                    String name = product.get("name").getAsString();
                    JsonObject supplier = product.get("supplier").getAsJsonObject();
                    String supplierName = supplier.get("name").getAsString();
                    String quantity = product.get("quantity").getAsString();
                    String price = product.get("price").getAsString();

                    tableModel.addRow(new Object[]{id, name, supplierName, price,quantity});
                    connection.disconnect();
                }
            } else {
                JOptionPane.showOptionDialog(rootPane,
                        "Ocorreu um erro ao carregar os produtos",
                        "Problema no Servidor",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        null,null,null);
                connection.disconnect();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

class ButtonRendererProduct extends JPanel implements TableCellRenderer {
    private final JButton editButton = new JButton();
    private final JButton deleteButton = new JButton();

    public ButtonRendererProduct() {
        setOpaque(true);
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));

        this.editButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/images/editar.png"))));
        this.editButton.setBackground(Color.WHITE);
        this.editButton.setBorder(null);
        this.editButton.setContentAreaFilled(false);
        this.editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        this.deleteButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/images/excluir.png"))));
        this.deleteButton.setBackground(Color.WHITE);
        this.deleteButton.setBorder(null);
        this.deleteButton.setContentAreaFilled(false);
        this.deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        add(editButton);
        add(deleteButton);

        editButton.setFocusable(false);
        deleteButton.setFocusable(false);
    }


    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(128, 0, 32));
        return this;
    }
}

class ButtonEditorProduct extends AbstractCellEditor implements TableCellEditor {
    private final JPanel panel = new JPanel();
    private final JButton editButton = new JButton();
    private final JButton deleteButton = new JButton();
    private final JTable table;
    private int currentRow;
    private final JFrame frame;
    private final String APIURL;

    public ButtonEditorProduct(JTable table,JRootPane rootPane,String APIURL) {
        this.table = table;
        this.frame = (JFrame) SwingUtilities.getWindowAncestor(rootPane);
        this.APIURL = APIURL;

        panel.setLayout(new

                FlowLayout(FlowLayout.CENTER, 5, 0));

        this.editButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(
                getClass().getResource("/resources/images/editar.png"))));
        this.editButton.setOpaque(true);
        this.editButton.setBackground(new java.awt.Color(255, 255, 255));
        this.editButton.setForeground(new java.awt.Color(128, 0, 32));
        this.editButton.setFocusPainted(false);
        this.editButton.setBorder(null);
        this.editButton.setContentAreaFilled(false);
        this.editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        this.deleteButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(
                getClass().getResource("/resources/images/excluir.png"))));
        this.deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        this.deleteButton.setForeground(new java.awt.Color(128, 0, 32));
        this.deleteButton.setFocusPainted(false);
        this.deleteButton.setBorder(null);
        this.deleteButton.setContentAreaFilled(false);
        this.deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        panel.add(editButton);
        panel.add(deleteButton);

        // Action for edit button
        editButton.addActionListener(evt -> {
            int cellIndex = table.getSelectedRow();
            Object cellValue = table.getValueAt(cellIndex,0);
            JFrame tela = new EditarProduto(cellValue.toString());
            SwingUtilities.invokeLater(() -> {
                this.frame.setVisible(false);
                tela.setVisible(true);
            });
            stopCellEditing();
        });

        // Action for delete button
        deleteButton.addActionListener(e -> {
            String[] options = {"Cancelar","Excluir"};
            int confirmation = JOptionPane.showOptionDialog(table,
                    "Deseja excluir o produto? Essa ação não poderá ser desfeita. ",
                    "Deletar Produto",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            if (confirmation == 1) {
                try{
                    int cellIndex = table.getSelectedRow();
                    Object cellValue = table.getValueAt(cellIndex,0);
                    BigInteger id_product = new BigInteger(cellValue.toString());
                    URL url = new URL(this.APIURL + "/product/" + id_product);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                    connection.setRequestMethod("DELETE");

                    int responseCode = connection.getResponseCode();
                    if(responseCode==HttpURLConnection.HTTP_NO_CONTENT || responseCode == HttpURLConnection.HTTP_OK){
                        ((DefaultTableModel) table.getModel()).removeRow(currentRow);
                        JOptionPane.showOptionDialog(this.frame,
                                "O produto foi deletado com sucesso",
                                "Produto Deletado",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                null,
                                null);
                    }
                    else{
                        JOptionPane.showOptionDialog(this.frame,
                                "Ocorreu um erro no servidor ao deletar o produto",
                                "Erro ao deletar produto",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.ERROR_MESSAGE,
                                null,
                                null,
                                null);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this.frame,ex.getMessage());
                }
            }
            else{
                stopCellEditing();
            }

        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        currentRow = row;
        return panel;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }
}
