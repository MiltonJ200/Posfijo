


import javax.swing.*;
public class infijaporfija {
	
    public static void main(String[] args) {
      String expresion;
    Convertidor c=new Convertidor();
    Evaluacion r=new Evaluacion();
    Pila p=new Pila();
  expresion=JOptionPane.showInputDialog("Ingrese expresion");

 JOptionPane.showMessageDialog(null, c.Posfijo(expresion));
 String a=c.Posfijo(expresion);
 JOptionPane.showMessageDialog(null,"Evaluacion" + r.Evaluar(a));
    }
}
