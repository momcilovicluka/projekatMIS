package guiFramework;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import klaseSaAtributima.Zanr;
import kontrolKlase.ZanrKontroler;

public class ZanrForma {

	private JFrame frmZanr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZanrForma window = new ZanrForma();
					window.frmZanr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					window.frmZanr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ZanrForma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		frmZanr = new JFrame();
		frmZanr.setResizable(false);
		frmZanr.setIconImage(
				Toolkit.getDefaultToolkit().getImage(ZanrForma.class.getResource("/guiFramework/book-stack.png")));
		frmZanr.setTitle("Pretraga žanra");
		frmZanr.setBounds(100, 100, 403, 300);
		frmZanr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZanr.getContentPane().setLayout(null);

		JLabel lblPretrazi = new JLabel("Pretraži:");
		lblPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPretrazi.setBounds(7, 12, 75, 18);
		frmZanr.getContentPane().add(lblPretrazi);

		JTextArea taUnos = new JTextArea();
		taUnos.setBounds(78, 13, 190, 22);
		frmZanr.getContentPane().add(taUnos);

		JButton btnPretrazi = new JButton("Pretraži");
		btnPretrazi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPretrazi.setBounds(275, 13, 104, 23);
		frmZanr.getContentPane().add(btnPretrazi);

		JButton btnDodajZanr = new JButton("Dodaj žanr");
		btnDodajZanr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NoviZanrForma();
				NoviZanrForma.main(null);
			}
		});
		btnDodajZanr.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnDodajZanr.setBounds(7, 231, 137, 23);
		frmZanr.getContentPane().add(btnDodajZanr);

		JButton btnIzaberiZanr = new JButton("Izaberi žanr");
		btnIzaberiZanr.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnIzaberiZanr.setBounds(242, 231, 137, 23);
		btnIzaberiZanr.setEnabled(false);
		frmZanr.getContentPane().add(btnIzaberiZanr);

		JList<Zanr> listZanr;
		DefaultListModel<Zanr> listModel = new DefaultListModel<Zanr>();
		try {
			listModel.addAll(ZanrKontroler.pronadjiZanr("").values());
		} catch (IllegalArgumentException | IOException e1) {
			e1.printStackTrace();
		}
		listZanr = new JList<Zanr>(listModel);
		listZanr.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listZanr.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listZanr.setVisibleRowCount(-1);
		listZanr.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (listZanr.getSelectedIndex() != -1)
					btnIzaberiZanr.setEnabled(true);
			}
		});
		listZanr.setBounds(7, 40, 372, 187);
		frmZanr.getContentPane().add(listZanr);

		btnIzaberiZanr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodavanjeKnjigeForma.zanr = (Zanr) listZanr.getSelectedValue();
				frmZanr.dispose();
			}
		});
	}

}
