package com.app.ioc;

public class UsuarioImplOracle implements IUsuario{

	//CLASE A LA QUE SE IMPLEMENTA LA INTERFAZ IUsuario 
	//Y SE DECLARAN LOS METODOS PARA QUE FUNCIONEN CON ORACLE
	@Override
	public void getInsertaUsuario() {

		System.out.println("Insertando usuario con Oracle.");
		
	}

	@Override
	public void getEliminaUsuarioById(int id) {

		System.out.println("Borrando usuario con Oracle: " + id);
		
	}

}
