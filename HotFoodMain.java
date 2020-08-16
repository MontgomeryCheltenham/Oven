package oven;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class HotFoodMain {
	static JFrame frm = new JFrame();
	GridBagConstraints gbc = new GridBagConstraints();
	static JPanel pnl = new JPanel(new GridBagLayout());
	static JPanel pnl0 = new JPanel(); static JScrollPane scr = new JScrollPane(pnl0);
	JButton t = new JButton("toastee"); JButton f = new JButton("focaccia");
	JButton p = new JButton("pizza"); JButton ch = new JButton("chicken");
	JButton b1 = new JButton("1"); JButton b2 = new JButton("2"); JButton b3 = new JButton("3");
	JButton b4 = new JButton("4"); JButton b5 = new JButton("5"); JButton b6 = new JButton("6");
	JButton b7 = new JButton("7"); JButton b8 = new JButton("8"); JButton b9 = new JButton("9");
	JButton b0 = new JButton("0"); 
	JButton cxl = new JButton("C"); JButton del = new JButton("<"); JButton x2 = new JButton("x2");
	JButton ba = new JButton("A"); JButton bb = new JButton("B"); JButton bc = new JButton("C");
	JButton bd = new JButton("D"); JButton be = new JButton("E"); JButton bf = new JButton("F");
	static JTextArea textarea = new JTextArea();
	
	public static void main(String[] args) {
		new HotFoodMain();
	}
	public HotFoodMain(){
		frm.setSize(600, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		scr.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scr.setPreferredSize(new Dimension(240, 300));
		pnl0.setPreferredSize(new Dimension(220, 1000));
		//pnl0.setLayout(new BoxLayout(pnl0, BoxLayout.Y_AXIS));
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridheight = 2;
		gbc.gridx = 0; gbc.gridy = 0; pnl.add(t, gbc);
		gbc.gridx = 0; gbc.gridy = 2; pnl.add(p, gbc);
		gbc.gridx = 1; gbc.gridy = 0; pnl.add(f, gbc);
		gbc.gridx = 1; gbc.gridy = 2; pnl.add(ch, gbc);
		gbc.gridheight = 1;
		gbc.gridx = 1; gbc.gridy = 5; pnl.add(textarea, gbc);
		gbc.gridx = 2; gbc.gridy = 0; pnl.add(b1, gbc);
		gbc.gridx = 3; gbc.gridy = 0; pnl.add(b2, gbc);
		gbc.gridx = 4; gbc.gridy = 0; pnl.add(b3, gbc);
		gbc.gridx = 2; gbc.gridy = 1; pnl.add(b4, gbc);
		gbc.gridx = 3; gbc.gridy = 1; pnl.add(b5, gbc);
		gbc.gridx = 4; gbc.gridy = 1; pnl.add(b6, gbc);
		gbc.gridx = 2; gbc.gridy = 2; pnl.add(b7, gbc);
		gbc.gridx = 3; gbc.gridy = 2; pnl.add(b8, gbc);
		gbc.gridx = 4; gbc.gridy = 2; pnl.add(b9, gbc);
		gbc.gridx = 2; gbc.gridy = 3; pnl.add(del, gbc);
		gbc.gridx = 3; gbc.gridy = 3; pnl.add(b0, gbc);
		gbc.gridx = 4; gbc.gridy = 3; pnl.add(x2, gbc);
		gbc.gridx = 5; gbc.gridy = 0; pnl.add(ba, gbc);
		gbc.gridx = 5; gbc.gridy = 1; pnl.add(bb, gbc);
		gbc.gridx = 5; gbc.gridy = 2; pnl.add(bc, gbc);
		gbc.gridx = 5; gbc.gridy = 3; pnl.add(bd, gbc);
		gbc.gridx = 5; gbc.gridy = 4; pnl.add(be, gbc);
		gbc.gridx = 5; gbc.gridy = 5; pnl.add(bf, gbc);
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridheight = 200; gbc.gridx = 6; gbc.gridy = 0; pnl.add(scr, gbc);
		frm.add(pnl); 
		frm.pack();
		frm.setVisible(true);
		
		t.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.equals(""))||(txt.endsWith("\n"))){
					textarea.append("toastie ");
				}else{ /*do nothing*/ }
			}
		});
		f.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.equals(""))||(txt.endsWith("\n"))){
					textarea.append("focaccia ");
				}else{ /*do nothing*/ }
			}
		});
		p.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.equals(""))||(txt.endsWith("\n"))){
					textarea.append("pizza ");
				}else{ /*do nothing*/ }
			}
		});
		ch.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.equals(""))||(txt.endsWith("\n"))){
					textarea.append("chicken ");
				}else{ /*do nothing*/ }
			}
		});
		b1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))||(txt.endsWith(" 3"))){
					textarea.append("1");
				}else{ /*do nothing*/ }
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))){
					textarea.append("2");
				}else{ /*do nothing*/ }
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))){
					textarea.append("3");
				}else{ /*do nothing*/ }
			}
		});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))){
					textarea.append("4");
				}else{ /*do nothing*/ }
			}
		});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))){
					textarea.append("5");
				}else{ /*do nothing*/ }
			}
		});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))){
					textarea.append("6");
				}else{ /*do nothing*/ }
			}
		});
		b7.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))){
					textarea.append("7");
				}else{ /*do nothing*/ }
			}
		});
		b8.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))){
					textarea.append("8");
				}else{ /*do nothing*/ }
			}
		});
		b9.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("toastie "))||(txt.endsWith("focaccia "))||(txt.endsWith("pizza "))||
						(txt.endsWith("chicken "))||(txt.endsWith(" 1"))||(txt.endsWith(" 2"))){
					textarea.append("9");
				}else{ /*do nothing*/ }
			}
		});
		b0.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith(" 1"))||(txt.endsWith(" 2"))||(txt.endsWith(" 3"))){
					textarea.append("0");
				}else{ /*do nothing*/ }
			}
		});
		ba.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("1"))||(txt.endsWith("2"))||(txt.endsWith("3"))||(txt.endsWith("4"))
						||(txt.endsWith("5"))||(txt.endsWith("6"))||(txt.endsWith("7"))
						||(txt.endsWith("8"))||(txt.endsWith("9"))||(txt.endsWith("0"))){
					new AddItem("A");
				}else{ /*do nothing*/ }
			}
		});
		bb.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("1"))||(txt.endsWith("2"))||(txt.endsWith("3"))||(txt.endsWith("4"))
						||(txt.endsWith("5"))||(txt.endsWith("6"))||(txt.endsWith("7"))
						||(txt.endsWith("8"))||(txt.endsWith("9"))||(txt.endsWith("0"))){
					new AddItem("B");
				}else{ /*do nothing*/ }
			}
		});
		bc.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("1"))||(txt.endsWith("2"))||(txt.endsWith("3"))||(txt.endsWith("4"))
						||(txt.endsWith("5"))||(txt.endsWith("6"))||(txt.endsWith("7"))
						||(txt.endsWith("8"))||(txt.endsWith("9"))||(txt.endsWith("0"))){
					new AddItem("C");
				}else{ /*do nothing*/ }
			}
		});
		bd.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("1"))||(txt.endsWith("2"))||(txt.endsWith("3"))||(txt.endsWith("4"))
						||(txt.endsWith("5"))||(txt.endsWith("6"))||(txt.endsWith("7"))
						||(txt.endsWith("8"))||(txt.endsWith("9"))||(txt.endsWith("0"))){
					new AddItem("D");
				}else{ /*do nothing*/ }
			}
		});
		be.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("1"))||(txt.endsWith("2"))||(txt.endsWith("3"))||(txt.endsWith("4"))
						||(txt.endsWith("5"))||(txt.endsWith("6"))||(txt.endsWith("7"))
						||(txt.endsWith("8"))||(txt.endsWith("9"))||(txt.endsWith("0"))){
					new AddItem("E");
				}else{ /*do nothing*/ }
			}
		});
		bf.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("1"))||(txt.endsWith("2"))||(txt.endsWith("3"))||(txt.endsWith("4"))
						||(txt.endsWith("5"))||(txt.endsWith("6"))||(txt.endsWith("7"))
						||(txt.endsWith("8"))||(txt.endsWith("9"))||(txt.endsWith("0"))){
					new AddItem("F");
				}else{ /*do nothing*/ }
			}
		});
		/*cxl.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if(txt.contains("\n")){
					int line = txt.lastIndexOf("\n");
					textarea.setText(txt.substring(0, line));
				}else{
					textarea.setText("");
				}
			}
		});*/
		del.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				String txt = textarea.getText();
				if((txt.endsWith("\n"))||(txt.endsWith("1"))||(txt.endsWith("2"))||
						(txt.endsWith("3"))||(txt.endsWith("4"))||(txt.endsWith("5"))||
						(txt.endsWith("6"))||(txt.endsWith("7"))||(txt.endsWith("8"))||
						(txt.endsWith("9"))||(txt.endsWith("0"))
						||(txt.endsWith("A"))||(txt.endsWith("B"))||(txt.endsWith("C"))
						||(txt.endsWith("D"))||(txt.endsWith("E"))||(txt.endsWith("F"))){
					textarea.setText(txt.substring(0, (txt.length()-1)));
				}else if(txt.endsWith(" ")){
					if(txt.contains("\n")){
						int line = txt.lastIndexOf("\n");
						textarea.setText(txt.substring(0, line));
					}else{
						textarea.setText("");
					}
				}
			}
		});
		x2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				System.out.println("under construction");
			}
		});
		
		
	}
}
