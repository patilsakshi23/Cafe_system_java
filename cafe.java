
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.charset.CharacterCodingException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

public class cafe implements ActionListener
{
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b19,b18,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,b82,b83;
    JLabel l00,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,l53,l54,l55,l56,l57,l58,l59,l60,l61,l62,l63,l64,l65,l66,l67,l68,l69,l70,l71,l72,l73,l74,l75,l76,l77,l78,l79,l80,l81,l82,l83,l84,l85,l86,l87,l88,l89,l90,l91,l92,l93,l94,l95,l96,l97,l98,l99,l100,l101,l102,l103,l104,l105,l106,l107,l108,l109,l110,l111,l112,l113,l114,l115,l116,l117,l118,l119,l120,l121,l122,l123,l124,l125,l126,l127,l128,l129,l130,l131,l132,l133,l134,l135,l137,l138,l139,l140,l141,l142,l143,l144,l145,l146,l147,l148;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf22,tf23,tf24,tf25,tf26,tf27;
    JTextArea ta;
    JTable jt;
    DefaultTableModel model;
    JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p26,p27,p28,p29,p30,p31,p32,p33,p34,p35,p36,p37,p38;

    cafe()
    {
    JFrame f = new JFrame("CafeProject");
    f.setSize(1005,600);
    f.setLayout(null);
    f.setResizable(false);
    //panel 1
     JPanel p1 = new JPanel();
     p1.setBounds(0,0,200,570);
     p1.setBackground(new Color(51,51,51));
     p1.setLayout(null);
     b1= new JButton("Home");
     b1.setBounds(25,180,150,25);
     b1.setBackground (new Color(51,51,51));
     b1.setBorder(BorderFactory.createLineBorder(new Color(51,51,51)));
     b1.setForeground(Color.WHITE);
     b1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            b1.setBackground(Color.darkGray);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            b1.setBackground(new Color(51,51,51));
        }
    });
     b2= new JButton("Menu");
     b2.setBounds(25,220,150,25);
     b2.setBackground(new Color(51,51,51));
     b2.setBorder(BorderFactory.createLineBorder(new Color(51,51,51)));
     b2.setForeground(Color.WHITE);
     b2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            b2.setBackground(Color.darkGray);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            b2.setBackground(new Color(51,51,51));
        }
    });
     b3= new JButton("Cart");
     b3.setBounds(25,260,150,25);
     b3.setBackground(new Color(51,51,51));
     b3.setBorder(BorderFactory.createLineBorder(new Color(51,51,51)));
     b3.setForeground(Color.WHITE);
     b3.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            b3.setBackground(Color.darkGray);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            b3.setBackground(new Color(51,51,51));
        }
    });
     b4= new JButton("Order");
     b4.setBounds(25,300,150,25);
     b4.setBackground(new Color(51,51,51));
     b4.setBorder(BorderFactory.createLineBorder(new Color(51,51,51)));
     b4.setForeground(Color.WHITE);
     b4.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            b4.setBackground(Color.darkGray);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            b4.setBackground(new Color(51,51,51));
        }
    });
     b5= new JButton("Help");
     b5.setBounds(25,340,150,25);
     b5.setBackground(new Color(51,51,51));
     b5.setBorder(BorderFactory.createLineBorder(new Color(51,51,51)));
     b5.setForeground(Color.WHITE);
     b5.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            b5.setBackground(Color.darkGray);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            b5.setBackground(new Color(51,51,51));
        }
    });

     p1.add(b1); p1.add(b2); p1.add(b3); p1.add(b4); p1.add(b5); 
     p1.setVisible(true);
     f.add(p1);

//HOME PAGE
     //panel 2 
     p2 = new JPanel();
     p2.setBounds(200,75,800,495);
     p2.setLayout(null);
    l1 = new JLabel("",new ImageIcon("./res/back1.png"),SwingConstants.CENTER);
    l1.setBounds(0,0,800,495);
    p2.add(l1); 
     f.add(p2);

     //panel 3
     p3=new JPanel();
     p3.setLayout(null);
     p3.setBounds(0,0,1000,15);
     p3.setBackground(new Color(176,23,31));
     f.add(p3);

     //panel 4
     p4=new JPanel();
     p4.setLayout(null);
     p4.setBounds(0,15,1000,60);    
    l9 = new JLabel("Cafe Blue");
    l9.setFont(new Font("Serif",Font.TRUETYPE_FONT,25));
    l9.setBounds(520,15,150,32);
    l9.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            l9.setForeground(Color.blue);
        }
        @Override
        public void mouseExited(MouseEvent e) {
             l9.setForeground(Color.black);
        }
    });
    
    Icon i5 = new ImageIcon("./res/down.png");
     b11= new JButton("",i5);
     b11.setBounds(930,0,60,60);
     b11.setBorder(BorderFactory.createLineBorder(Color.lightGray));
     b11.setToolTipText("Shut Down");
     b11.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae)
         {
         if(ae.getSource()== b11)
         {
            System.exit(0);
         }
        }
     });

     Icon i6 = new ImageIcon("./res/user3.jpg");
     b28= new JButton("",i6);
     b28.setBounds(868,0,60,60);
     b28.setBackground(Color.white);
     b28.setBorder(BorderFactory.createLineBorder(Color.lightGray));
     b28.setToolTipText("User Details");
     b28.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
        if(ae.getSource()== b28)
        {
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);
            p9.setVisible(false); ; p10.setVisible(false); p12.setVisible(false); p26.setVisible(false);
            p27.setVisible(false);  p5.setVisible(false);  p28.setVisible(false);
            p11.setVisible(false); p36.setVisible(true);
        }
       }
    });


     p4.add(l9);
    p4.add(b11); 
     p4.add(b28);
     f.add(p4);


//user details page 

     p36 = new JPanel();
     p36.setLayout(null);
     p36.setBounds(200,75,800,495);
     p36.setBackground(Color.white);

    l128 = new JLabel("*User Details*");
    l128.setBounds(130,20,190,40);
    l128.setFont(new Font("Serif",Font.BOLD,30));

    l129 = new JLabel("Name           : ");
    l129.setBounds(50,100,100,20);
    l129.setFont(new Font("Serif",Font.BOLD,15));
    l130 = new JLabel("Mobile No.   : ");
    l130.setBounds(50,150,100,20);
    l130.setFont(new Font("Serif",Font.BOLD,15));
    l131 = new JLabel("City               : ");
    l131.setBounds(50,200,100,20);
    l131.setFont(new Font("Serif",Font.BOLD,15));
    l132 = new JLabel("Pincode        : ");
    l132.setBounds(50,250,100,20);
    l132.setFont(new Font("Serif",Font.BOLD,15));
    l133 = new JLabel("Address        : ");
    l133.setBounds(50,300,100,20);
    l133.setFont(new Font("Serif",Font.BOLD,15));
    

    tf23= new JTextField();
    tf23.setBounds(170,100,150,25);
    tf23.addKeyListener(new KeyListener()
    {
        public void keyTyped(KeyEvent ae )
        { 
          char c = ae.getKeyChar(); 
         if(!(Character.isAlphabetic(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_SPACE))
            { 
             tf23.setEditable(false); 
            }
            else 
            { 
             tf23.setEditable(true);
            }    
        }
        public void keyReleased(KeyEvent ae){}
        public void keyPressed(KeyEvent ae){} 
      
    });
    
    tf24 = new JTextField();
    tf24.setBounds(170,150,150,25);

    tf24.addKeyListener(new KeyAdapter(){
    public void keyTyped(KeyEvent ae )
    { 
       
     if(tf24.getText().length() <= 9 || (ae.getKeyChar() == KeyEvent.VK_BACK_SPACE))
        { 
         tf24.setForeground(Color.black); 
        }
        else 
        { 
            JOptionPane.showMessageDialog(f, "Sorry, Mobile No. contains only 10 digits");
            tf24.setForeground(Color.red);
        }
         if(ae.getKeyChar() == KeyEvent.VK_BACK_SPACE) 
         {      
            tf24.setForeground(Color.black);
            
          }
          if((ae.getKeyChar() >= '0' && ae.getKeyChar() <= '9') )
          {
            tf24.setEditable(true);
          }
          else{
            tf24.setEditable(false);
          }
        } 
       // public void keyReleased(KeyEvent ae){}
       // public void keyPressed(KeyEvent ae){} 
});
   
    tf25 = new JTextField();
    tf25.setBounds(170,200,150,25);
    tf26 = new JTextField();
    tf26.setBounds(170,250,150,25);
    tf26.addKeyListener(new KeyAdapter()
    {
        public void keyTyped(KeyEvent e )
        { 
        
         if((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) || (e.getKeyChar() == KeyEvent.VK_SPACE))
            { 
             tf26.setEditable(true); 
            }
            else 
            { 
             tf26.setEditable(false);
            }    
        } 
        public void keyReleased(KeyEvent ae){}
        public void keyPressed(KeyEvent ae){}
    });
    tf27 = new JTextField();
    tf27.setBounds(170,300,150,40);

    b83 = new JButton("SUBMIT ");
    b83.setBounds(100,380,100,25);
    b83.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
        if( tf23.getText().equals("") || tf24.getText().equals("") || tf25.getText().equals("") || tf26.getText().equals("") || tf27.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter all Details");
        }
        else
        {
           p37.setVisible(true);
           l134.setText( tf23.getText());
           l135.setText("+91 " + tf24.getText());
           l143.setText(tf27.getText() +", " + tf25.getText() +"- " + tf26.getText());
           tf23.setText("");
           tf24.setText("");
           tf25.setText("");
           tf26.setText("");
           tf27.setText("");
           tf24.setEditable(true);

        }
       }
    });
    


    p37 =  new JPanel();
     p37.setLayout(null);
     p37.setBounds(550,25,230,200);
     l00 = new JLabel("Your Details");
     l00.setBounds(20,20,100,20);
     l00.setFont(new Font("Serif",Font.BOLD,18));
     l134 = new JLabel("");
     l134.setBounds(5,50,200,20);
     l134.setFont(new Font("Serif",Font.BOLD,15));
     l135 = new JLabel("");
     l135.setBounds(5,70,200,20);
     l135.setFont(new Font("Serif",Font.BOLD,15));
     l143 = new JLabel("");
     l143.setBounds(5,90,300,20);
     l143.setFont(new Font("Serif",Font.BOLD,15));
     


     p37.add(l00);  p37.add(l134); p37.add(l135); p37.add(l143);
    p37.setVisible(false);    



    p36.add(l128); p36.add(l129); p36.add(l130); p36.add(l131); p36.add(l132); p36.add(l133); p36.add(tf23);
    p36.add(tf24); p36.add(tf25); p36.add(tf26);  p36.add(tf27); p36.add(b83); p36.add(p37);

    p36.setVisible(false);
     f.add(p36);

     


