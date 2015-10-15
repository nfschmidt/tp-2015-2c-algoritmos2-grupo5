package frameworkJuegos.tamagotchi;

public  class Tamagotchi
{
	private String nombre;
	private int energia;
	private int hambre;
	private int felicidad;
	private int salud;
	private int diasDeVida;
	private Estado estadoActual;
	private Nivel nivel;

	public Tamagotchi()
	{
		inicializar();
	}
	public  void inicializar()
	{
		Nivel huevo = new Huevo(this);
		nivel=huevo;
		setEstadoActual(new Normal(huevo));
	}
	public String[] getMenu()
	{
		return getMenu();
	}
	public void procesarOpcionElegida(int opcionElegida)
	{
		//gestionarMenu(opcionElegida,this);
	}
	public void vivir()
	{
	
	}
	public void morir()
	{
		estadoActual = new Muerto();
	}
	public void sumarDia()
	{
		this.diasDeVida ++;
	}
	public int getNivelMinimoHambre()
	{
		return getNivelMinimoHambre();
	}
	public boolean estasVivo()
	{
		return estadoActual.estasVivo();
	}
	public boolean necesitasTratamiento()
	{
	   return (estadoActual.puedeAfectarA(this));
	}
	
	public void aumentarSalud(int unaCantidad)
	{		
		int saludMaximaNivel= nivel.getSaludMaxima();
	    this.salud = Math.min(saludMaximaNivel,salud + unaCantidad);
	}
	public void aumentarEnergia(int unaEnergia)
	{
		int energiaMaximaNivel= nivel.getEnergiaMaxima();
		this.energia = Math.min(energiaMaximaNivel,energia + unaEnergia);
	}
	public void aumentarHambre(int unaCantidad)
	{
		int hambreMaximaNivel= nivel.getHambreMaxima();
		this.hambre = Math.min(hambreMaximaNivel,hambre + unaCantidad);
	}
	public void aumentarFelicidad(int unaCantidad)
	{
		int felicidadMaximaNivel= nivel.getFelicidadMaxima();
		this.felicidad = Math.min(felicidadMaximaNivel,felicidad + unaCantidad);
	}
	public void disminuirHambre(int unValor)
	{
		this.hambre = Math.max(0,hambre + unValor);
	}	
	
	
	
	
	//--getters y setters---------------------------
	public void setNivel(Nivel unNivel)
	{
		nivel= unNivel;
	}
	public Nivel getNivel()
	{
		return nivel;
	}
	public int getEnergia()
	{
		return energia;
	}
	public int getFelicidad()
	{
		return felicidad;
	}
	public int getSalud()
	{
		return salud;
	}
	public int getHambre()
	{
		return hambre;
	}
	public int getDiasDeVida()
	{
		return diasDeVida;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setEnergia(int unaEnergia)
	{
		this.energia = unaEnergia;
	}
	public void setHambre(int unaCantidad)
	{
		this.hambre = unaCantidad;	
	}
	public void setFelicidad(int unaCantidad)
	{
		this.felicidad =unaCantidad;
	}
	public void setSalud(int unaCantidad)
	{
		this.salud = unaCantidad;
	}
	public void setNombre(String unNombre)
	{
		nombre= unNombre;
	}
	public void setEstadoActual(Estado unEstado)
	{
		estadoActual= unEstado;
	}
	public void setDiasDeVida(int unosDias)
	{
		diasDeVida= unosDias;
	}

}
