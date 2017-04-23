import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Glassex
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		final JPanel p1=new JPanel();
		p1.add(new JLabel("java,vb,c++"));
		p1.add(new JButton("java"));
		p1.add(new JButton("c++"));
		final JPanel glass=(JPanel)f.getGlassPane();
		glass.setVisible(true);
		glass.setLayout(new GridBagLayout());
		JButton b=new JButton("start");
		glass.add(b);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				glass.setVisible(false);
				p1.repaint();
			}
		});
		f.add(p1);
		f.setSize(150,80);
		f.setVisible(true);
	}
}