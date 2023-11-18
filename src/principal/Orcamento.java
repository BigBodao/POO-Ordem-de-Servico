package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Orcamento {

	private JFrame frmSgo;
	private JTextField NomeCliente;
	private JTextField CpfCLiente;
	private JTextField TelefoneCLiente;
	private JTextField EmailCliente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField Produto;
	private JTextField Quantidade;
	private JTextField AlturaProd;
	private JTextField larguraProd;
	private JTextField ValorUn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orcamento window = new Orcamento();
					window.frmSgo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Orcamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSgo = new JFrame();
		frmSgo.setTitle("SGO");
		frmSgo.setBounds(100, 100, 820, 500);
		frmSgo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSgo.getContentPane().setLayout(null);
		
		JPanel PainelCliente = new JPanel();
		PainelCliente.setBounds(10, 5, 783, 75);
		frmSgo.getContentPane().add(PainelCliente);
		PainelCliente.setLayout(null);
		
		JLabel ClienteLabel = new JLabel("Nome:");
		ClienteLabel.setBounds(10, 11, 58, 14);
		PainelCliente.add(ClienteLabel);
		
		NomeCliente = new JTextField();
		NomeCliente.setBounds(61, 8, 119, 20);
		PainelCliente.add(NomeCliente);
		NomeCliente.setColumns(10);
		
		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ:");
		lblCpfcnpj.setBounds(190, 11, 69, 14);
		PainelCliente.add(lblCpfcnpj);
		
		CpfCLiente = new JTextField();
		CpfCLiente.setColumns(10);
		CpfCLiente.setBounds(269, 8, 119, 20);
		PainelCliente.add(CpfCLiente);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(398, 11, 52, 14);
		PainelCliente.add(lblTelefone);
		
		TelefoneCLiente = new JTextField();
		TelefoneCLiente.setColumns(10);
		TelefoneCLiente.setBounds(448, 8, 119, 20);
		PainelCliente.add(TelefoneCLiente);
		
		EmailCliente = new JTextField();
		EmailCliente.setColumns(10);
		EmailCliente.setBounds(639, 8, 119, 20);
		PainelCliente.add(EmailCliente);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(577, 11, 52, 14);
		PainelCliente.add(lblEmail);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(10, 42, 70, 14);
		PainelCliente.add(lblEndereco);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(88, 39, 362, 20);
		PainelCliente.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(485, 39, 86, 20);
		PainelCliente.add(textField_1);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(458, 42, 31, 14);
		PainelCliente.add(lblCep);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(587, 42, 46, 14);
		PainelCliente.add(lblCidade);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(631, 39, 98, 20);
		PainelCliente.add(textField_2);
		
		JPanel ServicoPainel = new JPanel();
		ServicoPainel.setBounds(10, 90, 783, 75);
		frmSgo.getContentPane().add(ServicoPainel);
		ServicoPainel.setLayout(null);
		
		JLabel ProdutoServico = new JLabel("Produto/Serviço");
		ProdutoServico.setBounds(10, 11, 90, 24);
		ServicoPainel.add(ProdutoServico);
		
		Produto = new JTextField();
		Produto.setBounds(111, 13, 144, 20);
		ServicoPainel.add(Produto);
		Produto.setColumns(10);
		
		JLabel lblQtd = new JLabel("Qtd.:");
		lblQtd.setBounds(265, 11, 35, 24);
		ServicoPainel.add(lblQtd);
		
		Quantidade = new JTextField();
		Quantidade.setColumns(10);
		Quantidade.setBounds(310, 13, 51, 20);
		ServicoPainel.add(Quantidade);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(376, 11, 51, 24);
		ServicoPainel.add(lblAltura);
		
		AlturaProd = new JTextField();
		AlturaProd.setColumns(10);
		AlturaProd.setBounds(430, 13, 51, 20);
		ServicoPainel.add(AlturaProd);
		
		JLabel lblLargura = new JLabel("Largura:");
		lblLargura.setBounds(376, 34, 51, 24);
		ServicoPainel.add(lblLargura);
		
		larguraProd = new JTextField();
		larguraProd.setColumns(10);
		larguraProd.setBounds(430, 38, 51, 20);
		ServicoPainel.add(larguraProd);
		
		JLabel lblValorUn = new JLabel("Valor Un.:");
		lblValorUn.setBounds(491, 11, 56, 24);
		ServicoPainel.add(lblValorUn);
		
		ValorUn = new JTextField();
		ValorUn.setColumns(10);
		ValorUn.setBounds(545, 13, 51, 20);
		ServicoPainel.add(ValorUn);
		
		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setBounds(616, 11, 67, 24);
		ServicoPainel.add(lblValorTotal);
		
		JLabel lblValorTotalVar = new JLabel("");
		lblValorTotalVar.setBounds(678, 11, 67, 24);
		ServicoPainel.add(lblValorTotalVar);
	}
}
