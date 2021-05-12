/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

/*
 A2_Bin Jane Lu 
 Wednesday April 03 2019
 program aims to convert binary, decimal, and hexadecimal numbers
 */
public class javaapplication1 extends JPanel implements ActionListener {// to let the button listener could be defined in a class other than the frame class

    Button btdButton; //declares the buttom to convert from binomial to decimal
    Button dtbButton;//declares the buttom to convert from decimal to binomial
    Button dthButton;//declares the buttom to convert from decimal to hexdecimal
    Button htdButton;//declares the buttom to convert from hexdecimal to decimal
    Button exitButton;//declares the buttom to exit from the program
    Button bthButton;//declares the buttom to convert from binomial to hexdecimal
    Button htbButton;//declares the buttom to convert from hexdecmial to binomial
    String theText = "The is a program to convert different base of numbers!";//input on the frame that this is a program which converts different base of numbers
    int style = Font.BOLD; //To bold the font
    Font font = new Font("Arial", style, 15);//the font class, which are used to render all text based on such form in the frame
    int inta = 0;//declare the integer input into the program first
    String first = "";//declare the string

    javaapplication1() { //method to create button
        //  create the first button
        btdButton = new Button("Convert from binomial to decimal");// button class is used to create a labeled button: btdButton
        btdButton.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        add(btdButton);//use add() method to add button on the frame

        //  create the second button
        dtbButton = new Button("Convert from decimal to binomial");// button class is used to create a labeled button: dtbButton
        dtbButton.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        add(dtbButton);//use add() method to add button on the frame

        //  create the third button
        dthButton = new Button("Convert from hexdecimal to decimal");// button class is used to create a labeled button: dthButton
        dthButton.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        add(dthButton);//use add() method to add button on the frame

        //  create the fourth button
        htdButton = new Button("Convert from decimal to hexdecimal");// button class is used to create a labeled button: htdButton
        htdButton.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        add(htdButton);//use add() method to add button on the frame

        //  create the fifth button
        exitButton = new Button("Exit");// button class is used to create a labeled button: exitButton
        exitButton.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        add(exitButton);//use add() method to add button on the frame

        //  create the sixth button
        bthButton = new Button("Convert from binomial to hexdecimal");// button class is used to create a labeled button: bthButton
        bthButton.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        add(bthButton);//use add() method to add button on the frame

        //  create the seventh button
        htbButton = new Button("Convert from hexdecimal to binomial");// button class is used to create a labeled button: htbButton
        htbButton.addActionListener(this); // means that the actions for this ActionListener can be found in this class:  A2_Bin 
        add(htbButton);//use add() method to add button on the frame

    }

    public void actionPerformed(ActionEvent e) // this method responds to clicking a button
    {
        if (e.getActionCommand().equals("Exit")) {//if the mouse click on "Exit"
            System.exit(0); // exit the program
        }
        if (e.getActionCommand().equals("Convert from binomial to decimal")) {//if the mouse click on "Convert from binomial to decimal"
            theText = "Convert from binomial to decimal";//redefine the value of the string which declared in the sub-class: A2_Bin
            first = JOptionPane.showInputDialog("Input a binary number: ");// read a string from the user
        } else if (e.getActionCommand().equals("Convert from decimal to binomial")) {//if the mouse click on ""Convert from decimal to binomial""
            theText = "Convert from decimal to binomial";//redefine the value of the string which declared in the sub-class: A2_Bin
            first = JOptionPane.showInputDialog("Input a decimal number: ");// read a string from the user
            if (first.matches("[0123456789]+") && !first.startsWith("0")) {//use the match method to check whether it is a decimal number and if it is
                inta = Integer.parseInt(first);// change the string to an integer
            } else {//if it is not
                theText = "Invalid decimal number!";
            }
        } else if (e.getActionCommand().equals("Convert from hexdecimal to decimal")) {//if the mouse click on "Convert from hexdecimal to decimal"
            theText = "Convert from hexdecimal to decimal";//redefine the value of the string which declared in the sub-class: A2_Bin
            first = JOptionPane.showInputDialog("Input a hexdecimal number: ");// read a string from the user
        } else if (e.getActionCommand().equals("Convert from decimal to hexdecimal")) {//if the mouse click on "Convert from decimal to hexdecmal"
            theText = "Convert from decimal to hexdecimal";//redefine the value of the string which declared in the sub-class: A2_Bin
            first = JOptionPane.showInputDialog("Input a decimal number: ");// read a string from the user
            if (first.matches("[0123456789]+") && !first.startsWith("0")) {//use the match method to check if it is a decimal number if it is a decimal number
                inta = Integer.parseInt(first);// change the string to an integer
            } else {//if it is not
                theText = "Invalid decimal number!";
            }
        } else if (e.getActionCommand().equals("Convert from binomial to hexdecimal")) {//if the mouse click on "Convert from binomial to hexdecimal"
            theText = "Convert from binomial to decimal";//redefine the value of the string which declared in the sub-class: A2_Bin
            String first5 = JOptionPane.showInputDialog("Input a binary number: ");// read a string from the user
            if (first5.matches("[01]+") && !first5.startsWith("0")) {//use the match method to check if it is a binomial number and if it is
                theText = "Valid binomial number. ";
                int b = bintodec(first5);//declared integer b as the output of bintodec method
                String d = dectohex(b);//declared string d as the output of dectohex method
                theText = theText + "Convert from binomial to hexdecimal is: " + d;//redefine the value of string
            } else {//if it is not
                theText = "Invalid binomial number!";
            }

        } else if (e.getActionCommand().equals("Convert from hexdecimal to binomial")) {//if the mouse click on "Convert from hexdecimal to binomial"
            theText = "Convert from hexdecimal to binomial";//redefine the value of the string which declared in the sub-class: A2_Bin
            String first6 = JOptionPane.showInputDialog("Input a hexdecimal number: ");// read a string from the user
            if (first6.matches("[0123456789ABCDEF]+") && !first6.startsWith("0")) {//use the match method to check if it is a hexdecimal number and if it is
                theText = "Valid hexdecimal number. ";
                int a = hextodec(first6);//declared integer b as the output of bintodec method
                String h = stringdectobi(a);//declared string d as the output of dectohex method
                theText = theText + "Convert from hexdecimal to binomial is: " + h;//redefine the value of string
            } else {//if it is not
                theText = "Invalid hexdecimal number!";
            }
        }
        repaint(); // call paintComponent and update the frame by redrawing it
    }

