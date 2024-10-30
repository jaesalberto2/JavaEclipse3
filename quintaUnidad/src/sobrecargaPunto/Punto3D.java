/*
 * Uso de sobrecarga de metodos
 */

package sobrecargaPunto;

public class Punto3D {
	int x,y,z;
	//defiicion del metodo contrusctor

	public Punto3D() {
		x=y=z=0;
	}
	public Punto3D(int x) {
		
		this.x = x;
	}
	public Punto3D(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public Punto3D(int x, int y, int z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	//definicion de los metods gets y sets
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return x + "\t" + y + "\t" + z + "\n";
	}
	
	
	
	

}
