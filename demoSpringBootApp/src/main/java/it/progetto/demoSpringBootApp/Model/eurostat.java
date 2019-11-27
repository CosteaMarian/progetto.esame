package it.progetto.demoSpringBootApp.Model;

import java.io.Serializable;

public class eurostat implements Serializable {
	private String Unit, Isced11, Iscedf13, Sex, Geotime;
	private double A2017, A2016, A2015, A2014, A2013 ;
	
	/*
	@param 
	*/
	
	public eurostat (String unit, String isced11, String iscedf13, String sex, String geotime,
			double a2017, double a2016, double a2015, double a2014, double a2013) {
	
		this.Unit = unit;
		this.Isced11 = isced11;
		this.Iscedf13 = iscedf13;
		this.Sex = sex;
		this.Geotime = geotime;
		this.A2017 = a2017;
		this.A2016 = a2016;
		this.A2015 = a2015;
		this.A2014 = a2014;
		this.A2013 = a2013;
		
}
	// implementazione getters
	
	public String getUnit() {
		    return Unit;
  }
	
	public String getIsced11() {
	    return Isced11;
  }
	public String getIscedf13() {
	    return Iscedf13;
  }
	public String getSex() {
 	    return Sex;
  }
	public String getGeotime() {
	    return Geotime;
  }
	
	public double getA2017() {
		return A2017;
  }
	public double getA2016() {
		return A2016;
  }
	public double getA2015() {
		return A2015;
  }
	public double getA2014() {
		return A2014;
  }
	public double getA2013() {
		return A2013;
  }
	
	public String toString() {
		return "Eurostat [Unit=" + Unit +", Isced11 = " + Isced11 + ", Iscedf13 = "+ Iscedf13 +
				", Sex = "+ Sex + ", Geotime = " + Geotime + ", A2017 = " + A2017 + ", A2016 = " + A2016 +
				 ", A2015 = " + A2015 + ", A2014 = " + A2014 + ", A2013 = " + A2013 + "]";
	}

	
	
}

	
	
