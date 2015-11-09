package algoritmos2.grupo5.frameworkJuegos;

import java.util.ArrayList;

public abstract class Jugada
{
	//private Reglamento reglamento;
	private ArrayList<IGameObject> listaGameObjects;
	public int posicionX;
	public int posicionY;
	public Jugador jugador;

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
	 public int getPosicionX(){
		 return this.posicionX;
	 }
	 public void setPosicionX(int valor){
		 this.posicionX = valor;
	 }
	 
	 public int getPosicionY(){
		 return this.posicionY;
	 }
	 public void setPosicionY(int valor){
		 this.posicionY = valor;
	 }
	 
	 public Jugador getJugador(){
		 return this.jugador;
	 }
	 public void setJugador(Jugador jugador){
		 this.jugador = jugador;
	 }
	
	
	public abstract void ejecutar(Tablero tablero);
}