//MENU PAGE
     //panel p5 
     p5=new JPanel();
     p5.setLayout(null);
     p5.setBounds(200,75,800,495);
     p5.setBackground(Color.white);
     
     JTextField tf1 = new JTextField("**Category**");
     tf1.setBounds(230,40,350,70);
     tf1.setFont(new Font("Serif",Font.BOLD,40));
     tf1.setHorizontalAlignment(JTextField.CENTER);
     tf1.setBackground(new Color(176,23,31));
     tf1.setForeground(Color.white);
     tf1.setEditable(false);
    Icon i1 = new ImageIcon("./res/pg1.png");
    b6 = new JButton("a",i1);
    b6.setBackground(Color.white);
    b6.setBorder(BorderFactory.createLineBorder(Color.white));
    b6.setBounds(10,194,173,145);
    Icon i2 = new ImageIcon("./res/IceCream.png");
    b7 = new JButton("b",i2);
    b7.setBackground(Color.white);
    b7.setBorder(BorderFactory.createLineBorder(Color.white));
    b7.setBounds(210,200,173,135);
    Icon i3 = new ImageIcon("./res/burger.png");
    b8 = new JButton("c",i3);
    b8.setBackground(Color.white);
    b8.setBorder(BorderFactory.createLineBorder(Color.white));
    b8.setBounds(410,200,173,135);
    Icon i4 = new ImageIcon("./res/pizza.png");
    b9 = new JButton("d",i4);
    b9.setBackground(Color.white);
    b9.setBorder(BorderFactory.createLineBorder(Color.white));
    b9.setBounds(610,200,173,131);

    l2 = new JLabel("Pastries");
    l2.setBounds(10,150,173,30);
    l2.setFont(new Font("Serif",Font.BOLD,20));
    l2.setHorizontalAlignment(JLabel.LEFT);
    l2.setForeground(Color.black);

    l3 = new JLabel("Ice-Cream");
    l3.setBounds(200,150,173,30);
    l3.setFont(new Font("Serif",Font.BOLD,20));
    l3.setHorizontalAlignment(JLabel.LEFT);
    l3.setForeground(Color.black);

    l4 = new JLabel("Burger");
    l4.setBounds(400,150,173,30);
    l4.setFont(new Font("Serif",Font.BOLD,20));
    l4.setHorizontalAlignment(JLabel.LEFT);
    l4.setForeground(Color.black);

    l5 = new JLabel("Pizza");
    l5.setBounds(600,150,173,30);
    l5.setFont(new Font("Serif",Font.BOLD,20));
    l5.setHorizontalAlignment(JLabel.LEFT);
    l5.setForeground(Color.black);
   
    p5.add(tf1); p5.add(l2); p5.add(l3); p5.add(l4); p5.add(l5);  p5.add(b6); p5.add(b7); p5.add(b8); p5.add(b9);
     p5.setVisible(false);
     f.add(p5);


     
     jt = new JTable();
     jt.setBounds(50,80,700,250); 
     jt.setBackground(new Color(255, 228, 225));

     model = new  DefaultTableModel();

     Object row[][] = new Object[4][4];
    
       
     
 l127 = new JLabel("");
 f.add(l127);    

               

     
// PASTRY PAGE     
    //panel 9
    p9=new JPanel();
    p9.setLayout(null);
    p9.setBounds(200,75,800,495);
    p9.setBackground(Color.white);

    p13=new JPanel();
    p13.setLayout(null);
    p13.setBounds(20,60,240,340);
    l11 = new JLabel("BlackForest Pastry");
    l11.setBounds(5,5,150,25);
    l11.setFont(new Font("Serif",Font.BOLD,17));
    l23 = new JLabel("",new ImageIcon("./res/blackforest21.png"),SwingConstants.CENTER);
    l23.setBounds(10,40,220,180);
    l89 = new JLabel("Price :");
    l89.setBounds(10,230,80,30);
    l89.setForeground(Color.black);
    l89.setFont(new Font("Serif",Font.BOLD,17));
    l108 = new JLabel("80.00");
    l108.setBounds(70,230,50,30);
    l108.setForeground(Color.black);
    l108.setFont(new Font("Serif",Font.BOLD,17));
    b13= new JButton("-");
    b13.setBounds(140,238,30,20);
    b13.setBackground(Color.lightGray);
    b13.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b13.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf3.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf3.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf3 = new JTextField("0");
    tf3.setBounds(170,238,25,20);
    tf3.setHorizontalAlignment(SwingConstants.CENTER);
    tf3.setBackground(Color.lightGray);
    tf3.setBorder(BorderFactory.createLineBorder( Color.lightGray));
    tf3.setEditable(false);
    b14 = new JButton("+");
    b14.setBounds(190,238,30,20);
    b14.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b14.setBackground(Color.lightGray);
    b14.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf3.setForeground(Color.black);
            if(tf3.getText() == "0") {
                tf3.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf3.getText());
                    quantity++;   
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf3.setText(Integer.toString(quantity));
            } }	
    });
    l26 = new JLabel("Ingredients");
    l26.setBounds(10,255,100,25);
    l26.setForeground(Color.darkGray);
    l27 = new JLabel("Chocolate cake, Whipped Cream, Cherries");
    l27.setFont(new Font("Serif",Font.BOLD,12));
    l27.setBounds(0,275,300,25);
    l27.setForeground(Color.darkGray);
    b12 = new JButton("Add to Cart ");
    b12.setBounds(10,310,220,20);
    b12.setBackground(new Color(135,121,78));
    b12.setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));

    b12.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l108.getText();
            String s2 = tf3.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b12)
			{
               d1 =c1 *c2;
			} 
			String result = String.valueOf(d1);
            l127.setText(result);
            if(e.getSource()== b12&& tf3.getText().equals("0"))
            {
            tf3.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l11.getText();
                row[0][1] = tf3.getText();
                row[0][2] = l108.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf3.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });   
    
    p13.add(l11); p13.add(l23); p13.add(l89); p13.add(l26); p13.add(l27); p13.add(b12); p13.add(l108);
    p13.add(b13); p13.add(tf3); p13.add(b14); 

    p14=new JPanel();
    p14.setLayout(null);
    p14.setBounds(280,60,240,340);
    l12 = new JLabel("Vanilla Pastry");
    l12.setBounds(5,5,150,25);
    l12.setFont(new Font("Serif",Font.BOLD,17));
    l24 = new JLabel("",new ImageIcon("./res/vanilla12.png"),SwingConstants.CENTER);
    l24.setBounds(10,40,220,180);
    l90 = new JLabel("Price :");
    l90.setBounds(10,230,80,30);
    l90.setForeground(Color.black);
    l90.setFont(new Font("Serif",Font.BOLD,17));
    l109 = new JLabel("100.00");
    l109.setBounds(70,230,50,30);
    l109.setForeground(Color.black);
    l109.setFont(new Font("Serif",Font.BOLD,17));
    
    b15= new JButton("-");
    b15.setBounds(140,238,30,20);
    b15.setBackground(Color.lightGray);
    b15.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b15.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf4.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf4.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf4 = new JTextField("0");
    tf4.setBounds(170,238,25,20);
    tf4.setHorizontalAlignment(SwingConstants.CENTER);
    tf4.setBackground(Color.lightGray);
    tf4.setBorder(BorderFactory.createLineBorder( Color.lightGray));
    tf4.setEditable(false);
    b16 = new JButton("+");
    b16.setBounds(190,238,30,20);
    b16.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b16.setBackground(Color.lightGray);
    b16.addActionListener(new ActionListener() {
       
        public void actionPerformed(ActionEvent e) {
            tf4.setForeground(Color.black);
            if(tf4.getText() == "0") {
                tf4.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf4.getText());
                    quantity++;  
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                 else
                 tf4.setText(Integer.toString(quantity));
            } }	
    });

    l28 = new JLabel("Ingredients");
    l28.setBounds(10,255,100,25);
    l28.setForeground(Color.darkGray);
    l29 = new JLabel("Vanilla cake, Whipped Cream, Cherries");
    l29.setFont(new Font("Serif",Font.BOLD,12));
    l29.setBounds(0,275,300,25);
    l29.setForeground(Color.darkGray);
    b17 = new JButton("Add to Cart ");
    b17.setBounds(10,310,220,20);
    b17.setBackground(new Color(135,121,78));
    b17.setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));

    b17.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l109.getText();
            String s2 = tf4.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b17)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(e.getSource()== b17&& tf4.getText().equals("0"))
            {
            tf4.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l12.getText();
                row[0][1] = tf4.getText();
                row[0][2] = l109.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf4.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    }); 

    p14.add(l12); p14.add(l24); p14.add(l28); p14.add(l29); p14.add(b17); p14.add(l90); p14.add(b15); p14.add(tf4); p14.add(b16);
    p14.add(l109);

 //error

    p15=new JPanel();
    p15.setLayout(null);
    p15.setBounds(540,60,240,340);    
    l13 = new JLabel("Kiwi Pastry");
    l13.setBounds(5,5,150,25);
    l13.setFont(new Font("Serif",Font.BOLD,17));
    l25 = new JLabel("",new ImageIcon("./res/kiwi1.png"),SwingConstants.CENTER);
    l25.setBounds(10,40,220,180);
    l91 = new JLabel("Price :");
    l91.setBounds(10,230,80,30);
    l91.setForeground(Color.black);
    l91.setFont(new Font("Serif",Font.BOLD,17));
    l110 = new JLabel("80.00");
    l110.setBounds(70,230,50,30);
    l110.setForeground(Color.black);
    l110.setFont(new Font("Serif",Font.BOLD,17)); 

    l30 = new JLabel("Ingredients");
    l30.setBounds(10,255,100,25);
    l30.setForeground(Color.darkGray);
    l31 = new JLabel("Kiwi Fruits, Cake, Whipped Cream");
    l31.setFont(new Font("Serif",Font.BOLD,12));
    l31.setBounds(0,275,300,25);
    l31.setForeground(Color.darkGray);

    b19= new JButton("-");
    b19.setBounds(140,238,30,20);
    b19.setBackground(Color.lightGray);
    b19.setBorder(BorderFactory.createLineBorder( Color.lightGray));
    b19.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf22.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf22.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf22 = new JTextField("0");
    tf22.setBounds(170,238,25,20);
    tf22.setHorizontalAlignment(SwingConstants.CENTER);
    tf22.setBackground(Color.lightGray);
    tf22.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf22.setEditable(false);

    b20 = new JButton("+");
    b20.setBounds(190,238,30,20);
    b20.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b20.setBackground(Color.lightGray);
    b20.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            //tf22.setForeground(Color.black); 
            if(tf22.getText() == "0") {
                tf22.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf22.getText());
                    quantity++;    
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                 else
                 tf22.setText(Integer.toString(quantity));
            } }	
    });

    b21 = new JButton("Add to Cart ");
    b21.setBounds(10,310,220,20);
    b21.setBackground(new Color(135,121,78));
    b21.setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b21.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            String s1 = l110.getText();
            String s2 = tf22.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(ae.getSource()==b21)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf22.getText().equals("0") && (ae.getSource()== b21 ))
            {
            tf22.setForeground(Color.red);
            }
           else{    
                row[0][0] = l13.getText();
                row[0][1] = tf22.getText();
                row[0][2] = l110.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf22.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
           }
        }
    });

    p15.add(l13); p15.add(l25); p15.add(l30); p15.add(l31); p15.add(b19); p15.add(tf22); p15.add(b20); p15.add(b21);
    p15.add(l91); p15.add(l110);

    b24 = new JButton("Back to Category ");
    b24.setBounds(20,420,130,25);
    b24.setBackground(Color.gray);
    b24.setBorder(BorderFactory.createLineBorder(Color.gray));
    
    b52 = new JButton("Next");
    b52.setBounds(690,420,70,25);
    b52.setBackground(Color.gray);
    b52.setBorder(BorderFactory.createLineBorder(Color.gray));
    p9.add(p13);   p9.add(p14);  p9.add(p15); p9.add(b24); p9.add(b52); 
    p9.setVisible(false);

