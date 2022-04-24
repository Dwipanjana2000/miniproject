package registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class registration {

	private JFrame frame;
	private JTextField txtDjnc;
	private JTextField txtCdk;
	private JTextField txtCkdCk;
	private JTable table;
	/**
	 * @wbp.nonvisual location=781,484
	 */
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 944, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel txtname = new JLabel("memeber Name");
		txtname.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtname.setBounds(93, 117, 138, 35);
		frame.getContentPane().add(txtname);
		
		JLabel txtid = new JLabel("memeber Id");
		txtid.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtid.setBounds(93, 173, 101, 35);
		frame.getContentPane().add(txtid);
		
		JLabel txtrole = new JLabel("Role");
		txtrole.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrole.setBounds(93, 244, 101, 35);
		frame.getContentPane().add(txtrole);
		
		txtDjnc = new JTextField();
		txtDjnc.setBounds(294, 119, 186, 35);
		frame.getContentPane().add(txtDjnc);
		txtDjnc.setColumns(10);
		
		txtCdk = new JTextField();
		txtCdk.setColumns(10);
		txtCdk.setBounds(294, 184, 186, 35);
		frame.getContentPane().add(txtCdk);
		
		txtCkdCk = new JTextField();
		txtCkdCk.setColumns(10);
		txtCkdCk.setBounds(294, 244, 186, 35);
		frame.getContentPane().add(txtCkdCk);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtname.setText("");
				txtid.setText("");
				txtrole.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(177, 333, 131, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add More");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel model=( DefaultTableModel) table.getModel();
				 
			model.addRow(new Object[] {
				txtname.getText(),
				txtid.getText(),
				txtrole.getText(),
			});
			if(table.getSelectedRow()==-1){
			if(table.getSelectedRowCount()==0) {
				JOptionPane.showMessageDialog(null,"record added successfully","registration",JOptionPane.OK_OPTION );
			}
		}
			}
															});
				
			
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(332, 333, 134, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Role Assignment");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(313, 23, 298, 56);
		frame.getContentPane().add(lblNewLabel_2);
		
		table = new JTable();
		table.setToolTipText("");
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBackground(Color.CYAN);
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Member Id", "Mmember name", "Role"},
			},
			new String[] {
				"", "Member name", ""
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.getColumnModel().getColumn(2).setPreferredWidth(78);
		table.setBounds(502, 49, 418, 272);
		frame.getContentPane().add(table);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame=new JFrame();
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","registration",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(24, 331, 131, 47);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				try {
					table.print();
				}catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found",e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrint.setBounds(490, 333, 131, 47);
		frame.getContentPane().add(btnPrint);
	}
}
