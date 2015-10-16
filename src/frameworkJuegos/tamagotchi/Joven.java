package frameworkJuegos.tamagotchi;

public class Joven extends Nivel
{
	Tamagotchi miTamagotchi;
	public Joven(Tamagotchi unTamagotchi)
	{
		this.miTamagotchi=unTamagotchi;
		inicializar();
		super.inicializar();
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
	}

	public String nombre()
	{
		return "Joven";
	}

	@Override
	public void crecer( Tamagotchi unTamagotchi)
	{
		Nivel unAdulto=new Adulto(unTamagotchi);
		unTamagotchi.setNivel(unAdulto);
	}

	@Override
	public void gestionarMenu(int unaOpcion,Tamagotchi unTamagotchi)
	{
		switch(unaOpcion)
		{
			case 2: 
				imprimir("Bien, al comer las mascotas bajan su nivel de hambre");
				comer(unTamagotchi);
				imprimir("ahora tiene " + unTamagotchi.getHambre() + " puntos de hambre");
				break;
			case 3:
				imprimir("Nada mejor que jugar un rato para aumentar la felicidad.");
				jugar(unTamagotchi);
				imprimir("Ahora tiene " + unTamagotchi.getFelicidad() + " puntos de felicidad");
				break;
			case 4:
				imprimir("Una buena siesta recuperará la energia de " + unTamagotchi.getNombre());
				dormir(unTamagotchi);
				imprimir("Ahora tiene " + unTamagotchi.getEnergia() + " puntos de energia");
				break;
			case 5:
				imprimir("A veces es mejor prevenir que curar");
				curar(unTamagotchi);
				imprimir("tu mascota aumentó su salud, ahora tiene " + unTamagotchi.getSalud() + " puntos de salud");
				break;
			case 6:
				imprimir("Tu mascota se convertirá en adulta...");
				crecer(unTamagotchi);
				imprimir("Muy bien, sus valores maximos aumentaron y subio algunos puntos");
				break;
			case 7:
				imprimir("¿Estas seguro de querer matar a "+ unTamagotchi.getNombre() +"?, se perderia de vivir un montón de cosas.");
				imprimir("Para confirmar presioná el número 8:");
				break;
			case 8:
				imprimir("Tu mascota está muriendo, pobrecit@...");
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
		unMenu[5]="	Matar";
		return unMenu;
	}
}
