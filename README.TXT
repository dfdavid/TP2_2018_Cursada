1. Implemente la clase "RegistroDeLlamadas" como una subclase de Registro,
   de acuerdo con la documentacion de la superclase.

abstract public List<Llamada> getLlamadasPorDuracion (int minInicial, int segInicial, int minFinal, int segFinal) throws ParmetrosInconsistentesException;
abstract public List<Llamada> getLlamadasPorTipo (TipoDeLlamada tipo); 
abstract public int getDuracionTotalLlamadas ();
abstract public Map<String, EstadisticasNumero> getMapaDeEstadisticas (List<Llamada> llamadas) throws ParmetrosInconsistentesException;
abstract public EstadisticasNumero getEstadisticasPorNumero (List<Llamada> llamadas, String numero) throws ParmetrosInconsistentesException;
	

2. Implemente la clase "Visor", tal que implemente la interfaz Formateable,
   de acuerdo a la documentacion en la interfaz

public String convertirListaComoString(List<Llamada> llamadas);
public String convertirListaComoStringAmigable(List<Llamada> llamadas, LibretaDeContactos cont);
public String convertirMapaEstadisticaComoString(Map<String, EstadisticasNumero> m);


3. Fecha: Implemente el constructor, de acuerdo a la documentacion en la clase

public Fecha (int anio, int mes, int dia, int hora, int minuto)


4. Llamada: Implemente los metodos, de acuerdo a la documentacion en la clase

public String getDuracion()
public String toString()