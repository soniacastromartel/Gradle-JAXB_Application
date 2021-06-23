package Models;

import javax.xml.bind.annotation.*;


/**
 *
 * @author Sonia Castro (soniacastromartel@gmail.com)
 */
@XmlRootElement(name = "incienso")
@XmlType(propOrder={"aroma", "color","ventajas","unidadesStock","precioCaja", "unidadesCaja"})
public class Incienso {
    private String aroma;
    private String color;
    private String ventajas;
    private int unidadesStock;
    private double precioCaja;
    private int unidadesCaja;
    
    @XmlElement(name="aroma")
    public String getAroma() {
	return aroma;
    }

    public void setAroma(String aroma) {
	this.aroma = aroma;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public String getVentajas() {
	return ventajas;
    }

    public void setVentajas(String ventajas) {
	this.ventajas = ventajas;
    }

    public int getUnidadesStock() {
	return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
	this.unidadesStock = unidadesStock;
    }

    public double getPrecioCaja() {
	return precioCaja;
    }

    public void setPrecioCaja(double precioCaja) {
	this.precioCaja = precioCaja;
    }

    public int getUnidadesCaja() {
	return unidadesCaja;
    }

    public void setUnidadesCaja(int unidadesCaja) {
	this.unidadesCaja = unidadesCaja;
    }
    
    
}
