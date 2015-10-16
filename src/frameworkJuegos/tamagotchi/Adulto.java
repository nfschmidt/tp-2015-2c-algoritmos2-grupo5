package frameworkJuegos.tamagotchi;

public class Adulto extends Nivel 
{
	Tamagotchi miTamagotchi;
	public Adulto(Tamagotchi unTamagotchi)
	{
		this.miTamagotchi=unTamagotchi;
		inicializar();
		super.inicializar();
	}
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
	}
	
	public String nombre()
	{
		return "Adult@";
	}
	@Override
	public void crecer(Tamagotchi unTamagotchi)
	{
		System.out.println("No deberia entrar aca");
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
				imprimir("Una buena siesta recupera la energia de tu mascota");
				dormir(unTamagotchi);
				imprimir("ahora tiene " + unTamagotchi.getEnergia() + " puntos de energia");
				break;
			case 5:
				imprimir("Hay, que seria de la vida sin drogas");
				curar(unTamagotchi);
				imprimir("tu mascota aumentó su salud, ahora tiene " + unTamagotchi.getSalud() + " puntos de salud");
				break;
			case 6:
				imprimir("Tu mascota se convertirá en viej@...");
				imprimir("Mejor no, lo dejamos asi hasta que muera");
				break;
			case 7:
				imprimir("¿Estas seguro de querer matar a tu mascota?, todavia podria disfrutar un poco más.");
				imprimir("Para confirmar una muerte horrible presioná el número 8:");
				break;
			case 8:
				imprimir("Tu mascota está muriendode forma miserable...");
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
