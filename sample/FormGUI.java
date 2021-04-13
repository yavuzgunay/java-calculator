package sample;

import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import java.awt.*;
import java.net.URL;

import static javafx.application.Application.launch;
import static javax.swing.UIManager.setLookAndFeel;
import static javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme;

public class FormGUI extends JFrame implements ActionListener {
    private JTextField textField1;
    private JButton numpad7;
    private JButton numpad1;
    private JButton numpad4;
    private JButton dotbtn;
    private JButton numpad8;
    private JButton numpad9;
    private JButton additionbtn;
    private JButton numpad5;
    private JButton numpad2;
    private JButton numpad0;
    private JButton numpad6;
    private JButton numpad3;
    private JButton equalbtn;
    private JButton subtractionbtn;
    private JButton dividebtn;
    private JButton multiplicationbtn;
    private JButton sinbtn;
    private JButton cosbtn;
    private JButton tanbtn;
    private JButton logbtn;
    private JButton rootbtn;
    private JButton squarebtn;
    private JButton absolutebtn;
    private JButton powerbtn;
    private JButton lnbtn;
    private JButton exponentbtn;
    private JButton factorialbtn;
    private JButton onoffbtn;
    private JButton deletebtn;
    private JButton resetbtn;
    private JButton resetoperationbtn;
    private JPanel formpanel;
    private JLabel equaltoLbl;


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    @Override
    public void actionPerformed(ActionEvent action) {
        String text = textField1.getText();
        if(action.getSource()== onoffbtn) {
            if(onoffcontrol==0){
                textField1.setEnabled(false);
                onoffcontrol=1;
                textField1.setText("");
            }
            else if(onoffcontrol==1){
                onoffcontrol=0;
                textField1.setEnabled(true);
                textField1.setText("0");
            }
        }
        if(onoffcontrol==0){
        if (action.getSource() == numpad0) {
            Numpad0();
        }
        if (action.getSource() == numpad1) {
            Numpad("1");
        }
        if (action.getSource() == numpad2) {
            Numpad("2");
        }
        if (action.getSource() == numpad3) {
            Numpad("3");
        }
        if (action.getSource() == numpad4) {
            Numpad("4");
        }
        if (action.getSource() == numpad5 ) {
            Numpad("5");
        }
        if (action.getSource() == numpad6) {
            Numpad("6");
        }
        if (action.getSource() == numpad7) {
            Numpad("7");
        }
        if (action.getSource() == numpad8) {
            Numpad("8");
        }
        if (action.getSource() == numpad9) {
            Numpad("9");
        }
        if (action.getSource() == dotbtn) {
            DotKey();
        }
        if(action.getSource()== deletebtn){
            BackSpaceKey();
        }
        if (action.getSource() == additionbtn) {

                PlusKey();

        }
        if (action.getSource() == subtractionbtn) {
                MinusKey();
        }
        if (action.getSource() == multiplicationbtn) {
            MultiplyKey();
        }
        if (action.getSource() == dividebtn) {
            DivideKey();
        }
        if (action.getSource() == powerbtn) {
            XPowerYKey();
        }
        if (action.getSource() == sinbtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+"sin"+textField1.getText()+" ");
                result=sin(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText(equaltoLbl.getText()+"sin"+textField1.getText()+currentOperation);
                if(currentOperation=="+")
                {
                    result+=sin(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="-")
                {
                    result-=sin(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="*")
                {
                    result*=sin(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="/")
                {
                    result/=sin(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="^")
                {
                    result=Math.pow(result,sin(Double.parseDouble(textField1.getText())));
                    tempresult=result;

                }
            }
            textField1.setText(""+result);

        }
        if (action.getSource() == cosbtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+"cos"+textField1.getText()+" ");
                result=cos(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText(equaltoLbl.getText()+"cos"+textField1.getText()+currentOperation);
                if(currentOperation=="+")
                {
                    result+=cos(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="-")
                {
                    result-=cos(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="*")
                {
                    result*=cos(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="/")
                {
                    result/=cos(Double.parseDouble(textField1.getText()));
                    tempresult=result;

                }
                if(currentOperation=="^")
                {
                    result=Math.pow(number,cos(Double.parseDouble(textField1.getText())));
                    tempresult=result;

                }
            }
            textField1.setText(""+result);
        }
        if (action.getSource() == tanbtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+"tan"+textField1.getText()+" ");
                result=tan(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText(equaltoLbl.getText()+"tan"+textField1.getText()+currentOperation);
            if(currentOperation=="+")
            {
            result+=tan(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            if(currentOperation=="-")
            {
                result-=tan(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            if(currentOperation=="*")
            {
                result*=tan(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            if(currentOperation=="/")
            {
                result/=tan(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            if(currentOperation=="^")
            {
                result=Math.pow(number,tan(Double.parseDouble(textField1.getText())));
                tempresult=result;

            }
            }
            textField1.setText(""+result);

        }
        if (action.getSource() == logbtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+"log"+textField1.getText()+" ");
                result=log(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText(equaltoLbl.getText()+"log"+textField1.getText()+currentOperation);
                if(currentOperation=="+")
                {
                    result+=log(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="-")
                {
                    result-=log(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="*")
                {
                    result*=log(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="/")
                {
                    result/=log(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="^")
                {
                    result=Math.pow(result,log(Double.parseDouble(textField1.getText())));
                    tempresult=result;

                }
            }
            textField1.setText(""+result);
        }
        if (action.getSource() == lnbtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+"ln"+textField1.getText()+" ");
                result=ln(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText(equaltoLbl.getText()+"ln"+textField1.getText()+currentOperation);
                if(currentOperation=="+")
                {
                    result+=ln(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="-")
                {
                    result-=ln(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="*")
                {
                    result*=ln(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="/")
                {
                    result/=ln(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="^")
                {
                    result=Math.pow(result,ln(Double.parseDouble(textField1.getText())));
                    tempresult=result;

                }
            }
            textField1.setText(""+result);
        }
        if (action.getSource() == rootbtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+"√"+textField1.getText()+" ");
                result=sqrt(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText(equaltoLbl.getText()+"√"+textField1.getText()+currentOperation);
                if(currentOperation=="+")
                {
                    result+=sqrt(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="-")
                {
                    result-=sqrt(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="*")
                {
                    result*=sqrt(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="/")
                {
                    result/=sqrt(Double.parseDouble(textField1.getText()));
                    tempresult=result;

                }
                if(currentOperation=="^")
                {
                    result=Math.pow(number,sqrt(Double.parseDouble(textField1.getText())));
                    tempresult=result;

                }
            }
            textField1.setText(""+result);
        }
        if (action.getSource() == absolutebtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText("|"+textField1.getText()+"| ");
                result=absolute(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText("|"+textField1.getText()+"|=");
                if(currentOperation=="+")
                {
                    result=absolute(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="-")
                {
                    result=absolute(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="*")
                {
                    result=absolute(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="/")
                {
                    result=absolute(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="^")
                {
                    result=Math.pow(number,absolute(Double.parseDouble(textField1.getText())));
                    tempresult=result;

                }
            }
            number=absolute(Double.parseDouble(textField1.getText()));
            textField1.setText(""+result);
        }
        if (action.getSource() == squarebtn) {

            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+textField1.getText()+"^2 ");
                result=Square(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText(equaltoLbl.getText()+textField1.getText()+"^2"+currentOperation);
                if(currentOperation=="+")
                {
                    result+=Square(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="-")
                {
                    result-=Square(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="*")
                {
                    result*=Square(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="/")
                {
                    result/=Square(Double.parseDouble(textField1.getText()));
                    tempresult=result;

                }
                if(currentOperation=="^")
                {
                    result=Math.pow(result,Square(Double.parseDouble(textField1.getText())));
                    tempresult=result;

                }
            }
            textField1.setText(""+result);
        }
        if (action.getSource() == exponentbtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+"Exp"+textField1.getText()+" ");
                result=exp(Double.parseDouble(textField1.getText()));
                tempresult=result;
            }
            else{
                equaltoLbl.setText(equaltoLbl.getText()+"Exp"+textField1.getText()+currentOperation);
                if(currentOperation=="+")
                {
                    result+=exp(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="-")
                {
                    result-=exp(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="*")
                {
                    result*=exp(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="/")
                {
                    result/=exp(Double.parseDouble(textField1.getText()));
                    tempresult=result;
                }
                if(currentOperation=="^")
                {
                    result=Math.pow(result,exp(Double.parseDouble(textField1.getText())));
                    tempresult=result;

                }
            }
            textField1.setText(""+result);
        }
        if (action.getSource() == factorialbtn) {
            if(result==0 || currentOperation=="")
            {
                equaltoLbl.setText(equaltoLbl.getText()+textField1.getText()+"! ");
                result=factorial(Double.parseDouble(textField1.getText()));
                tempresult=result;
                textField1.setText(""+result);
            }
            else {
                if (currentOperation == "+") {
                    if (tempresult == Double.parseDouble(textField1.getText())) {
                        equaltoLbl.setText(" ");
                        equaltoLbl.setText(equaltoLbl.getText() + textField1.getText() + "! ");
                    } else {
                        equaltoLbl.setText(equaltoLbl.getText() + textField1.getText() + "! ");
                        result += factorial(Double.parseDouble(textField1.getText()));
                        tempresult = result;
                        number = factorial(Double.parseDouble(textField1.getText()));
                        textField1.setText("" + result);
                    }


                } else if (currentOperation == "-") {
                    equaltoLbl.setText(equaltoLbl.getText() + textField1.getText() + "! ");
                    result -= factorial(Double.parseDouble(textField1.getText()));
                    number = factorial(Double.parseDouble(textField1.getText()));
                    textField1.setText("" + result);
                } else if (currentOperation == "/") {
                    equaltoLbl.setText(equaltoLbl.getText() + textField1.getText() + "! ");
                    result = number / factorial(Double.parseDouble(textField1.getText()));
                    number = factorial(Double.parseDouble(textField1.getText()));
                    textField1.setText("" + result);
                } else if (currentOperation == "*") {
                    equaltoLbl.setText(equaltoLbl.getText() + textField1.getText() + "! ");
                    result = number * factorial(Double.parseDouble(textField1.getText()));
                    number = factorial(Double.parseDouble(textField1.getText()));
                    textField1.setText("" + result);
                } else if (currentOperation == "^") {
                    equaltoLbl.setText(equaltoLbl.getText() + textField1.getText() + "! ");
                    double factorialNumberDO = factorial(Double.parseDouble(textField1.getText()));
                    int factorialNumber = (int) factorialNumberDO;
                    result = (int) number ^ factorialNumber;
                    number = factorial(Double.parseDouble(textField1.getText()));
                    textField1.setText("" + result);
                } else {
                    equaltoLbl.setText(equaltoLbl.getText() + textField1.getText() + "! ");
                    number = factorial(Double.parseDouble(textField1.getText()));
                    result = factorial(Double.parseDouble(textField1.getText()));
                    textField1.setText("" + factorial(Double.parseDouble(textField1.getText())));
                }
            }
        }
        if (action.getSource() == resetoperationbtn) {
            if(onoffcontrol==0)
                textField1.setText("0");
            currentOperation = "";
            equaltoLbl.setText(" ");
            result = 0;
            number = 0;
        }
        if (action.getSource() == resetbtn) {
            if(onoffcontrol==0)
                textField1.setText("0");
            currentOperation = "";
            number = 0;
        }

        if(action.getSource()== equalbtn){
            EqualKey();
        }
        }
    }
    private class MyDispatcher implements KeyEventDispatcher {
        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            String text = textField1.getText();
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                if(e.getKeyCode()== KeyEvent.VK_0 || e.getKeyCode()== KeyEvent.VK_NUMPAD0){
                    Numpad0();
                }
                if(e.getKeyCode()== KeyEvent.VK_1 || e.getKeyCode()== KeyEvent.VK_NUMPAD1){
                    Numpad("1");
                }
                if(e.getKeyCode()== KeyEvent.VK_2 || e.getKeyCode()== KeyEvent.VK_NUMPAD2){
                    Numpad("2");
                }
                if(e.getKeyCode()== KeyEvent.VK_3 || e.getKeyCode()== KeyEvent.VK_NUMPAD3){
                    Numpad("3");
                }
                if(e.getKeyCode()== KeyEvent.VK_4 || e.getKeyCode()== KeyEvent.VK_NUMPAD4){
                    Numpad("4");
                }
                if(e.getKeyCode()== KeyEvent.VK_5 || e.getKeyCode()== KeyEvent.VK_NUMPAD5){
                    Numpad("5");
                }
                if(e.getKeyCode()== KeyEvent.VK_6 || e.getKeyCode()== KeyEvent.VK_NUMPAD6){
                    Numpad("6");
                }
                if(e.getKeyCode()== KeyEvent.VK_7 || e.getKeyCode()== KeyEvent.VK_NUMPAD7){
                    Numpad("7");
                }
                if(e.getKeyCode()== KeyEvent.VK_8 || e.getKeyCode()== KeyEvent.VK_NUMPAD8){
                    Numpad("8");
                }
                if(e.getKeyCode()== KeyEvent.VK_9 || e.getKeyCode()== KeyEvent.VK_NUMPAD9){
                    Numpad("9");
                }
                if(e.getKeyCode()== KeyEvent.VK_ENTER || e.getKeyCode() == 13){
                    EqualKey();
                }
                if(e.getKeyCode()== KeyEvent.VK_PLUS || e.getKeyCode() == 107){
                    PlusKey();
                    }
                if(e.getKeyCode()== KeyEvent.VK_MINUS || e.getKeyCode() == 109){
                    MinusKey();
                }
                if(e.getKeyCode()== KeyEvent.VK_MULTIPLY){
                    MultiplyKey();
                }
                if(e.getKeyCode()== KeyEvent.VK_DIVIDE){
                    DivideKey();
                }
                if(e.getKeyCode()== 110 || e.getKeyCode() == 190) {
                    DotKey();
                }
                if(e.getKeyCode()== KeyEvent.VK_BACK_SPACE || e.getKeyCode() == 46) {
                    BackSpaceKey();
                }
            } else if (e.getID() == KeyEvent.KEY_RELEASED) {
            } else if (e.getID() == KeyEvent.KEY_TYPED) {
            }
            return false;
        }
    }
    public FormGUI() {
        setLayout(new BorderLayout());
        setTitle("Calculator");
        setSize(250, 1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        setUndecorated(true);
        numpad1.setFocusPainted(false);
        numpad2.setFocusPainted(false);
        numpad3.setFocusPainted(false);
        numpad4.setFocusPainted(false);
        numpad5.setFocusPainted(false);
        numpad6.setFocusPainted(false);
        numpad7.setFocusPainted(false);
        numpad8.setFocusPainted(false);
        numpad9.setFocusPainted(false);
        numpad0.setFocusPainted(false);
        additionbtn.setFocusPainted(false);
        subtractionbtn.setFocusPainted(false);
        multiplicationbtn.setFocusPainted(false);
        dotbtn.setFocusPainted(false);
        dividebtn.setFocusPainted(false);
        onoffbtn.setFocusPainted(false);
        sinbtn.setFocusPainted(false);
        cosbtn.setFocusPainted(false);
        tanbtn.setFocusPainted(false);
        logbtn.setFocusPainted(false);
        lnbtn.setFocusPainted(false);
        powerbtn.setFocusPainted(false);
        exponentbtn.setFocusPainted(false);
        rootbtn.setFocusPainted(false);
        //resetbtn.setFocusPainted(false);
        //resetoperationbtn.setFocusPainted(false);
        //equalbtn.setFocusPainted(false);
        squarebtn.setFocusPainted(false);
        deletebtn.setFocusPainted(false);
        factorialbtn.setFocusPainted(false);
        absolutebtn.setFocusPainted(false);

        try {
            setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/calculator.png"));
        setIconImage(icon);
        formpanel.setBorder(new EmptyBorder(5,5,5,5));
        textField1.setBorder(null);
        setVisible(true);
        add(formpanel);
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
        textField1.setHorizontalAlignment(SwingConstants.RIGHT);
        ImageIcon ic = new ImageIcon(getClass().getResource("/images/backspace.png"));
        deletebtn.setIcon(ic);
        numpad7.addActionListener(this);
        numpad8.addActionListener(this);
        numpad9.addActionListener(this);
        numpad4.addActionListener(this);
        numpad5.addActionListener(this);
        numpad6.addActionListener(this);
        numpad1.addActionListener(this);
        numpad2.addActionListener(this);
        numpad3.addActionListener(this);
        dotbtn.addActionListener(this);
        numpad0.addActionListener(this);
        equalbtn.addActionListener(this);
        additionbtn.addActionListener(this);
        subtractionbtn.addActionListener(this);
        dividebtn.addActionListener(this);
        multiplicationbtn.addActionListener(this);
        sinbtn.addActionListener(this);
        cosbtn.addActionListener(this);
        tanbtn.addActionListener(this);
        logbtn.addActionListener(this);
        rootbtn.addActionListener(this);
        squarebtn.addActionListener(this);
        absolutebtn.addActionListener(this);
        powerbtn.addActionListener(this);
        lnbtn.addActionListener(this);
        exponentbtn.addActionListener(this);
        factorialbtn.addActionListener(this);
        onoffbtn.addActionListener(this);
        deletebtn.addActionListener(this);
        resetbtn.addActionListener(this);
        resetoperationbtn.addActionListener(this);
         String text = textField1.getText();

    }
    int onoffcontrol=0;
    String currentOperation,ans;
    double number = 0,result,tempresult=0;
    public static void main(String[] args) {
        FormGUI myForm = new FormGUI();
        myForm.pack();
        myForm.setVisible(true);
    }
    public void Numpad0() // time in milliseconds
    {
        if(onoffcontrol==0)
            if (textField1.getText().equals("0"))
            {
                textField1.setText("0");
            }
            if(tempresult == Double.parseDouble(textField1.getText())){
                textField1.setText("0");
                tempresult=Math.random();
            }
            else if(!textField1.getText().equals("0")) {
                textField1.setText(textField1.getText()+"0");

            }
    }
    public void Numpad(String key) // time in milliseconds
    {
        if(onoffcontrol==0){

            if (textField1.getText().equals("0."))
            {
                    textField1.setText(textField1.getText()+key);
            }
            else if(textField1.getText().equals("0"))
            {
                textField1.setText(key);
            }
            else if(tempresult == Double.parseDouble(textField1.getText())){
                tempresult=Math.random();
                textField1.setText(""+key);
            }
            else{
                textField1.setText(textField1.getText()+key);
            }

        }
    }
    public void PlusKey() // time in milliseconds
    {
        if(equaltoLbl.getText().length()>30){
            equaltoLbl.setText("...");
        }
        if(onoffcontrol==0){
            if(currentOperation=="-")
            {
                MinusKey();
                currentOperation="+";
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
            }
            else if(currentOperation=="/"){
                DivideKey();
                currentOperation="+";
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
            }
            else if(currentOperation=="^"){
                XPowerYKey();
                currentOperation="+";
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
            }
            else if(currentOperation=="*"){
                MultiplyKey();
                currentOperation="+";
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
            }
            else{
                if(tempresult == Double.parseDouble(textField1.getText())){
                    currentOperation = "+";
                    equaltoLbl.setText(" ");
                    equaltoLbl.setText("" +equaltoLbl.getText()+ equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1)+textField1.getText()+currentOperation);
                }
                else {
                    if(result == 0)
                    {
                        currentOperation = "+";
                        number= Double.parseDouble(textField1.getText());
                        result=number;
                        tempresult=result;
                        equaltoLbl.setText(" ");
                        equaltoLbl.setText(""+equaltoLbl.getText()+textField1.getText()+currentOperation);
                    }
                    else{
                        number= Double.parseDouble(textField1.getText());
                        result+=number;
                        tempresult=result;
                        ans= equaltoLbl.getText()+""+number;
                        equaltoLbl.setText(ans+currentOperation);
                    }
                    textField1.setText(""+result);
                }
            }
        }


    }
    public void MinusKey() // time in milliseconds
    {
        if(onoffcontrol==0) {
            if (equaltoLbl.getText().length() > 30) {
                equaltoLbl.setText("...");
            }
            if (currentOperation == "+") {
                PlusKey();
                currentOperation = "-";
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
            } else if (currentOperation == "/") {
                DivideKey();
                currentOperation = "-";
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
            } else if (currentOperation == "^") {
                XPowerYKey();
                currentOperation = "-";
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
            } else if (currentOperation == "*") {
                MultiplyKey();
                currentOperation = "-";
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
            }
            else {
                if (tempresult == Double.parseDouble(textField1.getText())) {
                    currentOperation = "-";
                    equaltoLbl.setText(" ");
                    equaltoLbl.setText("" + equaltoLbl.getText() + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + textField1.getText() + currentOperation);
                } else {
                    if (result == 0) {
                        currentOperation = "-";
                        number = Double.parseDouble(textField1.getText());
                        result = number;
                        tempresult = result;
                        equaltoLbl.setText(" ");
                        equaltoLbl.setText("" + equaltoLbl.getText() + textField1.getText() + currentOperation);
                    } else {
                        number = Double.parseDouble(textField1.getText());
                        result -= number;
                        tempresult = result;
                        ans = equaltoLbl.getText() + "" + number;
                        equaltoLbl.setText(ans + currentOperation);
                    }
                    textField1.setText("" + result);
                }
            }
        }
    }
    public void DivideKey() // time in milliseconds
    {

        if(equaltoLbl.getText().length()>30){
            equaltoLbl.setText("...");
        }
        if(currentOperation=="+")
        {
            PlusKey();
            currentOperation="/";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else if(currentOperation=="-"){
            MinusKey();
            currentOperation="/";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else if(currentOperation=="^"){
            XPowerYKey();
            currentOperation="/";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else if(currentOperation=="*"){
            MultiplyKey();
            currentOperation="/";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else {
            if (onoffcontrol == 0) {
                currentOperation = "/";
                if (tempresult == Double.parseDouble(textField1.getText())) {
                    equaltoLbl.setText(" ");
                    equaltoLbl.setText("" +equaltoLbl.getText()+ equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1)+textField1.getText()+currentOperation);
                } else {
                    if (result == 0) {
                        number = Double.parseDouble(textField1.getText());
                        result = number;
                        tempresult=result;
                        equaltoLbl.setText(equaltoLbl.getText() + "" + number + currentOperation);
                        textField1.setText("" + result);
                    } else {

                        number = Double.parseDouble(textField1.getText());
                        if(Double.parseDouble(textField1.getText())==0) {
                            JOptionPane.showMessageDialog(null,"Cannot Divide by zero","Error: Divide",JOptionPane.ERROR_MESSAGE);
                            number=0;
                            result=0;
                            textField1.setText("0");
                            equaltoLbl.setText(" ");
                        }
                        else{
                            result /= number;
                            tempresult=result;
                            equaltoLbl.setText(equaltoLbl.getText() + "" + number + currentOperation);
                            textField1.setText("" + result);
                        }

                    }
                }
            }
        }
    }
    public void MultiplyKey() // time in milliseconds
    {
        if(equaltoLbl.getText().length()>30){
            equaltoLbl.setText("...");
        }
        if(currentOperation=="+")
        {
            PlusKey();
            currentOperation="*";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else if(currentOperation=="/"){
            DivideKey();
            currentOperation="*";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else if(currentOperation=="^"){
            XPowerYKey();
            currentOperation="*";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else if(currentOperation=="-"){
            MinusKey();
            currentOperation="*";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else{
            if(tempresult == Double.parseDouble(textField1.getText())){
                currentOperation = "+";
                equaltoLbl.setText(" ");
                equaltoLbl.setText("" +equaltoLbl.getText()+ equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1)+textField1.getText()+currentOperation);
            }
        else {
                if (result == 0) {
                    currentOperation = "*";
                    number = Double.parseDouble(textField1.getText());
                    result = number;
                    tempresult = result;
                    equaltoLbl.setText(" ");
                    equaltoLbl.setText("" + equaltoLbl.getText() + textField1.getText() + currentOperation);
                } else {
                    number = Double.parseDouble(textField1.getText());
                    result *= number;
                    tempresult = result;
                    ans = equaltoLbl.getText() + "" + number;
                    equaltoLbl.setText(ans + currentOperation);
                }
                textField1.setText("" + result);
            }
        }
    }
    public void XPowerYKey() // time in milliseconds
    {
        if(equaltoLbl.getText().length()>30){
            equaltoLbl.setText("...");
        }
        if(currentOperation=="+")
        {
            PlusKey();
            currentOperation="^";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else if(currentOperation=="/"){
            DivideKey();
            currentOperation="^";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else if(currentOperation=="-"){
            MinusKey();
            currentOperation="^";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);

        }
        else if(currentOperation=="*"){
            MultiplyKey();
            currentOperation="^";
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + currentOperation);
        }
        else {
            if (tempresult == Double.parseDouble(textField1.getText())) {
                currentOperation = "^";
                equaltoLbl.setText(" ");
                equaltoLbl.setText("" + equaltoLbl.getText() + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + textField1.getText() + currentOperation);
            }
            else {
                if (result == 0) {
                    currentOperation = "^";
                    number = Double.parseDouble(textField1.getText());
                    result = number;
                    tempresult = result;
                    equaltoLbl.setText(" ");
                    equaltoLbl.setText("" + equaltoLbl.getText() + textField1.getText() + currentOperation);
                } else {
                    number = Double.parseDouble(textField1.getText());
                    result = Math.pow(result, number);
                    tempresult = result;
                    ans = equaltoLbl.getText() + "" + textField1.getText();
                    equaltoLbl.setText(ans + currentOperation);
                }
                textField1.setText("" + result);
            }
        }
    }
    public void EqualKey() // time in milliseconds
    {
        if(equaltoLbl.getText().length()>30){
            equaltoLbl.setText("...");
        }
        if(tempresult== Double.parseDouble(textField1.getText())){
            if(currentOperation == "+"){
                if(result==0)
                {
                    result=number+Double.parseDouble(textField1.getText());
                    tempresult=result;
                    number=0;
                    result=0;
                    equaltoLbl.setText(" ");
                    textField1.setText("0");
                }
                else{
                    result+=Double.parseDouble(textField1.getText());
                    equaltoLbl.setText(equaltoLbl.getText()+""+textField1.getText()+currentOperation);
                    textField1.setText(""+result);
                }

            }
            else  if(currentOperation == "-"){
                if(0 == result)
                {
                    result=number+Double.parseDouble(textField1.getText());
                    tempresult=result;
                    number=0;
                    result=0;
                    equaltoLbl.setText(" ");
                    textField1.setText("0");
                }
                else{
                    result-=Double.parseDouble(textField1.getText());
                    tempresult=result;
                    equaltoLbl.setText(equaltoLbl.getText() + "" + number + currentOperation);
                    textField1.setText(""+(int)result);
                }

            }
            else if(currentOperation == "/"){

                if (result==1){
                    result=Double.parseDouble(textField1.getText());
                    tempresult=result;
                    number=0;
                    result=1;
                    equaltoLbl.setText("1");
                    textField1.setText("1");
                }
                else{
                    if(Double.parseDouble(textField1.getText())==0) {
                        JOptionPane.showMessageDialog(null,"Cannot Divide by zero","Error: Divide",JOptionPane.ERROR_MESSAGE);
                        number=0;
                        result=0;
                        textField1.setText("0");
                        equaltoLbl.setText(" ");
                    }
                        else{
                            result/=Double.parseDouble(textField1.getText());
                            tempresult=result;
                            equaltoLbl.setText(equaltoLbl.getText()+"/"+textField1.getText()+"=");
                            textField1.setText(""+result);

                        }



                }
                }


            else if(currentOperation == "*"){
                if(0 == result)
                {
                    result=number+Double.parseDouble(textField1.getText());
                    tempresult=result;
                    number=0;
                    result=0;
                    equaltoLbl.setText(" ");
                    textField1.setText("0");
                }
                else{
                    equaltoLbl.setText(result+currentOperation+textField1.getText()+"=");
                    result*=Double.parseDouble(textField1.getText());
                    tempresult=result;
                    textField1.setText(""+result);
                }

            }
            else if(currentOperation == "^"){
                if(0 == result)
                {
                    result=number+Double.parseDouble(textField1.getText());
                    tempresult=result;
                    number=0;
                    result=0;
                    equaltoLbl.setText(" ");
                    textField1.setText("0");
                }
                else{
                    result=Math.pow(number,Double.parseDouble(textField1.getText()));
                    tempresult=result;
                    equaltoLbl.setText(equaltoLbl.getText()+""+textField1.getText()+"=");
                    textField1.setText(""+result);
                }
            }


        }
        else {
        if(currentOperation == "+"){
            PlusKey();
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + "=");
        }
        else  if(currentOperation == "-"){
            MinusKey();
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + "=");


        }
        else if(currentOperation == "/"){
            DivideKey();
            if(result!=0){
                equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + "=");
            }
        }
        else if(currentOperation == "*"){
            MultiplyKey();
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + "=");
        }
        else if(currentOperation == "^"){
            XPowerYKey();
            equaltoLbl.setText("" + equaltoLbl.getText().substring(0, equaltoLbl.getText().length() - 1) + "=");
        }
        }
    }
    public void BackSpaceKey() // time in milliseconds
    {
        if(textField1.getText().length()>0)
        {
            textField1.setText("" + textField1.getText().substring(0, textField1.getText().length() - 1));
            if (textField1.getText().length()<=0)
            {
                textField1.setText("0");
            }
        }
    }
    public void DotKey() // time in milliseconds
    {
        if(onoffcontrol==0 && textField1.getText()!="")
        {
            boolean isContains = textField1.getText().indexOf(".") != -1 ? true : false;
            if(!isContains){
                textField1.setText(textField1.getText()+".");
            }


        }
    }

    public static double Square(double a){
        return a*a;
    }
    public static double factorial(double a)
    {
        double finaly=1;
        for(int i=1; i<=a; i++)
        {
            finaly*=i;
        }
        return finaly;
    }
    public double sin(double a)
    {
        double sinDouble = Math.sin(a);
        return sinDouble;
    }
    public double cos(double a)
    {
        double cosDouble = Math.cos(a);
        return cosDouble;
    }
    public double tan(double a)
    {
        double tanDouble = Math.tan(a);
        return tanDouble;
    }
    public double exp(double a)
    {
        double logDouble = Math.exp(a);
        return logDouble;
    }
    public double sqrt(double a)
    {
        double sqrtDouble = Math.sqrt(a);
        return sqrtDouble;
    }
    public double log(double a)
    {
        double logDouble = Math.log(a);
        return logDouble;
    }
    public double ln(double a)
    {
        double lnDouble = Math.log(a)/Math.log(Math.E);
        return lnDouble;
    }
    public double absolute(double a)
    {
        double absoluteDouble = Math.abs(a);
        return absoluteDouble;
    }
}