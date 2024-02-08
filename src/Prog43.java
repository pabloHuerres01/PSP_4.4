import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Prog43 extends Thread{	
	public static final int PUERTO = 8500;
	public Socket socketCliente;
	/*
	http://localhost:8500/
	http://localhost:8500/datos
	http://localhost:8500/modulo
	*/
	
	
	/*private void procesarPeticion(Socket socketCliente) {
		//Variables Locales
		
		String peticion ="";
		String html="";
		PrintWriter flujoSalida = null;
		try{
			//Crear flujo de entrada
			BufferedReader bufferEntrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
			//Creamos flujo de salida
			flujoSalida = new PrintWriter(socketCliente.getOutputStream(),true);
			//Recogemos peticion del cliente
			peticion = bufferEntrada.readLine();
		}catch (IOException ex) {
			System.out.println("Error");
		}
		//Compactar peticion para facilitar analisis -- suprimimos espacios en blanco
		peticion = peticion.replaceAll(" ","");
		//Comprobar si es una peticion GET
		if(peticion.startsWith("GET")) {
			// Extraer subcadena entre get y HTTP
			peticion = peticion.substring(3,peticion.lastIndexOf("HTTP"));
			//Devolver pgina en funcion subcadena
			if(peticion.length()==0||peticion.equals("/")) { //index.html
				html="<html><head><title>Principal</title></head>"
						+"<body><h1>Pagina Principal</h1><p>Servidor funciona correctamente</p>"
						+"</body></html>";
				flujoSalida.println("HTTP/1.1 200 OK");
				flujoSalida.println("Content-Type:text/html;charset=ISO-8859-1");
				flujoSalida.println("Content-Length: "+ html.length()+1);
				flujoSalida.println("\n");
				flujoSalida.println(html);				
			}else if (peticion.equals("/datos")) { // prueba.html
				html="<html><head><title>Principal</title></head>"
						+"<body><h1>Servidor Datos</h1><p>Servidor de los Datos</p>"
						+"</body></html>";
				flujoSalida.println("HTTP/1.1 200 OK");
				flujoSalida.println("Content-Type:text/html;charset=ISO-8859-1");
				flujoSalida.println("Content-Length: "+ html.length()+1);
				flujoSalida.println("\n");
				flujoSalida.println(html);	
			}else if (peticion.equals("/modulo")) { // prueba.html
				html="<html><head><title>Principal</title></head>"
						+"<body><h1>Pagina Modulo</h1><p>Servidor del Modulo</p>"
						+"</body></html>";
				flujoSalida.println("HTTP/1.1 200 OK");
				flujoSalida.println("Content-Type:text/html;charset=ISO-8859-1");
				flujoSalida.println("Content-Length: "+ html.length()+1);
				flujoSalida.println("\n");
				flujoSalida.println(html);	
			}else {
				html="<html><head><title>Principal</title></head>"
						+"<body><h1>Error</h1><p>Página no encontrada</p>"
						+"</body></html>";
				flujoSalida.println("HTTP/1.1 404 Not Found");
				flujoSalida.println("Content-Type:text/html;charset=ISO-8859-1");
				flujoSalida.println("Content-Length: "+ html.length()+1);
				flujoSalida.println("\n");
				flujoSalida.println(html);	
			}
		}
	}
	*/
	public void run() {
		//procesarPeticion(socketCliente);
		//Variables Locales
				String peticion ="";
				String html="";
				PrintWriter flujoSalida = null;
				try{
					//Crear flujo de entrada
					BufferedReader bufferEntrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
					//Creamos flujo de salida
					flujoSalida = new PrintWriter(socketCliente.getOutputStream(),true);
					//Recogemos peticion del cliente
					peticion = bufferEntrada.readLine();
				}catch (IOException ex) {
					System.out.println("Error");
				}
				//Compactar peticion para facilitar analisis -- suprimimos espacios en blanco
				peticion = peticion.replaceAll(" ","");
				//Comprobar si es una peticion GET
				if(peticion.startsWith("GET")) {
					// Extraer subcadena entre get y HTTP
					peticion = peticion.substring(3,peticion.lastIndexOf("HTTP"));
					//Devolver pgina en funcion subcadena
					if(peticion.length()==0||peticion.equals("/")) { //index.html
						html="<html><head><title>Principal</title></head>"
								+"<body><h1>Pagina Principal</h1><p>Servidor funciona correctamente</p>"
								+"</body></html>";
						flujoSalida.println("HTTP/1.1 200 OK");
						flujoSalida.println("Content-Type:text/html;charset=ISO-8859-1");
						flujoSalida.println("Content-Length: "+ html.length()+1);
						flujoSalida.println("\n");
						flujoSalida.println(html);				
					}else if (peticion.equals("/datos")) { // prueba.html
						html="<html><head><title>Principal</title></head>"
								+"<body><h1>Servidor Datos</h1><p>Servidor de los Datos</p>"
								+"</body></html>";
						flujoSalida.println("HTTP/1.1 200 OK");
						flujoSalida.println("Content-Type:text/html;charset=ISO-8859-1");
						flujoSalida.println("Content-Length: "+ html.length()+1);
						flujoSalida.println("\n");
						flujoSalida.println(html);	
					}else if (peticion.equals("/modulo")) { // prueba.html
						html="<html><head><title>Principal</title></head>"
								+"<body><h1>Pagina Modulo</h1><p>Servidor del Modulo</p>"
								+"</body></html>";
						flujoSalida.println("HTTP/1.1 200 OK");
						flujoSalida.println("Content-Type:text/html;charset=ISO-8859-1");
						flujoSalida.println("Content-Length: "+ html.length()+1);
						flujoSalida.println("\n");
						flujoSalida.println(html);	
					}else {
						html="<html><head><title>Principal</title></head>"
								+"<body><h1>Error</h1><p>Página no encontrada</p>"
								+"</body></html>";
						flujoSalida.println("HTTP/1.1 404 Not Found");
						flujoSalida.println("Content-Type:text/html;charset=ISO-8859-1");
						flujoSalida.println("Content-Length: "+ html.length()+1);
						flujoSalida.println("\n");
						flujoSalida.println(html);	
					}
				}
	}	
	
	public Prog43(Socket socketCliente) {
		this.socketCliente=socketCliente;
		/*try {
			ServerSocket serverSocket = new ServerSocket(PUERTO);
			System.out.println("Esperando a los clientes");
			while(true) {
				Socket socketCliente = serverSocket.accept();
				System.out.println("Atiendo al cliente");
				procesarPeticion(socketCliente);
				System.out.println("Cliente atendido correctamente");
				socketCliente.close();
				
			}
		}catch(Exception e) {
			System.out.println("Error");
		}*/
	}
	
	

	public static void main(String[] args) {
		ServerSocket skServidor = null;
		try {
			skServidor = new ServerSocket(PUERTO);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true) {
			try {
				Socket sCliente = skServidor.accept();
				new Prog43(sCliente).start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
