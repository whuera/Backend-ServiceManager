package com.app.modelo;

public class Contacto extends Base{
	
	private int codigoPer;
	private String numeroIdentificacion;
	private String primer_nombre;
	private String segundo_nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private String email_primario;
	private String celular;
	private String fechaNacimiento;
	private String estadoCivil;
	private String profesion;
	
	
	
	public int getCodigoPer(){
		return codigoPer;
	}
	public void setCodigoPer(int codigoPer) {
		this.codigoPer = codigoPer;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getEstadoCivil() {
		
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getPrimer_nombre() {
		return primer_nombre;
	}
	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}
	public String getSegundo_nombre() {
		return segundo_nombre;
	}
	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}
	public String getEmail_primario() {
		return email_primario;
	}
	public void setEmail_primario(String email_primario) {
		this.email_primario = email_primario;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "Contacto [codigoPer=" + codigoPer + ", numeroIdentificacion=" + numeroIdentificacion
				+ ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", primer_apellido="
				+ primer_apellido + ", segundo_apellido=" + segundo_apellido + ", email_primario=" + email_primario
				+ ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", estadoCivil=" + estadoCivil
				+ ", profesion=" + profesion + "]";
	}
	

}
