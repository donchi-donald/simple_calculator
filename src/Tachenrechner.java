import javax.swing.*;


@SuppressWarnings("serial")
public class Tachenrechner extends JFrame {
	public KomponenteCalco pan;
	private String text="";
	private double op1=0;
	private double op2=0;
	private double result=0;
	 
	private char sign;
	
	private boolean isOPdran=false;
	
	public Tachenrechner() {
		pan = new KomponenteCalco();
		//Title der Fenster
		this.setTitle("Calco");
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);
		//Fenstergrösse
		this.setSize(250, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.deaktierenalleB(pan, false);
		
		pan.ein.addActionListener((e)->
		{
			text = text + "1";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
		});
		pan.zwei.addActionListener((e)->
		{
			text = text + "2";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
			
			
		});
		pan.drei.addActionListener((e)->
		{
			text = text + "3";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
		});
		pan.vier.addActionListener((e)->
		{
			text = text + "4";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
		});
		pan.fuenf.addActionListener((e)->
		{
			text = text + "5";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
		});
		pan.sechs.addActionListener((e)->
		{
			text = text + "6";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
		});
		pan.sieben.addActionListener((e)->
		{
			text = text + "7";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
			
		});
		pan.acht.addActionListener((e)->
		{
			text = text + "8";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
		});
		pan.neun.addActionListener((e)->
		{
			text = text + "9";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
		});
		pan.nul.addActionListener((e)->
		{
			text = text + "0";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, true);
		});
		pan.plus.addActionListener((e)->
		{
				op1 = op1Organisator(pan, isOPdran, sign, op1);
				sign = '+';
				
				pan.menu.setText("");
				text="";
				this.deaktierenalleB(pan, false);
				isOPdran = true;
			
			
		});
		pan.minus.addActionListener((e)->
		{
			op1 = op1Organisator(pan, isOPdran, sign, op1);
			sign = '-';

			pan.menu.setText("");
			text="";
			this.deaktierenalleB(pan, false);
			isOPdran = true;
			
		});
		pan.mal.addActionListener((e)->
		{
			op1 = op1Organisator(pan, isOPdran, sign, op1);
			sign = '*';

			pan.menu.setText("");
			text="";
			this.deaktierenalleB(pan, false);
			isOPdran = true;
			
		});
		pan.div.addActionListener((e)->
		{
			op1 = op1Organisator(pan, isOPdran, sign, op1);
			sign = '/';
			pan.menu.setText("");
			text="";
			this.deaktierenalleB(pan, false);
			isOPdran = true;
		});
		pan.gleich.addActionListener((e)->
		{
			op2 = Double.valueOf(pan.menu.getText());
			pan.menu.setText(""+arrondi(this.doOperation(op1, op2, sign)));
			
			result = 0;
			op1 =0;
			op2=0;
			text ="";
			isOPdran = false;
		});
		pan.delet.addActionListener((e)->{
			if(text.length()!=0) {
				text = text.substring(0, text.length()-1);
				pan.menu.setText(text);
				if(text.length()==0) {
					this.deaktierenalleB(pan, false);
					pan.menu.setText("0");
				}
			}
		});
		pan.punkt.addActionListener((e)->{
			
			text = Double.valueOf(pan.menu.getText()).intValue()+".";
			pan.menu.setText(text);
			this.deaktierenalleB(pan, false);
		});
		pan.quadrat.addActionListener((e)->{
			double value = Double.valueOf(pan.menu.getText());
			pan.menu.setText(""+arrondi(Math.pow(value, 2)));
		});
		pan.sqr.addActionListener((e)->{
			double value = Double.valueOf(pan.menu.getText());
			pan.menu.setText(""+arrondi(Math.sqrt(value)));
		});
		pan.clr.addActionListener((e)->{
			op1=0;
			op2=0;
			text="";
			result=0;
			pan.menu.setText("0");
			this.deaktierenalleB(pan, false);
		});
		
		
		
		this.setContentPane(pan);
		this.setVisible(true);
	}
	@SuppressWarnings("unused")

	
	public double doOperation(double op1,  double op2, char sign) {
		double result=0;
		switch(sign) {
			case '+':{
				op2 = Double.valueOf(pan.menu.getText());
				result = op1+op2;
				break;
			}
			case '-':{
				op2 = Double.valueOf(pan.menu.getText());
				result = op1-op2;
				break;
			}
			case '/':{
				op2 = Double.valueOf(pan.menu.getText());
				result = op1/op2;
				break;
			}
			case '*':{
				op2 = Double.valueOf(pan.menu.getText());
				result = op1*op2;
				break;
			}
			default:{
				break;
			}
		}
		return result;
	}
	
	public double op1Organisator(KomponenteCalco pan, boolean isOPdran, char sign, double op1) {
		
		if(isOPdran) {
			double op2 = Double.valueOf(pan.menu.getText());
			return doOperation(op1, op2, sign);
		}
		else {
			return Double.valueOf(pan.menu.getText());
		}
		
		
	}
	public void deaktierenalleB(KomponenteCalco pan, boolean b) {
		pan.plus.setEnabled(b);
		pan.minus.setEnabled(b);
		pan.mal.setEnabled(b);
		pan.div.setEnabled(b);
		pan.gleich.setEnabled(b);
		pan.punkt.setEnabled(b);
		pan.quadrat.setEnabled(b);
		pan.sqr.setEnabled(b);
		
	}
	
	public double arrondi(double nbr) {
		return (double)((int)((nbr*100)+0.5))/100;
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			new Tachenrechner();
		});
	}

}
