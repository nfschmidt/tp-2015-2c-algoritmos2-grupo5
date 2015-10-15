package frameworkJuegos.tamagotchi;

public class Cachorro extends Nivel implements INivel
{
	Tamagotchi miTamagotchi;
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
		return 5;
	}

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
		Nivel unJoven=new Joven(unTamagotchi);
		unTamagotchi.setNivel(unJoven);
	}
	public void gestionarMenuzz(int unaOpcion,Tamagotchi unTamagotchi)
	{
		switch(unaOpcion)
		{

			case 2:
				super.ui.imprimir("¿Estas seguro de queres matar a tu huevo?, tiene toda una vida por delante.");
				super.ui.imprimir("Para confirmar presioná el número 3:");
				break;
			case 3:
				super.ui.imprimir("Tu huevo está muriendo");
				unTamagotchi.morir();
				super.ui.imprimir("Q.E.P.D");
				break;
		}
	}
	@Override
	public void gestionarMenu(int unaOpcion,Tamagotchi unTamagotchi)
	{
		switch(unaOpcion)
		{
			case 1://alimentar
				super.ui.imprimir("Muy bien, al comer tu mascota reduce su hambre.");
				comer(unTamagotchi);
				if (unTamagotchi.getHambre()==0)
				{
					super.ui.imprimir("tu mascota está satisfecha." );
				}
				else
				{
					super.ui.imprimir("Ahora tiene " +unTamagotchi.getHambre()+ " puntos de hambre." );
				}
				break;
			case 2://jugar
				super.ui.imprimir("Cuando jugan las mascotas aumentan su felicidad.");
				jugar(unTamagotchi);
				super.ui.imprimir(unTamagotchi.getNombre() + " ahora tiene " + unTamagotchi.getFelicidad() + " puntos de felicidad");
				break;
			case 3://dormir
				super.ui.imprimir("Al dormir se recupera la energia,");
				dormir(unTamagotchi);
				super.ui.imprimir("tu mascota ahora tiene " + unTamagotchi.getEnergia() + " puntos de energia");
				break;
			case 4://curar
				
//				if (unTamagotchi.getSalud()== .getSaludMaxima())
//				{
//					super.ui.imprimir("Tu cachorro ya está muy saludable");
//					//podria agregar el caso de sobredosis aca
//				}
//				else
//				{
//					curar(unTamagotchi);
//					super.ui.imprimir("Tu cachorro está creciendo!!!");
//				}
				break;
			case 5://crecer
				super.ui.imprimir("Tu cachorro está creciendo!!!");
				crecer(unTamagotchi);
				super.ui.imprimir("Muy bien, ahora que tu mascota creció un poco aumentaron sus puntos de energia, felicidad y demás.");
				break;
			case 6://matar
				super.ui.imprimir("¿Estas seguro de querer matar a tu cachorro?, tiene toda una vida por delante.");
				super.ui.imprimir("Para confirmar presioná el número 7:");
				break;
			case 7://confirmar muerte
				super.ui.imprimir("Tu cachorro está muriendo");
				unTamagotchi.morir();
				super.ui.imprimir("Q.E.P.D");
				break;
		}
	}

	@Override
	public String[] getMenu()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
