package Herbolario_Online;

import Models.Incienso;
import Models.Fabricante;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
public class Main {
    	private static final String FABRICANTE_XML="./fabricante-jabx.xml";



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException, FileNotFoundException {

	ArrayList<Incienso> coleccionInciensos= new ArrayList<>();
	
	//creamos los objetos de la coleccion
	Incienso incienso1= new Incienso();
	incienso1.setAroma("fresa");
	incienso1.setColor("Rojo");
	incienso1.setVentajas("Aromaterapia");
	incienso1.setUnidadesStock(500);
	incienso1.setPrecioCaja(15.25);
	incienso1.setUnidadesCaja(10);
	coleccionInciensos.add(incienso1);
	
	Incienso incienso2= new Incienso();
	incienso2.setAroma("vainilla");
	incienso2.setColor("beige");
	incienso2.setVentajas("Relajante");
	incienso2.setUnidadesStock(1000);
	incienso2.setPrecioCaja(10.25);
	incienso2.setUnidadesCaja(10);
	coleccionInciensos.add(incienso2);
	
	Incienso incienso3= new Incienso();
	incienso3.setAroma("lavanda");
	incienso3.setColor("malva");
	incienso3.setVentajas("Dormir");
	incienso3.setUnidadesStock(100);
	incienso3.setPrecioCaja(8.95);
	incienso3.setUnidadesCaja(8);
	coleccionInciensos.add(incienso3);
	
	Incienso incienso4= new Incienso();
	incienso4.setAroma("natural");
	incienso4.setColor("negro");
	incienso4.setVentajas("Reiki");
	incienso4.setUnidadesStock(700);
	incienso4.setPrecioCaja(5.15);
	incienso4.setUnidadesCaja(5);
	coleccionInciensos.add(incienso4);
	
	Incienso incienso5= new Incienso();
	incienso5.setAroma("limón");
	incienso5.setColor("amarillo");
	incienso5.setVentajas("Mindfullness");
	incienso5.setUnidadesStock(835);
	incienso5.setPrecioCaja(7.65);
	incienso5.setUnidadesCaja(7);
	coleccionInciensos.add(incienso5);
	
	//creamos la tienda y le asignamos la coleccion de objetos
	Fabricante fabricante= new Fabricante();
	fabricante.setNombreFabricante("Incisevi S.L.");
	fabricante.setNombre("Inciensos de Sevilla");
	fabricante.setColeccionIncienso(coleccionInciensos);
	fabricante.setPais("España");
	
	JAXBContext contexto=JAXBContext.newInstance(Fabricante.class);
	Marshaller m= contexto.createMarshaller();
	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	
	//mandamos a la consola
	m.marshal(fabricante, System.out);
	
	//escribir en archivo
	m.marshal(fabricante, new File(FABRICANTE_XML));
	
	//Obtener variables de nuestro xml e imprimir por consola lo que hay en el xml
	System.out.println("");
	System.out.println("Colecciones en Herbolario Online Maria: ");
	Unmarshaller um= contexto.createUnmarshaller();
	Fabricante fabricante2=(Fabricante)um.unmarshal(new FileReader(FABRICANTE_XML));
	List <Incienso> coleccion= fabricante2.getColeccionIncienso();
	for (Incienso incienso: coleccion) {
	    System.out.println("Incienso de "+incienso.getAroma()+" Color "+incienso.getColor()+" sirve para "+incienso.getVentajas()+". Unidades en stock: "+incienso.getUnidadesStock()+", precio por caja: "+incienso.getPrecioCaja()+", unidades por caja: "+incienso.getUnidadesCaja());
	    
	}
	
	

    }
}

