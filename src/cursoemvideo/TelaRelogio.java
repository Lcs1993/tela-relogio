/*
 * Created by JFormDesigner on Tue Jul 20 08:46:17 BRT 2021
 */

package cursoemvideo;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author lucas
 */
public class TelaRelogio extends JFrame {
	public TelaRelogio() {
		initComponents();
	}

	private void btnCliqueActionPerformed(ActionEvent e) {
		Date d = new Date();
		lblHora.setText(d.toString());
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - lucas
		label1 = new JLabel();
		label2 = new JLabel();
		lblHora = new JLabel();
		btnClique = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText(".");
		label1.setIcon(new ImageIcon(getClass().getResource("/imagens/663353.png")));
		contentPane.add(label1, "cell 1 1");

		//---- label2 ----
		label2.setText("data e hora atuais");
		label2.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(label2, "cell 1 2 3 1");

		//---- lblHora ----
		lblHora.setText("clique no bot\u00e3o");
		lblHora.setForeground(Color.gray);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblHora, "cell 1 3");

		//---- btnClique ----
		btnClique.setText("Clique Aqui");
		btnClique.addActionListener(e -> btnCliqueActionPerformed(e));
		contentPane.add(btnClique, "cell 1 4");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - lucas
	private JLabel label1;
	private JLabel label2;
	private JLabel lblHora;
	private JButton btnClique;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	public static void main(String[] args ) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 TelaRelogio GUI = new TelaRelogio();
                 GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 GUI.setVisible(true);
            }
        });
	}
}
