package com.app.ioc;

public class App {
	
	public static void main(String[] args) {
		
		//AQUI INYECTAMOS LA DEPENDENCIA DENTRO DEL OBJETO USUARIOFACTORY. PRUEBA ORACLE.
		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplOracle());
		
		//METODOS DE INSERCION Y ELIMINACION
		obj.getInsertaUsuario();
		System.out.println();
		obj.getEliminaUsuarioById(1);
		
		System.out.println();
		System.out.println();
		
		//PRUEBA MONGO.
		obj = new UsuarioFactory(new UsuarioImplMongo());
		
		obj.getInsertaUsuario();
		System.out.println();
		obj.getEliminaUsuarioById(1);
	}
}
