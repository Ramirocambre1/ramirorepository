/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author usuario
 */
public class MaximaCantEntrenadoresException extends Exception{

    private String clave; // Mensaje de error
	
	public MaximaCantEntrenadoresException(String msg) {
		super(msg);
		clave = msg;
	}
}
