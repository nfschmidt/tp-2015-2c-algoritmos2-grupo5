package frameworkJuegos.tamagotchi;

public class Huevo extends Nivel
{
	Tamagotchi miTamagotchi;
	public Huevo(Tamagotchi unTamagotchi)
	{
		this.miTamagotchi=unTamagotchi;
		inicializar();
		super.inicializar();
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
	}
	public String nombre()
	{
		return "Huevo";
	}
	public void gestionarMenu(int unaOpcion,Tamagotchi unTamagotchi)
	{
		switch(unaOpcion)
		{
			case 2: 
				imprimir("Tu huevo está listo!!!");
				crecer(unTamagotchi);
				imprimir("Muy bien, ahora tu mascota se convirtió en cachorro");
				break;
			case 3:
				imprimir("¿Estas seguro de querer matar a tu huevo?, tiene toda una vida por delante.");
				imprimir("Para confirmar presioná el número 4:");
				break;
			case 4:
				imprimir("Tu huevo está muriendo...");
				unTamagotchi.morir();
				imprimir("Q.E.P.D");
				break;
		}
	}
	public void crecer(Tamagotchi unTamagotchi)
	{
		Nivel unCachorro=new Cachorro(unTamagotchi);
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
		String[] unMenu=new String[2];
		unMenu[0]="Eclosionar huevo";
		unMenu[1]="	  Matar";
		return unMenu;
	}

}
