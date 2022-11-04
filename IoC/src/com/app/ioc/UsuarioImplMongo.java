package com.app.ioc;

public class UsuarioImplMongo implements IUsuario{

	//CLASE A LA QUE SE IMPLEMENTA LA INTERFAZ IUsuario 
	//Y SE DECLARAN LOS METODOS PARA QUE FUNCIONEN CON MONGO
	@Override
	public void getInsertaUsuario() {
		System.out.println("Insertando Usuario con Mongo.");
		
	}

	@Override
	public void getEliminaUsuarioById(int id) {
		System.out.println("Borrando Usuario con Mongo: " + id);
		
	}
	
	

}
