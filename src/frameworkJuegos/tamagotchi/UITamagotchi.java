package frameworkJuegos.tamagotchi;

import algoritmos2.grupo5.frameworkJuegos.UI;

public class UITamagotchi extends UI
{
	private String[] menu;

	public void inicializar() 
	{
	}

	public String[] getMenu()
	{
		return menu;
	}
	@Override
	public void imprimirMenu(String[] unMenu)
	{
		imprimir("0-Ver estado actual de tu mascota."); 
		imprimir("1-Poner/Cambiar nombre");
		for(int i=0;i<unMenu.length ;i++)
		{
			imprimir((i+2) + "-"+ unMenu[i]);
		}
		
	}
}
