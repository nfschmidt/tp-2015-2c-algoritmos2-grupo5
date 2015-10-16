package frameworkJuegos.tamagotchi;

public abstract class Nivel implements INivel
{
	private UITamagotchi ui;
	Tamagotchi unTamagotchi;
	private int saludMaxima;
	private int energiaMaxima;
	private int felicidadMaxima;
	private int hambreMaxima;
	
    public abstract String[] getMenu();
    public abstract void crecer(Tamagotchi unTamagotchi);
	public abstract void gestionarMenu(int opcionElegida, Tamagotchi unTamagotchi);
	public int getNivelMinimoHambre()
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void inicializar()
	{
		ui = new UITamagotchi();
	}
	@Override
	public void dormir(Tamagotchi unTamagotchi)
	{
		Vivo unEstado = (Vivo)unTamagotchi.getEstadoActual();
		unTamagotchi.aumentarEnergia(unEstado.getCantidadPuntosExtraEnergia(this));
	}

	@Override
	public void comer(Tamagotchi unTamagotchi)
	{
		Vivo unEstado = (Vivo)unTamagotchi.getEstadoActual();
		unTamagotchi.disminuirHambre(unEstado.getCantidadPuntosExtraHambre(this));
	}

	@Override
	public void jugar(Tamagotchi unTamagotchi)
	{
		Vivo unEstado = (Vivo)unTamagotchi.getEstadoActual();
		unTamagotchi.aumentarFelicidad(unEstado.getCantidadPuntosExtraFelicidad(this));
	}

	@Override
	public void curar(Tamagotchi unTamagotchi)
	{
		Vivo unEstado = (Vivo)unTamagotchi.getEstadoActual();
		unTamagotchi.aumentarSalud(unEstado.getCantidadPuntosExtraSalud(this));
	}
	public void imprimir(String mensaje)
	{
		ui.imprimir(mensaje);
	}
	
	public void cambiarEstado(Tamagotchi unTamagotchi)
	{
		if (unTamagotchi.getEnergia() > (unTamagotchi.getNivel().getEnergiaMaxima()/2))
			unTamagotchi.setEstadoActual(new Normal(this));
		else
		{
			//agregar otros estados
		}
	}
	//getters y setters----------------------------------------
	public int getSaludMaxima()
	{
		return saludMaxima;
	}
	public void setSaludMaxima(int saludMaxima)
	{
		this.saludMaxima = saludMaxima;
	}
	public int getEnergiaMaxima()
	{
		return energiaMaxima;
	}
	public void setEnergiaMaxima(int energiaMaxima)
	{
		this.energiaMaxima = energiaMaxima;
	}
	public int getFelicidadMaxima()
	{
		return felicidadMaxima;
	}
	public void setFelicidadMaxima(int felicidadMaxima)
	{
		this.felicidadMaxima = felicidadMaxima;
	}
	public int getHambreMaxima()
	{
		return hambreMaxima;
	}
	public void setHambreMaxima(int hambreMaxima)
	{
		this.hambreMaxima = hambreMaxima;
	}
	public Tamagotchi getTamagotchi()
	{ 
		return unTamagotchi;
	}
	public abstract String nombre();


}
