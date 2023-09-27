package examen;

public class Desarrollador {
	private int codigo;
	private double tarifa, horas;

	private static int cantidad;
	private static double suma;

	public static final double PORDES = 0.15;

	public Desarrollador(int codigo, double tarifa, double horas) {
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.horas = horas;
	}

	public Desarrollador(int codigo, double tarifa) {
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.horas = 18;

	}

	public Desarrollador() {
		this.codigo = 999;
		this.tarifa = 26.95;
		this.horas = 45;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Desarrollador.cantidad = cantidad;
	}

	public static double getSuma() {
		return suma;
	}

	public static void setSuma(double suma) {
		Desarrollador.suma = suma;
	}
	
	public double sueldoBruto() {
		return tarifa * horas;
	}
	
	public double descuento() {
		return PORDES * sueldoBruto();
	}
	public double sueldoNeto() {
		return sueldoBruto() - descuento();
	}
	
	

}