    public void paintComponent(Graphics g) {//method to redraw the graphics on this panel.
        super.paintComponent(g); // clears the frame 

        Color c = Color.orange;//define the color class to make the color of the frame background is orange
        if (theText.equals("Convert from binomial to decimal")) {//if the mouse click on "Convert from binomial to decimal"

            if (first.matches("[01]+") && !first.startsWith("0")) {//use the match method to check if it is a binomial number and if it is
                theText = "Valid binomial number. ";
                theText = theText + "Convert from binomial to decimal is: " + bintodec(first);

            } else {//if it is not
                theText = "Invalid binomial number!";

            }
        } else if (theText.equals("Convert from decimal to binomial")) {//if the mouse click on "Convert from decimal to binomial"

            theText = "Valid decimal number. Convert from decimal to binomial is: " + stringdectobi(inta);//show to output
        } else if (theText.equals("Convert from hexdecimal to decimal")) {//if the mouse click on "Convert from hexdecimal to decimal"

            if (first.matches("[0123456789ABCDEF]+") && !first.startsWith("0")) {//use the match method to check if it is a hexdecimal number and if it is
                theText = "Valid hexdecimal number. ";
                theText = theText + "Convert from hexdecimal to decimal: " + hextodec(first);//show to output

            } else {//if it is not
                theText = "Invalid hexdecimal number!";

            }
        } else if (theText.equals("Convert from decimal to hexdecimal")) {//if the mouse click on "Convert from decimal to hexdecmal"

            theText = "Valid decimal number. Convert from decimal to hexdecimal is: " + dectohex(inta);//show to output
        } else if (theText.equals("Convert from binomial to hexdecimal")) {//if the mouse click on "Convert from binomial to hexdecimal"

        } else if (theText.equals("Convert from hexdecimal to binomial")) {//if the mouse click on "Convert from hexdecimal to binomial"

        }
        g.setColor(c);//Sets this graphics context's current color to the specified color "c"
        Dimension size = getSize();//dimension class define the frame's width and height by using method getSize
        g.fillRect(0, 0, size.width, size.height);//use the fillRect method to fills the frame with specified rectangle
        g.setColor(Color.black);//Sets this graphics context's current color: black
        g.setFont(font);//Sets this graphics context's font to the specified font, which has already defined before
        g.drawString(theText, 100, 100);//Draws the text given by the specified string"theText" and using the font defined before
    } // paint method

    public static void main(String[] args) {
        JFrame frame = new JFrame("Buttons");
        frame.getContentPane().add(new javaapplication1());//the method getContentPane is used to returns the A2_Bin for this frame.
        frame.setSize(700, 300);//the setSize method is used to define the width and height of this frame
        frame.setVisible(true);//the setVisible is used to make sure the user  can see the output
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the setDefault Close Operation is a method used to close the frame
    }

