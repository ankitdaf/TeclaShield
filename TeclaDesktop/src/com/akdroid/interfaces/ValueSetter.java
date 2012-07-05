/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akdroid.interfaces;

import com.akdroid.tecladesk.ComEvent;
import com.akdroid.tecladesk.EventConstant;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


/**
 * ValueSetter is used to change the preference
 * one ComEvent at a time.
 * @author Akhil
 */
public class ValueSetter extends javax.swing.JFrame implements KeyListener {

    /**
     * Creates new form ValueSetter
     */
    ComEvent ce,temp; //ComEvents temp and ce one temporary and one current
    
    int counter;
           
    ButtonPref source;  //the caller object
    
    public ValueSetter(ComEvent event,int button,ButtonPref src) {
        initComponents();
       // block=true;
        setTitle("EditEvent");
        ce=event;
        source=src;
        //Initialize temp and copy it from ce;
        temp=new ComEvent();
        temp.device=ce.device;
        temp.dx=ce.dx;
        temp.dy=ce.dy;
        temp.values=ce.values;
        temp.eventno=ce.eventno;
        counter=0;
        
        //Initialize header labels
        
        String name="  "+EventConstant.Shieldbuttons[button];
        name=name+" Event: "+EventConstant.ShieldEventNames[ce.eventno];
        
        headerlabel.setText(name);
        
        //Set the currently set value.
        Cvalue.removeAllItems();
        setCurrentValue();
        
        //To prevent the whole application from closing,on pressing "X" button
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Rnone = new javax.swing.JRadioButton();
        Rmouse = new javax.swing.JRadioButton();
        Rkey = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Cvalue = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputdx = new javax.swing.JTextField();
        inputdy = new javax.swing.JTextField();
        headerlabel = new javax.swing.JLabel();
        instructlabel = new javax.swing.JLabel();
        okbutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Device:");

        buttonGroup1.add(Rnone);
        Rnone.setText("None");
        Rnone.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RnoneStateChanged(evt);
            }
        });

        buttonGroup1.add(Rmouse);
        Rmouse.setText("Mouse");
        Rmouse.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RmouseStateChanged(evt);
            }
        });

        buttonGroup1.add(Rkey);
        Rkey.setText("Keyboard");
        Rkey.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RkeyStateChanged(evt);
            }
        });

        jLabel2.setText("Action");

        Cvalue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Cvalue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CvalueMouseClicked(evt);
            }
        });
        Cvalue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CvalueItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Optional Values :");

        jLabel4.setText("Change in X :");

        jLabel5.setText("Change in Y : ");

        inputdx.setText(" 0");
        inputdx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputdxFocusLost(evt);
            }
        });

        inputdy.setText(" 0");
        inputdy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputdyFocusLost(evt);
            }
        });

        headerlabel.setText(" Button : Name  Event : ShieldEventName");

        instructlabel.setText("Instructions :");

        okbutton.setText("OK");
        okbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okbuttonMouseClicked(evt);
            }
        });

        cancelbutton.setText("Cancel");
        cancelbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Rnone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Rmouse)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Rkey))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Cvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputdx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputdy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(instructlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(okbutton)
                        .addGap(85, 85, 85)
                        .addComponent(cancelbutton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelbutton, okbutton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inputdx, inputdy});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Rnone)
                        .addComponent(Rmouse)
                        .addComponent(Rkey))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Cvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(inputdx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputdy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbutton)
                    .addComponent(cancelbutton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelbutton, okbutton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputdx, inputdy});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RkeyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RkeyStateChanged
        /*
         * if keyboard is selected ,disable options and make Keyboard listening
         * To change the currently set value,click on combobox and press the
         * keycombination on your keyboard.this will set the keyvalue.
         */
        
        if(Rkey.isSelected()){
        System.out.println("Keyboard selected");
        temp.device=EventConstant.KEYBOARD;
        disableoptions(false);
        Cvalue.setEnabled(true);
        Cvalue.removeAllItems();
        if(ce.device==EventConstant.KEYBOARD)
            Cvalue.addItem(getKeyCombination(ce.values));
        else
            Cvalue.addItem("Click to Change");
        Cvalue.setEnabled(false);
        
        }
    }//GEN-LAST:event_RkeyStateChanged

    private void CvalueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CvalueMouseClicked
        if (temp.device==EventConstant.KEYBOARD){    
            Cvalue.setEnabled(true);
            Cvalue.setFocusable(true);
            Cvalue.requestFocus();
            instructlabel.setText("Click to change");
            Cvalue.addKeyListener(this);
            
        }
    }//GEN-LAST:event_CvalueMouseClicked

    private void RmouseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RmouseStateChanged
        // TODO add your handling code here:
        /*
         * if mouse is selected update the combobox with
         * all the mouse options.
         * if mouse move is selected dx and dy can be edited
         * if the entered value isn't a number default value of 5 is chosen
         * if mouse scroll is selected ,dx can be edited and if the entered 
         * value is not a number default value of 5 is chosen. 
         */
        if(Rmouse.isSelected())
        {
            temp.device=EventConstant.MOUSE;
            Cvalue.setEnabled(true);
            Cvalue.removeAllItems();
            for(int i=0;i<EventConstant.mouseevents.length;i++){
                Cvalue.addItem(EventConstant.mouseevents[i]);               
            }
        }

    }//GEN-LAST:event_RmouseStateChanged

    private void RnoneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RnoneStateChanged
        /*
         * don't assign a device
         * or Computer Device
         */
                
        if(Rnone.isSelected()){
            temp.device=EventConstant.NONE;
            disableAllOptions();
            temp.values=new ArrayList<Integer>();
            temp.values.add(EventConstant.NONE);
            temp.dx=0;
            temp.dy=0;
        }
    }//GEN-LAST:event_RnoneStateChanged

    private void CvalueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CvalueItemStateChanged
        temp.values=new ArrayList<Integer>();
        Integer i=Cvalue.getSelectedIndex();
        temp.values.add(i);
        if(i==EventConstant.MOUSEMOVE){
            enableoptions(false);
            inputdx.setText("5");
            inputdy.setText("5");
            temp.dx=5;
            temp.dy=5;
        }
        else if(i==EventConstant.SCROLL){
            enableoptions(true);
            inputdx.setText("5");
            temp.dx=5;
        }
    }//GEN-LAST:event_CvalueItemStateChanged

    private void inputdxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputdxFocusLost
        // TODO add your handling code here:
        String text=inputdx.getText();
        int i;
        if(text.length()==0)
            inputdx.setText("5");
        else
            try{
            i=Integer.parseInt(text);
            temp.dx=i;
            }
            catch(NumberFormatException e){
                inputdx.setText("5");
                
            }
    }//GEN-LAST:event_inputdxFocusLost

    private void inputdyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputdyFocusLost
        // TODO add your handling code here:
        String text = inputdy.getText();
        int i;
        if (text.length() == 0) {
            inputdy.setText("5");
        } else {
            try {
                i = Integer.parseInt(text);
                temp.dy = i;
            } catch (NumberFormatException e) {
                inputdy.setText("5");

            }
        }
    }//GEN-LAST:event_inputdyFocusLost

    private void okbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbuttonMouseClicked
        // TODO add your handling code here:
        /*
         * keep the changes done.
         */
        ce=temp;
        switch(ce.eventno){
            case ShieldEvent.EVENT_PRESSED:
                source.updateOnPress(ce);
                break;
            case ShieldEvent.EVENT_RELEASED:
                source.updateOnRelease(ce);
                break;
            case ShieldEvent.EVENT_CLICK:
                source.updateOnClick(ce);
                break;
            case ShieldEvent.EVENT_DOUBLECLICK:
                source.updateOnDblClick(ce);
                break;
            case ShieldEvent.EVENT_LONGPRESS:
                source.updateOnLongPress(ce);
                break;
        }
        source.setComEvent(ce);
        setVisible(false);
        
    }//GEN-LAST:event_okbuttonMouseClicked

    private void cancelbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbuttonMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_cancelbuttonMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ValueSetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValueSetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValueSetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValueSetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
               // new ValueSetter().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Cvalue;
    private javax.swing.JRadioButton Rkey;
    private javax.swing.JRadioButton Rmouse;
    private javax.swing.JRadioButton Rnone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JTextField inputdx;
    private javax.swing.JTextField inputdy;
    private javax.swing.JLabel instructlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton okbutton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(counter==0)temp.values=new ArrayList<Integer>();
        temp.values.add(e.getKeyCode());
        
        counter++;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        counter--;
        if(counter==0){
            instructlabel.setText(instructlabel.getText()+" Value changed to "+getKeyCombination(temp.values));
            Cvalue.removeKeyListener(this);
            Cvalue.setEnabled(false);
        }
    }
    public void disableoptions(boolean scroll){
        /*
         * disbale options text boxes
         */
        if(!scroll)
        inputdx.setEnabled(false);
        inputdy.setEnabled(false);
    }
    public void enableoptions(boolean scroll){
        /*
         * enable options text boxes
         */
        if(!scroll)
            inputdy.setEnabled(true);
        else
            inputdy.setEnabled(false);
        inputdx.setEnabled(true);
    }
    public void disableAllOptions(){
        /*
         * disbale everything except device selection
         */
        disableoptions(false);
        Cvalue.setEnabled(false);
    }
    public void setCurrentValue(){
        /*
         * updates Label and Combobox Values
         * for the current setting of ComEvent
         */
        switch(ce.device){
            case EventConstant.NONE:
                Rnone.setSelected(true);
                break;
            case EventConstant.MOUSE:
                Rmouse.setSelected(true);
                Cvalue.setSelectedIndex(ce.values.get(0));
                if(ce.values.get(0)==EventConstant.MOUSEMOVE){
                    inputdx.setText(""+ce.dx);
                    inputdy.setText(""+ce.dy);
                }
                else if(ce.values.get(0)==EventConstant.SCROLL){
                    inputdx.setText(""+ce.dx);
                }
                    
                break;
            case EventConstant.KEYBOARD:
                Rkey.setSelected(true);
                Cvalue.removeAllItems();
                Cvalue.addItem(getKeyCombination(ce.values));
                break;
        }
    }
    public static String getKeyCombination(ArrayList<Integer> val){
        /*
         * Returns user friendly name of the key-combinations
         */
        String keyCombination="";
        
        if(val.isEmpty())
            return "Not Set";
        else{
            keyCombination=KeyEvent.getKeyText(val.get(0));
        for(int i=1;i<val.size();i++){
            if(val.get(i)==0){
                keyCombination="Not Set";
                return keyCombination;
            }else
                keyCombination=keyCombination + " + " + KeyEvent.getKeyText(val.get(i));
        }}
        return keyCombination;
    }
}
