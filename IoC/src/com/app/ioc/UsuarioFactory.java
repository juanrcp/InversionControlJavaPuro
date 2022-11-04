package com.app.ioc;

public class UsuarioFactory {
	
	IUsuario usr;
	
	//CON ESTE CONSTRUCTOR ASIGNAMOS LA INTERFAZ (PARAMETRO) AL ATIBUTO DE LA CLASE  
	public UsuarioFactory(IUsuario usr) {
		
		this.usr = usr;
		
	}
	
	//METODOS APLICADOS A LA INTERFAZ	
	public void getInsertaUsuario() {
		
		usr.getInsertaUsuario();
	}
	
	public void getEliminaUsuarioById(int id) {
		
		usr.getEliminaUsuarioById(id);
		
	}

}
