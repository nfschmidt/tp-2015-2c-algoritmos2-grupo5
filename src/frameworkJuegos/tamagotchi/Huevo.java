package frameworkJuegos.tamagotchi;

public class Huevo extends Nivel implements INivel
{
	Tamagotchi miTamagotchi;
	public Huevo(Tamagotchi unTamagotchi)
	{
		this.miTamagotchi=unTamagotchi;
		inicializar();
	}
	public void inicializar()
	{
		miTamagotchi.setEnergia(5);
		miTamagotchi.setHambre(0);
		miTamagotchi.setFelicidad(5);
		miTamagotchi.setSalud(5);
		miTamagotchi.setDiasDeVida(0);
		setSaludMaxima(5);
		setEnergiaMaxima(5);
		setHambreMaxima(0);
		setFelicidadMaxima(5);
		InicializarMenu();
	}
	private void InicializarMenu()
	{
		String[] unasOpciones=new String[2];
		unasOpciones[0]="Eclosionar huevo";
		unasOpciones[1]="	Matar";
	}
	public void gestionarMenu(int unaOpcion,Tamagotchi unTamagotchi)
	{
		switch(unaOpcion)
		{
			case 1: 
				super.ui.imprimir("Tu huevo está listo!!!");
				crecer(unTamagotchi);
				super.ui.imprimir("Muy bien, ahora tu mascota se convirtió en cachorro");
				break;
			case 2:
				super.ui.imprimir("¿Estas seguro de querer matar a tu huevo?, tiene toda una vida por delante.");
				super.ui.imprimir("Para confirmar presioná el número 3:");
				break;
			case 3:
				ui.imprimir("Tu huevo está muriendo...");
				unTamagotchi.morir();
				super.ui.imprimir("Q.E.P.D");
				break;
		}
	}
	public void crecer(Tamagotchi unTamagotchi)
	{
		Nivel unCachorro=new Cachorro();
		unTamagotchi.setNivel(unCachorro);
	}
	public int getNivelMinimoHambre()
	{
		return 1;
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
		// TODO Auto-generated method stub
		return null;
	}

}