    static String stringdectobi(int a) {//the self-defined method to conver decimal to binomial with the input interger int a
        String n = "";//define the string for the later usage
        while (true) {//use the while loop to continue operate the small program
            if (a <= 0) {//if the input number is less than 0
                break;//then stop the program
            } else if (a > 0) {//if the input number is larger than 0
                int remainder = a % 2;//define a variable called "remainder" and used to calculate the remainder of a divided by 2
                a = a / 2;//After find out the remainder, the later a is half of the former a
                n = remainder + n;//the new n
            }
        }
        return n;//return the answer
    }

    static int bintodec(String a) {//the self-defined method to conver binomial to decimal with the input string a
        double total = 0;//define a variable for later usage
        for (int i = 0; i < a.length(); i++) {//use the for loop, from the start of the string to the end of it
            Character c = a.charAt(i);//to locate every character from the string
            if (c == '1') {//if there is a character at a certain position

                double number = Math.pow(2, (a.length() - 1 - i));//to calculate the number if convert to decimal number
                total = total + number;//add all the numbers together to get the final answer
            }
        }
        return (int) total;//return the answer
    }

    static String dectohex(int a) {//the self-defined method to conver decimal to hexdecimal with the input int a
        String n = "";//define the variable for the later usage
        String hex = "";//define the variable for the later usage
        while (true) {//use to while loop to repeat the small program
            if (a <= 0) {//if the input a is less than 0
                break;//then break down the program
            } else if (a > 0) {//if the input a is larger than 0
                int remainder = a % 16;//define a variable called "remainder" and used to calculate the remainder of a divided by 16
                if (remainder == 10) {//if the remainder is 10 
                    hex = "A";//then the hexdecimal string  A
                } else if (remainder == 11) {//if the remainder is 11
                    hex = "B"; //then the hexdecimal string  B
                } else if (remainder == 12) { //if the remainder is 12
                    hex = "C"; //then the hexdecimal string  C
                } else if (remainder == 13) { //if the remainder is 13
                    hex = "D"; //then the hexdecimal string  D
                } else if (remainder == 14) { //if the remainder is 14 
                    hex = "E"; //then the hexdecimal string  E
                } else if (remainder == 15) { //if the remainder is 15
                    hex = "F"; //then the hexdecimal string  F
                } else if (remainder == 0) { //if the remainder is 0
                    hex = "0"; //then the hexdecimal string  0
                } else if (remainder == 1) { //if the remainder is 1
                    hex = "1"; //then the hexdecimal string  1
                } else if (remainder == 2) { //if the remainder is 2 
                    hex = "2"; //then the hexdecimal string  2
                } else if (remainder == 3) { //if the remainder is 3
                    hex = "3"; //then the hexdecimal string  3
                } else if (remainder == 4) { //if the remainder is 4
                    hex = "4"; //then the hexdecimal string  4
                } else if (remainder == 5) { //if the remainder is 5
                    hex = "5"; //then the hexdecimal string  5
                } else if (remainder == 6) { //if the remainder is 6
                    hex = "6"; //then the hexdecimal string  6
                } else if (remainder == 7) { //if the remainder is 7
                    hex = "7"; //then the hexdecimal string  7
                } else if (remainder == 8) { //if the remainder is 8
                    hex = "8"; //then the hexdecimal string  8
                } else if (remainder == 9) { //if the remainder is 9
                    hex = "9"; //then the hexdecimal string  9
                }

                a = a / 16; //After find out the remainder, the later a is divided based on the former a
                n = hex + n; //the new n
            }
        }
        return n; //return the answer
    }

    static int hextodec(String a) { //the self-defined method to conver hexdecimal to decimal with the input int a
        double total = 0;//define the variable for the later use
        for (int i = 0; i < a.length(); i++) { // use the for loop to start, from the start of the string to the end of it
            Character c = a.charAt(i); //to trace the every character in the string
            int b;//define the variable b for the later use
            if (c == 'A') { //if the character is A
                b = 10;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == 'B') {//if the character is B
                b = 11;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == 'C') {//if the character is C
                b = 12;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == 'D') {//if the character is D
                b = 13;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == 'E') {//if the character is E
                b = 14;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == 'F') {//if the character is F
                b = 15;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '1') {//if the character is 1
                b = 1;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '2') {//if the character is 2
                b = 2;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '3') {//if the character is 3
                b = 3;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '4') {//if the character is 4
                b = 4;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together 
            } else if (c == '5') {//if the character is 5
                b = 5;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '6') {//if the character is 6
                b = 6;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '7') {//if the character is 7
                b = 7;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '8') {//if the character is 8
                b = 8;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '9') {//if the character is 9
                b = 9;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            } else if (c == '0') {//if the character is 0
                b = 0;
                double number = b * Math.pow(16, (a.length() - 1 - i));//use formula to calculate
                total = total + number;// add number together
            }

        }
        return (int) total;//return the answer;
    }

}
