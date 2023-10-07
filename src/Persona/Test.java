package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	//Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		/*
		
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
		
		//Instancia de paciente con todos los datos
		Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Doc. Simi Lares", false);
		System.out.println("*****************************");
		System.out.println(Chencho);
		
		
		
		//Instancia de un paciente con datos obligatorios
		Paciente Masiosare = new Paciente("MAS12345", false, false);
		System.out.println("**********************");
		System.out.println(Masiosare);
		
		//Cambiar el false de seguroMedico a true
		//Masiosare.seguroGastosMedicos = true;
		
		System.out.println("***************************");
		System.out.println(Masiosare);
		*/
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//Implementación de ArrayList de Dentistas
		List<Dentista> listaDentistasArrayList = new ArrayList<Dentista>();
		
		//Primero genero una instancia de Dentista
		Dentista DrChapatin =  new Dentista("Dr. Chapatin", "Chespirito", (byte)45, "11223344", "chapatin@mail.com", "General", "666123455", "Consultorio 200", "avanzado", "matutino", 450);
		
		//Luego la agrego a la lista
		listaDentistasArrayList.add(DrChapatin);
	
	//Si agrego la instancia a una variable, puedo imprimir su información usando un toString, o un método mostrarInfo();
	
	
		//Hago una instancia y la agrego directamente a la lista.
		listaDentistasArrayList.add(new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
		
		//Si genero la instancia y la agrego directamente al arrayList, para sacar el dato tendré que utilizar un forEach o algún ciclo para imprimir dato por dato.
		
		
		//Implementación de lista de Dentistas con un HashSet
		Set<Dentista> conjuntoDentistas = new HashSet<>();
		
		//Agregando Dentista a mi conjunto
		conjuntoDentistas.add(new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
		
		
		//Implementación de un hashmap de Dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<>();
		
		//Agregar un dentista a mi mapa
		mapaDentistas.put("Dr House", new Dentista("Gregory", "House", (byte)55, "12345678", "house.com", "Cirujano", "55113344", "Consultorio 600", "avanzado", "vespertino", 1400));
		
		//Imprimir el objeto Doctor House
		Dentista DoctorBuscado = mapaDentistas.get("Dr House");
		
		System.out.println(DoctorBuscado);
		
		
		

	}//main

}//class
