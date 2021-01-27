package doviz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DovizView extends JFrame{
	
	JTextField cevirilmekIstenenGir;
	JLabel cevirilmekIstenenLabel, cevirilecekLabel,miktarLabel,sonucLabel;
	JComboBox comboCevirilecek, comboCevirilmekIstenen;
	JPanel midPanel;
	JPanel bottomPanel;
	JButton cevirBtn;
	JPanel panelmidTop;
	JTextArea sonucText;
	DovizView()
	{
		super("Doviz Programi");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container mainPanel = this.getContentPane();
		
		
		
		cevirilmekIstenenLabel = new JLabel ("Çevirmek istediginiz birim:");
		
		
		cevirilmekIstenenGir = new JTextField(6);
		
		String[] cevirilmekIstenenTurler = {"Turk Lirasi","ABD Dolari", "Euro","Ingiliz Sterlini","Kanada Dolari","Isvicre Frangi","100 Japon Yeni"};
		comboCevirilecek = new JComboBox(cevirilmekIstenenTurler);
		
		miktarLabel = new JLabel("Miktar giriniz:         ");
		
		cevirilmekIstenenGir.setFont(new Font("SansSerif", Font.BOLD, 15));
		cevirilmekIstenenGir.setText("0");
		
		
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEADING,19,16));
		mainPanel.add(cevirilmekIstenenLabel);
		mainPanel.add(comboCevirilecek);
		
		panelmidTop = new JPanel();
		panelmidTop.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
		panelmidTop.setPreferredSize(new Dimension(400,30));
		panelmidTop.add(miktarLabel);
		panelmidTop.add(cevirilmekIstenenGir);
		
		
		midPanel = new JPanel();
		midPanel.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
		midPanel.setPreferredSize(new Dimension(400,30));

		
		cevirilecekLabel = new JLabel("Cevirilecek birim:     ");
		
		comboCevirilmekIstenen = new JComboBox(cevirilmekIstenenTurler);
		
		sonucLabel= new JLabel("Çeviri Sonucu  =     ");
		
		
		
		
		
		
		midPanel.add(cevirilecekLabel);
		midPanel.add(comboCevirilmekIstenen);
		
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
		bottomPanel.setPreferredSize(new Dimension(400,40));
		
		
		//cevirBtn = new JButton("Çevir");
		//cevirBtn.setPreferredSize(new Dimension(105,30));
		sonucText = new JTextArea();
		sonucText.setEditable(false);
		sonucText.setPreferredSize(new Dimension(105,25));
		sonucText.setFont(new Font("SansSerif", Font.BOLD, 18));

		//bottomPanel.add(cevirBtn);
		bottomPanel.add(sonucLabel);
		bottomPanel.add(sonucText);
		

		mainPanel.add(panelmidTop);
		mainPanel.add(midPanel);
		mainPanel.add(bottomPanel);

		
		
		this.setSize(400, 250);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
	}
	
	public void cevirComboListener(ActionListener e)
	{
		//cevirBtn.addActionListener(e);
		
		comboCevirilmekIstenen.addActionListener(e);
		
	}

}
