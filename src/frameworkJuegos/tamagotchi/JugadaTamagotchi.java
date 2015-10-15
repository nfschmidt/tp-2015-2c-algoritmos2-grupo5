package frameworkJuegos.tamagotchi;

import algoritmos2.grupo5.frameworkJuegos.Jugada;
import algoritmos2.grupo5.frameworkJuegos.Reglamento;

public class JugadaTamagotchi extends Jugada
{
	private UITamagotchi ui;
	private Tamagotchi unTamagotchi;
	
	public JugadaTamagotchi(Reglamento unReglamento, Tamagotchi unTamagotchi)
	{
		super.setReglamento(unReglamento);
		this.unTamagotchi= unTamagotchi;
	}
	
    public void inicializar()
    {
		ui = new UITamagotchi();
		ui.comenzar();
    }
    
	public boolean validar(int unValor)
	{    //sacar esto cuando tenga el menu de interaccciones 
		 //y sepa la cantidad de opciones bien
		 return (unValor>=0) && (unValor <8);
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
			if(unValor==0)
			{
				String nombre;
				ui.imprimir("Ingresá un nuevo nombre para tu mascota:");
				nombre=ui.scanearCadena();
				unTamagotchi.setNombre(nombre);
				ui.imprimir("Muy bien, ahora tu mascota se llama " + nombre);
			}
			else
			{
				unTamagotchi.procesarOpcionElegida(unValor);
			}
		}
		else
			ui.imprimir("Ese numero no, elegi uno que esté en el menú");
	}
	
	 public boolean chequearFin()
	 {
		 return  !unTamagotchi.estasVivo();
	 }
	
}
