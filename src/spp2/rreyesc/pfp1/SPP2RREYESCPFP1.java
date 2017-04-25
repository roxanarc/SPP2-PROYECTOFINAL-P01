/*
 * To chnge this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.pfp1;
import javax.swing.JOptionPane;
/**
 *
 * @author roxana
 */
public class SPP2RREYESCPFP1 {

    /**
     * @param args the command line arguments
     */
    
    //ROXANA REYES CORDOBA
    //JUAN PABLO CASTILLO
    //ANA SILVIA ALDAPE
    //MAXIMILIANO TURRIBIATES
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar variables
        int a=0;
        double calf, prom, par1=0, par2=0;
        
        a=pedirEntero("Introduce el número de materias que cursas:");
        
        String[][] miVector=new String[a][4];
        for (int i=0; i<miVector.length; i++){
            
        miVector[i][0]=pedirString("Nombre de la materia:");
        miVector[i][1]=pedirDouble("Introduce la calificación del primer parcial:");
        miVector[i][2]=pedirDouble("Introduce la calificación del segundo parcial:");
        
        par1=Double.parseDouble(miVector[i][1]);
        par2=Double.parseDouble(miVector[i][2]);
        prom=(par1+par2)/2;
        JOptionPane.showMessageDialog(null, "Tu promedio es:" +prom);
        }
    }
    public static int pedirEntero(String mensaje){
        String dato="";
        int num=0;
        boolean flag;
        do{
            try{ 
                dato=JOptionPane.showInputDialog(null, mensaje);
                num=Integer.parseInt(dato);
                flag=false;
            }catch (Exception ex){
                JOptionPane.showInputDialog(null, "Error");
                flag=true;
            }
            }while (flag);
        return num;
    }
    public static String pedirString(String mensaje){
        String dato="";
        boolean flag;
        do{
            try{
                dato=JOptionPane.showInputDialog(null, mensaje);
                flag=false; 
            }catch (Exception ex){
                JOptionPane.showInputDialog(null, "Error");
                flag=true;
            }
        }while(flag);
        return dato;
    }
    public static String pedirDouble(String mensaje){
        String dato="";
        double num=0;
        String d="";
        boolean flag;
        do{
            try{
                dato=JOptionPane.showInputDialog(null, mensaje);
                num=Double.parseDouble(dato);
                flag=false;
            }catch (Exception ex){
                JOptionPane.showInputDialog(null, "Error");
                flag=true;
            }
        }while(flag);
        d=String.valueOf(num);
    return d;
}
}