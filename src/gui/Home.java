/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import genetics.Gene;
import genetics.Individual;
import genetics.Solution;
import java.awt.Component;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static genetics.Picture.DIMX;
import static genetics.Picture.DIMY;

/**
 *
 * @author nikol
 */
public class Home extends javax.swing.JFrame
{

    /**
     * Creates new form Home
     */
    public Home()
    {
        initComponents();
        setLocationRelativeTo(null);
        instance=this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        txtCircles = new javax.swing.JLabel();
        btnLocation = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        txtInfo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtIter = new javax.swing.JTextField();
        txtRadMin = new javax.swing.JTextField();
        txtRadMax = new javax.swing.JTextField();
        txtPopSize = new javax.swing.JTextField();
        txtCrosProb = new javax.swing.JTextField();
        txtMutProb = new javax.swing.JTextField();
        txtGoal = new javax.swing.JTextField();
        txtSelect = new javax.swing.JTextField();
        txtGenes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSolution = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCircles.setBackground(new java.awt.Color(255, 255, 255));
        txtCircles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCircles.setText("Picture will appear here");

        btnLocation.setText("Find the picture");
        btnLocation.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLocationActionPerformed(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.setEnabled(false);
        btnStart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnStopActionPerformed(evt);
            }
        });

        txtInfo.setColumns(15);
        txtInfo.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtInfo.setRows(10);

        jLabel1.setText("Max num. of iter.");

        txtIter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIter.setText("100000");

        txtRadMin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRadMin.setText("1");

        txtRadMax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRadMax.setText("10");

        txtPopSize.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPopSize.setText("50");

        txtCrosProb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCrosProb.setText("90");

        txtMutProb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMutProb.setText("50");

        txtGoal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGoal.setText("95");

        txtSelect.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSelect.setText("10");

        txtGenes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGenes.setText("1500");

        jLabel2.setText("Min radius");

        jLabel3.setText("Max radius");

        jLabel4.setText("Population size");

        jLabel5.setText("Crossing prob. percent");

        jLabel6.setText("Mutation prob. percent");

        jLabel7.setText("Goal percent");

        jLabel8.setText("Size of elite");

        btnSolution.setText("Location for the solution");
        btnSolution.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSolutionActionPerformed(evt);
            }
        });

        jLabel9.setText("Num. of circles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSolution, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGenes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGoal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMutProb)
                            .addComponent(txtCrosProb)
                            .addComponent(txtPopSize)
                            .addComponent(txtSelect, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(txtRadMin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRadMax, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCircles, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCircles, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRadMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRadMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPopSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCrosProb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMutProb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSolution))
                    .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void callOptionPane(Component comp, Object message, String title, int messageType) {
        JOptionPane novi = new JOptionPane();
        novi.showMessageDialog(comp, message, title, messageType);
    }
    
    private void btnLocationActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLocationActionPerformed
    {//GEN-HEADEREND:event_btnLocationActionPerformed
    
        /**Getting the location of image**/
        FileDialog dialog = new FileDialog(this);
        dialog.setVisible(true);
        //JFileChooser chooser = new JFileChooser();
        File location=null;
        try
        {
            location=dialog.getFiles()[0];
            //location=chooser.getSelectedFile();
        }
        catch(Exception e)
        {
            return;
        }
        if(location==null)
        {
            callOptionPane(this, "Check it a little bit more.", "Check it a little bit more!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        btnLocation.setText(location.getName());
        btnLocation.setIcon(null);
        /**Reading the image from location**/
        Image image=null;
        try
        {
            byte[] bytes=Files.readAllBytes(location.toPath());
            img = ImageIO.read(new ByteArrayInputStream(bytes));
            /*for(int i=10;i<100;++i)//Pisanje po slici
                for(int j=10;j<100;++j)
                    img.setRGB(i, j, 0);*/
            //image = img.getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), BufferedImage.SCALE_FAST);
            image = img.getScaledInstance(256, 256, BufferedImage.SCALE_FAST);
            btnStart.setEnabled(true);
        }
        catch (IOException e)
        {
            callOptionPane(this, "Faulty image.", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        /**Showing the image**/
        txtCircles.setText("");
        txtCircles.setIcon(new ImageIcon(image));
        
        btnStart.setEnabled(true);
        DIMX=img.getWidth();
        DIMY=img.getHeight();
    }//GEN-LAST:event_btnLocationActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnStartActionPerformed
    {//GEN-HEADEREND:event_btnStartActionPerformed
        try
        {
            Solution.MAX_ITER=Integer.parseInt(txtIter.getText());
            Gene.MINR=Integer.parseInt(txtRadMin.getText());
            Gene.MAXR=Integer.parseInt(txtRadMax.getText());
            Solution.POP_SIZE=Integer.parseInt(txtPopSize.getText());
            Solution.P_CRO=Integer.parseInt(txtCrosProb.getText())/100.0;
            Solution.P_MUT=Integer.parseInt(txtMutProb.getText())/100.0;
            Solution.GOAL_FIT=Integer.parseInt(txtGoal.getText())/100.0;
            Solution.SELECT=Integer.parseInt(txtSelect.getText());
            Individual.NUM_GENES=Integer.parseInt(txtGenes.getText());
        }
        catch(Exception e)
        {
            callOptionPane(this, "Type of input parameters not good.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if
        (
            Solution.MAX_ITER<=0 ||
            Gene.MINR<0 ||
            Gene.MAXR<0 ||
            Gene.MINR>Gene.MAXR ||
            Solution.POP_SIZE<=0 ||
            Solution.P_CRO<0.0 ||
            Solution.P_CRO>1.0 ||
            Solution.P_MUT<0.0 ||
            Solution.P_MUT>1.0 ||
            Solution.GOAL_FIT<=0.0 ||
            Solution.GOAL_FIT>1.0 ||
            Solution.SELECT>=Solution.POP_SIZE ||
            Individual.NUM_GENES<=0
        )
        {
            callOptionPane(this, "Input parameters out of bounds.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Solution.STOP=false;
        Solution.image=img;
        btnStart.setEnabled(false);
        
        btnStop.setEnabled(true);
        runningThread=new Thread()
        {
            @Override
            public void run()
            {
                img=Solution.solve(/*img*/);
            }
        };
        runningThread.start();
        txtCircles.setText("");
        txtCircles.setIcon(new ImageIcon(
                img.getScaledInstance(256, 256, BufferedImage.SCALE_FAST)));
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnStopActionPerformed
    {//GEN-HEADEREND:event_btnStopActionPerformed
        Solution.STOP=true;
        btnStop.setEnabled(false);
        btnStart.setEnabled(true);
        try
        {
        runningThread.join();
        }
        catch(Exception e){}
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnSolutionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSolutionActionPerformed
    {//GEN-HEADEREND:event_btnSolutionActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showSaveDialog(null);
        
        chooser.setVisible(true);
        solutionLocation=null;
        try
        {
            //solutionLocation=chooser.getCurrentDirectory();
            solutionLocation=chooser.getSelectedFile();
        }
        catch(Exception e)
        {
            return;
        }
        if(solutionLocation==null)
        {
            callOptionPane(this, "Check it a little bit more.", "Check it a little bit more!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        btnSolution.setText(solutionLocation.getName());
        btnSolution.setIcon(null);
    }//GEN-LAST:event_btnSolutionActionPerformed
    
    public static void results(int iter, long time)
    {
        Home.iter=iter;
        Home.time=time;
    }
    public static void connection(Individual ind)
    {
        instance.txtInfo.setText
        (
                "Iter    :"+Solution.iter+
                "\nPercent :"+(Math.round(Individual.best.getFitness()*100.0*100.0/((long)DIMX*DIMY*256))/100.0)+"%"+
                "\nBest    :"+Individual.best.getFitness()+
                "\nLocal   :"+ind.getFitness()+
                "\nTime    :"+(int)((System.currentTimeMillis()-Solution.time)/1000)+"s"
        );
        //img=ind.toImage();
        img=Individual.best.toImage();
        instance.txtCircles.setText("");
        instance.txtCircles.setIcon(
                new ImageIcon(img.getScaledInstance(256, 256, BufferedImage.SCALE_FAST)));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Home().setVisible(true);
            }
        });
    }
    private static int iter;
    private static long time;
    public static BufferedImage img;
    public static Home instance;
    public static File solutionLocation=new File("solution");
    public static Thread runningThread;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocation;
    private javax.swing.JButton btnSolution;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtCircles;
    private javax.swing.JTextField txtCrosProb;
    private javax.swing.JTextField txtGenes;
    private javax.swing.JTextField txtGoal;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtIter;
    private javax.swing.JTextField txtMutProb;
    private javax.swing.JTextField txtPopSize;
    private javax.swing.JTextField txtRadMax;
    private javax.swing.JTextField txtRadMin;
    private javax.swing.JTextField txtSelect;
    // End of variables declaration//GEN-END:variables
}