//pastry 2 page 

    p26 = new JPanel();
    p26.setLayout(null);
    p26.setBounds(200,75,800,495);
    p26.setBackground(Color.white);
    p26.setVisible(false);

    p29=new JPanel();
    p29.setLayout(null);
    p29.setBounds(280,60,240,340);
    l59 = new JLabel("Pineapple Pastry");
    l59.setBounds(5,5,150,25);
    l59.setFont(new Font("Serif",Font.BOLD,17));
    l60 = new JLabel("",new ImageIcon("./res/pineapple.png"),SwingConstants.CENTER);
    l60.setBounds(10,40,220,180);
    l92 = new JLabel("Price :");
    l92.setBounds(10,230,80,30);
    l92.setForeground(Color.black);
    l92.setFont(new Font("Serif",Font.BOLD,17));
    l111 = new JLabel("90.00");
    l111.setBounds(70,230,50,30);
    l111.setForeground(Color.black);
    l111.setFont(new Font("Serif",Font.BOLD,17));
    l61 = new JLabel("Ingredients");
    l61.setBounds(10,255,100,25);
    l61.setForeground(Color.darkGray);
    l62 = new JLabel("Cake, Whipped Cream, Pineapple juice");
    l62.setFont(new Font("Serif",Font.BOLD,12));
    l62.setBounds(0,275,300,25);
    l62.setForeground(Color.darkGray);
    b58= new JButton("-");
    b58.setBounds(140,238,30,20);
    b58.setBackground(Color.lightGray);
    b58.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b58.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf14.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf14.setText(Integer.toString(quantity));	
            }   
        }
    });

    tf14 = new JTextField("0");
    tf14.setBounds(170,238,25,20);
    tf14.setHorizontalAlignment(SwingConstants.CENTER);
    tf14.setBackground(Color.lightGray);
    tf14.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf14.setEditable(false);
    b59 = new JButton("+");
    b59.setBounds(190,238,30,20);
    b59.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b59.setBackground(Color.lightGray);
    b59.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf14.setForeground(Color.black);
            if(tf14.getText() == "0") {
                tf14.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf14.getText());
                    quantity++;    
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf14.setText(Integer.toString(quantity));
            } }	
    });

    b60 = new JButton("Add to Cart ");
    b60.setBounds(10,310,220,20);
    b60.setBackground(new Color(135,121,78));
    b60.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l111.getText();
            String s2 = tf14.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b60)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf14.getText().equals("0")&&(e.getSource()== b60) )
            {
            tf14.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l59.getText();
                row[0][1] = tf14.getText();
                row[0][2] = l111.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf14.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
 

    b60.setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    p29.add(l59); p29.add(l60); p29.add(l61); p29.add(l62); p29.add(b58); p29.add(tf14); p29.add(b59); p29.add(b60);
    p29.add(l92); p29.add(l111);

    b55 = new JButton("Back to Category ");
    b55.setBounds(20,420,130,25);
    b55.setBackground(Color.gray);
    b55.setBorder(BorderFactory.createLineBorder(Color.gray));

    p30=new JPanel();
    p30.setLayout(null);
    p30.setBounds(20,60,240,330);
    l63 = new JLabel("WhiteForest Pastry");
    l63.setBounds(5,5,150,25);
    l63.setFont(new Font("Serif",Font.BOLD,17));
    l64 = new JLabel("",new ImageIcon("./res/white_forest1.png"),SwingConstants.CENTER);
    l64.setBounds(10,40,220,180);
    l93 = new JLabel("Price :");
    l93.setBounds(10,230,80,30);
    l93.setForeground(Color.black);
    l93.setFont(new Font("Serif",Font.BOLD,17));
    l112 = new JLabel("100.00");
    l112.setBounds(70,230,50,30);
    l112.setForeground(Color.black);
    l112.setFont(new Font("Serif",Font.BOLD,17));
    l65 = new JLabel("Ingredients");
    l65.setBounds(10,255,100,25);
    l65.setForeground(Color.darkGray);
    l66 = new JLabel("White Chocolate, Cake, Whipped Cream");
    l66.setFont(new Font("Serif",Font.BOLD,12));
    l66.setBounds(0,275,300,25);
    l66.setForeground(Color.darkGray);
    b61= new JButton("-");
    b61.setBounds(140,238,30,20);
    b61.setBackground(Color.lightGray);
    b61.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b61.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf15.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf15.setText(Integer.toString(quantity));	
            }   
        }
    });
    
    tf15 = new JTextField("0");
    tf15.setBounds(170,238,25,20);
    tf15.setHorizontalAlignment(SwingConstants.CENTER);
    tf15.setBackground(Color.lightGray);
    tf15.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf15.setEditable(false);
    b62 = new JButton("+");
    b62.setBounds(190,238,30,20);
    b62.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b62.setBackground(Color.lightGray);
    b62.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf15.setForeground(Color.black);
            if(tf15.getText() == "0") {
                tf15.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf15.getText());
                    quantity++;   
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf15.setText(Integer.toString(quantity));
            } }	
    });
    b63 = new JButton("Add to Cart ");
    b63.setBounds(10,310,220,20);
    b63.setBackground(new Color(135,121,78));
    b63.setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));  
    b63.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l112.getText();
            String s2 = tf15.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b63)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(e.getSource()== b63&& tf15.getText().equals("0"))
            {
            tf15.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l63.getText();
                row[0][1] = tf15.getText();
                row[0][2] = l112.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf15.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p30.add(l63); p30.add(l64); p30.add(l65); p30.add(l66); p30.add(b61); p30.add(tf15); p30.add(b62); p30.add(b63);
    p30.add(l93); p30.add(l112);

    p31=new JPanel();
    p31.setLayout(null);
    p31.setBounds(540,60,240,340);    
    l67 = new JLabel("Chocolate Pastry");
    l67.setBounds(5,5,150,25);
    l67.setFont(new Font("Serif",Font.BOLD,17));
    l68 = new JLabel("",new ImageIcon("./res/abc45.png"),SwingConstants.CENTER);
    l68.setBounds(10,40,220,180);
    l94 = new JLabel("Price :");
    l94.setBounds(10,230,80,30);
    l94.setForeground(Color.black);
    l94.setFont(new Font("Serif",Font.BOLD,17));
    l113 = new JLabel("100.00");
    l113.setBounds(70,230,50,30);
    l113.setForeground(Color.black);
    l113.setFont(new Font("Serif",Font.BOLD,17));
    l69 = new JLabel("Ingredients");
    l69.setBounds(10,255,100,25);
    l69.setForeground(Color.darkGray);
    l70 = new JLabel("Chocolate cake, Whipped Cream");
    l70.setFont(new Font("Serif",Font.BOLD,12));
    l70.setBounds(0,275,300,25);
    l70.setForeground(Color.darkGray);
    b64= new JButton("-");
    b64.setBounds(140,238,30,20);
    b64.setBackground(Color.lightGray);
    b64.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b64.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf16.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf16.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf16 = new JTextField("0");
    tf16.setBounds(170,238,25,20);
    tf16.setHorizontalAlignment(SwingConstants.CENTER);
    tf16.setBackground(Color.lightGray);
    tf16.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf16.setEditable(false);
    b65 = new JButton("+");
    b65.setBounds(190,238,30,20);
    b65.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b65.setBackground(Color.lightGray);
    b65.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf16.setForeground(Color.black);
            if(tf16.getText() == "0") {
                tf16.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf16.getText());
                    quantity++;   
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf16.setText(Integer.toString(quantity));
            } }	
    });
    b66 = new JButton("Add to Cart ");
    b66.setBounds(10,310,220,20);
    b66.setBackground(new Color(135,121,78));
    b66.setBorder(BorderFactory.createLineBorder(new Color(135,121,78))); 
    b66.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l113.getText();
            String s2 = tf16.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b66)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(e.getSource()== b66&& tf16.getText().equals("0"))
            {
            tf16.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l67.getText();
                row[0][1] = tf16.getText();
                row[0][2] = l113.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf16.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p31.add(l67); p31.add(l68); p31.add(l69); p31.add(l70); p31.add(b64); p31.add(tf16); p31.add(b65); p31.add(b66);
    p31.add(l94); p31.add(l113);

    b73 = new JButton("Back");
    b73.setBounds(690,420,70,25);
    b73.setBackground(Color.gray);
    b73.setBorder(BorderFactory.createLineBorder(Color.gray)); 
    
    p26.add(b55); p26.add(p29); p26.add(p30); p26.add(p31); p26.add(b73);
    f.add(p9); f.add(p26); 

//ICE-CREAM PAGE
    //panel 10
    p10=new JPanel();
    p10.setLayout(null);
    p10.setBounds(200,75,800,495);
    p10.setBackground(Color.white);

    p16 = new JPanel();
    p16.setLayout(null);
    p16.setBounds(20,60,240,340);
    l14 = new JLabel("Strawberry Ice-Cream");
    l14.setBounds(5,5,170,25);
    l14.setFont(new Font("Serif",Font.BOLD,17));
    l32 = new JLabel("",new ImageIcon("./res/berry.png"),SwingConstants.CENTER);
    l32.setBounds(10,40,220,180);
    l95 = new JLabel("Price :");
    l95.setBounds(10,230,80,30);
    l95.setForeground(Color.black);
    l95.setFont(new Font("Serif",Font.BOLD,17));
    l114 = new JLabel("120.00");
    l114.setBounds(70,230,50,30);
    l114.setForeground(Color.black);
    l114.setFont(new Font("Serif",Font.BOLD,17));
    l33 = new JLabel("Ingredients");
    l33.setBounds(10,255,100,25);
    l33.setForeground(Color.darkGray);
    l34 = new JLabel("Strawberries, Cream, Milk");
    l34.setFont(new Font("Serif",Font.BOLD,12));
    l34.setBounds(0,275,300,25);
    l34.setForeground(Color.darkGray);
    b18= new JButton("-");
    b18.setBounds(140,238,30,20);
    b18.setBackground(Color.lightGray);
    b18.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b18.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf5.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf5.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf5 = new JTextField("0");
    tf5.setBounds(170,238,25,20);
    tf5.setHorizontalAlignment(SwingConstants.CENTER);
    tf5.setBackground(Color.lightGray);
    tf5.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf5.setEditable(false);
    b21 = new JButton("+");
    b21.setBounds(190,238,30,20);
    b21.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b21.setBackground(Color.lightGray);
    b21.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf5.setForeground(Color.black);
            if(tf5.getText() == "0") {
                tf5.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf5.getText());
                    quantity++;  
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf5.setText(Integer.toString(quantity));
            } }	
    });
    b22 = new JButton("Add to Cart ");
    b22.setBounds(10,310,220,20);
    b22.setBackground(new Color(135,121,78));
    b22.setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b22.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l114.getText();
            String s2 = tf5.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b22)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf5.getText().equals("0")&&(e.getSource()== b22) )
            {
            tf5.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l14.getText();
                row[0][1] = tf5.getText();
                row[0][2] = l114.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf5.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p16.add(l14); p16.add(l32); p16.add(l33); p16.add(l34); p16.add(b18); p16.add(tf5); p16.add(b21); p16.add(b22);
    p16.add(l95); p16.add(l114);

    p17 = new JPanel();
    p17.setLayout(null);
    p17.setBounds(280,60,240,340);
    l15 = new JLabel("Mango Ice-Cream");
    l15.setBounds(5,5,150,25);
    l15.setFont(new Font("Serif",Font.BOLD,17));
    l35 = new JLabel("",new ImageIcon("./res/mango1.png"),SwingConstants.CENTER);
    l35.setBounds(10,40,220,180);
    l96 = new JLabel("Price :");
    l96.setBounds(10,230,80,30);
    l96.setForeground(Color.black);
    l96.setFont(new Font("Serif",Font.BOLD,17));
    l115 = new JLabel("100.00");
    l115.setBounds(70,230,50,30);
    l115.setForeground(Color.black);
    l115.setFont(new Font("Serif",Font.BOLD,17));
    l36 = new JLabel("Ingredients");
    l36.setBounds(10,255,100,25);
    l36.setForeground(Color.darkGray);
    l37 = new JLabel("Mangoes, Cream");
    l37.setFont(new Font("Serif",Font.BOLD,12));
    l37.setBounds(0,275,300,25);
    l37.setForeground(Color.darkGray);
    b31= new JButton("-");
    b31.setBounds(140,238,30,20);
    b31.setBackground(Color.lightGray);
    b31.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b31.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf6.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf6.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf6 = new JTextField("0");
    tf6.setBounds(170,238,25,20);
    tf6.setHorizontalAlignment(SwingConstants.CENTER);
    tf6.setBackground(Color.lightGray);
    tf6.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf6.setEditable(false);
    b29 = new JButton("+");
    b29.setBounds(190,238,30,20);
    b29.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b29.setBackground(Color.lightGray);
    b29.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf6.setForeground(Color.black);
            if(tf6.getText() == "0") {
                tf6.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf6.getText());
                    quantity++;  
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                  tf6.setText(Integer.toString(quantity));

            } }	
    });
    b30 = new JButton("Add to Cart ");
    b30.setBounds(10,310,220,20);
    b30.setBackground(new Color(135,121,78));
    b30.setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b30.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l115.getText();
            String s2 = tf6.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b30)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf6.getText().equals("0")&&(e.getSource()== b30) )
            {
            tf6.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l15.getText();
                row[0][1] = tf6.getText();
                row[0][2] = l115.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf6.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });  
    p17.add(l15); p17.add(l35); p17.add(l36); p17.add(l37); p17.add(b31); p17.add(tf6); p17.add(b29); p17.add(b30);
    p17.add(l96); p17.add(l115);

    p18 = new JPanel();
    p18.setLayout(null);
    p18.setBounds(540,60,240,340);    
    l16 = new JLabel("Chocolate Ice-Cream");
    l16.setBounds(5,5,180,25);
    l16.setFont(new Font("Serif",Font.BOLD,17));
    l38 = new JLabel("",new ImageIcon("./res/chocolate1.png"),SwingConstants.CENTER);
    l38.setBounds(10,40,220,180);
    l97 = new JLabel("Price :");
    l97.setBounds(10,230,80,30);
    l97.setForeground(Color.black);
    l97.setFont(new Font("Serif",Font.BOLD,17));
    l116 = new JLabel("90.00");
    l116.setBounds(70,230,60,30);
    l116.setForeground(Color.black);
    l116.setFont(new Font("Serif",Font.BOLD,17));
    l39 = new JLabel("Ingredients");
    l39.setBounds(10,255,100,25);
    l39.setForeground(Color.darkGray);
    l40 = new JLabel("Chocolate , Cream");
    l40.setFont(new Font("Serif",Font.BOLD,12));
    l40.setBounds(0,275,300,25);
    l40.setForeground(Color.darkGray);
    b23= new JButton("-");
    b23.setBounds(140,238,30,20);
    b23.setBackground(Color.lightGray);
    b23.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b23.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf7.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf7.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf7 = new JTextField("0");
    tf7.setBounds(170,238,25,20);
    tf7.setHorizontalAlignment(SwingConstants.CENTER);
    tf7.setBackground(Color.lightGray);
    tf7.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf7.setEditable(false);
    b32 = new JButton("+");
    b32.setBounds(190,238,30,20);
    b32.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b32.setBackground(Color.lightGray);
    b32.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf7.setForeground(Color.black);
            if(tf7.getText() == "0") {
                tf7.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf7.getText());
                    quantity++;   
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                 else
                 tf7.setText(Integer.toString(quantity));
            } }	
    });
    b33 = new JButton("Add to Cart ");
    b33.setBounds(10,310,220,20);
    b33.setBackground(new Color(135,121,78));
    b33 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b33.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l116.getText();
            String s2 = tf7.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b33)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf7.getText().equals("0")&&(e.getSource()== b33) )
            {
            tf7.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l16.getText();
                row[0][1] = tf7.getText();
                row[0][2] = l116.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf7.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p18.add(l16); p18.add(l38); p18.add(l39); p18.add(l40); p18.add(b23); p18.add(tf7); p18.add(b32); p18.add(b33);
    p18.add(l97); p18.add(l116);

    b25 = new JButton("Back to Category ");
    b25.setBounds(20,420,130,25);
    b25.setBackground(Color.gray);
    b25.setBorder(BorderFactory.createLineBorder(Color.gray));

    b53 = new JButton("Next");
    b53.setBounds(690,420,70,25);
    b53.setBackground(Color.gray);
    b53.setBorder(BorderFactory.createLineBorder(Color.gray));
    
    p10.add(p16);  p10.add(p17);  p10.add(p18); p10.add(b25); p10.add(b53);
    p10.setVisible(false); 

//ice-cream 2 page
    p27 = new JPanel();
    p27.setLayout(null);
    p27.setBounds(200,75,800,495);
    p27.setBackground(Color.white);

    p32=new JPanel();
    p32.setLayout(null);
    p32.setBounds(280,60,240,340);
    l71 = new JLabel("Pista Ice-Cream");
    l71.setBounds(5,5,150,25);
    l71.setFont(new Font("Serif",Font.BOLD,17));
    l72 = new JLabel("",new ImageIcon("./res/pista.png"),SwingConstants.CENTER);
    l72.setBounds(10,40,220,180);
    l98 = new JLabel("Price :");
    l98.setBounds(10,230,80,30);
    l98.setForeground(Color.black);
    l98.setFont(new Font("Serif",Font.BOLD,17));
    l117 = new JLabel("120.00");
    l117.setBounds(70,230,50,30);
    l117.setForeground(Color.black);
    l117.setFont(new Font("Serif",Font.BOLD,17));
    l73 = new JLabel("Ingredients");
    l73.setBounds(10,255,100,25);
    l73.setForeground(Color.darkGray);
    l74 = new JLabel("Cream, Pistachios");
    l74.setFont(new Font("Serif",Font.BOLD,12));
    l74.setBounds(0,275,300,25);
    l74.setForeground(Color.darkGray);
    b67= new JButton("-");
    b67.setBounds(140,238,30,20);
    b67.setBackground(Color.lightGray);
    b67.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b67.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf17.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf17.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf17 = new JTextField("0");
    tf17.setBounds(170,238,25,20);
    tf17.setHorizontalAlignment(SwingConstants.CENTER);
    tf17.setBackground(Color.lightGray);
    tf17.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf17.setEditable(false);
    b68 = new JButton("+");
    b68.setBounds(190,238,30,20);
    b68.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b68.setBackground(Color.lightGray);
    b68.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf17.setForeground(Color.black);;
            if(tf17.getText() == "0") {
                tf17.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf17.getText());
                    quantity++;  
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf17.setText(Integer.toString(quantity));
            } }	
    });
    b69 = new JButton("Add to Cart ");
    b69.setBounds(10,310,220,20);
    b69.setBackground(new Color(135,121,78));
    b69.setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b69.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l117.getText();
            String s2 = tf17.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b69)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf17.getText().equals("0")&&(e.getSource()== b69) )
            {
            tf17.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l71.getText();
                row[0][1] = tf17.getText();
                row[0][2] = l117.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf17.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p32.add(l71); p32.add(l72); p32.add(l73); p32.add(l74); p32.add(b67); p32.add(tf17); p32.add(b68); p32.add(b69);
    p32.add(l98); p32.add(l117);
   
    p33=new JPanel();
    p33.setLayout(null);
    p33.setBounds(20,60,240,340);
    l75 = new JLabel("Butter-Pecan Ice-Cream "); 
    l75.setBounds(5,5,200,25);
    l75.setFont(new Font("Serif",Font.BOLD,17));
    l76 = new JLabel("",new ImageIcon("./res/xyz.png"),SwingConstants.CENTER);
    l76.setBounds(10,40,220,180);
    l99 = new JLabel("Price :");
    l99.setBounds(10,230,80,30);
    l99.setForeground(Color.black);
    l99.setFont(new Font("Serif",Font.BOLD,17));
    l118 = new JLabel("120.00");
    l118.setBounds(70,230,50,30);
    l118.setForeground(Color.black);
    l118.setFont(new Font("Serif",Font.BOLD,17));
    l77 = new JLabel("Ingredients");
    l77.setBounds(10,255,100,25);
    l77.setForeground(Color.darkGray);
    l78 = new JLabel("Butter, Chopped Pecans, Cream");
    l78.setFont(new Font("Serif",Font.BOLD,12));
    l78.setBounds(0,275,300,25);
    l78.setForeground(Color.darkGray);
    b70 = new JButton("-");
    b70.setBounds(140,238,30,20);
    b70.setBackground(Color.lightGray);
    b70.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b70.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf18.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf18.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf18 = new JTextField("0");
    tf18.setBounds(170,238,25,20);
    tf18.setHorizontalAlignment(SwingConstants.CENTER);
    tf18.setBackground(Color.lightGray);
    tf18.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf18.setEditable(false);
    b71 = new JButton("+");
    b71.setBounds(190,238,30,20);
    b71.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b71.setBackground(Color.lightGray);
    b71.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf18.setForeground(Color.black);
            if(tf18.getText() == "0") {
                tf18.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf18.getText());
                    quantity++;    
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                 else
                 tf18.setText(Integer.toString(quantity));
            } }	
    });
    b72 = new JButton("Add to Cart ");
    b72.setBounds(10,310,220,20);
    b72.setBackground(new Color(135,121,78));
    b72.setBorder(BorderFactory.createLineBorder(new Color(135,121,78))); 
    b72.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l118.getText();
            String s2 = tf18.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b72)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf18.getText().equals("0")&&(e.getSource()== b72) )
            {
            tf18.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l75.getText();
                row[0][1] = tf18.getText();
                row[0][2] = l118.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf18.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p33.add(l75); p33.add(l76); p33.add(l77); p33.add(l78); p33.add(b70); p33.add(tf18); p33.add(b71); p33.add(b72);
    p33.add(l99); p33.add(l118);

    b56 = new JButton("Back to Category ");
    b56.setBounds(20,420,130,25);
    b56.setBackground(Color.gray);
    b56.setBorder(BorderFactory.createLineBorder(Color.gray));

    b74 = new JButton("Back");
    b74.setBounds(690,420,70,25);
    b74.setBackground(Color.gray);
    b74.setBorder(BorderFactory.createLineBorder(Color.gray));

    p27.add(b56); p27.add(p32); p27.add(p33); p27.add(b74);
    p27.setVisible(false);
    f.add(p10); f.add(p27);

//BURGER PAGE
    //panel 11
    p11=new JPanel();
    p11.setLayout(null);
    p11.setBounds(200,75,800,495);
    p11.setBackground(Color.white);

    p19 = new JPanel();
    p19.setLayout(null);
    p19.setBounds(20,60,240,340);
    l17 = new JLabel("Veggies Burger");
    l17.setBounds(5,5,150,25);
    l17.setFont(new Font("Serif",Font.BOLD,17));
    l41 = new JLabel("",new ImageIcon("./res/veggie.png"),SwingConstants.CENTER);
    l41.setBounds(10,40,220,180);
    l100 = new JLabel("Price :");
    l100.setBounds(10,230,80,30);
    l100.setForeground(Color.black);
    l100.setFont(new Font("Serif",Font.BOLD,17));
    l119 = new JLabel("120.00");
    l119.setBounds(70,230,50,30);
    l119.setForeground(Color.black);
    l119.setFont(new Font("Serif",Font.BOLD,17));
    l42 = new JLabel("Ingredients");
    l42.setBounds(10,255,100,25);
    l42.setForeground(Color.darkGray);
    l43 = new JLabel("Burger Buns, Vegetables, Spices");
    l43.setFont(new Font("Serif",Font.BOLD,12));
    l43.setBounds(0,275,300,25);
    l43.setForeground(Color.darkGray);
    b34= new JButton("-");
    b34.setBounds(140,238,30,20);
    b34.setBackground(Color.lightGray);
    b34.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b34.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf8.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf8.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf8 = new JTextField("0");
    tf8.setBounds(170,238,25,20);
    tf8.setHorizontalAlignment(SwingConstants.CENTER);
    tf8.setBackground(Color.lightGray);
    tf8.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf8.setEditable(false);
    b35 = new JButton("+");
    b35.setBounds(190,238,30,20);
    b35.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b35.setBackground(Color.lightGray);
    b35.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf8.setForeground(Color.black);
            if(tf8.getText() == "0") {
                tf8.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf8.getText());
                    quantity++;    
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf8.setText(Integer.toString(quantity));
            } }	
    });
    b36 = new JButton("Add to Cart ");
    b36.setBounds(10,310,220,20);
    b36.setBackground(new Color(135,121,78));
    b36 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b36.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l119.getText();
            String s2 = tf8.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b36)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf8.getText().equals("0")&&(e.getSource()== b36) )
            {
            tf8.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l17.getText();
                row[0][1] = tf8.getText();
                row[0][2] = l119.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf8.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p19.add(l17); p19.add(l41); p19.add(l42); p19.add(l43); p19.add(b34); p19.add(tf8); p19.add(b35); p19.add(b36);
    p19.add(l100); p19.add(l119);

    p20 = new JPanel();
    p20.setLayout(null);
    p20.setBounds(280,60,240,330);
    l18 = new JLabel("Black Bean Burger");
    l18.setBounds(5,5,150,25);
    l18.setFont(new Font("Serif",Font.BOLD,17));
    l44 = new JLabel("",new ImageIcon("./res/blackbean.png"),SwingConstants.CENTER);
    l44.setBounds(10,40,220,180);
    l101 = new JLabel("Price :");
    l101.setBounds(10,230,80,30);
    l101.setForeground(Color.black);
    l101.setFont(new Font("Serif",Font.BOLD,17));
    l120 = new JLabel("100.00");
    l120.setBounds(70,230,50,30);
    l120.setForeground(Color.black);
    l120.setFont(new Font("Serif",Font.BOLD,17));
    l45 = new JLabel("Ingredients");
    l45.setBounds(10,255,100,25);
    l45.setForeground(Color.darkGray);
    l46 = new JLabel("Burger Bans, Black Bean ");
    l46.setFont(new Font("Serif",Font.BOLD,12));
    l46.setBounds(0,275,300,25);
    l46.setForeground(Color.darkGray);
    b37= new JButton("-");
    b37.setBounds(140,238,30,20);
    b37.setBackground(Color.lightGray);
    b37.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b37.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf9.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf9.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf9 = new JTextField("0");
    tf9.setBounds(170,238,25,20);
    tf9.setHorizontalAlignment(SwingConstants.CENTER);
    tf9.setBackground(Color.lightGray);
    tf9.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf9.setEditable(false);
    b38 = new JButton("+");
    b38.setBounds(190,238,30,20);
    b38.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b38.setBackground(Color.lightGray);
    b38.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf9.setForeground(Color.black);
            if(tf9.getText() == "0") {
                tf9.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf9.getText());
                    quantity++;                   
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf9.setText(Integer.toString(quantity));
            } }	
    });
    b39 = new JButton("Add to Cart ");
    b39.setBounds(10,310,220,20);
    b39.setBackground(new Color(135,121,78));
    b39 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b39.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l120.getText();
            String s2 = tf9.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b39)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf9.getText().equals("0")&&(e.getSource()== b39) )
            {
            tf9.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l18.getText();
                row[0][1] = tf9.getText();
                row[0][2] = l120.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf9.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p20.add(l18); p20.add(l44); p20.add(l45); p20.add(l46); p20.add(b37); p20.add(tf9); p20.add(b38); p20.add(b39);
    p20.add(l101); p20.add(l120);

    p21 = new JPanel();
    p21.setLayout(null);
    p21.setBounds(540,60,240,340);    
    l19 = new JLabel("Mushroom-Quinoa Burger");
    l19.setBounds(5,5,230,25);
    l19.setFont(new Font("Serif",Font.BOLD,17));
    l47 = new JLabel("",new ImageIcon("./res/mushroomquinoa.png"),SwingConstants.CENTER);
    l47.setBounds(10,40,220,180);
    l102 = new JLabel("Price :");
    l102.setBounds(10,230,80,30);
    l102.setForeground(Color.black);
    l102.setFont(new Font("Serif",Font.BOLD,17));
    l121 = new JLabel("150.00");
    l121.setBounds(70,230,50,30);
    l121.setForeground(Color.black);
    l121.setFont(new Font("Serif",Font.BOLD,17));

    l48 = new JLabel("Ingredients");
    l48.setBounds(10,255,100,25);
    l48.setForeground(Color.darkGray);
    l49 = new JLabel("Burger Bans, Mushroom, Cooked Quinoa");
    l49.setFont(new Font("Serif",Font.BOLD,12));
    l49.setBounds(0,275,300,25);
    l49.setForeground(Color.darkGray);
    b40= new JButton("-");
    b40.setBounds(140,238,30,20);
    b40.setBackground(Color.lightGray);
    b40.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b40.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf10.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf10.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf10 = new JTextField("0");
    tf10.setBounds(170,238,25,20);
    tf10.setHorizontalAlignment(SwingConstants.CENTER);
    tf10.setBackground(Color.lightGray);
    tf10.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf10.setEditable(false);
    b41 = new JButton("+");
    b41.setBounds(190,238,30,20);
    b41.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b41.setBackground(Color.lightGray);
    b41.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf10.setForeground(Color.black);
            if(tf10.getText() == "0") {
                tf10.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf10.getText());
                    quantity++;    
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                tf10.setText(Integer.toString(quantity));
            } }	
    });
    b42 = new JButton("Add to Cart ");
    b42.setBounds(10,310,220,20);
    b42.setBackground(new Color(135,121,78));
    b42 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b42.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l121.getText();
            String s2 = tf10.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b42)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf10.getText().equals("0")&&(e.getSource()== b42) )
            {
            tf10.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l19.getText();
                row[0][1] = tf10.getText();
                row[0][2] = l121.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf10.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p21.add(l19); p21.add(l47); p21.add(l48); p21.add(l49); p21.add(b40); p21.add(tf10); p21.add(b41); p21.add(b42);
    p21.add(l102); p21.add(l121);

    b26 = new JButton("Back to Category ");
    b26.setBounds(20,420,130,25);
    b26.setBackground(Color.gray);
    b26.setBorder(BorderFactory.createLineBorder(Color.gray));
    b54 = new JButton("Next");
    b54.setBounds(690,420,70,25);
    b54.setBackground(Color.gray);
    b54.setBorder(BorderFactory.createLineBorder(Color.gray));
    
    p11.add(p19);   p11.add(p20);  p11.add(p21); p11.add(b26); p11.add(b54);
    p11.setVisible(false);

// Burger 2 page

    p28 = new JPanel();
    p28.setLayout(null);
    p28.setBounds(200,75,800,495);
    p28.setBackground(Color.white);

    p34 = new JPanel();
    p34.setLayout(null);
    p34.setBounds(20,60,240,340);
    l79 = new JLabel("Wild Burger");
    l79.setBounds(5,5,100,25);
    l79.setFont(new Font("Serif",Font.BOLD,17));
    l80 = new JLabel("",new ImageIcon("./res/wild.png"),SwingConstants.CENTER);
    l80.setBounds(10,40,220,180);
    l103 = new JLabel("Price :");
    l103.setBounds(10,230,80,30);
    l103.setForeground(Color.black);
    l103.setFont(new Font("Serif",Font.BOLD,17));
    l122 = new JLabel("120.00");
    l122.setBounds(70,230,50,30);
    l122.setForeground(Color.black);
    l122.setFont(new Font("Serif",Font.BOLD,17));
    l81 = new JLabel("Ingredients");
    l81.setBounds(10,255,100,25);
    l81.setForeground(Color.darkGray);
    l82 = new JLabel("Wild Burger, Allipuram, Vizag ");
    l82.setFont(new Font("Serif",Font.BOLD,12));
    l82.setBounds(0,275,300,25);
    l82.setForeground(Color.darkGray);
    b75= new JButton("-");
    b75.setBounds(140,238,30,20);
    b75.setBackground(Color.lightGray);
    b75.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b75.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf19.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf19.setText(Integer.toString(quantity));	
            }   
        }
    });
    tf19 = new JTextField("0");
    tf19.setBounds(170,238,25,20);
    tf19.setHorizontalAlignment(SwingConstants.CENTER);
    tf19.setBackground(Color.lightGray);
    tf19.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf19.setEditable(false);
    b76 = new JButton("+");
    b76.setBounds(190,238,30,20);
    b76.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b76.setBackground(Color.lightGray);
    b76.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf19.setForeground(Color.black);
            if(tf19.getText() == "0") {
                tf19.setText(" 1");
            }
            else{
                int quantity = Integer.parseInt(tf19.getText());
                    quantity++;    
                if(quantity==21)
                  JOptionPane.showMessageDialog(f, "Sorry, only 20 items are remaining!!");
                else
                  tf19.setText(Integer.toString(quantity));
                   	
            } }	
    });
    b77 = new JButton("Add to Cart ");
    b77.setBounds(10,310,220,20);
    b77.setBackground(new Color(135,121,78));
    b77 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b77.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l122.getText();
            String s2 = tf19.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b77)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf19.getText().equals("0")&&(e.getSource()== b77) )
            {
            tf19.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l79.getText();
                row[0][1] = tf19.getText();
                row[0][2] = l122.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf19.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p34.add(l79); p34.add(l80); p34.add(l81); p34.add(l82); p34.add(b75); p34.add(tf19); p34.add(b76); p34.add(b77);
    p34.add(l103); p34.add(l122);

    p35 = new JPanel();
    p35.setLayout(null);
    p35.setBounds(280,60,240,340);
    l83 = new JLabel("Mexican Burger");
    l83.setBounds(5,5,150,25);
    l83.setFont(new Font("Serif",Font.BOLD,17));
    l84 = new JLabel("",new ImageIcon("./res/Mexican.jpg"),SwingConstants.CENTER);
    l84.setBounds(10,40,220,180);
    l104 = new JLabel("Price :");
    l104.setBounds(10,230,80,30);
    l104.setForeground(Color.black);
    l104.setFont(new Font("Serif",Font.BOLD,17));
    l123 = new JLabel("150.00");
    l123.setBounds(70,230,50,30);
    l123.setForeground(Color.black);
    l123.setFont(new Font("Serif",Font.BOLD,17));
    l85 = new JLabel("Ingredients");
    l85.setBounds(10,255,100,25);
    l85.setForeground(Color.darkGray);
    l86 = new JLabel("Burger Buns,Chicken breasts,Cheese ");
    l86.setFont(new Font("Serif",Font.BOLD,12));
    l86.setBounds(0,275,300,25);
    l86.setForeground(Color.darkGray);
    b78= new JButton("-");
    b78.setBounds(140,238,30,20);
    b78.setBackground(Color.lightGray);
    b78.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b78.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf20.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf20.setText(Integer.toString(quantity));	
            }    
        }
    });
    tf20 = new JTextField("0");
    tf20.setBounds(170,238,25,20);
    tf20.setHorizontalAlignment(SwingConstants.CENTER);
    tf20.setBackground(Color.lightGray);
    tf20.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf20.setEditable(false);
    b79 = new JButton("+");
    b79.setBounds(190,238,30,20);
    b79.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b79.setBackground(Color.lightGray);
    b79.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf20.setForeground(Color.black);
            if(tf20.getText() == "0") {
                tf20.setText("1");
            }
            else{
                int quantity = Integer.parseInt(tf20.getText());
                    quantity++;
                if(quantity == 21)
                    JOptionPane.showMessageDialog(f, "We can take only 20 number of quantity!!!");
                else
                    tf20.setText(Integer.toString(quantity));	        
            }   }    
    });
    b80 = new JButton("Add to Cart ");
    b80.setBounds(10,310,220,20);
    b80.setBackground(new Color(135,121,78));
    b80 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b80.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l123.getText();
            String s2 = tf20.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b80)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf20.getText().equals("0")&&(e.getSource()== b80) )
            {
            tf20.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l83.getText();
                row[0][1] = tf20.getText();
                row[0][2] = l123.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf20.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p35.add(l83); p35.add(l84); p35.add(l85); p35.add(l86); p35.add(b78); p35.add(tf20); p35.add(b79); p35.add(b80);  
    p35.add(l104); p35.add(l123);

    b57 = new JButton("Back to Category ");
    b57.setBounds(20,420,130,25);
    b57.setBackground(Color.gray);
    b57.setBorder(BorderFactory.createLineBorder(Color.gray));

    b81 = new JButton("Back");
    b81.setBounds(690,420,70,25);
    b81.setBackground(Color.gray);
    b81.setBorder(BorderFactory.createLineBorder(Color.gray));

    p28.add(b57); p28.add(b81); p28.add(p34); p28.add(p35); 
    p28.setVisible(false);
    f.add(p11); f.add(p28);

//PIZZA PAGE    
    //panel 12
    p12=new JPanel();
    p12.setLayout(null);
    p12.setBounds(200,75,800,495);
    p12.setBackground(Color.white);

    p22 = new JPanel();
    p22.setLayout(null);
    p22.setBounds(20,60,240,340);
    l20 = new JLabel("Cheese Pizza");
    l20.setBounds(5,5,150,25);
    l20.setFont(new Font("Serif",Font.BOLD,17));
    l50 = new JLabel("",new ImageIcon("./res/cheese.png"),SwingConstants.CENTER);
    l50.setBounds(10,40,220,180);
    l105 = new JLabel("Price :");
    l105.setBounds(10,230,80,30);
    l105.setForeground(Color.black);
    l105.setFont(new Font("Serif",Font.BOLD,17));
    l124 = new JLabel("199.00");
    l124.setBounds(70,230,50,30);
    l124.setForeground(Color.black);
    l124.setFont(new Font("Serif",Font.BOLD,17));
    l51 = new JLabel("Ingredients");
    l51.setBounds(10,255,100,25);
    l51.setForeground(Color.darkGray);
    l52 = new JLabel("Cheese, Pizza Base, Ketchup");
    l52.setFont(new Font("Serif",Font.BOLD,12));
    l52.setBounds(0,275,300,25);
    l52.setForeground(Color.darkGray);
    b43 = new JButton("-");
    b43.setBounds(140,238,30,20);
    b43.setBackground(Color.lightGray);
    b43.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b43.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf11.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf11.setText(Integer.toString(quantity));	
            }    
        }
    });
    tf11 = new JTextField("0");
    tf11.setBounds(170,238,25,20);
    tf11.setHorizontalAlignment(SwingConstants.CENTER);
    tf11.setBackground(Color.lightGray);
    tf11.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf11.setEditable(false);
    b44 = new JButton("+");
    b44.setBounds(190,238,30,20);
    b44.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b44.setBackground(Color.lightGray);
    b44.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf11.setForeground(Color.black);
            if(tf11.getText() == "0") {
                tf11.setText("1");
            }
            else{
                int quantity = Integer.parseInt(tf11.getText());
                    quantity++;
                if(quantity == 21)
                    JOptionPane.showMessageDialog(f, "We can take only 20 number of quantity!!!");
                else
                    tf11.setText(Integer.toString(quantity));	        
            }   }    
    });
    b45 = new JButton("Add to Cart ");
    b45.setBounds(10,310,220,20);
    b45.setBackground(new Color(135,121,78));
    b45 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b45.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l124.getText();
            String s2 = tf11.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b45)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf11.getText().equals("0")&&(e.getSource()== b45) )
            {
            tf11.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l20.getText();
                row[0][1] = tf11.getText();
                row[0][2] = l124.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf11.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p22.add(l20); p22.add(l50); p22.add(l51); p22.add(l52); p22.add(b43); p22.add(tf11); p22.add(b44); p22.add(b45);
    p22.add(l105); p22.add(l124);

    p23 = new JPanel();
    p23.setLayout(null);
    p23.setBounds(280,60,240,340);
    l21 = new JLabel("Neapolitan Pizza");
    l21.setBounds(5,5,150,25);
    l21.setFont(new Font("Serif",Font.BOLD,17));
    l53 = new JLabel("",new ImageIcon("./res/neapolitan.png"),SwingConstants.CENTER);
    l53.setBounds(10,40,220,180);
    l106 = new JLabel("Price :");
    l106.setBounds(10,230,80,30);
    l106.setForeground(Color.black);
    l106.setFont(new Font("Serif",Font.BOLD,17));
    l125 = new JLabel("150.00");
    l125.setBounds(70,230,50,30);
    l125.setForeground(Color.black);
    l125.setFont(new Font("Serif",Font.BOLD,17));
    l54 = new JLabel("Ingredients");
    l54.setBounds(10,255,100,25);
    l54.setForeground(Color.darkGray);
    l55 = new JLabel("Bread flour, Kosher Salt, Yeast");
    l55.setFont(new Font("Serif",Font.BOLD,12));
    l55.setBounds(0,275,300,25);
    l55.setForeground(Color.darkGray);
    b46 = new JButton("-");
    b46.setBounds(140,238,30,20);
    b46.setBackground(Color.lightGray);
    b46.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b46.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf12.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf12.setText(Integer.toString(quantity));	
            }    
        }
    });
    tf12 = new JTextField("0");
    tf12.setBounds(170,238,25,20);
    tf12.setHorizontalAlignment(SwingConstants.CENTER);
    tf12.setBackground(Color.lightGray);
    tf12.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf12.setEditable(false);
    b47 = new JButton("+");
    b47.setBounds(190,238,30,20);
    b47.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b47.setBackground(Color.lightGray);
    b47.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf12.setForeground(Color.black);
            if(tf12.getText() == "0") {
                tf12.setText("1");
            }
            else{
                int quantity = Integer.parseInt(tf12.getText());
                    quantity++;
                if(quantity == 21)
                    JOptionPane.showMessageDialog(f, "We can take only 20 number of quantity!!!");
                else
                    tf12.setText(Integer.toString(quantity));	        
            }   }    
    });
    b48 = new JButton("Add to Cart ");
    b48.setBounds(10,310,220,20);
    b48.setBackground(new Color(135,121,78));
    b48 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b48.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l125.getText();
            String s2 = tf12.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b48)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            if(tf12.getText().equals("0")&&(e.getSource()== b48) )
            {
            tf12.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l21.getText();
                row[0][1] = tf12.getText();
                row[0][2] = l125.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf12.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p23.add(l21); p23.add(l53); p23.add(l54); p23.add(l55); p23.add(b46); p23.add(tf12); p23.add(b47); p23.add(b48);
    p23.add(l106); p23.add(l125);

    p24 = new JPanel();
    p24.setLayout(null);
    p24.setBounds(540,60,240,340);    
    l22 = new JLabel("California Pizza");
    l22.setBounds(5,5,150,25);
    l22.setFont(new Font("Serif",Font.BOLD,17));
    l56 = new JLabel("",new ImageIcon("./res/california.png"),SwingConstants.CENTER);
    l56.setBounds(10,40,220,180);
    l107 = new JLabel("Price :");
    l107.setBounds(10,230,80,30);
    l107.setForeground(Color.black);
    l107.setFont(new Font("Serif",Font.BOLD,17));
    l126 = new JLabel("190.00");
    l126.setBounds(70,230,50,30);
    l126.setForeground(Color.black);
    l126.setFont(new Font("Serif",Font.BOLD,17));
    l57 = new JLabel("Ingredients");
    l57.setBounds(10,255,100,25);
    l57.setForeground(Color.darkGray);
    l58 = new JLabel("Pizza Base, Cooked Chicken, Ketchup");
    l58.setFont(new Font("Serif",Font.BOLD,12));
    l58.setBounds(0,275,300,25);
    l58.setForeground(Color.darkGray);
    b49 = new JButton("-");
    b49.setBounds(140,238,30,20);
    b49.setBackground(Color.lightGray);
    b49.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b49.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int quantity  = Integer.parseInt(tf13.getText());
            if(quantity > 0) 
            {
                    quantity--;
                    tf13.setText(Integer.toString(quantity));	
            }    
        }
    });
    tf13 = new JTextField("0");
    tf13.setBounds(170,238,25,20);
    tf13.setHorizontalAlignment(SwingConstants.CENTER);
    tf13.setBackground(Color.lightGray);
    tf13.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    tf13.setEditable(false);
    b50 = new JButton("+");
    b50.setBounds(190,238,30,20);
    b50.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    b50.setBackground(Color.lightGray);
    b50.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            tf13.setForeground(Color.black);
            if(tf13.getText() == "0") {
                tf13.setText("1");
            }
            else{
                int quantity = Integer.parseInt(tf13.getText());
                    quantity++;
                if(quantity == 21)
                    JOptionPane.showMessageDialog(f, "We can take only 20 number of quantity!!!");
                else
                    tf13.setText(Integer.toString(quantity));	        
            }   }    
    });
    b51 = new JButton("Add to Cart ");
    b51.setBounds(10,310,220,20);
    b51.setBackground(new Color(135,121,78));
    b51 .setBorder(BorderFactory.createLineBorder(new Color(135,121,78)));
    b51.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s1 = l126.getText();
            String s2 = tf13.getText();
     
            double c1 = Double.parseDouble(s1);
            double c2 = Double.parseDouble(s2);
            double d1 = 0;
			if(e.getSource()==b51)
			{
               d1 =c1 *c2;
			}
			String result = String.valueOf(d1);
            l127.setText(result);
            
            if(tf13.getText().equals("0")&&(e.getSource()== b51) )
            {
            tf13.setForeground(Color.red);
            }
            
           else{    
                row[0][0] = l22.getText();
                row[0][1] = tf13.getText();
                row[0][2] = l126.getText();
                row[0][3] = l127.getText();
                model.addRow(row[0]);
                
                tf13.setText("0");
                JOptionPane.showMessageDialog(null, "Save Successful.");
            }
        }
    });
    p24.add(l22); p24.add(l56); p24.add(l57); p24.add(l58); p24.add(b49); p24.add(tf13); p24.add(b50); p24.add(b51);
    p24.add(l107); p24.add(l126);

    b27 = new JButton("Back to Category ");
    b27.setBounds(20,420,130,25);
    b27.setBackground(Color.gray);
    b27.setBorder(BorderFactory.createLineBorder(Color.gray));

    p12.add(p22);  p12.add(p23);  p12.add(p24); p12.add(b27);
    p12.setVisible(false);
    f.add(p12);






