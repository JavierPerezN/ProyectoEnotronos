package prueba;

public class Series {
	private String titulo,genero,creador;
	private boolean entregado;
	private int nTemp;
	
	Series(){
		nTemp=3;
		entregado=false;
	}
	Series(String tit,String cre){
		titulo=tit;
		creador=cre;
		nTemp=3;
		entregado=false;
	}
	Series(String tit,String cre,String gen,int nt){
		titulo=tit;
		creador=cre;
		genero=gen;
		nTemp=nt;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getnTemp() {
		return nTemp;
	}
	public void setnTemp(int nTemp) {
		this.nTemp = nTemp;
	}
}
