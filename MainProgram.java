import javax.swing.*; 
impot java.awt.*;
class LoginForm
{
JLabel l1,l2;
JTextField t1;
JPasswordField pf1;
JButton b1,b2;
JPanel p1;
JFrame f1;
GridLayout gl;
void display()
{
l1=new JLabel("Username");
l1=new JLabel("Password");
t1=new JtextField(20);
pf1=new JPasswordField(20);
b1=new JButton("Login");
b2=new JButton("Reset");
p1=new JPanel();
f1=new JFrame();
gl=new GridLayout(0,2);
f1.getContentPanel().add(p1)
p1.setLayout(gl);
p1.add(l1);
p2.add(t1);
p1.add(l2);
p1.add(t2);
p1.add(b1);
p1.add(b2);
f1.setSize(400,400);
f1.setVisible(true);
}
	}
class MainProgram
{
public static void main(String arg[])
{
LoginForm pr1=new LoginForm();
pr1.display();
}
}