//ORDER PAGE     
    //panel p7
    p7=new JPanel();
    p7.setLayout(null);
    p7.setBounds(200,75,800,495);
    p7.setBackground(Color.white);
    l88 = new JLabel("Your Orders");
    l88.setBounds(310,20,190,40);
    l88.setFont(new Font("Serif",Font.BOLD,30));

    p38=new JPanel();
    p38.setLayout(null);
    p38.setBounds(150,80,500,325);

    l145 = new JLabel("------------------------------------------------------------------------------------------------------------------------");
    l145.setBounds(10,0,500,30);

    l139 = new JLabel("|| Cafe Blue ||");
    l139.setFont(new Font("Serif",Font.TRUETYPE_FONT,25));
    l139.setBounds(180,20,150,32);
    l144 = new JLabel("------------------------------------------------------------------------------------------------------------------------");
    l144.setBounds(10,40,500,30);

    l137 = new JLabel("");
    l137.setBounds(80,80,300,20);
    l137.setFont(new Font("Serif",Font.TRUETYPE_FONT,15));
    l138 = new JLabel("");
    l138.setBounds(80,100,300,20);
    l138.setFont(new Font("Serif",Font.TRUETYPE_FONT,15));
    l140 = new JLabel("");
    l140.setBounds(80,120,300,20);
    l140.setFont(new Font("Serif",Font.TRUETYPE_FONT,15));
    l141 = new JLabel("");
    l141.setBounds(80,140,300,20);
    l141.setFont(new Font("Serif",Font.TRUETYPE_FONT,15));
    l142 = new JLabel("");
    l142.setBounds(80,160,300,20);
    l142.setFont(new Font("Serif",Font.TRUETYPE_FONT,15));
    l146 = new JLabel("________________________________________________________________________");
    l146.setBounds(10,260,500,30);
    l146.setVisible(false);
    l147 = new JLabel("No Orders ");
    l147.setBounds(120,100,200,30);
    l147.setFont(new Font("Serif",Font.PLAIN,25));
    l147.setForeground(Color.red);

    l148 = new JLabel("");
    l148.setBounds(280,275,250,40);
    l148.setFont(new Font("Serif",Font.BOLD,20));
  
   

    p38.add(l139); p38.add(l137); p38.add(l138); p38.add(l140); p38.add(l141); p38.add(l142); p38.add(l144); p38.add(l145);
    p38.add(l146); p38.add(l147); p38.add(l148);


    p7.add(l88); p7.add(p38); 
    p7.setVisible(false);
    f.add(p7);

