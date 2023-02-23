import java.util.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.lang.String;
import javax.swing.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.LineNumberReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.*;
import java.io.*;
import java.awt.Toolkit.*;
import java.io.OutputStream;
import java.io.FileOutputStream;
import javax.swing.table.*;
import java.util.StringTokenizer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Password_OTP

{
public static void main(String[] args)
{
JFrame otppage=new JFrame("OTP");
Color theme=new Color(0,203,153);
JFrame page=new JFrame("OTP GENERATOR");
JFrame passpage=new JFrame("PASSWORD GENERATOR");
JPanel head=new JPanel();
head.setBounds(0,0,600,100);
JLabel heading=new JLabel("OTP AND PASSWORD GENERATOR");
heading.setFont(new Font("ROBOTO", Font.PLAIN, 24));
JButton b1,b2;
JTextField otp,pass;
JLabel t1,t2;
t1=new JLabel("Enter Length of password bet 5-15");
t1.setFont(new Font("ROBOTO", Font.PLAIN, 16));
t1.setBounds(70,150,250,50);
t2=new JLabel("Enter Length of OTP in bet 4-10");
t2.setFont(new Font("ROBOTO", Font.PLAIN, 16));
t2.setBounds(350,150,250,50);
b1=new JButton("GENERATE PASSWORD");
b1.setBounds(70,300,250,50);
b1.setFont(new java.awt.Font("Arial", Font.BOLD, 18));
b1.setBackground(theme);

b1.setForeground(Color.WHITE);
b2=new JButton("GENTERATE OTP");
b2.setBounds(400,300,250,50);
b2.setFont(new java.awt.Font("Arial", Font.BOLD, 18));
b2.setBackground(theme);
b2.setForeground(Color.WHITE);

Font font1= new Font("Arial", Font.BOLD, 18);
pass=new JTextField();
pass.setBounds(100,200,200,40);
pass.setFont(font1);
otp=new JTextField();
otp.setBounds(400,200,200,40);
otp.setFont(font1);
head.add(heading);
head.setBounds(0,0,800,100);
head.setBackground(theme);
page.setLayout(null);
page.setSize(800,500);
page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
page.setVisible(true);
page.add(head);
page.add(b1);
page.add(b2);

page.add(otp);
page.add(pass);
page.add(t1);
page.add(t2);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{

JLabel display1=new JLabel("Your password is:-");
JLabel output=new JLabel();
JPanel design1=new JPanel();

design1.setBounds(0,0,500,70);
design1.setBackground(theme);
design1.add(display1);
display1.setFont(new Font("ROBOTO", Font.PLAIN, 24));
display1.setBounds(70,150,250,50);
output.setFont(new Font("ROBOTO", Font.PLAIN, 24));
output.setBounds(200,170,250,50);
String passl;
passl=pass.getText();
//otpl=otp.getText();

int passi = Integer.parseInt(passl);
// int otpi=Integer.parseInt(otpl);
if (passi>5 && passi<15)
{
String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String Small_chars = "abcdefghijklmnopqrstuvwxyz";
String numbers = "0123456789";
String symbols = "!@#$%^&*_=+-/.?<>)";
String values = Capital_chars + Small_chars + numbers + symbols;
Random rndm_method = new Random();
char[] password = new char[passi];
for (int i = 0; i < passi; i++)
{
password[i] =values.charAt(rndm_method.nextInt(values.length()));
}
String passw=new String(password);
output.setText(passw);
passpage.setSize(500,300);
passpage.setLayout(null);
passpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
passpage.setVisible(true);
passpage.add(design1);
passpage.add(output);
}

}catch(Exception ev){System.out.println(ev);};

}
});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{

JLabel display2=new JLabel("Your OTP is:-");
JPanel design=new JPanel();

design.setBounds(0,0,500,70);
design.setBackground(theme);
design.setForeground(Color.WHITE);
JLabel output1=new JLabel();
display2.setFont(new Font("ROBOTO", Font.PLAIN, 24));
display2.setBounds(100,50,300,50);
output1.setFont(new Font("ROBOTO", Font.PLAIN, 24));
output1.setBounds(200,170,250,50);

design.add(display2);

String otpl;
// passl=pass.getText();
otpl=otp.getText();
// int passi = Integer.parseInt(passl);
int otpi=Integer.parseInt(otpl);
if (otpi>4 && otpi<10)
{
System.out.println("Generating OTP : ");
System.out.print("You OTP is : ");
String numbers = "0123456789";
Random rndm_method = new Random();
char[] otp = new char[otpi];
for (int i = 0; i < otpi; i++)
{
otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
}
String otpw=new String(otp);
output1.setText(otpw);
otppage.setSize(500,300);
otppage.setLayout(null);
otppage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
otppage.setVisible(true);
otppage.add(design);
otppage.add(output1);

}
}
catch(Exception em){System.out.println(em);};

}
});

}
}

/*
return password;
}*/
/*static char[] OTP(int len)
{

return otp;
}*/