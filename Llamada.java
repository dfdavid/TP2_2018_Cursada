
public class Llamada {
	private TipoDeLlamada saliente;
	private int duracionEnSegundos;
	private String numero ;
	private Fecha fecha;
	
	/**
	 * Constructor con parametros.
	 * @param numero
	 * @param fecha
	 * @param duracion
	 * @param saliente
	 */
	public Llamada (String numero, Fecha fecha, int duracion, TipoDeLlamada saliente){
		if (numero == null ||  numero.trim().length() != 10)
			throw new IllegalArgumentException();
		
		if (duracion < 0)
			throw new IllegalArgumentException();
			
		this.numero = numero.trim();
		this.fecha = fecha;
		this.duracionEnSegundos = duracion;
		this.saliente = saliente;
	}

	public TipoDeLlamada getTipoDeLlamada() {
		return saliente;
	}

	public int getDuracionEnSegundos() {
		return duracionEnSegundos;
	}

	public String getNumero() {
		return numero;
	}

	public Fecha getFecha() {
		return fecha;
	}
	
	
	/**
	 * Retorna la duracion en un string con formato <mm:ss>
	 * Ejemplos: "03:15", "12:03", "110:45"
	 * 
	 * @return
	 */
	public String getDuracion() {
		//TODO: Implementar!!!
		return null;
	}
	
	/**
	 * Retorna un String con el siguiente formato:
	 * 
	 * <aaaa/mm/dd> <hh:mm> <(SALIENTE)|(ENTRANTE)> <numero> <duracion>
	 * 
	 * Ej. "2013/05/06 21:44 3514801234 ENTRANTE 05:12"
	 *     "2013/01/30 01:14 1161293091 SALIENTE 12:00"
	 * 
	 */
		
	public String toString(){
		//TODO: Implementar!!!
		return null;
	}
}
