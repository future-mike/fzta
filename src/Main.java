import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

class MyFrame extends JFrame {

    public MyFrame(String s) {
        super(s);
        JPanel root = new JPanel();
        JFrame jf = this;
        jf.setContentPane(root);


        JTextArea jTextArea = new JTextArea();
        jTextArea.setPreferredSize(new Dimension(200, 200));
        root.add(jTextArea);
        jTextArea.setLineWrap(true);
        JButton jButton1 = new JButton("open");
        JButton jButton2 = new JButton("save");
        root.add(jButton1);
        root.add(jButton2);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showopendialog(jf, jTextArea);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showsavedialog(jf,jTextArea);
            }
        });

    }
    private void showopendialog(JFrame root, JTextArea jTextArea) {
        JFileChooser jFileChooser=new JFileChooser();

        jFileChooser.setCurrentDirectory(new File("."));

        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        jFileChooser.setMultiSelectionEnabled(true);



        jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("zip(*.zip, *.rar)", "zip", "rar"));
        // 设置默认使用的文件过滤器
        jFileChooser.setFileFilter(new FileNameExtensionFilter("image(*.jpg, *.png, *.gif)", "jpg", "png", "gif"));

       // jFileChooser.setFileFilter(new FileNameExtensionFilter("image(*.jpg,*.png,*.gif)","jpg","png","gif"));
        //jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("zip(*.zip,*.rar)","zip","rar"));
        int res=jFileChooser.showOpenDialog(root);
        if(res==JFileChooser.APPROVE_OPTION)
        {
            File file = jFileChooser.getSelectedFile();

            // 如果允许选择多个文件, 则通过下面方法获取选择的所有文件
            // File[] files = fileChooser.getSelectedFiles();

            jTextArea.append("打开文件: " + file.getAbsolutePath() + "\n\n");

//            File[] files=jFileChooser.getSelectedFiles();
//            for ( File file:files
//                 ) {
//                jTextArea.append("the opening file Path is"+file.getAbsolutePath());
//                jTextArea.append("\n");
//            }

        }
    }
    private void showsavedialog(JFrame root, JTextArea jTextArea) {

    }
//        JButton btn01 = new JButton("Button01");
//        JButton btn02 = new JButton("Button02");
//        JButton btn03 = new JButton("Button03");
//        JButton btn04 = new JButton("Button04");
//        JButton btn05 = new JButton("Button05");
//
//        Box hbox1=Box.createHorizontalBox();
//        hbox1.add(btn01);
//        hbox1.add(btn02);
//        hbox1.add(btn03);
//
//        Box hbox2=Box.createHorizontalBox();
//        hbox2.add(btn04);
//        hbox2.add(Box.createHorizontalGlue());
//        hbox2.add(btn05);
//
//        Box Vbox =Box.createVerticalBox();
//        Vbox.add(hbox1);
//       // Vbox.add(Box.createVerticalBox());
//        Vbox.add(hbox2);
//        jf.setContentPane(Vbox);




        //GridBagLayout gridBagLayout=new GridBagLayout();

//        GridLayout gridLayout=new GridLayout(3,3);
//        root.setLayout(gridLayout);
//        root.add(new JButton("1"));
//        root.add(new JButton("2"));
//        root.add(new JButton("3"));
//        root.add(new JButton("4"));
//        root.add(new JButton("5"));
//        root.add(new JButton("6"));
//        root.add(new JButton("7"));

//        BorderLayout borderLayout=new BorderLayout();
//        root.setLayout(borderLayout);
//        JLabel label1=new JLabel("1");
//        label1.setOpaque(true);
//        root.add(label1,BorderLayout.WEST);
//        label1.setBackground(Color.BLUE);
//        label1.setPreferredSize(new Dimension(100,200));
//        label1.setHorizontalAlignment(SwingConstants.CENTER);
//        JLabel label2=new JLabel("2");
//        root.add(label2,BorderLayout.NORTH);
//        label2.setHorizontalAlignment(SwingConstants.CENTER);
//
        //ButtonGroup buttonGroup=new ButtonGroup();

//        JCheckBox jCheckBox=new JCheckBox("zheshi");
//        jCheckBox.setSelected(false);
//        JButton button=new JButton("wdw");
//        button.setEnabled(false);
//        root.add(jCheckBox);
//        root.add(button);
//        jCheckBox.addActionListener(e -> {
//            if (jCheckBox.isSelected()){
//                button.setEnabled(true);
//            }
//            else {
//                button.setEnabled(false);
//            }
//        });

