/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbookingsoft;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Tareq
 */
public class TicketBookingSoft_ver_2 extends javax.swing.JFrame {
    
    /**
     * Creates new form TicketBookingSoft_ver_2
     */
    public TicketBookingSoft_ver_2() {
        
        initComponents();
        
        if(checkFileExistence() == false){
            
            NewFileCreation(); // creates new file
            writeStatusToFile(); // writes fresh status to file
            setbuttonColor(); // sets button status
            
        }
        
        else if(checkFileExistence() == true){
            
            readStatusFromFile(); // reads existing status from file
            setbuttonColor();
            
        }
    }
    
    //Checks if the Source File Exists or not, and
    // if exists then checks for invalid data
    public boolean checkFileExistence(){
            
            boolean isExist = false;
            
            if(sourceFile.exists()){
                
                try {
                    
                    FileReader readFile = new FileReader(sourceFile);
                    BufferedReader bR = new BufferedReader(readFile);
                    
                    // Reads every line from the file
                    for(int i = 0; i < 24 ; i++){
                        
                        String line = bR.readLine();
                        
                        // Checks for invalid data, if found then total file is overwritten
                        if(!"0".equals(line) && !"1".equals(line) && !"2".equals(line)){
                            
                            writeStatusToFile();
                        }
                    }
                    
                    bR.close();
                    
                } catch (Exception ex) {
                    
                    System.out.println("Error in: checkFileExistence() ");
                }
                
                isExist = true;
            }
            
            else if(!sourceFile.exists()){
                
                isExist = false;
            }
            
            return isExist;
        }
    
    //Creates new file
    public void NewFileCreation(){
        
        try {
            
            sourceFile.createNewFile();
            System.out.println("File created");
        
        } catch (IOException ex) {
            
            System.out.println("File already exists");
        
        }
    
    }
    
