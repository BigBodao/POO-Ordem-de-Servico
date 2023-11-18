package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal {

	private JFrame frmSgo;
	private final Action IrOrcamento = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
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
		
		JPanel telaInicial = new JPanel();
		telaInicial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		telaInicial.setBounds(0, 0, 804, 461);
		telaInicial.setBackground(new Color(0, 128, 255));
		frmSgo.getContentPane().add(telaInicial);
		telaInicial.setLayout(null);
		
		JButton NovoOrcamento = new JButton("Orçamento");
		NovoOrcamento.setAction(IrOrcamento);
		NovoOrcamento.setBounds(32, 11, 225, 410);
		NovoOrcamento.setBackground(new Color(255, 255, 255));
		telaInicial.add(NovoOrcamento);
		
		JButton NovoFunc = new JButton("Funcionários");
		NovoFunc.setBounds(289, 11, 225, 410);
		NovoFunc.setBackground(new Color(255, 255, 255));
		telaInicial.add(NovoFunc);
		
		JButton NovoProd = new JButton("Serviços");
		NovoProd.setBounds(546, 11, 225, 410);
		NovoProd.setBackground(new Color(255, 255, 255));
		telaInicial.add(NovoProd);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Orçamento");
			putValue(SHORT_DESCRIPTION, "");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
