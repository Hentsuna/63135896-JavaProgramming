import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setFont(new Font("Arial", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(26, 34, 62, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNhpB.setBounds(26, 80, 62, 35);
		contentPane.add(lblNhpB);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Arial", Font.PLAIN, 16));
		txtA.setBounds(98, 34, 164, 29);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Arial", Font.PLAIN, 16));
		txtB.setBounds(98, 80, 164, 29);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Phương thức cộng
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCong.setBounds(26, 126, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Phương thức trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Arial", Font.PLAIN, 16));
		btnTru.setBounds(125, 126, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Phương thức nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNhan.setBounds(224, 126, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Phương thức chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Arial", Font.PLAIN, 16));
		btnChia.setBounds(325, 126, 89, 23);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Arial", Font.PLAIN, 16));
		lblKtQu.setBounds(26, 175, 62, 35);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Arial", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(98, 175, 164, 29);
		contentPane.add(txtKetQua);
	}
	
	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		//Chuyển đổi kiểu
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		//Tính toán
		double ketqua = soA+soB;
		//Đưa ra kết quả
		txtKetQua.setText(String.valueOf(ketqua));
	}
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		//Chuyển đổi kiểu
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		//Tính toán
		double ketqua = soA-soB;
		//Đưa ra kết quả
		txtKetQua.setText(String.valueOf(ketqua));
	}
	void HamXuLyNhan() {
		//Lấy dữ liệu từ điều khiển
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		//Chuyển đổi kiểu
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		//Tính toán
		double ketqua = soA*soB;
		//Đưa ra kết quả
		txtKetQua.setText(String.valueOf(ketqua));
	}
	void HamXuLyChia() {
		//Lấy dữ liệu từ điều khiển
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		//Chuyển đổi kiểu
		double soA = Double.parseDouble(str_A);
		double soB = Double.parseDouble(str_B);
		//Tính toán
		double ketqua;
		if(soB == 0) {
			txtKetQua.setText("B khác 0");
		}
		else {
			ketqua = soA/soB;
			txtKetQua.setText(String.valueOf(ketqua));
		}
	}
}
