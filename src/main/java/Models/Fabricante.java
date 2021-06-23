package Models;

import java.util.List;
import javax.xml.bind.annotation.*;

/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = "Herbolario_Online.Models")
public class Fabricante {
    
    @XmlElementWrapper(name = "Coleccion")
    @XmlElement (name = "incienso")
    private List<Incienso> coleccionIncienso;
    private String nombreFabricante;
    private String nombre;
    private String pais;

    public List<Incienso> getColeccionIncienso() {
	return coleccionIncienso;
    }

    public void setColeccionIncienso(List<Incienso> coleccionIncienso) {
	this.coleccionIncienso = coleccionIncienso;
    }

    public String getNombreFabricante() {
	return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
	this.nombreFabricante = nombreFabricante;
    }
    
    

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getPais() {
	return pais;
    }

    public void setPais(String pais) {
	this.pais = pais;
    }
    
    
    
    
    
}
