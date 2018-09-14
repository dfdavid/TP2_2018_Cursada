import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class Registro {
	private List<Llamada> registro;
	
	public Registro(){
		registro = new ArrayList<Llamada> ();
	}
	
	public List<Llamada> getRegistroCompleto (){
		return registro;
	}
	
	public void agregarLlamada (Llamada llamada){
		registro.add(llamada);
	}
	
	public void limpiarRegistro (){
		registro.clear();
	}
	
	/**
	 * Devuelve una lista con las llamadas cuya duracion esta comprendida entre
	 *  
	 *  [minInicial:segInicial] y [minFinal:segFinal] 
	 *
	 * Ej. minInicial = 1, segInicial=30, minFinal=3, segFinal=45, la lista
	 * contendra solo llamadas cuya duracion este comprendida entre
	 * un minuto treinta segundos y tres minutos cuarenta y cinco segundos.
	 *
	 * Un argumento no es valido cuando el valor de un parametro es negativo,
	 * o cuando seg > 59 o cuando el tiempo inicial es mayor que el final 
     * 
	 * @param minInicial minutos para el tiempo minimo de duracion de la llamada 
	 * @param segInicial segundos para el tiempo minimo de duracion de la llamada
	 * @param minFinal   minutos para el tiempo maximo de duracion de la llamada
	 * @param segFinal   segundos para el tiempo maximo de duracion de la llamada
	 * @return Lista de llamadas 
	 * @throws ParametrosInconsistentesException cuando un parametro este
	 *         fuera de rango.
	 */
	abstract public List<Llamada> getLlamadasPorDuracion (int minInicial, int segInicial, int minFinal, int segFinal) throws ParametrosInconsistentesException;
	
	/**
	 * Devuelve una lista con las llamadas salientes o entrantes
     * 
	 * @param tipo tipo de Llamada ENTRANTE/SALIENTE
	 * @return Lista de llamadas por el tipo elegido
	 */
	abstract public List<Llamada> getLlamadasPorTipo (TipoDeLlamada tipo);
	
	/**
	 * Devuelve un entero con la duracion total de las llamadas salientes y
	 * entrantes, en segundos
     * 
	 * @return duracion total de llmadas
	 */
	abstract public int getDuracionTotalLlamadas ();
	
	/**
	 * Devuelve un mapa <String, EstadisticasNumero> 
	 * con las estadisticas de cada numero en la lista de llamadas. 
	 * 
	 * @param llamadas Lista de las llamadas registradas
	 * @return mapa con las estadisticas
	 * @throws ParametrosInconsistentesException cuando la lista de
	 *         llamadas es null.
	 */
	abstract public Map<String, EstadisticasNumero> getMapaDeEstadisticas (List<Llamada> llamadas) throws ParametrosInconsistentesException;
	
	
	/**
	 * Devuelve las estadisticas de la lista de llamados para un
	 * numero en particular 
	 * 
	 * @param llamadas Lista de las llamadas registradas
	 * @param numero Numero de telefono para averiguar
	 * @return estadisticas del numero solicitado
	 * @throws ParametrosInconsistentesException cuando un parametro es null.
	 */
	abstract public EstadisticasNumero getEstadisticasPorNumero (List<Llamada> llamadas, String numero) throws ParametrosInconsistentesException;
	
}
