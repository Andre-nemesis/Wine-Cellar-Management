package resources.interface_card;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RegistrarVenda extends JPanel {
    public RegistrarVenda(JPanel mainPanel) {
        // inicialização de variáveis
        jLabelCadastro = new JLabel();

        jButtonCadastrar = new JButton();
        jButtonCancelar = new JButton();
        jButtonAdicionarCarrinho = new JButton();
        jButtonProdutoCard = new JButton();
        jButtonClienteCard = new JButton();
        jButtonFinalizarVendaCard = new JButton();

        jPanelButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        jPanelContent = new JPanel(new CardLayout());
        jPanelButtonsCard = new JPanel();
        jPanelHeader = new JPanel();
        jPanel = new JPanel();

        // cards
        cardProdutos = new ProdutoVenda();
        cardClientes = new ClienteVenda();
        cardFinalizarVenda = new FinalizarVenda();

        jSeparator = new JSeparator();

        // configuração do card
        setBackground(new Color(243, 243, 223));
        setPreferredSize(new Dimension(1366, 650)); // tamanho do painel que tem tudo
        setLayout(new FlowLayout(FlowLayout.CENTER,30,30));

        // painel branco que vai conter tudo
        jPanel.setPreferredSize(new Dimension(1200, 600));
        jPanel.setBackground(Color.WHITE);
        jPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // painel do texto de cadastro de produto(header)
        jPanelHeader.setLayout(new BoxLayout(jPanelHeader, BoxLayout.Y_AXIS));
        jPanelHeader.setBackground(new Color(255, 255, 255));
        jPanelHeader.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanelHeader.setPreferredSize(new Dimension(1200, 50));

        jLabelCadastro.setFont(new Font("Cormorant Garamond SemiBold", 0, 30));
        jLabelCadastro.setText("Registrar Venda");
        jLabelCadastro.setAlignmentX(Component.CENTER_ALIGNMENT); // centralizar

        jSeparator.setBackground(new Color(128, 0, 32));
        jSeparator.setForeground(new Color(128, 0, 32));
        jSeparator.setPreferredSize(new Dimension(200, 8));
        jSeparator.setMaximumSize(new Dimension(230, 8));
        jSeparator.setAlignmentX(Component.CENTER_ALIGNMENT); // centralizar

        jPanelHeader.setOpaque(false);
        jPanelHeader.add(jLabelCadastro);
        jPanelHeader.add(jSeparator); // adiciona no painel

        // adiciona o painelHeader no principal
        jPanel.add(jPanelHeader);

        // Butões de mudança de tela
        jPanelButtonsCard.setBackground(Color.WHITE);
        jPanelButtonsCard.setPreferredSize(new Dimension(1200, 50));

        // painel dos campos
        jPanelContent.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanelContent.setPreferredSize(new Dimension(1200, 400));
        jPanelContent.setBackground(new Color(255, 255, 255));
        
        jPanelContent.add(cardProdutos,"produtos");
        jPanelContent.add(cardClientes,"clientes");
        jPanelContent.add(cardFinalizarVenda,"finalizar_venda");

        jPanelButtonsCard.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        jPanelButtonsCard.setOpaque(false);
        jPanelButtonsCard.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 10));

        jButtonProdutoCard.setBackground(Color.WHITE);
        jButtonProdutoCard.setFont(new Font("Cormorant Garamond Bold", 1, 20));
        jButtonProdutoCard.setForeground(new Color(128, 0, 32));
        jButtonProdutoCard.setText("Produto");
        jButtonProdutoCard.setFocusPainted(false);
        jButtonProdutoCard.setBorderPainted(false);
        jButtonProdutoCard.setOpaque(false);
        jButtonProdutoCard.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonProdutoCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutoCardActionEvent(evt);
            }
        });
        jPanelButtonsCard.add(jButtonProdutoCard);

        jButtonClienteCard.setBackground(Color.WHITE);
        jButtonClienteCard.setFont(new Font("Cormorant Garamond Bold", 1, 20));
        jButtonClienteCard.setForeground(new Color(0, 0, 0));
        jButtonClienteCard.setText("Cliente");
        jButtonClienteCard.setFocusPainted(false);
        jButtonClienteCard.setBorderPainted(false);
        jButtonClienteCard.setOpaque(false);
        jButtonClienteCard.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonClienteCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteCardActionEvent(evt);
            }
        });
        jPanelButtonsCard.add(jButtonClienteCard);

        jButtonFinalizarVendaCard.setBackground(Color.WHITE);
        jButtonFinalizarVendaCard.setFont(new Font("Cormorant Garamond Bold", 1, 20));
        jButtonFinalizarVendaCard.setForeground(new Color(0, 0, 0));
        jButtonFinalizarVendaCard.setText("Finalizar Venda");
        jButtonFinalizarVendaCard.setFocusPainted(false);
        jButtonFinalizarVendaCard.setBorderPainted(false);
        jButtonFinalizarVendaCard.setOpaque(false);
        jButtonFinalizarVendaCard.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonFinalizarVendaCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarVendaCardActionEvent(evt);
            }
        });
        jPanelButtonsCard.add(jButtonFinalizarVendaCard);

        jPanelButtons.setLayout(new BorderLayout());
        jPanelButtons.setBackground(Color.WHITE);
        jPanelButtons.setPreferredSize(new Dimension(1200, 50));
        jPanelButtons.setBorder(new EmptyBorder(5,30,5,20));

        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));

        leftPanel.setBackground(Color.WHITE);
        rightPanel.setBackground(Color.WHITE);

        leftPanel.add(jButtonCancelar);
        rightPanel.add(jButtonAdicionarCarrinho);
        rightPanel.add(jButtonCadastrar);

        jButtonCancelar.setBackground(new Color(225, 225, 200));
        jButtonCancelar.setFont(new Font("Cormorant Garamond SemiBold", 1, 18));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setBorder(new EmptyBorder(5,20,5,20));
        jButtonCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(e -> {
            // Redireciona para "listar_produtos"
            CardLayout cl = (CardLayout) mainPanel.getLayout();
            cl.show(mainPanel, "card_vendas");
        });

        jButtonCadastrar.setBackground(new Color(0, 128, 17));
        jButtonCadastrar.setFont(new Font("Cormorant Garamond SemiBold", 1, 18));
        jButtonCadastrar.setForeground(new Color(255, 255, 200));
        jButtonCadastrar.setText("Próximo");
        jButtonCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonCadastrar.setFocusPainted(false);

        jButtonAdicionarCarrinho.setBackground(new Color(28, 128, 67));
        jButtonAdicionarCarrinho.setFont(new Font("Cormorant Garamond SemiBold", 1, 18));
        jButtonAdicionarCarrinho.setForeground(new Color(255, 255, 200));
        jButtonAdicionarCarrinho.setText("Adicionar ao Carrinho");
        jButtonAdicionarCarrinho.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonAdicionarCarrinho.setFocusPainted(false);

        jPanelButtons.add(leftPanel, BorderLayout.WEST);
        jPanelButtons.add(rightPanel, BorderLayout.EAST);

        jPanel.add(jPanelButtonsCard);
        jPanel.add(jPanelContent);
        jPanel.add(jPanelButtons);

        add(jPanel);

    }

    private void showCard(String cardName) {
        CardLayout cl = (CardLayout) jPanelContent.getLayout();
        cl.show(jPanelContent, cardName);
    }

    private void jButtonProdutoCardActionEvent(java.awt.event.ActionEvent evt){
        jButtonProdutoCard.setForeground(new Color(128, 0, 32));
        jButtonClienteCard.setForeground(new Color(0, 0, 0));
        jButtonFinalizarVendaCard.setForeground(new Color(0, 0, 0));
        this.showCard("produtos");
    }

    private void jButtonClienteCardActionEvent(java.awt.event.ActionEvent evt){
        jButtonProdutoCard.setForeground(new Color(0, 0, 0));
        jButtonClienteCard.setForeground(new Color(128, 0, 32));
        jButtonFinalizarVendaCard.setForeground(new Color(0, 0, 0));
        this.showCard("clientes");
    }

    private void jButtonFinalizarVendaCardActionEvent(java.awt.event.ActionEvent evt){
        jButtonProdutoCard.setForeground(new Color(0, 0, 0));
        jButtonClienteCard.setForeground(new Color(0, 0, 0));
        jButtonFinalizarVendaCard.setForeground(new Color(128, 0, 32));
        this.showCard("finalizar_venda");
    }

    // componentes que vão ser usados na tela, só o essencial e com os nomes certinhos
    private JLabel jLabelCadastro;

    private JButton jButtonCancelar;
    private JButton jButtonCadastrar;
    private JButton jButtonAdicionarCarrinho;
    private JButton jButtonProdutoCard;
    private JButton jButtonClienteCard;
    private JButton jButtonFinalizarVendaCard;

    private JPanel jPanelHeader;
    private JPanel jPanelButtons;
    private JPanel jPanelContent;
    private JPanel jPanelButtonsCard;
    private JPanel jPanel;
    private JPanel cardProdutos;
    private JPanel cardClientes;
    private JPanel cardFinalizarVenda;
    private JPanel leftPanel;
    private JPanel rightPanel;

    private JSeparator jSeparator;
}
