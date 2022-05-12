 
package fatorial;

import javax.swing.JOptionPane;

public class Fatorial {

    public static void main(String[] args) {
       
       Número objFatorial = new Número();
       
       do{
           int número=Integer.parseInt(JOptionPane.showInputDialog(null,"Qual número você quer fazer o fatorial?","Advinhação",3));
           objFatorial.setNúmero(número);
           
           long resultado = objFatorial.fatorial();
           if (resultado != -1){
            JOptionPane.showMessageDialog(null, "Seu fatorial é:"+objFatorial.fatorial(),"Fatorial",1);
           }
           else{
               JOptionPane.showMessageDialog(null, "Seu fatorial é  inválido","Fatorial",1);
           }
       
       }while(JOptionPane.showConfirmDialog(null,"Deseja nova operação?","Fatorial",JOptionPane.YES_NO_OPTION,3) == 0);
            System.exit(0);
        
       }
    }
