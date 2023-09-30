package service;

import model.Cliente;

import java.util.List;
import java.util.ArrayList;
import dto.ClienteDTO;
import Exceptions.ClientExceptions;
import java.lang.NumberFormatException;

public class ClienteService {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void agregar (ClienteDTO cliente) throws Exception{
		validarCuits(cliente.getCuit());
		validarEmails(cliente.getEmail());
		validarCelulares(cliente.getNumeroCelular());
		validarNombre(cliente.getNombre());
		clientes.add(convertirDtoACliente(cliente));
	}
	
	public void eliminar (ClienteDTO cliente)throws Exception{
		Cliente clienteEliminar=null;
		for (Cliente c:clientes) {
			if (c.getCuit().equals(cliente.getCuit())) {
				clienteEliminar=c;
				break;
				
			}
		}
		if (clienteEliminar != null) {
			clientes.remove(clienteEliminar);
		} else {
			throw new Exception(ClientExceptions.MSG_Client);
		}
	}
	public Cliente buscarCliente(ClienteDTO cliente)throws Exception{
		for (Cliente c: clientes) {
			if(c.getCuit().equals(cliente.getCuit())) {
				return c;
			}
		}
		throw new Exception(ClientExceptions.MSG_Client);
	}
	
	private void validarCuits(String cuit) throws ClientExceptions {
	    if (cuit == null || cuit.length()!= 11) {    //El cuit se toma como numerico, sinc aractereres como -
	    	throw new ClientExceptions(ClientExceptions.MSG_CUIT);
	    }
	    try {
	        Long.parseLong(cuit); //convertir una cadena en un número de tipo long. Aca  se utiliza para verificar si el CUIT ingresado es numérico.Si la cadena cuit contiene algún carácter que no sea un dígito, se lanzará una excepción NumberFormatException
	    } catch (NumberFormatException e) {
	        throw new ClientExceptions(ClientExceptions.MSG_CUIT2);
	    }
	}
	private void validarEmails(String email)throws ClientExceptions{
		boolean verificador=(email.contains("@hotmail.com")||email.contains("@gmail.com"))? true:false;
		if (!verificador) {
			throw new ClientExceptions(ClientExceptions.MSG_EMAIL);
		}
		
	}
	private boolean validarCelulares(String numeroCelular) {
		boolean verificador2=(numeroCelular.matches("[0-9]*"))?true:false;
		return verificador2;
	}
	private void validarNombre(String nombre) throws ClientExceptions{
	    if (nombre == null || nombre.length()<2) { 
	    	throw new ClientExceptions(ClientExceptions.MSG_Nombre);
	    } try {
	    	Long.parseLong(nombre);	
	    } catch (NumberFormatException e) {                                        
	    	throw new ClientExceptions(ClientExceptions.MSG_Nombre2);                                                                                                                            
	    }
	}
	
	private Cliente convertirDtoACliente(ClienteDTO clienteDTO) {
        return new Cliente(clienteDTO.getNombre(), clienteDTO.getCuit(), clienteDTO.getEmail(), clienteDTO.getNumeroCelular());
    }
}
