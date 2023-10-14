package semana_06;

public class ArregloEdades {
	private int[] edad;
	private int indice;

	public ArregloEdades() {
		edad = new int[10];
		indice = 0;
	}

//  Operaciones p�blicas b�sicas
	public int tamanio() {
		return indice;
	}

	public int obtener(int i) {
		return edad[i];
	}

	// Un método privado ampliarArreglo
	// que extienda el arreglo en diez espacios más.
	private void ampliarArreglo() {
		int[] aux = edad;
		edad = new int[indice + 10];
		for (int i = 0; i < indice; i++)
			edad[i] = aux[i];
	}

	// Un método adicionar que reciba una edad y la registre
	// en la posición que corresponda. Verifique primero si
	// el arreglo está lleno para invocar al método ampliarArreglo.
	public void adicionar(int e) {
		if (indice == edad.length)
			ampliarArreglo();
		edad[indice] = e;
		indice++;
	}

	// Un método eliminarAlFinal que elimina lógicamente la
	// última edad del arreglo.
	public void eliminarAlFinal() {
		indice--;
	}

	// Un método eliminarTodo que elimina lógicamente todas las edades.
	public void eliminarTodo() {
		indice = 0;
	}

	// Un método edadMayor que retorne la mayor de todas las edades.
	public int edadMayor() {
		int mayor = 0;
		for (int i = 0; i < tamanio(); i++) {
			if (mayor < edad[i]) {
				mayor = edad[i];
			}
		}
		return mayor;
	}

	// Un método posPrimeraEdadAdulta que retorne la posición de la primera
	// edad encontrada en el rango de 20 a 59 años. En caso no exista retorne -1.
	
	 //---con for each sale 21 a 26
	public int posPrimeraEdadAdulta() {
		int i = 0;
		for (int valor : edad) {
			if (valor >= 20 && valor <= 59) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public void incrementarPrimeraEdadAdulta() {
		int pos = posPrimeraEdadAdulta();
		if (pos != -1) {
			edad[pos] += 5;
		}
	}

	// Un método remplazarPrimeraEdadAdulta que cambie la primera edad adulta
	// por la edad mayor.
	public void remplazarPrimeraEdadAdulta() {
		int pos = posPrimeraEdadAdulta();
		if (pos != -1) {
			edad[pos] = edadMayor();
		}
	}

}
