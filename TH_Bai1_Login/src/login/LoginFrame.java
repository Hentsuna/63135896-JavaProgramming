package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTen;
	private JPasswordField txtMatKhau;
	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Đăng nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 36, 117, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(44, 82, 117, 35);
		contentPane.add(lblMtKhu);
		
		txtTen = new JTextField();
		txtTen.setBounds(171, 36, 222, 35);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMatKhau.setBounds(171, 82, 222, 35);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(138, 154, 132, 35);
		contentPane.add(btnDangNhap);
	}
	
	void XuLyDangNhap() {
		//Lấy tên đăng nhập và mật khẩu
		String strTen = txtTen.getText();
		String strMK = txtMatKhau.getText();
		//Xử lý
		if(strTen.equals("63CNTT") && strMK.equals("123")) {
			//Hiện MainFrame
			MainFrame TrangChu = new MainFrame();
			TrangChu.setVisible(true);
			//Ẩn trang Login
			this.setVisible(false);
		}else {
			//Báo lỗi
			txtTen.setText("");
			txtMatKhau.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
