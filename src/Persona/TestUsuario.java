package Persona;

public class TestUsuario {
	
	public static void main(String[] args) {
		
		//Cambiar la constraseña de un objeto del tipo usuario
		//Felipe.setPassword (una donde la contrseña esté vacía)
		//Felipe.setPassword (una donde la contraseña no esté vacía pero sea igual a la anterior)
		//Felipe.password (se cumplan las dos condiciones)
		
		
		//Isntancia de usuario
		Usuario Felipe = new Usuario("Doctor", "DoctorFelipe", "paracetamol");
		
		//Contraseña vacía
		Felipe.setPassword("");
		
		//Contraseña no vacía pero igual a la anterior
		Felipe.setPassword("paracetamol"); //error
		
		//Contraseña no vacía y diferente a la anterior
		Felipe.setPassword("Contras3ña nueva");
		
		
		
		
	}//main

}//
