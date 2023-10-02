package Persona;

public class Test {

	//Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		//Instancia de Persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		
		System.out.println(Felipe); //Imprime lugar de memoria
		Felipe.imprimirInfo(); //Imprime información
		Felipe.saludar(); //Imprime saludo
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "", "matutino", 500);
		
		System.out.println("******************************");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		

	}//main

}//class