//        JButton jButton = new JButton("test");
//        root.add(jButton);
//
//
//
//        JLabel jLabel=new JLabel();
//        jLabel.setText("this is my wife");
//        ImageIcon imageIcon=new ImageIcon("icon1.jpg");
//        jLabel.setIcon(imageIcon);
//
//        jLabel.setHorizontalTextPosition(SwingConstants.CENTER);
//        jLabel.setVerticalTextPosition(SwingConstants.BOTTOM);

//        jLabel.setPreferredSize(new Dimension(40,50));
//        jLabel.setHorizontalAlignment(SwingConstants.LEFT);
//        jLabel.setVerticalAlignment(SwingConstants.CENTER);
//        jLabel.setOpaque(true);
//        jLabel.setBackground(Color.BLUE);

        //root.add(jLabel);
//        JTextArea jTextArea=new JTextArea("dwadw",3,4);
//        root.add(jTextArea);
//        jTextArea.setLineWrap(true);
//        jTextArea.setWrapStyleWord(false);
//        jTextArea.setFont(new Font("正文宋体",Font.BOLD,16));
//        jTextArea.setForeground(Color.BLUE);
//        jTextArea.getDocument().addDocumentListener(new DocumentListener() {
//            @Override
//            public void insertUpdate(DocumentEvent e) {
//                System.out.println(jTextArea.getText()+jTextArea.getLineCount());
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent e) {
//
//            }
//
//            @Override
//            public void changedUpdate(DocumentEvent e) {
//
//            }
        //});
//        JComboBox<String> jComboBox=new JComboBox<>();
//        jComboBox.addItem("红色");
//        jComboBox.addItem("绿色");
//        root.add(jComboBox);
//        jComboBox.setEditable(true);
//        jComboBox.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if(e.getStateChange()==ItemEvent.SELECTED){
//                    System.out.println(jComboBox.getSelectedItem());
//                }
//
//            }
        // });

//        jButton.addActionListener(e -> {
////            System.out.println(jComboBox.getSelectedItem());
//        });

//
//        JButton jButton1 = new JButton("信息消息");
//        jButton1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(
//                        jf,
//                        "you are accepted",
//                        "消息窗口",
//                        JOptionPane.INFORMATION_MESSAGE
//                );
//            }
//        });
//        JButton jButton2 = new JButton("警告消息");
//        jButton2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(
//                        jf,
//                        "sorry，you are failed",
//                        "警告窗口",
//                        JOptionPane.WARNING_MESSAGE
//                );
//            }
//        });
//        JButton jButton3 = new JButton("确认消息");
//        jButton3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int res = JOptionPane.showConfirmDialog(
//                        jf,
//                        "请您确认消息",
//                        "确认窗口",
//                        JOptionPane.YES_NO_CANCEL_OPTION
//
//                        );
//                System.out.println(""+res);
//            }
//        });
//        JButton jButton4=new JButton("确认下拉对话框");
//        jButton4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Object[] list={"pingg","xiangjiao"};
//
//                Object res= JOptionPane.showInputDialog(
//                        jf,
//                        "请选择一个",
//                        "确认下拉",
//                        JOptionPane.PLAIN_MESSAGE,
//                        null,
//                        list,
//                        list[0]
//                );
//                System.out.println(res);
//            }
//        });
//        JButton jButton5=new JButton("输入");
//        jButton5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String res= JOptionPane.showInputDialog(
//                  jf,
//                  "qingshuru",
//                  "morenxinxi"
//                );
//                System.out.println(res);
//            }
//        });
//        JButton jButton6=new JButton("xuanze");
//        jButton6.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Object[] options = new Object[]{"香蕉", "雪梨", "苹果"};
//                int res=JOptionPane.showOptionDialog(
//                        jf,
//                        "xuanze",
//                        "xuanze",
//                        JOptionPane.YES_NO_CANCEL_OPTION,
//                        JOptionPane.ERROR_MESSAGE,
//                        null,
//                        options,
//                        options[0]
//
//                );
//                System.out.println(options[res]);
//            }
//        });
//        jf.add(jButton1);
//        jf.add(jButton2);
//        jf.add(jButton3);
//        jf.add(jButton4);
//        jf.add(jButton5);
//        jf.add(jButton6);





}

public class Main {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("this is my title");
        myFrame.setSize(200,300);
        //myFrame.pack();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}

