package polimorfismo_aula;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class TestePolimorfismoGui {

	private JFrame frmAplicaoJava;
	private Conta conta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conta conta = new Conta("12345-6", 100.00);
					TestePolimorfismoGui window = new TestePolimorfismoGui(conta);
					window.frmAplicaoJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestePolimorfismoGui(Conta conta) {
		this.conta = conta;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//inicialização dos componentes
		frmAplicaoJava = new JFrame();
		JLabel lblValor = new JLabel(" Por Favor entre com valor do saque:");
		JPanel panel = new JPanel();
		JTextField fldValor = new JTextField();
		JButton btnEnviar = new JButton("Enviar");
		JTextArea textArea = new JTextArea();
		
		
		// configuração dos componentes
		frmAplicaoJava.setTitle("Aplica\u00E7\u00E3o Java");
		frmAplicaoJava.setBounds(100, 100, 450, 300);
		frmAplicaoJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fldValor.setColumns(10);
		textArea.setText(conta.toString() + "\n");
		
		// adicionando os componentes no painel frame
		frmAplicaoJava.getContentPane().add(panel, BorderLayout.NORTH);
		frmAplicaoJava.getContentPane().add(textArea, BorderLayout.CENTER);
		
		// adcionando os componentes no painel
		panel.add(lblValor);
		panel.add(fldValor);
		panel.add(btnEnviar);
		
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!fldValor.getText().isEmpty()) {
					conta.saque(Double.parseDouble(fldValor.getText()));
					JOptionPane.showMessageDialog(frmAplicaoJava, conta.toString(), 
							"Aviso", JOptionPane.INFORMATION_MESSAGE);
					textArea.setText(textArea.getText() + conta.toString() + "\n");
				}
				else 
					JOptionPane.showMessageDialog(frmAplicaoJava, "Insira Valor", 
							"Alerta", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		
		
		
	}

}
