

import javax.swing.JOptionPane;

public class Convertidor {
    
  //Creamos un objeto de la clase pila
   Pila pl=new Pila();
   Pila p2=new Pila();
   public String Posfijo(String Infijo)
   {
       
	 String posfijo="";
         //Convertimos la expresion
	 for(int i=0;i<Infijo.length();i++)
	 {
             
	    int p=Prioridad(Infijo.charAt(i));
            //Evaluamos la prioridad operador
	      if(p==0)
	        pl.push(Infijo.charAt(i));
		      if(p>0 && p<4)
		      {
                          //Preguntamos si la pila esta vacia
		        if(pl.Pila_Vacia())
		         pl.push(Infijo.charAt(i));
                        //Devuelve el elemento que ha sido insertado en la pila.
		        else
		        {
		           while(!pl.Pila_Vacia() && Prioridad(pl.Tope())>=p)
	                 {posfijo+=pl.pop();}

	   	           pl.push(Infijo.charAt(i));
		        }
		      }
		      if(p==4)
		      {
		      	char po=(Character)pl.pop();
		        do
		        {
		        	if(Prioridad(po)!=0)
		        	 posfijo+=po;

		        	 po=(Character)pl.pop();

		        } while(Prioridad(po)!=0);
		      }
		      if(p==5)
		       posfijo+=Infijo.charAt(i);
		}
	   while(!pl.Pila_Vacia())
	   posfijo+=pl.pop();
   	   return posfijo;
	}

    
    public int Prioridad(Object d)//Nosotros creamos un metodo que asigna prioridades para los operadores 
	{
	   char x=(Character)d;//cambiamos el valor de una variable char
	   int S;
        switch (x) {
           case '(':
               S=0;
               break;
           case '+':
           case '-':
               S=1;
               break;
           case '*':
           case '/':
               S=2;
               break;
           case '^':
               S=3;
               break;
           case ')':
               S=4;
               break;
           default:
               S=5;
               break;
       }
	    return S;
            //retornamos la prioridad
	}

       
		 	
		 }
	  





