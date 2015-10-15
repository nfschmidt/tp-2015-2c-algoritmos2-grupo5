package frameworkJuegos.tamagotchi;

import algoritmos2.grupo5.frameworkJuegos.UI;

public class UITamagotchi extends UI
{
	private String[] menu;

	public void inicializar(String[] unasOpciones) 
	{
		menu = unasOpciones;
	}

	public String[] getMenu()
	{
		return menu;
	}
	@Override
	public void imprimirMenu(String[] unMenu)
	{
		imprimir("0-Poner/Cambiar nombre");
		for(int i=0;i<unMenu.length ;i++)
		{
			imprimir((i+1) + "-"+ unMenu[i]);
		}
	}
}
