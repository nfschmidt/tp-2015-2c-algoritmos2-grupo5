package frameworkJuegos.tamagotchi;

public interface INivel
{
	public void inicializar();
	//public int getNivelMinimoHambre();
	public void dormir(Tamagotchi unTamagotchi);
	public void comer(Tamagotchi unTamagotchi);
	public void jugar(Tamagotchi unTamagotchi);
	public void curar(Tamagotchi unTamagotchi);
    public String[] getMenu();
    public void crecer(Tamagotchi unTamagotchi);
	public void gestionarMenu(int opcionElegida, Tamagotchi unTamagotchi);
	//public void imprimir();
}
