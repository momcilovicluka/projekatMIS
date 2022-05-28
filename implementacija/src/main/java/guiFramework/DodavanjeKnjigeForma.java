package guiFramework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DodavanjeKnjigeForma {

	private JFrame frmDodavanjeKnjige;
	private JTextField tfNaziv;
	private JTextField tfIzdavac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodavanjeKnjigeForma window = new DodavanjeKnjigeForma();
					window.frmDodavanjeKnjige.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DodavanjeKnjigeForma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frmDodavanjeKnjige = new JFrame();
		frmDodavanjeKnjige.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DodavanjeKnjigeForma.class.getResource("/guiFramework/book-stack.png")));
		frmDodavanjeKnjige.setTitle("Dodavanje knjige");
		frmDodavanjeKnjige.setResizable(false);
		frmDodavanjeKnjige.setBounds(100, 100, 285, 351);
		frmDodavanjeKnjige.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDodavanjeKnjige.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Naziv:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 49, 25);
		frmDodavanjeKnjige.getContentPane().add(lblNewLabel);

		JLabel lblBrstrana = new JLabel("Broj strana:");
		lblBrstrana.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBrstrana.setBounds(10, 45, 91, 25);
		frmDodavanjeKnjige.getContentPane().add(lblBrstrana);

		JLabel lblIzdava = new JLabel("Izdavač:");
		lblIzdava.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblIzdava.setBounds(10, 80, 65, 25);
		frmDodavanjeKnjige.getContentPane().add(lblIzdava);

		JLabel lblBrojKnjigaU = new JLabel("Broj knjiga u biblioteci:");
		lblBrojKnjigaU.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBrojKnjigaU.setBounds(10, 115, 187, 25);
		frmDodavanjeKnjige.getContentPane().add(lblBrojKnjigaU);

		JLabel lblBrojKnjigaUkupno = new JLabel("Ukupan broj knjiga:");
		lblBrojKnjigaUkupno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBrojKnjigaUkupno.setBounds(10, 150, 159, 25);
		frmDodavanjeKnjige.getContentPane().add(lblBrojKnjigaUkupno);

		tfNaziv = new JTextField();
		tfNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfNaziv.setBounds(69, 10, 138, 25);
		frmDodavanjeKnjige.getContentPane().add(tfNaziv);
		tfNaziv.setColumns(10);

		tfIzdavac = new JTextField();
		tfIzdavac.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		tfIzdavac.setColumns(10);
		tfIzdavac.setBounds(85, 80, 138, 25);
		frmDodavanjeKnjige.getContentPane().add(tfIzdavac);

		JSpinner spinBrStrana = new JSpinner();
		spinBrStrana.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinBrStrana.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		spinBrStrana.setBounds(112, 45, 85, 25);
		frmDodavanjeKnjige.getContentPane().add(spinBrStrana);

		JSpinner spinBrKnjigaBibl = new JSpinner();
		spinBrKnjigaBibl.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		spinBrKnjigaBibl.setBounds(207, 115, 57, 25);
		frmDodavanjeKnjige.getContentPane().add(spinBrKnjigaBibl);

		JSpinner spinBrUkupno = new JSpinner();
		spinBrUkupno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		spinBrUkupno.setBounds(179, 150, 57, 25);
		frmDodavanjeKnjige.getContentPane().add(spinBrUkupno);

		JButton btnOdabirAutor = new JButton("Odaberi autora");
		btnOdabirAutor.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdabirAutor.setBounds(56, 185, 159, 33);
		frmDodavanjeKnjige.getContentPane().add(btnOdabirAutor);

		JButton btnOdabirZanr = new JButton("Odaberi žanr");
		btnOdabirZanr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOdabirZanr.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnOdabirZanr.setBounds(56, 228, 159, 33);
		frmDodavanjeKnjige.getContentPane().add(btnOdabirZanr);

		JButton btnSacuvaj = new JButton("Sačuvaj");
		btnSacuvaj.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSacuvaj.setBounds(82, 271, 107, 33);
		frmDodavanjeKnjige.getContentPane().add(btnSacuvaj);
	}
}