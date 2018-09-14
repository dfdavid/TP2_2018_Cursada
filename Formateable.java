import java.util.List;
import java.util.Map;


public interface Formateable {
	/**
	 * Devuelve un String con el detalle de las llamadas,
	 * una llamada por linea. Si no hay llamadas registradas
     * o no hay lista, devuelve una cadena vacia.
	 * Ej:
           "2013/05/06 21:44 3514801234 ENTRANTE 05:12
            2013/01/30 01:14 1161293091 SALIENTE 12:00
            2013/01/30 01:28 1161293091 SALIENTE 02:10
            2013/01/30 01:42 1161293091 ENTRANTE 12:00"
	 *  
	 * @param llamadas La lista de llamadas registradas
	 * @return String con el texto segun formato de las llamadas registradas
	 */
	public String convertirListaComoString(List<Llamada> llamadas);

	
	/**
	 * Devuelve un String con el detalle de las llamadas, si el
	 * numero corresponde a un contacto, reemplaza el numero por
	 * el nombre del contacto. Si no, imprime el numero. Si no hay
     * llamadas registrada o no hay lista de contactos, devuelve
     *  una cadena vacia.
	 * 
	 * Ej: Una llamada por linea
	 * 
           "2013/05/06 21:44 3514801234 ENTRANTE 05:12
            2013/01/30 01:14 Juan Perez SALIENTE 12:00
            2013/01/30 01:28 Julieta Alvarez SALIENTE 02:10
            2013/01/30 01:42 1161293091 ENTRANTE 12:00"
	 *  
	 * @param llamadas La lista de llamadas registradas
     * @param cont La libreta de contactos
	 * @return String con el texto segun formato de las llamadas registradas
	 */
	public String convertirListaComoStringAmigable(List<Llamada> llamadas, LibretaDeContactos cont);
	
	
	/**
	 * Devuelve un String con las estadisticas de cada numero
	 * en el mapa. Un numero por linea con el formato:
	 *  <numero>: Llamadas salientes: <cantidadLlamadasSalientes> (<duracionSalientesEnSegundos>) - Llamadas entrantes: <cantidadLlamadasEntrantes> (<duraciondeEntrantesEnSegundos>)
     * 
     * Si no hay mapa, devuelve una cadena vacia.
	 * 
	 * Ej:
           "3514801234: Llamadas salientes: 5(123) - Llamadas entrantes: 1(65)
            3515597222: Llamadas salientes: 2(1315) - Llamadas entrantes: 4(165)
            3516557177: Llamadas salientes: 16(2312) - Llamadas entrantes: 12(657)"
	 *  
	 * @param m Mapa con las estadisticas por numero telefonico
	 * @return String con los estadisticas
	 */
	public String convertirMapaEstadisticaComoString(Map<String, EstadisticasNumero> m);
}
