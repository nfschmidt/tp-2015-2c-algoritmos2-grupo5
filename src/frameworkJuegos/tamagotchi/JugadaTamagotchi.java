package frameworkJuegos.tamagotchi;

import java.util.ArrayList;

import algoritmos2.grupo5.frameworkJuegos.IGameObject;
import algoritmos2.grupo5.frameworkJuegos.Jugada;

public class JugadaTamagotchi extends Jugada
{
	private UITamagotchi ui;
	private Tamagotchi unTamagotchi;
	
	public JugadaTamagotchi(ArrayList<IGameObject> unaListaGameObjects)
	{
		this.unTamagotchi = (Tamagotchi)unaListaGameObjects.get(0);
	}
	
    public void inicializar()
    {
		ui = new UITamagotchi();
		ui.comenzar();
		setReglamento(new ReglamentoTamagotchi());
    }
    
	public boolean validar(int unValor)
	{    //sacar esto cuando tenga el menu de interaccciones 
		 //y sepa la cantidad de opciones bien
		 return (unValor>=0) && (unValor <9);
		 //return menu.cantidadOpciones();
	}

	public void jugar()
	{
		int unValor;
		ui.imprimir("Elegi un numero del menu para interactuar con tu mascota");  
		ui.imprimirMenu(unTamagotchi.getMenu());
	    unValor =ui.scanearValor();
		if (validar(unValor))
		{
			if(unValor==1)
			{
				String nombre;
				ui.imprimir("Ingresá un nuevo nombre para tu mascota:");
				nombre=ui.scanearCadena();
				unTamagotchi.setNombre(nombre);
				ui.imprimir("Muy bien, ahora tu mascota se llama " + nombre);
			}
			else
			{
				if (unValor==0)
				{
					ui.imprimir("Nombre: " + unTamagotchi.getNombre());
					ui.imprimir("Energia: " + unTamagotchi.getEnergia());
					ui.imprimir("Felicidad: " + unTamagotchi.getFelicidad());
					ui.imprimir("Salud: " + unTamagotchi.getSalud());
					ui.imprimir("Hambre: " + unTamagotchi.getHambre());
					ui.imprimir("Nivel: " + unTamagotchi.getNivel().nombre());
					ui.imprimir("Estado: " + unTamagotchi.getEstadoActual().nombre() );
					
				}
				unTamagotchi.procesarOpcionElegida(unValor);
			}
			ui.imprimir("");
			ui.imprimir("");
		}
		else
			ui.imprimir("Ese numero no, elegi uno que esté en el menú");
	}
	
	 public boolean chequearFin()
	 {
		 return  !unTamagotchi.estasVivo();
	 }
	
}
