package algoritmos2.grupo5.frameworkJuegos;

import java.util.ArrayList;

public abstract class Jugada
{
	//private Reglamento reglamento;
	private ArrayList<IGameObject> listaGameObjects;

	public abstract void inicializar();
	public abstract void jugar();

	
	//-----getters y setters----------------------------------------
	public ArrayList<IGameObject> getListaGameObjects()
	{
		return listaGameObjects;
	}
	public void setListaGameObjects(ArrayList<IGameObject> listaGameObjects)
	{
		this.listaGameObjects = listaGameObjects;
	}
	/*public Reglamento getReglamento()
	{
		return reglamento;
	}
	public void setReglamento(Reglamento reglamento)
	{
		this.reglamento = reglamento;
	}*/
	
	public abstract void ejecutar(Tablero tablero);
}
