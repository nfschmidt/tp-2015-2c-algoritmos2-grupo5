package frameworkJuegos.tamagotchi;

public class Cachorro extends Nivel 
{
	Tamagotchi miTamagotchi;
	public Cachorro(Tamagotchi unTamagotchi)
	{
		this.miTamagotchi=unTamagotchi;
		inicializar();
		super.inicializar();
	}
	@Override
	public void inicializar()
	{
		miTamagotchi.aumentarEnergia(10);
		miTamagotchi.aumentarHambre(5);
		miTamagotchi.aumentarFelicidad(25);
		miTamagotchi.aumentarSalud(5);
		setSaludMaxima(10);
		setEnergiaMaxima(25);
		setHambreMaxima(30);
		setFelicidadMaxima(50);
	}
	public String nombre()
	{
		return "Cachorr@";
	}
	@Override
	public void crecer(Tamagotchi unTamagotchi)
	{
		Nivel unJoven=new Joven(unTamagotchi);
		unTamagotchi.setNivel(unJoven);
	}

	@Override
	public void gestionarMenu(int unaOpcion,Tamagotchi unTamagotchi)
	{
		switch(unaOpcion)
		{
			case 2://alimentar
				imprimir("Muy bien, al comer tu mascota reduce su hambre.");
				comer(unTamagotchi);
				if (unTamagotchi.getHambre()==0)
				{
					imprimir("tu mascota está satisfecha." );
				}
				else
				{
					imprimir("Ahora tiene " +unTamagotchi.getHambre()+ " puntos de hambre." );
				}
				break;
			case 3://jugar
				imprimir("Cuando jugan las mascotas aumentan su felicidad.");
				jugar(unTamagotchi);
				imprimir(unTamagotchi.getNombre() + " ahora tiene " + unTamagotchi.getFelicidad() + " puntos de felicidad");
				break;
			case 4://dormir
				imprimir("Al dormir se recupera la energia,");
				dormir(unTamagotchi);
				imprimir("tu mascota ahora tiene " + unTamagotchi.getEnergia() + " puntos de energia");
				break;
			case 5://curar
				if (unTamagotchi.getSalud()== getSaludMaxima())
				{
					imprimir("Tu cachorro ya está muy saludable");
				}
				else
				{
					curar(unTamagotchi);
					imprimir(unTamagotchi.getNombre() +  " ahora tiene " + unTamagotchi.getSalud()  + " puntos de salud");
				}
				break;
			case 6://crecer
				imprimir("Tu cachorro está creciendo!!!");
				crecer(unTamagotchi);
				imprimir("Muy bien, ahora que tu mascota creció un poco aumentaron sus puntos de energia, felicidad y demás.");
				break;
			case 7://matar
				imprimir("¿Estas seguro de querer matar a " + unTamagotchi.getNombre() + ", tiene toda una vida por delante.");
				imprimir("Para confirmar presioná el número 8:");
				break;
			case 8://confirmar muerte
				imprimir("Tu cachorro está muriendo");
				unTamagotchi.morir();
				imprimir("Q.E.P.D");
				break;
		}
	}
	@Override
	public String[] getMenu()
	{
		String[] unMenu=new String[6];
		unMenu[0]="Alimentar";
		unMenu[1]="Jugar con";
		unMenu[2]="Dormir";
		unMenu[3]="Curar";
		unMenu[4]="Crecer";
		unMenu[5]="	  Matar";
		return unMenu;
	}
}
