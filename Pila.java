

public class Pila {
    
    //Declaramos un atributo de la clase Nodo
    private Nodo Tope;

        //Creamos un metodo de la clase object 
	public Object Tope()
	{
	    return Tope.getInfo();
	}

        //Creamos un contructor de la clase pila
	public Pila()
	{
            Tope=null;
	}

        //creamos un metodo boleano para determinar si la clase esta vacia
	public boolean Pila_Vacia()
	{
            return(Tope==null)?true:false;
	}

        //Creamos un metodo para meter datos en la pila
	public void push(Object Dato)
	{
		Nodo Nuevo=new Nodo(Dato);
		if(!Pila_Vacia())
		Nuevo.setSig(Tope);
		Tope=Nuevo;
	}

        //Creamos un metodo para sacar datos de la pila
	public Object pop()
	{
		Object Aux='@'; //valor centinela
                Nodo aux2=Tope;

		if(!Pila_Vacia())
		{
			Aux=Tope.getInfo();
			Tope=Tope.getSig();
			aux2.setSig(null);
			aux2=null;
			System.gc();
		}
		return Aux;
	}
    
}
