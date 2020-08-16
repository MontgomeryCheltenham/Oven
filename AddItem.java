package oven;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddItem extends HotFoodMain {
		String txt1; int m, s;
		JPanel pnl1 = new JPanel(new GridBagLayout());
		JLabel lbl = new JLabel();
		JButton timerBtn = new JButton(); JButton btnD = new JButton("Del");
		JButton upBtn = new JButton("+"); JButton downBtn = new JButton("-");
		
	public AddItem(String letter){
		m=1; s=0;
		txt1 = textarea.getText() + letter;
		lbl.setText(txt1); timerBtn.setText(m + " : " + s);
		AddPanel1();
		btnD.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				pnl1.remove(lbl); pnl1.remove(timerBtn); pnl1.remove(btnD);
				pnl1.remove(upBtn); pnl1.remove(downBtn);
				pnl0.validate();
			}
		});
		upBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				m++;
				timerBtn.setText(m + " : " + s);
			}
		});
		downBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((m>1)||(m>0)&&(s>0)){ m--; timerBtn.setText(m + " : " + s); }
			}
		});
		timerBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Thread thread1 = new Thread(new Runnable(){
					public void run(){
						timerBtn.setText(m + " : " + s);
						timerBtn.setEnabled(false);
						CountdownStart();
					}
				});
				thread1.start();
			}
		});
		textarea.setText("");
	}
	public void AddPanel1(){
		gbc.gridheight = 2;
		gbc.gridx = 0; gbc.gridy = 0; pnl1.add(lbl, gbc); 
		gbc.gridx = 1; gbc.gridy = 0; pnl1.add(timerBtn, gbc); 
		gbc.gridx = 3; gbc.gridy = 0; pnl1.add(btnD, gbc);
		gbc.gridheight = 1;
		gbc.gridx = 2; gbc.gridy = 0; pnl1.add(upBtn, gbc); 
		gbc.gridx = 2; gbc.gridy = 1; pnl1.add(downBtn, gbc);  
		pnl0.add(pnl1);
	}
	public void CountdownStart(){
		while((m>0)){
			if(s==0){
				m=m-1;
				for(int i = 9; i>=0; i--){
					processCommand();
					s = i;
					timerBtn.setText(m + " : " + s);
				}
			}
		}
		timerBtn.setEnabled(true);
		timerBtn.setText("ready!");
		m=1;
	}
	private void processCommand() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
