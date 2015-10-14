package algoritmos2.grupo5.frameworkJuegos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class JuegoManager
{
	public static Object factory(String nombre)
	{
		try
		{
			FileInputStream archivo = new FileInputStream("Factory.Properties");
			Properties propiedades = new Properties();
			propiedades.load(archivo);
			String objeto = propiedades.getProperty(nombre);
			return Class.forName(objeto).newInstance();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
	public static void imprimirMenu() 
	{
		int i=0;
		try {
			FileInputStream archivo = new FileInputStream("Factory.Properties");
			Properties propiedades = new Properties();
			propiedades.load(archivo);
			propiedades.load(archivo);
			Enumeration<?> e = propiedades.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				//String value = propiedades.getProperty(key);
				i++;
				System.out.println(i + " -" + key );
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} 
	  }
}
