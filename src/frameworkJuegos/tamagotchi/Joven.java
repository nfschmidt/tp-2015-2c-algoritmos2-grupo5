package frameworkJuegos.tamagotchi;

public class Joven extends Nivel implements INivel
{
	Tamagotchi miTamagotchi;
	public Joven(Tamagotchi unTamagotchi)
	{
		this.miTamagotchi=unTamagotchi;
		inicializar();
	}
	public void inicializar()
	{
		miTamagotchi.aumentarEnergia(50);
		miTamagotchi.aumentarHambre(10);
		miTamagotchi.aumentarFelicidad(25);
		miTamagotchi.aumentarSalud(10);
		setSaludMaxima(20);
		setEnergiaMaxima(100);
		setHambreMaxima(60);
		setFelicidadMaxima(100);
		inicializarMenu();
	}

	private void inicializarMenu()
	{
		String[] unasOpciones=new String[6];
		unasOpciones[0]="Alimentar";
		unasOpciones[1]="Jugar con";
		unasOpciones[2]="Dormir";
		unasOpciones[3]="Curar";
		unasOpciones[4]="Crecer";
		unasOpciones[5]="	Matar";
		//super.inicializar(unasOpciones);
	}
	public int getNivelMinimoHambre()
	{
		return 2;
	}
	@Override
	public void dormir(Tamagotchi unTamagotchi)
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void comer(Tamagotchi unTamagotchi)
	{
		// TODO Auto-generated method stub
	}
	@Override
	public void jugar(Tamagotchi unTamagotchi)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void curar(Tamagotchi unTamagotchi)
	{
		// TODO Auto-generated method stub
	}
	@Override
	public String[] getMenu()
	{
		return null;
	}
	@Override
	public void crecer( Tamagotchi unTamagotchi)
	{
		Nivel unAdulto=new Adulto();
		unTamagotchi.setNivel(unAdulto);
	}

	@Override
	public void gestionarMenu(int unaOpcion,Tamagotchi unTamagotchi)
	{
		// TODO Auto-generated method stub
		
	}
}