    //Writes status to file
    public void writeStatusToFile(){
        
        try {
 
            try {

                FileWriter fileWriter =  new FileWriter(sourceFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(Button_A1);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_A2);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_A3);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_A4);
                bufferedWriter.newLine();
                
                bufferedWriter.write(Button_B1);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_B2);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_B3);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_B4);
                bufferedWriter.newLine();
                
                bufferedWriter.write(Button_C1);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_C2);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_C3);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_C4);
                bufferedWriter.newLine();
                
                bufferedWriter.write(Button_D1);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_D2);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_D3);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_D4);
                bufferedWriter.newLine();
                
                bufferedWriter.write(Button_E1);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_E2);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_E3);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_E4);
                bufferedWriter.newLine();
                
                bufferedWriter.write(Button_F1);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_F2);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_F3);
                bufferedWriter.newLine();
                bufferedWriter.write(Button_F4);             
                
                bufferedWriter.close(); // Must close, otherwise it keeps the file open and dont write till it is closed
            }
            
            catch(IOException ex) {
                
                System.out.println("Error writing to file '"+ sourceFile + "'");
            }
        } catch (Exception ex) {
            System.out.println("Exception in writeStatusToFile() method");
        }
    }
    
    //Reads status from file
    public void readStatusFromFile(){
        
        try {
 
            try {

                FileReader filereader =  new FileReader(sourceFile);
                BufferedReader bufferedreader = new BufferedReader(filereader);

                Button_A1 = bufferedreader.readLine();
                Button_A2 = bufferedreader.readLine();
                Button_A3 = bufferedreader.readLine();
                Button_A4 = bufferedreader.readLine();
                
                Button_B1 = bufferedreader.readLine();
                Button_B2 = bufferedreader.readLine();
                Button_B3 = bufferedreader.readLine();
                Button_B4 = bufferedreader.readLine();
                
                Button_C1 = bufferedreader.readLine();
                Button_C2 = bufferedreader.readLine();
                Button_C3 = bufferedreader.readLine();
                Button_C4 = bufferedreader.readLine();
                
                Button_D1 = bufferedreader.readLine();
                Button_D2 = bufferedreader.readLine();
                Button_D3 = bufferedreader.readLine();
                Button_D4 = bufferedreader.readLine();
                
                Button_E1 = bufferedreader.readLine();
                Button_E2 = bufferedreader.readLine();
                Button_E3 = bufferedreader.readLine();
                Button_E4 = bufferedreader.readLine();
                
                Button_F1 = bufferedreader.readLine();
                Button_F2 = bufferedreader.readLine();
                Button_F3 = bufferedreader.readLine();
                Button_F4 = bufferedreader.readLine();
                
                bufferedreader.close(); // Must call close, otherwise it keeps the file open and dont write till it is closed
            
            }
            
            catch(IOException ex) {
            
                System.out.println("Error writing to file '"+ sourceFile + "'");
            
            }
        
        } catch (Exception ex) {
        
            System.out.println("Exception in writeStatusToFile() method");
        
        }
    
    }
    
    //Sets button color
    public void setbuttonColor(){
        
        if(Button_A1.equals("0")){
            jButton_A1.setBackground(Color.WHITE);
        }
        else if(Button_A1.equals("1")){
            jButton_A1.setBackground(Color.YELLOW);
        }
        else if(Button_A1.equals("2")){
            jButton_A1.setBackground(Color.RED);
        }
        
        if(Button_A2.equals("0")){
            jButton_A2.setBackground(Color.WHITE);
        }
        else if(Button_A2.equals("1")){
            jButton_A2.setBackground(Color.YELLOW);
        }
        else if(Button_A2.equals("2")){
            jButton_A2.setBackground(Color.RED);
        }
        
        if(Button_A3.equals("0")){
            jButton_A3.setBackground(Color.WHITE);
        }
        else if(Button_A3.equals("1")){
            jButton_A3.setBackground(Color.YELLOW);
        }
        else if(Button_A3.equals("2")){
            jButton_A3.setBackground(Color.RED);
        }
        
        if(Button_A4.equals("0")){
            jButton_A4.setBackground(Color.WHITE);
        }
        else if(Button_A4.equals("1")){
            jButton_A4.setBackground(Color.YELLOW);
        }
        else if(Button_A2.equals("2")){
            jButton_A4.setBackground(Color.RED);
        }
        
        if(Button_B1.equals("0")){
            jButton_B1.setBackground(Color.WHITE);
        }
        else if(Button_B1.equals("1")){
            jButton_B1.setBackground(Color.YELLOW);
        }
        else if(Button_B1.equals("2")){
            jButton_B1.setBackground(Color.RED);
        }
        
        if(Button_B2.equals("0")){
            jButton_B2.setBackground(Color.WHITE);
        }
        else if(Button_B2.equals("1")){
            jButton_B2.setBackground(Color.YELLOW);
        }
        else if(Button_B2.equals("2")){
            jButton_B2.setBackground(Color.RED);
        }
        
        if(Button_B3.equals("0")){
            jButton_B3.setBackground(Color.WHITE);
        }
        else if(Button_B3.equals("1")){
            jButton_B3.setBackground(Color.YELLOW);
        }
        else if(Button_B3.equals("2")){
            jButton_B3.setBackground(Color.RED);
        }
        
        if(Button_B4.equals("0")){
            jButton_B4.setBackground(Color.WHITE);
        }
        else if(Button_B4.equals("1")){
            jButton_B4.setBackground(Color.YELLOW);
        }
        else if(Button_B4.equals("2")){
            jButton_B4.setBackground(Color.RED);
        }
        
        if(Button_C1.equals("0")){
            jButton_C1.setBackground(Color.WHITE);
        }
        else if(Button_C1.equals("1")){
            jButton_C1.setBackground(Color.YELLOW);
        }
        else if(Button_C1.equals("2")){
            jButton_C1.setBackground(Color.RED);
        }
        
        if(Button_C2.equals("0")){
            jButton_C2.setBackground(Color.WHITE);
        }
        else if(Button_C2.equals("1")){
            jButton_C2.setBackground(Color.YELLOW);
        }
        else if(Button_C2.equals("2")){
            jButton_C2.setBackground(Color.RED);
        }
        
        if(Button_C3.equals("0")){
            jButton_C3.setBackground(Color.WHITE);
        }
        else if(Button_C3.equals("1")){
            jButton_C3.setBackground(Color.YELLOW);
        }
        else if(Button_C3.equals("2")){
            jButton_C3.setBackground(Color.RED);
        }
        
        if(Button_C4.equals("0")){
            jButton_C4.setBackground(Color.WHITE);
        }
        else if(Button_C4.equals("1")){
            jButton_C4.setBackground(Color.YELLOW);
        }
        else if(Button_C4.equals("2")){
            jButton_C4.setBackground(Color.RED);
        }
        
        if(Button_D1.equals("0")){
            jButton_D1.setBackground(Color.WHITE);
        }
        else if(Button_D1.equals("1")){
            jButton_D1.setBackground(Color.YELLOW);
        }
        else if(Button_D1.equals("2")){
            jButton_D1.setBackground(Color.RED);
        }
        
        if(Button_D2.equals("0")){
            jButton_D2.setBackground(Color.WHITE);
        }
        else if(Button_D2.equals("1")){
            jButton_D2.setBackground(Color.YELLOW);
        }
        else if(Button_D2.equals("2")){
            jButton_D2.setBackground(Color.RED);
        }
        
        if(Button_D3.equals("0")){
            jButton_D3.setBackground(Color.WHITE);
        }
        else if(Button_D3.equals("1")){
            jButton_D3.setBackground(Color.YELLOW);
        }
        else if(Button_D3.equals("2")){
            jButton_D3.setBackground(Color.RED);
        }
        
        if(Button_D4.equals("0")){
            jButton_D4.setBackground(Color.WHITE);
        }
        else if(Button_D4.equals("1")){
            jButton_D4.setBackground(Color.YELLOW);
        }
        else if(Button_D4.equals("2")){
            jButton_D4.setBackground(Color.RED);
        }
        
        if(Button_E1.equals("0")){
            jButton_E1.setBackground(Color.WHITE);
        }
        else if(Button_E1.equals("1")){
            jButton_E1.setBackground(Color.YELLOW);
        }
        else if(Button_E1.equals("2")){
            jButton_E1.setBackground(Color.RED);
        }
        
        if(Button_E2.equals("0")){
            jButton_E2.setBackground(Color.WHITE);
        }
        else if(Button_E2.equals("1")){
            jButton_E2.setBackground(Color.YELLOW);
        }
        else if(Button_E2.equals("2")){
            jButton_E2.setBackground(Color.RED);
        }
        
        if(Button_E3.equals("0")){
            jButton_E3.setBackground(Color.WHITE);
        }
        else if(Button_E3.equals("1")){
            jButton_E3.setBackground(Color.YELLOW);
        }
        else if(Button_E3.equals("2")){
            jButton_E3.setBackground(Color.RED);
        }
        
        if(Button_E4.equals("0")){
            jButton_E4.setBackground(Color.WHITE);
        }
        else if(Button_E4.equals("1")){
            jButton_E4.setBackground(Color.YELLOW);
        }
        else if(Button_E4.equals("2")){
            jButton_E4.setBackground(Color.RED);
        }
        
        if(Button_F1.equals("0")){
            jButton_F1.setBackground(Color.WHITE);
        }
        else if(Button_F1.equals("1")){
            jButton_F1.setBackground(Color.YELLOW);
        }
        else if(Button_F1.equals("2")){
            jButton_F1.setBackground(Color.RED);
        }
        
        if(Button_F2.equals("0")){
            jButton_F2.setBackground(Color.WHITE);
        }
        else if(Button_F2.equals("1")){
            jButton_F2.setBackground(Color.YELLOW);
        }
        else if(Button_F2.equals("2")){
            jButton_F2.setBackground(Color.RED);
        }
        
        if(Button_F3.equals("0")){
            jButton_F3.setBackground(Color.WHITE);
        }
        else if(Button_F3.equals("1")){
            jButton_F3.setBackground(Color.YELLOW);
        }
        else if(Button_F3.equals("2")){
            jButton_F3.setBackground(Color.RED);
        }
        
        if(Button_F4.equals("0")){
            jButton_F4.setBackground(Color.WHITE);
        }
        else if(Button_F4.equals("1")){
            jButton_F4.setBackground(Color.YELLOW);
        }
        else if(Button_F4.equals("2")){
            jButton_F4.setBackground(Color.RED);
        }
        
    } 
    
    public void determineStatus(JButton button, String status, String buttonName, int mouseClicked ){
        
        
            if(status.equals("2")){

                JOptionPane.showMessageDialog(rootPane, buttonName+ " is not available.\nPlease select from available seats.");
            }
            else{ 
                if(status.equals("1")){
                    status = "0";
                }
                else if(status.equals("0")){
                    status = "1";
                }

                if(mouseClicked == 2){
                    status = "2";
                }
                
            }
            
            if (button == jButton_A1){
                    Button_A1 = status;    
            }
            
            else if (button == jButton_A2){
                    Button_A2 = status;    
            }
            else if (button == jButton_A3){
                    Button_A3 = status;    
            }
            else if (button == jButton_A4){
                    Button_A4 = status;    
            }
            else if (button == jButton_B1){
                    Button_B1 = status;    
            }
            else if (button == jButton_B2){
                    Button_B2 = status;    
            }
            else if (button == jButton_B3){
                    Button_B3 = status;    
            }
            else if (button == jButton_B4){
                    Button_B4 = status;    
            }
            else if (button == jButton_C1){
                    Button_C1 = status;    
            }
            else if (button == jButton_C2){
                    Button_C2 = status;    
            }
            else if (button == jButton_C3){
                    Button_C3 = status;    
            }
            else if (button == jButton_C4){
                    Button_C4 = status;    
            }
            else if (button == jButton_D1){
                    Button_D1 = status;    
            }
            else if (button == jButton_D2){
                    Button_D2 = status;    
            }
            else if (button == jButton_D3){
                    Button_D3 = status;    
            }
            else if (button == jButton_D4){
                    Button_D4 = status;    
            }
            else if (button == jButton_E1){
                    Button_E1 = status;    
            }
            else if (button == jButton_E2){
                    Button_E2 = status;    
            }
            else if (button == jButton_E3){
                    Button_E3 = status;    
            }
            else if (button == jButton_E4){
                    Button_E4 = status;    
            }
            else if (button == jButton_F1){
                    Button_F1 = status;    
            }
            else if (button == jButton_F2){
                    Button_F2 = status;    
            }
            else if (button == jButton_F3){
                    Button_F3 = status;    
            }
            else if (button == jButton_F4){
                    Button_F4 = status;    
            }
        
            
            
    }
        
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton_A1 = new javax.swing.JButton();
        jButton_A2 = new javax.swing.JButton();
        jButton_B1 = new javax.swing.JButton();
        jButton_B2 = new javax.swing.JButton();
        jButton_E2 = new javax.swing.JButton();
        jButton_E1 = new javax.swing.JButton();
        jButton_F1 = new javax.swing.JButton();
        jButton_F2 = new javax.swing.JButton();
        jButton_C1 = new javax.swing.JButton();
        jButton_C2 = new javax.swing.JButton();
        jButton_D1 = new javax.swing.JButton();
        jButton_D2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton_A3 = new javax.swing.JButton();
        jButton_A4 = new javax.swing.JButton();
        jButton_B3 = new javax.swing.JButton();
        jButton_B4 = new javax.swing.JButton();
        jButton_E4 = new javax.swing.JButton();
        jButton_E3 = new javax.swing.JButton();
        jButton_F3 = new javax.swing.JButton();
        jButton_F4 = new javax.swing.JButton();
        jButton_C3 = new javax.swing.JButton();
        jButton_C4 = new javax.swing.JButton();
        jButton_D3 = new javax.swing.JButton();
        jButton_D4 = new javax.swing.JButton();
        jButton_Driver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_Refresh = new javax.swing.JButton();
        jButton_Save = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" RIDE WITH PRIDE");
        setAutoRequestFocus(false);
        setName(""); // NOI18N
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "LEFT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton_A1.setLabel("A1");
        jButton_A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_A1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_A1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_A1MouseExited(evt);
            }
        });

        jButton_A2.setText("A2");
        jButton_A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_A2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_A2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_A2MouseExited(evt);
            }
        });

        jButton_B1.setText("B1");
        jButton_B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_B1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_B1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_B1MouseExited(evt);
            }
        });

        jButton_B2.setText("B2");
        jButton_B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_B2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_B2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_B2MouseExited(evt);
            }
        });

        jButton_E2.setText("E2");
        jButton_E2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_E2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_E2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_E2MouseExited(evt);
            }
        });

        jButton_E1.setText("E1");
        jButton_E1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_E1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_E1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_E1MouseExited(evt);
            }
        });

        jButton_F1.setText("F1");
        jButton_F1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_F1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_F1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_F1MouseExited(evt);
            }
        });

        jButton_F2.setText("F2");
        jButton_F2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_F2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_F2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_F2MouseExited(evt);
            }
        });

        jButton_C1.setText("C1");
        jButton_C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_C1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_C1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_C1MouseExited(evt);
            }
        });

        jButton_C2.setText("C2");
        jButton_C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_C2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_C2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_C2MouseExited(evt);
            }
        });

        jButton_D1.setText("D1");
        jButton_D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_D1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_D1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_D1MouseExited(evt);
            }
        });

        jButton_D2.setText("D2");
        jButton_D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_D2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_D2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_D2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_C1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_C2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_F1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_F2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_E1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_E2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_D1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_D2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_A1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_A2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_B1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_B2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_A1)
                    .addComponent(jButton_A2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_B1)
                    .addComponent(jButton_B2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_C1)
                    .addComponent(jButton_C2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_D1)
                    .addComponent(jButton_D2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_E1)
                    .addComponent(jButton_E2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_F1)
                    .addComponent(jButton_F2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RIGHT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton_A3.setText("A3");
        jButton_A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_A3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_A3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_A3MouseExited(evt);
            }
        });

        jButton_A4.setText("A4");
        jButton_A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_A4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_A4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_A4MouseExited(evt);
            }
        });

        jButton_B3.setText("B3");
        jButton_B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_B3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_B3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_B3MouseExited(evt);
            }
        });

        jButton_B4.setText("B4");
        jButton_B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_B4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_B4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_B4MouseExited(evt);
            }
        });

        jButton_E4.setText("E4");
        jButton_E4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_E4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_E4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_E4MouseExited(evt);
            }
        });

        jButton_E3.setText("E3");
        jButton_E3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_E3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_E3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_E3MouseExited(evt);
            }
        });

        jButton_F3.setText("F3");
        jButton_F3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_F3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_F3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_F3MouseExited(evt);
            }
        });

        jButton_F4.setText("F4");
        jButton_F4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_F4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_F4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_F4MouseExited(evt);
            }
        });

        jButton_C3.setText("C3");
        jButton_C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_C3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_C3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_C3MouseExited(evt);
            }
        });

        jButton_C4.setText("C4");
        jButton_C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_C4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_C4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_C4MouseExited(evt);
            }
        });

        jButton_D3.setText("D3");
        jButton_D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_D3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_D3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_D3MouseExited(evt);
            }
        });

        jButton_D4.setText("D4");
        jButton_D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_D4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_D4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_D4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_F3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_F4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_E3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_E4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_D3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_D4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_C3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_C4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_A3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_A4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_B3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_B4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_A3)
                    .addComponent(jButton_A4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_B3)
                    .addComponent(jButton_B4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_C3)
                    .addComponent(jButton_C4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_D3)
                    .addComponent(jButton_D4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_E3)
                    .addComponent(jButton_E4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_F3)
                    .addComponent(jButton_F4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_Driver.setForeground(new java.awt.Color(51, 51, 255));
        jButton_Driver.setText("DRIVER");
        jButton_Driver.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));
        jButton_Driver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_DriverMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("<-  OUT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("IN  ->");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton_Refresh.setText("REFRESH");
        jButton_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RefreshMouseClicked(evt);
            }
        });

        jButton_Save.setText("SAVE");
        jButton_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SaveMouseClicked(evt);
            }
        });

        jButton_Exit.setText("EXIT");
        jButton_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("S  E  A  T    P  L  A  N");

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Single Click: Book for six hours");

        jLabel5.setText("What Colors Mean");

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Double Click: Purchased");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Seat Available");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Driver)))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton_Driver, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(466, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("Ticket Booking");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A1MouseClicked
        // TODO add your handling code here:
       
        determineStatus(jButton_A1, Button_A1, "A1",evt.getClickCount());
        setbuttonColor();
              
        
    }//GEN-LAST:event_jButton_A1MouseClicked

    private void jButton_A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A2MouseClicked
        // TODO add your handling code here:

        determineStatus(jButton_A2, Button_A2, "A2",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_A2MouseClicked

    private void jButton_A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A3MouseClicked
        // TODO add your handling code here:

        determineStatus(jButton_A3, Button_A3, "A3",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_A3MouseClicked

    private void jButton_A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A4MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_A4, Button_A4, "A4",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_A4MouseClicked

    private void jButton_B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B1MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_B1, Button_B1, "B1",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_B1MouseClicked

    private void jButton_B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B2MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_B2, Button_B2, "B2",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_B2MouseClicked

    private void jButton_B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B3MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_B3, Button_B3, "B3",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_B3MouseClicked

    private void jButton_B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B4MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_B4, Button_B4, "B4",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_B4MouseClicked

    private void jButton_C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C1MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_C1, Button_C1, "C1",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_C1MouseClicked

    private void jButton_C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C2MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_C2, Button_C2, "C2",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_C2MouseClicked

    private void jButton_C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C3MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_C3, Button_C3, "C3",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_C3MouseClicked

    private void jButton_C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C4MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_C4, Button_C4, "C4",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_C4MouseClicked

    private void jButton_D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D1MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_D1, Button_D1, "D1",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_D1MouseClicked

    private void jButton_D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D2MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_D2, Button_D2, "D2",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_D2MouseClicked

    private void jButton_D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D3MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_D3, Button_D3, "D3",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_D3MouseClicked

    private void jButton_D4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D4MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_D4, Button_D4, "D4",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_D4MouseClicked

    private void jButton_E1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E1MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_E1, Button_E1, "E1",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_E1MouseClicked

    private void jButton_E2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E2MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_E2, Button_E2, "E2",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_E2MouseClicked

    private void jButton_E3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E3MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_E3, Button_E3, "E3",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_E3MouseClicked

    private void jButton_E4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E4MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_E4, Button_E4, "E4",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_E4MouseClicked

    private void jButton_F1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F1MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_F1, Button_F1, "F1",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_F1MouseClicked

    private void jButton_F2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F2MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_F2, Button_F2, "F2",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_F2MouseClicked

    private void jButton_F3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F3MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_F3, Button_F3, "F3",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_F3MouseClicked

    private void jButton_F4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F4MouseClicked
        // TODO add your handling code here:
        determineStatus(jButton_F4, Button_F4, "F4",evt.getClickCount());
        setbuttonColor();
    }//GEN-LAST:event_jButton_F4MouseClicked

    private void jButton_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RefreshMouseClicked
        // TODO add your handling code here:
        
        Button_A1 = "0";
        Button_A2 = "0";
        Button_A3 = "0";
        Button_A4 = "0";
    
        Button_B1 = "0";
        Button_B2 = "0";
        Button_B3 = "0";
        Button_B4 = "0";
    
        Button_C1 = "0";
        Button_C2 = "0";
        Button_C3 = "0";
        Button_C4 = "0";
    
        Button_D1 = "0";
        Button_D2 = "0";
        Button_D3 = "0";
        Button_D4 = "0";
    
        Button_E1 = "0";
        Button_E2 = "0";
        Button_E3 = "0";
        Button_E4 = "0";
    
        Button_F1 = "0";
        Button_F2 = "0";
        Button_F3 = "0";
        Button_F4 = "0";
        setbuttonColor();
    }//GEN-LAST:event_jButton_RefreshMouseClicked

    private void jButton_SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SaveMouseClicked
        // TODO add your handling code here:
        writeStatusToFile();
    }//GEN-LAST:event_jButton_SaveMouseClicked

    private void jButton_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ExitMouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Thank you for considering us as your riding partner. \n\nCall us any time.");
        
        System.exit(0);
    }//GEN-LAST:event_jButton_ExitMouseClicked

    private void jButton_DriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DriverMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Driver name will be notified shortly.");
    }//GEN-LAST:event_jButton_DriverMouseClicked

    private void jButton_A1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A1MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_A1) && !"2".equals(Button_A1)){
            jButton_A1.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_A1MouseEntered

    private void jButton_A1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A1MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_A1MouseExited

    private void jButton_A2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A2MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_A2) && !"2".equals(Button_A2)){
            jButton_A2.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_A2MouseEntered

    private void jButton_A2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A2MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_A2MouseExited

    private void jButton_A3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A3MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_A3) && !"2".equals(Button_A3)){
            jButton_A3.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_A3MouseEntered

    private void jButton_A3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A3MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_A3MouseExited

    private void jButton_A4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A4MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_A4) && !"2".equals(Button_A4)){
            jButton_A4.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_A4MouseEntered

    private void jButton_A4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_A4MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_A4MouseExited

    private void jButton_B1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B1MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_B1) && !"2".equals(Button_B1)){
            jButton_B1.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_B1MouseEntered

    private void jButton_B1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B1MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_B1MouseExited

    private void jButton_B2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B2MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_B2) && !"2".equals(Button_B2)){
            jButton_B2.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_B2MouseEntered

    private void jButton_B2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B2MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_B2MouseExited

    private void jButton_B3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B3MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_B3) && !"2".equals(Button_B3)){
            jButton_B3.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_B3MouseEntered

    private void jButton_B3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B3MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_B3MouseExited

    private void jButton_B4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B4MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_B4) && !"2".equals(Button_B4)){
            jButton_B4.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_B4MouseEntered

    private void jButton_B4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_B4MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_B4MouseExited

    private void jButton_C1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C1MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_C1) && !"2".equals(Button_C1)){
            jButton_C1.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_C1MouseEntered

    private void jButton_C1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C1MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_C1MouseExited

    private void jButton_C2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C2MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_C2) && !"2".equals(Button_C2)){
            jButton_C2.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_C2MouseEntered

    private void jButton_C2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C2MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_C2MouseExited

    private void jButton_C3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C3MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_C3) && !"2".equals(Button_C3)){
            jButton_C3.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_C3MouseEntered

    private void jButton_C3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C3MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_C3MouseExited

    private void jButton_C4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C4MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_C4) && !"2".equals(Button_C4)){
            jButton_C4.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_C4MouseEntered

    private void jButton_C4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_C4MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_C4MouseExited

    private void jButton_D1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D1MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_D1) && !"2".equals(Button_D1)){
            jButton_D1.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_D1MouseEntered

    private void jButton_D1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D1MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_D1MouseExited

    private void jButton_D2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D2MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_D2) && !"2".equals(Button_D2)){
            jButton_D2.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_D2MouseEntered

    private void jButton_D2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D2MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_D2MouseExited

    private void jButton_D3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D3MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_D3) && !"2".equals(Button_D3)){
            jButton_D3.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_D3MouseEntered

    private void jButton_D3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D3MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_D3MouseExited

    private void jButton_D4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D4MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_D4) && !"2".equals(Button_D4)){
            jButton_D4.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_D4MouseEntered

    private void jButton_D4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_D4MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_D4MouseExited

    private void jButton_E1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E1MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_E1) && !"2".equals(Button_E1)){
            jButton_E1.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_E1MouseEntered

    private void jButton_E1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E1MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_E1MouseExited

    private void jButton_E2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E2MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_E2) && !"2".equals(Button_E2)){
            jButton_E2.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_E2MouseEntered

    private void jButton_E2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E2MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_E2MouseExited

    private void jButton_E3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E3MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_E3) && !"2".equals(Button_E3)){
            jButton_E3.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_E3MouseEntered

    private void jButton_E3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E3MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_E3MouseExited

    private void jButton_E4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E4MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_E4) && !"2".equals(Button_E4)){
            jButton_E4.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_E4MouseEntered

    private void jButton_E4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_E4MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_E4MouseExited

    private void jButton_F1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F1MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_F1) && !"2".equals(Button_F1)){
            jButton_F1.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_F1MouseEntered

    private void jButton_F1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F1MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_F1MouseExited

    private void jButton_F2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F2MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_F2) && !"2".equals(Button_F2)){
            jButton_F2.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_F2MouseEntered

    private void jButton_F2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F2MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_F2MouseExited

    private void jButton_F3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F3MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_F3) && !"2".equals(Button_F3)){
            jButton_F3.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_F3MouseEntered

    private void jButton_F3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F3MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_F3MouseExited

    private void jButton_F4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F4MouseEntered
        // TODO add your handling code here:
        if(!"1".equals(Button_F4) && !"2".equals(Button_F4)){
            jButton_F4.setBackground(Color.CYAN);
        }
    }//GEN-LAST:event_jButton_F4MouseEntered

    private void jButton_F4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_F4MouseExited
        // TODO add your handling code here:
        setbuttonColor();
    }//GEN-LAST:event_jButton_F4MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketBookingSoft_ver_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBookingSoft_ver_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBookingSoft_ver_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBookingSoft_ver_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBookingSoft_ver_2().setVisible(true);
            }
        });
    }
    
    static File sourceFile = new File("bus ticket");
    
    static String Button_A1 = "0";
    static String Button_A2 = "0";
    static String Button_A3 = "0";
    static String Button_A4 = "0";
    
    static String Button_B1 = "0";
    static String Button_B2 = "0";
    static String Button_B3 = "0";
    static String Button_B4 = "0";
    
    static String Button_C1 = "0";
    static String Button_C2 = "0";
    static String Button_C3 = "0";
    static String Button_C4 = "0";
    
    static String Button_D1 = "0";
    static String Button_D2 = "0";
    static String Button_D3 = "0";
    static String Button_D4 = "0";
    
    static String Button_E1 = "0";
    static String Button_E2 = "0";
    static String Button_E3 = "0";
    static String Button_E4 = "0";
    
    static String Button_F1 = "0";
    static String Button_F2 = "0";
    static String Button_F3 = "0";
    static String Button_F4 = "0";
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_A1;
    private javax.swing.JButton jButton_A2;
    private javax.swing.JButton jButton_A3;
    private javax.swing.JButton jButton_A4;
    private javax.swing.JButton jButton_B1;
    private javax.swing.JButton jButton_B2;
    private javax.swing.JButton jButton_B3;
    private javax.swing.JButton jButton_B4;
    private javax.swing.JButton jButton_C1;
    private javax.swing.JButton jButton_C2;
    private javax.swing.JButton jButton_C3;
    private javax.swing.JButton jButton_C4;
    private javax.swing.JButton jButton_D1;
    private javax.swing.JButton jButton_D2;
    private javax.swing.JButton jButton_D3;
    private javax.swing.JButton jButton_D4;
    private javax.swing.JButton jButton_Driver;
    private javax.swing.JButton jButton_E1;
    private javax.swing.JButton jButton_E2;
    private javax.swing.JButton jButton_E3;
    private javax.swing.JButton jButton_E4;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_F1;
    private javax.swing.JButton jButton_F2;
    private javax.swing.JButton jButton_F3;
    private javax.swing.JButton jButton_F4;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
