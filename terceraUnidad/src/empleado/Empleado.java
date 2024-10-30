package empleado;

public class Empleado {
	
	String nombre;
	String apellido;
	String correo;
	String empresa;
	double salario;
	String ocupacion;
	int edad;
	String sexo;
	double peso;
	String origen;
	
	

	public Empleado(String nombre, String apellido, String correo, String empresa, double salario, String ocupacion,
			int edad, String sexo, double peso, String origen) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.empresa = empresa;
		this.salario = salario;
		this.ocupacion = ocupacion;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.origen = origen;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getOcupacion() {
		return this.ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	//metodos de operaciones
	public String imprime() {
		return "Nombre : "+getNombre()+"\nApellido : "+getApellido()+""
				+ "\nemail : "+getCorreo()+"\nEmpresa : "+getEmpresa()+"\n"
				+ "Puesto : "+getOcupacion()+"\nNacionalidad : "
				+ ""+getOrigen()+"\nEdad : "+getEdad()+"\nSalario : "
						+ ""+getSalario();
		
	}
	

}
