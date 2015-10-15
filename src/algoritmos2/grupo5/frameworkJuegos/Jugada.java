package algoritmos2.grupo5.frameworkJuegos;

import java.util.ArrayList;

public abstract class Jugada implements IJugada
{
	private Reglamento reglamento;
	private ArrayList<IGameObject> listaGameObjects;

	@Override
	public abstract void inicializar();
	@Override
	public abstract void jugar();
	@Override
	public  boolean chequearFin()
	{ 
		return reglamento.esFin(this); 
	}
	
	
	
	//-----getters y setters----------------------------------------
	public ArrayList<IGameObject> getListaGameObjects()
	{
		return listaGameObjects;
	}
	public void setListaGameObjects(ArrayList<IGameObject> listaGameObjects)
	{
		this.listaGameObjects = listaGameObjects;
	}
	public Reglamento getReglamento()
	{
		return reglamento;
	}
	public void setReglamento(Reglamento reglamento)
	{
		this.reglamento = reglamento;
	}
}
