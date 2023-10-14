package semana_06;

public class ArregloTemperaturas {
	private double[] temperatura;
	private int indice;
	
	public ArregloTemperaturas() {
		temperatura = new double[10];
		indice = 0;
	}
	
	//  Operaciones p�blicas b�sicas
	public int tamanio() {
		return indice;
	}
	
	public double obtener(int i) {
		return temperatura[i];
	}
	
	private void ampliarArreglo() {
		double[] aux = temperatura;
		temperatura = new double[indice + 10];
		for (int i = 0; i < indice; i++)
			temperatura[i] = aux[i];
	}
	
	public void adicionar(double d) {
		if (indice == temperatura.length)
			ampliarArreglo();
		temperatura[indice] = d;
		indice++;
	}
	
	public void eliminarAlFinal() {
		indice--;
	}
	
	public void eliminarTodo() {
		indice = 0;
	}
	
	//Un método temperaturaMenor que tetorne la temperatura más baja.
	public double temperaturaMenor() {
		double menor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (menor > temperatura[i]) {
				menor =  temperatura[i];
			}
		}
		return  menor;
	}
	
	//Un método posPrimeraTemperaturaNormal que retorne la posición de la 
	//primera temperatura encontrada en el rango de 36.1°C a 37.2°C.
	public int posPrimeraTemperaturaNormal() {
		int indice =0;
		for(int i =0; i<tamanio(); i++) {
			if(temperatura[i]>=36.1 && temperatura[i]<=37.2) {
			}
		}
		return indice;
	}
	
	//Un método remplazarPrimeraTemperaturaNormal que cambie la primera 
	//temperatura normal por la menor temperatura del arreglo. Para el efecto, 
	//invoque a los métodos posPrimeraTemperaturaNormal y temperaturaMenor.
	
	public void remplazarPrimeraTemperaturaNormal() {
		int pos = posPrimeraTemperaturaNormal();
		if (pos != -1) {
			temperatura[pos] = temperaturaMenor();
		}
	}
	
	//Un método incrementarTemperaturas que aumente todas las temperaturas en 0.2°C.
	public void incrementarTemperaturas() {
		for(int i=0; i<indice; i++) {
			temperatura[i] += 0.2;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
