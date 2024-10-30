package itz;

public class TADusaConjunto {
	private int lista[]; 
	private int nelementos;
	public TDAConjunto() {
		lista=new int[50];
		nelementos=0;
	}
	public TDAConjunto(int ...elementos) 
	{
		this();
		for(int valor:elementos) {
			agregar(this,valor);
		}
	}
	public TDAConjunto conjuntoVacio() {
		return new TDAConjunto();
	}
	private int buscar(TDAConjunto c, int valor) {
		int pos=-1;
		for (int i=0; i<nelementos; i++)
			if(lista[i]>=valor) {pos=i; break;}
			return pos;
		}
		public TDAConjunto agregar(TDAConjunto c , int valorx) {
			int pos=buscar(c,valorx);
			if (pos==-1) {
				c.nelementos++;
				c.lista[nelementos-1]=valorx;
			}else if(c.lista[pos]!=valorx) {
				c.nelementos++;
				for(int i=c.nelementos-1; i>pos; i--)
					c.lista[i]=c.lista[i-1];
				c.lista[pos]=valorx;
			}
			return c;
		}
		public TDAConjunto borrar(TDAConjunto c, int valorx) {
			int pos=buscar(c,valorx);
			if (pos>=0) {
				if (c.lista[pos]==valorx) {
					for(int i=pos; i<c.nelementos; i++)
						c.lista[i]=c.lista[i+1];
				}
				c.nelementos--;
			}
			return c;
		}
	
	@Override
	public String toString() {
		String salida= "{";
		for (int i=0; i<nelementos; i++)
			salida=salida+lista[i]+",";
			salida=salida+"}";
			return salida;
		}
		public boolean esVacio(TDAConjunto c) { 
			if(c.nelementos==0) return true;
			else return false;
		}
		public boolean pertenece(TDAConjunto c, int valorx) {
			boolean existe=false;
			for(int i=0; i<c.nelementos; i++) 
				if(c.lista[i]==valorx) {existe=true;break;}
			return existe;
		}
		public TDAConjunto union(TDAConjunto a, TDAConjunto b) {
			TDAConjunto c = new TDAConjunto();
			for(int i=0; i<a.nelementos; i++)
				c.agregar(c, a.lista[i]);
			for(int i=0; i<b.nelementos; i++)
				c.agregar(c, b.lista[i]);
			return c;
		}
		public TDAConjunto interseccion(TDAConjunto a, TDAConjunto b) {
			TDAConjunto c=new TDAConjunto();
			for (int i=0;i<a.nelementos;i++)
				if (b.pertenece(b,a.lista[i])) c.agregar(c,a.lista[i]);
			return c;
		}
		

}
