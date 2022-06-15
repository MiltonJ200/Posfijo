

import javax.swing.JOptionPane;
public class Evaluacion {
    
    Pila p=new Pila();//creamos un objeto de clase pila
 
	public int Operador(char a)//Creamos un metodo para evaluar la expresion del operador
	{
	    int p;
	      if(a=='+')
		  p=0;
		   else
		     if(a=='-')
		       p=1;
		        else
		         if(a=='*')
			  p=2;
		            else
			     if(a=='/')
			      p=3;
			       else
			       if(a=='^')
			         p=4;
			          else
			             p=5;
		                       return p;
	}
   
	public String Evaluar(String Posfijo) //Metodo que evalua la expresion posfija
        {
	  String expre="";
	  int A;
	  int B;
	  int acumulador=0;//Creamos un acumulador

        try{
            	  for(int i=0;i<Posfijo.length();i++)
	  {
              //Asignamos el valor de las constantes 
	    if(Operador(Posfijo.charAt(i))==5)
		{
                    String valor=JOptionPane.showInputDialog("INGRESE EL VALOR DE "+Posfijo.charAt(i));
                    p.push(valor);
		}

		else
		{
		   A=Integer.parseInt(p.pop().toString());
		   B=Integer.parseInt(p.pop().toString());

		int Signo=Operador(Posfijo.charAt(i));
                //Realizamos la evaluavion determinada por su valor del signo que tenga
		 switch(Signo)
		 {
			case 0:acumulador=B+A;
			break;

			case 1:acumulador=B-A;
			break;

			case 2:acumulador=B*A;
			break;

			case 3:acumulador=B/A;
			break;

			case 4:acumulador=(int)Math.pow(B,A);
			break;
		 }
		p.push(acumulador);
	    }
	   }
        }
        catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Error!");}
		  expre+=p.pop();
		  return expre;
        }

       
}
