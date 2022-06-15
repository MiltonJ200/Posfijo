

public class Nodo {
    
    //declaromos los atributos siguientes y informacion de la clase nodo
    private Nodo Sig;
    private Object Info;

        //Creamos un contructor para asignar valores a los atributos
	public Nodo(Object Valor)
	{
		Info=Valor;
		Sig=null;
	}

        //creamos los gets y sets de los atributos
	public void setInfo(Object Valor)
	{
		Info =Valor;
	}

	public void setSig(Nodo Valor)
	{
		Sig=Valor;
	}

	public Object getInfo()
	{
		return Info;
	}

	public Nodo getSig()
	{
		return Sig;
	}
}
