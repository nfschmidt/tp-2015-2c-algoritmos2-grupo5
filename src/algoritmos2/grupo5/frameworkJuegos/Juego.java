package algoritmos2.grupo5.frameworkJuegos;

import java.util.ArrayList;

public abstract class Juego implements IJuego{

	public void inicializar()
	{
		listaGameObjects= new ArrayList<IGameObject>();
	}

	public abstract void cerrar();
	public abstract void jugar();
	private String dirJuego; //path del directorio donde se ubican los recursos del juego en caso de tener alguno
	private IUI ui;
	private ArrayList<IGameObject> listaGameObjects;
	public void listaAdd(IGameObject unGameObject)
	{
		listaGameObjects.add(unGameObject);
	}
	
	
	
	//-getters y setters--------------------------
	public abstract String getCategoria();//la categoria me permite agrupar por tipo de juego, para poder armar un menu por ejemplo
	public abstract String getNombre();//nombre del juego que se ve en el menu
	public abstract String getDescripcion();
	public String getDirJuego()
	{
		return dirJuego;
	}
    public void setDirJuego(String path)
    {
    	this.dirJuego = path;
    }
	public IUI getUi()
	{
		return ui;
	}
	public void setUi(IUI ui)
	{
		this.ui = ui;
	}
	public ArrayList<IGameObject> getListaGameObjects()
	{
		return listaGameObjects;
	}
	public void setListaGameObjects(ArrayList<IGameObject> listaGameObjects)
	{
		this.listaGameObjects = listaGameObjects;
	}
}

