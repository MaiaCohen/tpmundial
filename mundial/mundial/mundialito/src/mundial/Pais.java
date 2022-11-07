package mundial;

public class Pais {
	
	private String nombre;
	private int golestot;
	private boolean cal_desc;
	private String grupo;
	public Pais(String nombre, int golestot, boolean cal_desc, String grupo) {
		super();
		this.nombre = nombre;
		this.golestot = golestot;
		this.cal_desc = cal_desc;
		this.grupo = grupo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGolestot() {
		return golestot;
	}
	public void setGolestot(int golestot) {
		this.golestot = golestot;
	}
	public boolean isCal_desc() {
		return cal_desc;
	}
	public void setCal_desc(boolean cal_desc) {
		this.cal_desc = cal_desc;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", golestot=" + golestot + ", cal_desc=" + cal_desc + ", grupo=" + grupo
				+ "]";
	}

	
	
}