//CART PAGE     
    //panel p6
    p6=new JPanel();
    p6.setLayout(null);
    p6.setBounds(200,75,800,495);
    p6.setBackground(Color.white);

    l10 = new JLabel("Your Cart");
    l10.setBounds(330,20,150,40);
    l10.setFont(new Font("Serif",Font.BOLD,30));
        

     

     Icon i7 = new ImageIcon("./res/pqr1.png");
        b82 = new JButton("",i7);
        b82.setBounds(650,350,60,75);
        b82.setBorder(BorderFactory.createLineBorder(Color.white));
        
        b82.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                String a1 = (model.getValueAt(0,3).toString());
                String b1 = (model.getValueAt(1,3).toString());
                String c1 = (model.getValueAt(2,3).toString());
                String d1 = (model.getValueAt(3,3).toString());
                String e1 = (model.getValueAt(4,3).toString());

               double a = Double.parseDouble(a1);
               double b = Double.parseDouble(b1);
               double c = Double.parseDouble(c1);
               double d = Double.parseDouble(d1);
               double x = Double.parseDouble(e1);
               double s = 0;
                if(ae.getSource()== b82)
                {
                      s = a + b + c + d + x ;
                      l148.setVisible(true);
                } 
                String result = String.valueOf(s);
                l148.setText("Total Bill :" + result);
                
                if(ae.getSource()== b82)
                {
                      JOptionPane.showMessageDialog(f, "Your Order is Confirm!!");
               l137.setText((model.getValueAt(0,0).toString()) + " ( " + (model.getValueAt(0,1).toString()) + " )  ~  " + (model.getValueAt(0,3).toString()));
               l138.setText((model.getValueAt(1,0).toString()) + " ( " + (model.getValueAt(1,1).toString()) + " )  ~  " + (model.getValueAt(1,3).toString()));
               l140.setText((model.getValueAt(2,0).toString()) + " ( " + (model.getValueAt(2,1).toString()) + " )  ~  " + (model.getValueAt(2,3).toString()));
               l141.setText((model.getValueAt(3,0).toString()) + " ( " + (model.getValueAt(3,1).toString()) + " )  ~  " + (model.getValueAt(3,3).toString()));
               l142.setText((model.getValueAt(4,0).toString()) + " ( " + (model.getValueAt(4,1).toString()) + " )  ~  " + (model.getValueAt(4,3).toString()));
                    l146.setVisible(true);
                    l147.setVisible(false); 
            }
            
              
            }
        });


        l87 = new JLabel("Confirmed Order!!");
        l87.setBounds(620,430,150,20);
        l87.setFont(new Font("Serif",Font.ITALIC,17));

        Object column[] = {"Item Name","Quantity","Unit Price","Total"};
        model.setColumnIdentifiers(column);
        jt.setModel(model);
      
        p6.add(jt); 
        p6.add(l10); p6.add(b82); p6.add(l87); 

    p6.setVisible(false);
    f.add(p6);




