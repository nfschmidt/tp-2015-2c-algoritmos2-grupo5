package frameworkJuegos.tamagotchi;

public class Adulto extends Nivel implements INivel
{
	Tamagotchi miTamagotchi;
	public void inicializar()
	{
		miTamagotchi.aumentarEnergia(100);
		miTamagotchi.aumentarHambre(20);
		miTamagotchi.aumentarFelicidad(50);
		miTamagotchi.aumentarSalud(10);
		setSaludMaxima(50);
		setEnergiaMaxima(200);
		setHambreMaxima(120);
		setFelicidadMaxima(150);
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
	@Override
	public int getNivelMinimoHambre()
	{
		return 10;
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
	public void crecer(Tamagotchi unTamagotchi)
	{
		// no deberia entrar aca
	}

	@Override
	public void gestionarMenu(int unaOpcion, Tamagotchi unTamagotchi)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public String[] getMenu()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
