import javax.swing.*;
import java.awt.*;

public class KomponenteCalco extends JPanel {
	
	public JButton ein, zwei, drei, vier, fuenf, sechs, sieben, acht, neun, nul, plus, minus, mal, gleich, div, delet, punkt, quadrat, sqr, clr;
	public JTextField menu;
	
	public KomponenteCalco() {
		super();
		this.konponenE();
		
	}
	
	public void konponenE() {
		this.setLayout(null);
		this.ButtonE();
		this.textFE();
		
	}
	
	public void ButtonE() {
		sieben = new JButton("7");
		sieben.setBounds(0, 50, 50, 50);
		this.add(sieben);
		
		vier = new JButton("4");
		vier.setBounds(0, 100, 50, 50);
		this.add(vier);
		
		ein = new JButton("1");
		ein.setBounds(0, 150, 50, 50);
		this.add(ein);
		
		nul = new JButton("0");
		nul.setBounds(0, 200, 50, 50);
		this.add(nul);
		
		acht = new JButton("8");
		acht.setBounds(50, 50, 50, 50);
		this.add(acht);
		
		fuenf = new JButton("5");
		fuenf.setBounds(50, 100, 50, 50);
		this.add(fuenf);
		
		zwei = new JButton("2");
		zwei.setBounds(50, 150, 50, 50);
		this.add(zwei);
		
		neun = new JButton("9");
		neun.setBounds(100, 50, 50, 50);
		this.add(neun);
		
		sechs = new JButton("6");
		sechs.setBounds(100, 100, 50, 50);
		this.add(sechs);
		
		drei = new JButton("3");
		drei.setBounds(100, 150, 50, 50);
		this.add(drei);
		
		gleich = new JButton("=");
		gleich.setBounds(50, 200, 70, 50);
		this.add(gleich);
		
		mal = new JButton("*");
		mal.setBounds(120, 200, 50, 50);
		this.add(mal);
		
		plus = new JButton("+");
		plus.setBounds(150, 50, 50, 50);
		this.add(plus);
		
		minus = new JButton("-");
		minus.setBounds(150, 100, 50, 50);
		this.add(minus);
		
		div = new JButton("/");
		div.setBounds(150, 150, 50, 50);
		this.add(div);
		
		delet = new JButton("<-");
		delet.setBounds(200, 50, 50, 50);
		this.add(delet);
		
		punkt = new JButton(".");
		punkt.setBounds(200, 100, 50, 50);
		this.add(punkt);
		
		quadrat = new JButton("x²");
		quadrat.setBounds(200, 150, 50, 50);
		this.add(quadrat);
		
		sqr = new JButton("sqrt");
		sqr.setBounds(170, 200, 80, 50);
		this.add(sqr);
		
		clr = new JButton("clean");
		clr.setBounds(150, 0, 100, 50);
		this.add(clr);
		
		
	
	}
	
	public void textFE() {
		menu = new JTextField("Bildschirm");
		menu.setBackground(Color.BLACK);
		menu.setForeground(Color.WHITE);
		menu.setFont(new Font("TimesRoman", Font.BOLD, 20));
		menu.setEditable(false);
		menu.setBounds(0, 0, 150, 50);
		this.add(menu);
	}
	
	
	
	

}