//HELP PAGE    
    //panel p8
    p8=new JPanel();
    p8.setLayout(null);
    p8.setBounds(200,75,800,495);
    p8.setBackground(new Color(204,255,255));
    l6 = new JLabel("Question : ");
    l6.setBounds(50,50,130,25);
    l6.setFont(new Font("Serif",Font.BOLD,20));

    tf2 = new JTextField(500);
    tf2.setBounds(150,50,500,25);

    b10 = new JButton("SUBMIT");
    b10.setBounds(280,100,100,25);
    b10.setEnabled(false);
    tf2.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
            b10.setEnabled(tf1.getText().length() > 0);
        }
    });

    l7 = new JLabel("Your Question is Submited.We will solve your query and reply your Question as early as possible...");
    l7.setBounds(50,150,650,25);
    l7.setForeground(Color.red);
    l7.setFont(new Font("",Font.BOLD,13));
    l7.setVisible(false);

    l8= new JLabel ("Thank You! Visit Again!!");
    l8.setBounds(500,450,250,25);
    l8.setFont(new Font("Serif",Font.BOLD,20));
    l8.setVisible(false);

    p8.setVisible(false);
    p8.add(l6); p8.add(tf2); p8.add(b10); p8.add(l7); p8.add(l8);
    f.add(p8);

     f.setVisible(true);
		
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
     b10.addActionListener(this);
     
     b24.addActionListener(this);
     b25.addActionListener(this);
     b26.addActionListener(this);
     b27.addActionListener(this);

     b52.addActionListener(this);
     b53.addActionListener(this);
     b54.addActionListener(this);

     b55.addActionListener(this);
     b56.addActionListener(this);
     b57.addActionListener(this);
     b73.addActionListener(this);
     b74.addActionListener(this);
     b81.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Menu")) {
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);  
            p9.setVisible(false); p10.setVisible(false); p11.setVisible(false); p12.setVisible(false); 
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false);
            p5.setVisible(true); p36.setVisible(false);
            
        }
        else if(ae.getActionCommand().equals("Cart")) {
            p2.setVisible(false); p5.setVisible(false); p8.setVisible(false); p7.setVisible(false); 
            p9.setVisible(false); p10.setVisible(false); p11.setVisible(false); p12.setVisible(false);
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false);
            p6.setVisible(true); p36.setVisible(false);
        }
        else if(ae.getActionCommand().equals("Order")) {
            p2.setVisible(false); p5.setVisible(false); p6.setVisible(false); p8.setVisible(false);
            p9.setVisible(false); p10.setVisible(false); p11.setVisible(false); p12.setVisible(false);
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false);
            p7.setVisible(true); p36.setVisible(false);
        }
        else if(ae.getActionCommand().equals("Help")) {
            p2.setVisible(false); p5.setVisible(false);  p6.setVisible(false);  p7.setVisible(false);
            p9.setVisible(false);  p10.setVisible(false);  p11.setVisible(false);  p12.setVisible(false); 
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false);
            p8.setVisible(true); p36.setVisible(false);
        }
        
        else if(ae.getActionCommand().equals("Home")) {
            p7.setVisible(false);  p5.setVisible(false);   p6.setVisible(false);  p8.setVisible(false);
            p9.setVisible(false);  p10.setVisible(false);  p11.setVisible(false); p12.setVisible(false);  
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false);
            p2.setVisible(true); p36.setVisible(false);
        }
         else if(ae.getActionCommand().equals("SUBMIT"))
         {
            l7.setVisible(true);
            l8.setVisible(true);
            tf2.setText("");
         }
         
         else if(ae.getActionCommand().equals("a"))
         {
            p7.setVisible(false); p5.setVisible(false); p6.setVisible(false); p8.setVisible(false);
            p2.setVisible(false); p10.setVisible(false); p11.setVisible(false); p12.setVisible(false); 
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false);
            p9.setVisible(true); p36.setVisible(false);
         }
         else if(ae.getActionCommand().equals("b"))
         {
            p7.setVisible(false); p5.setVisible(false); p6.setVisible(false); p8.setVisible(false); 
            p2.setVisible(false); p9.setVisible(false);  p11.setVisible(false); p12.setVisible(false);
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false); 
            p10.setVisible(true); p36.setVisible(false);
         }
         else if(ae.getActionCommand().equals("c"))
         {
            p7.setVisible(false); p5.setVisible(false); p6.setVisible(false); p8.setVisible(false); 
            p2.setVisible(false); p9.setVisible(false); p10.setVisible(false); p12.setVisible(false);
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false); 
            p11.setVisible(true); p36.setVisible(false);
         }
         else if(ae.getActionCommand().equals("d"))
         {
            p7.setVisible(false); p5.setVisible(false); p6.setVisible(false); p8.setVisible(false); 
            p2.setVisible(false); p9.setVisible(false); p10.setVisible(false); p11.setVisible(false); 
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false);
            p12.setVisible(true); p36.setVisible(false);
         }
         else if(ae.getActionCommand().equals("Back to Category ")) 
         {
            
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);
            p9.setVisible(false); p10.setVisible(false); p11.setVisible(false); p12.setVisible(false);
            p26.setVisible(false); p27.setVisible(false); p28.setVisible(false); 
            p5.setVisible(true);  p36.setVisible(false);

        }
        else if(ae.getSource()==b52) {
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);
            p9.setVisible(false); p10.setVisible(false); p11.setVisible(false); p12.setVisible(false); 
            p27.setVisible(false); p28.setVisible(false); p5.setVisible(false);  
            p26.setVisible(true); p36.setVisible(false);
        }
        else if(ae.getSource()==b53) {
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);
            p9.setVisible(false); p10.setVisible(false); p11.setVisible(false); p12.setVisible(false); 
            p26.setVisible(false); p28.setVisible(false); p5.setVisible(false);  
            p27.setVisible(true); p36.setVisible(false);
        }
        else if(ae.getSource()==b54) {
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);
            p9.setVisible(false); p10.setVisible(false); p11.setVisible(false); p12.setVisible(false); 
            p26.setVisible(false); p27.setVisible(false);  p5.setVisible(false);  
            p28.setVisible(true); p36.setVisible(false);
        }
        else if(ae.getSource()==b73) {
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);
            p10.setVisible(false); p11.setVisible(false); p12.setVisible(false); p28.setVisible(false);
            p26.setVisible(false); p27.setVisible(false);  p5.setVisible(false);  
            p9.setVisible(true); p36.setVisible(false);
        }
        else if(ae.getSource()==b74) {
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);
            p9.setVisible(false); ; p11.setVisible(false); p12.setVisible(false); p26.setVisible(false);
            p27.setVisible(false);  p5.setVisible(false);  p28.setVisible(false);
            p10.setVisible(true); p36.setVisible(false);
        }
        
        else if(ae.getSource()==b81) {
            p2.setVisible(false); p8.setVisible(false); p7.setVisible(false); p6.setVisible(false);
            p9.setVisible(false); ; p10.setVisible(false); p12.setVisible(false); p26.setVisible(false);
            p27.setVisible(false);  p5.setVisible(false);  p28.setVisible(false);
            p11.setVisible(true); p36.setVisible(false);
        }
    }
  public static void main (String args[])
  {
      new cafe();
  }
} 
  