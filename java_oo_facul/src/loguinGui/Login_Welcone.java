package loguinGui;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class Login_Welcone extends JFrame implements ActionListener 
{
	public static String nome;
	private JPanel contentPane;
	Button btnVisualizar,btnEditar,btnLogOut;

	public Login_Welcone(String n)
	{
		nome=n;
	}

	/**
	 * Create the frame.
	 */
	public Login_Welcone() 
	{

		/* INICIALIZANDO OS COMPONENTES */

		//Criando os componentes		
		contentPane = new JPanel();
		JLabel lblHiwelcome = new JLabel("New text");
		btnVisualizar = new Button("Visualizar Perfil");
		btnEditar = new Button("Editar Perfil");
		btnLogOut=new Button("Log Out");

		/*------------------------------------------------*/

		/* CONFIGURANDO DOS COMPONENTES */

		//Configurando o frame
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(contentPane);

		//Configurando o contentPane
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));		
		contentPane.setLayout(null);

		//Configurando tela de boas vindas
		lblHiwelcome.setBounds(99, 11, 209, 62);
		lblHiwelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		String mssge="Ol�  ";
		mssge+=nome ;
		mssge+="  Bem Vindo!!!";
		lblHiwelcome.setText(mssge);


		//Configurando o bot�o visualizar
		btnVisualizar.setBounds(21, 111, 99, 44);
		btnVisualizar.addActionListener(this);

		//Configurando o bot�o editar
		btnEditar.setBounds(127, 111, 106, 44);
		btnEditar.addActionListener(this);

		//Configurando o bot�o logOut
		btnLogOut.addActionListener(this);
		btnLogOut.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnLogOut.setBounds(350, 11, 74, 19);

		/*------------------------------------------------------*/


		/* Adicionando os componentes do contentPane */

		contentPane.add(lblHiwelcome);
		contentPane.add(btnVisualizar);
		contentPane.add(btnEditar);
		contentPane.add(btnLogOut);

		/*------------------------------------------------------*/

	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Button bb=(Button)ae.getSource();
		if(bb==btnVisualizar)
		{
			dispose();
			new View_profile(nome);
			View_profile le = new View_profile();  //View Profile

			le.setVisible(true);

		}
		if(bb==btnEditar)
		{
			dispose();
			new Edit_proile(nome);
			Edit_proile ep=new Edit_proile();   //Edit Profile
			ep.setVisible(true);
		}

		if(bb==btnLogOut)
		{
			dispose();
			Loguin p=new Loguin();        //Logs us out ie. gets us back to Page1(Login page)
			p.setVisible(true);
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Welcone frame = new Login_Welcone();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
