package procesos;

public class Proceso {
	//Constantes
	public final static String ALTA="Alta";
	public final static String MEDIA="Media";
	public final static String BAJA="Baja";
	
	public final static String EJECUCION="Ejecución";
	public final static String SUSPENDIDO="Suspendido";
	public final static String PREPARADO="Preparado";
	public final static String INACTIVO="inactivo";
	

	//Atributos
	
	private int PID;
	private int pr;
	private String prioridad;
	
	private int tiempoProces;
	private boolean interactividad;
	private int quantum;
	private String estado;
	private int tiBloq,tBloq,tEp;
	//Tiempo de procesamiento del computador
	private int tiempo;
	
	public Proceso()
	
	{
		tiempo=20;
		pr=(int) (Math.random()*3+1);
		if(pr==1)
			prioridad=Proceso.BAJA;
		else if(pr==2)
			prioridad=Proceso.MEDIA;
		else
			prioridad=Proceso.ALTA;
		PID=1;
		tiempoProces=(int) (Math.random()*10+1);
		interactividad=false;
		quantum=tiempo/tiempoProces;
		estado="Inactivo";
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public int getPID() {
		return PID;
	}

	public void setPID(int pID) {
		PID = pID;
	}

	public int getTiempoProces() {
		return tiempoProces;
	}

	public void setTiempoProces(int tiempoProces) {
		this.tiempoProces = tiempoProces;
	}

	public boolean isInteractividad() {
		return interactividad;
	}

	public void setInteractividad(boolean interactividad) {
		this.interactividad = interactividad;
	}

	public int getQuantum() {
		return quantum;
	}

	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}
	public String getEstado()
	{
		return estado;
	}

}
