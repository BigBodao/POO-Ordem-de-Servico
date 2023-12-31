package principal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaInicial extends JFrame {
	private JLabel viewValorProduto;
	private JPanel contentPane;
	private JLabel vlrTotal;
	private JTextField NomeCliente;
	private JTextField IdCliente;
	private JTextField TelCliente;
	private JTextField LarguraProduto;
	private JTextField AlturaProduto;
	private JTextField QuantidadeProduto;
	
    private JComboBox<Object> ListaProdutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public TelaInicial() {
		setTitle("Gestão de Ordem de Serviço");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel NomeView = new JLabel("Nome:");
		NomeView.setBounds(10, 11, 46, 14);
		contentPane.add(NomeView);
		
		NomeCliente = new JTextField();
		NomeCliente.setBounds(66, 8, 154, 20);
		contentPane.add(NomeCliente);
		NomeCliente.setColumns(10);
		
		JLabel IdView = new JLabel("CPF | CNPJ:");
		IdView.setBounds(230, 11, 70, 14);
		contentPane.add(IdView);
		
		IdCliente = new JTextField();
		IdCliente.setBounds(304, 8, 161, 20);
		contentPane.add(IdCliente);
		IdCliente.setColumns(10);
		
		JLabel TelView = new JLabel("Telefone:");
		TelView.setBounds(475, 11, 62, 14);
		contentPane.add(TelView);
		
		TelCliente = new JTextField();
		TelCliente.setBounds(547, 8, 138, 20);
		contentPane.add(TelCliente);
		TelCliente.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 38, 675, 8);
		contentPane.add(horizontalStrut);
		
		viewValorProduto = new JLabel();
        viewValorProduto.setBounds(304, 57, 70, 14);
        contentPane.add(viewValorProduto);
		
		JLabel ViewProduto = new JLabel("Produto:");
		ViewProduto.setBounds(10, 57, 52, 14);
		contentPane.add(ViewProduto);
		
		ListaProdutos = new JComboBox<>();
        ListaProdutos.setBounds(66, 53, 154, 22);
        contentPane.add(ListaProdutos);
		
		
		try (Connection conexao = ConnectionFactory.getConnection();) {
            String sqlListaProdutos = "SELECT nome FROM produtos";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlListaProdutos);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    ListaProdutos.addItem(resultSet.getString("nome"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		JLabel ViewValor = new JLabel("Valor:");
		ViewValor.setBounds(230, 57, 46, 14);
		contentPane.add(ViewValor);
		
		try (Connection conexao = ConnectionFactory.getConnection();) {
            String sqlValorProduto = "SELECT preco FROM produtos";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlValorProduto);
                    ResultSet resultSet = preparedStatement.executeQuery()) {

                   if (resultSet.next()) {
                       int valorInteiro = resultSet.getInt("preco");
                       viewValorProduto.setText(String.valueOf(valorInteiro));
                   }
               }
           } catch (SQLException e) {
               e.printStackTrace();
        }
		

		
		JLabel ViewLargura = new JLabel("Largura");
		ViewLargura.setBounds(230, 82, 46, 14);
		contentPane.add(ViewLargura);
		
		LarguraProduto = new JTextField();
		LarguraProduto.setText("0");
		LarguraProduto.setBounds(304, 82, 50, 20);
		contentPane.add(LarguraProduto);
		LarguraProduto.setColumns(10);
		
		JLabel ViewAltura = new JLabel("Altura");
		ViewAltura.setBounds(230, 117, 46, 14);
		contentPane.add(ViewAltura);
		
		AlturaProduto = new JTextField();
		AlturaProduto.setText("0");
		AlturaProduto.setBounds(304, 113, 50, 20);
		contentPane.add(AlturaProduto);
		AlturaProduto.setColumns(10);
		
		JLabel ViewQtd = new JLabel("Qtd.:");
		ViewQtd.setBounds(419, 57, 46, 14);
		contentPane.add(ViewQtd);
		
		QuantidadeProduto = new JTextField();
		QuantidadeProduto.setText("1");
		QuantidadeProduto.setBounds(475, 54, 46, 20);
		contentPane.add(QuantidadeProduto);
		QuantidadeProduto.setColumns(10);
		
		JLabel ViewValorTotal = new JLabel("Vlr. Total:");
		ViewValorTotal.setBounds(547, 57, 62, 14);
		contentPane.add(ViewValorTotal);
		
		vlrTotal = new JLabel();
		vlrTotal.setBounds(615, 57, 70, 14);
		contentPane.add(vlrTotal);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(10, 142, 675, 8);
		contentPane.add(horizontalStrut_1);
		
		JLabel ViewDesigner = new JLabel("Designer:");
		ViewDesigner.setBounds(10, 161, 62, 14);
		contentPane.add(ViewDesigner);
		
		JComboBox<Object> ListaDesigner = new JComboBox<>();
		ListaDesigner.setBounds(82, 157, 138, 22);
		contentPane.add(ListaDesigner);
		
		try (Connection conexao = ConnectionFactory.getConnection();) {
            String sqlDesigners = "SELECT nome, sobrenome FROM designer";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlDesigners);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                	ListaDesigner.addItem(resultSet.getString("nome") + " " + resultSet.getString("sobrenome"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		JButton BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.setBounds(596, 161, 89, 23);
		contentPane.add(BotaoSalvar);
		
        atualizarValorProduto();
        atualizarVlrTotal();
        ListaProdutos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                atualizarValorProduto();
                atualizarVlrTotal();
            }
        });
        addDocumentListenerToTextField(AlturaProduto);
        addDocumentListenerToTextField(LarguraProduto);
        addDocumentListenerToTextField(QuantidadeProduto);
		

	}
	
	private void addDocumentListenerToTextField(JTextField textField) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                atualizarVlrTotal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                atualizarVlrTotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                atualizarVlrTotal();
            }
        });
    }
	
	private void atualizarVlrTotal() {
		try {
	        double quantidade = Double.parseDouble(QuantidadeProduto.getText());
	        double altura = Double.parseDouble(AlturaProduto.getText());
	        double largura = Double.parseDouble(LarguraProduto.getText());

	        double valorProduto = Double.parseDouble(viewValorProduto.getText());

	        double valorTotal = (altura * largura * valorProduto) * quantidade;	      
	        String valorTotalFormatado = String.format("%.2f", valorTotal);

	        vlrTotal.setText(valorTotalFormatado);
	    } catch (NumberFormatException e) {
	        vlrTotal.setText("Erro de cálculo");
	    }
	}
	
	
	private void atualizarValorProduto() {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            String produtoSelecionado = ListaProdutos.getSelectedItem().toString();

            String sqlValorProduto = "SELECT preco FROM produtos WHERE nome = ?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sqlValorProduto)) {
                preparedStatement.setString(1, produtoSelecionado);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        int valorInteiro = resultSet.getInt("preco");
                        viewValorProduto.setText(String.valueOf(valorInteiro));
                        atualizarVlrTotal();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	
}