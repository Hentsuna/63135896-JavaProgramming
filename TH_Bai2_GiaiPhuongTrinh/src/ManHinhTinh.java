import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;
	/**
	 * Create the frame.
	 */
	public ManHinhTinh() {
		setTitle("Giải phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(40, 34, 73, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(40, 81, 73, 36);
		contentPane.add(lblNhpB);
		
		txtA = new JTextField();
		txtA.setBounds(123, 34, 201, 36);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(123, 81, 201, 36);
		contentPane.add(txtB);
		
		JLabel lblNewLabel_1 = new JLabel("Phương trình có dạng: ax^2+bx+c=0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(86, 175, 315, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpC.setBounds(40, 128, 73, 36);
		contentPane.add(lblNhpC);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(123, 128, 201, 36);
		contentPane.add(txtC);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(40, 295, 73, 36);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(123, 295, 201, 36);
		contentPane.add(txtKQ);
		
		JButton btnTinh = new JButton("Tính toán");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyTinhToan();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(141, 226, 131, 36);
		contentPane.add(btnTinh);
	}
	
	void XuLyTinhToan() {
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		String str_C = txtC.getText();
		//Đổi kiểu
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		double soC = Double.parseDouble(str_C);
		String ketqua;
		//Tính
		if(soA == 0) {
			if(soB == 0) {
				if(soC == 0) {
					ketqua = "Phương trình vô số nghiệm";
				}else {
					ketqua = "Phương trình vô nghiệm";
				}
			}else {
				ketqua = String.valueOf(-soC / soB);
			}
		}else {
			double delta = soB * soB - 4 * soA * soC;
			if(delta < 0) ketqua = "Phương trình vô nghiệm";
			else if(delta == 0) ketqua = String.valueOf(-soB / (2 * soA));
			else {
				ketqua ="x1:" + String.valueOf((-soB + Math.sqrt(delta))/(2 * soA)) + " ,x2:" + String.valueOf((-soB - Math.sqrt(delta))/(2 * soA));
			}
		}
		txtKQ.setText(ketqua);
	}
}
