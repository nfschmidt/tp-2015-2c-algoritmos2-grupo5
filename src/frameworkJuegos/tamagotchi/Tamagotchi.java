package frameworkJuegos.tamagotchi;

import algoritmos2.grupo5.frameworkJuegos.GameObject;

public  class Tamagotchi extends GameObject
{
	private String nombre="tu mascota";
	private int energia;
	private int hambre;
	private int felicidad;
	private int salud;
	private int diasDeVida;
	private Estado estadoActual;
	private Nivel nivel;

	public  void inicializar()
	{
		Nivel huevo = new Huevo(this);
		nivel=huevo;
		setEstadoActual(new Normal(huevo));
	}
	@Override
	public void imprimir()
	{
		//nivel.imprimir();
	}
	@Override
	public void actualizar()
	{
		// TODO Auto-generated method stub
	}

	public void procesarOpcionElegida(int opcionElegida)
	{
		nivel.gestionarMenu(opcionElegida,this);
	}
	public void morir()
	{
		estadoActual = new Muerto();
	}

	public boolean estasVivo()
	{
		return estadoActual.estasVivo();
	}
	public boolean necesitasTratamiento()
	{
	   return (estadoActual.puedeAfectarA(this));
	}
	
	
	
	//---actualizar valores-----------------------------------------
	public void sumarDia()
	{
		this.diasDeVida ++;
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
		this.hambre = Math.max(0,hambre - unValor);
	}	
	public void disminuirEnergia(int unValor)
	{
		this.energia = Math.max(0,energia - unValor);
	}	
	public void disminuirFelicidad(int unValor)
	{
		this.felicidad = Math.max(0,felicidad - unValor);
	}	
	public void disminuirSalud(int unValor)
	{
		this.salud = Math.max(0,salud - unValor);
	}	
	
	
	//--getters y setters---------------------------
	public String[] getMenu()
	{
		return nivel.getMenu();
	}
	public int getNivelMinimoHambre()
	{
		return nivel.getNivelMinimoHambre();
	}
	public void setNivel(Nivel unNivel)
	{
		nivel= unNivel;
	}
	public Nivel getNivel()
	{
		return nivel;
	}
	public Estado getEstadoActual()
	{
		return estadoActual;
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
