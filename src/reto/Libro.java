package reto;

public class Libro {
	private int id;
	private String titulo;
	private String Autor;
	private String genero;
	private String editorial;
	private String fecha;

	public Libro() {
		
	}
	
	public Libro(int id, String titulo, String autor, String genero, String editorial, String fecha) {
		this.id = id;
		this.titulo = titulo;
		this.Autor = autor;
		this.genero = genero;
		this.editorial = editorial;
		this.fecha = fecha;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.Autor;
	}

	public void setAutor(String autor) {
		this.Autor = autor;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
