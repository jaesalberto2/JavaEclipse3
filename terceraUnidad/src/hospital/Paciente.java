package hospital;

public class Paciente {

	Medico medico;
	Hospital hospital;
	Familiar familiar;
	String name,direccion,padecimiento,nss,email,phone;
	public Paciente(Medico medico, Hospital hospital, Familiar familiar, String name, String direccion,
			String padecimiento, String nss, String email, String phone) {
		super();
		this.medico = medico;
		this.hospital = hospital;
		this.familiar = familiar;
		this.name = name;
		this.direccion = direccion;
		this.padecimiento = padecimiento;
		this.nss = nss;
		this.email = email;
		this.phone = phone;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public Familiar getFamiliar() {
		return familiar;
	}
	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPadecimiento() {
		return padecimiento;
	}
	public void setPadecimiento(String padecimiento) {
		this.padecimiento = padecimiento;
	}
	public String getNss() {
		return nss;
	}
	public void setNss(String nss) {
		this.nss = nss;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return  "\nNombre : " + name
				+ "\nDireccion : " + direccion + "\nPadecimiento : "
						+ "" + padecimiento + "\nNSS : " + nss + "\ne-mail : "
				+ email + "\nTelefono : " + phone + "\n"+" Medico : \n" + medico + "\nHospital : \n" + hospital + ""
				+ "\nFamiliar : \n" + familiar ;
	}
	
	
	
	
	
}
