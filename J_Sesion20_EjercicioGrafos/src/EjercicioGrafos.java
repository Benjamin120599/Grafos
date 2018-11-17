import java.util.Scanner;

class Vertice {
	private String nombre;
    private int numVertice;
    
    public Vertice() {}
	
    public Vertice(String x){
    	nombre = x;
	    numVertice = -1;
	}
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumVertice() {
		return numVertice;
	}

	public void setNumVertice(int numVertice) {
		this.numVertice = numVertice;
	}
	
    public String nomVertice() { 
    	return nombre;
    }
    
    public boolean equals(Vertice n) {
    	return nombre.equals(n.nombre);
    }
    
    public void asigVert(int n) { 
        numVertice = n;
    }
    
    public String toString() { 
    	return nombre + " (" + numVertice + ")";
    }
      
}


class GrafoMatriz{
    int numVerts;
    static int maxVerts;
    Vertice[] verts;
    int[][] matAd;
    
    public GrafoMatriz(){
    	this(maxVerts);
    }
    
    public GrafoMatriz(int mx){
    	maxVerts=mx;
        matAd = new int [mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++)
        	for (int j = 0; i < mx; i++)
        		matAd[i][j] = 0;
        numVerts = 0;
    }
    
    public int numVertice(String vs) {
         Vertice v = new Vertice(vs);
         boolean encontrado = false;
         int i = 0;
         for (; (i < numVerts) && !encontrado;) { 
        	 encontrado = verts[i].equals(v);
        	 if (!encontrado) 
        		 i++ ;
         }
         return (i < numVerts) ? i : -1 ;
    }
    
    public void nuevoVertice (String nom){
    	boolean esta = numVertice(nom) >= 0;
    	if (!esta){
    		Vertice v = new Vertice(nom);
    		v.asigVert(numVerts);
    		verts[numVerts++] = v;
    	}
    }
    
    public void nuevoArco(String a, String b)throws Exception{
    	int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        matAd[va][vb] = 1;
    }
    
    public boolean adyacente(String a, String b)throws Exception{
    	int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        return matAd[va][vb] == 1;
    }
    
    public static int[]recorrerAnchura(GrafoMatriz g, String org) throws Exception{
    	int w, v;
        int [] m;
     
        v = g.numVertice(org);
        
        int CLAVE =-1;
        if (v < 0) throw new Exception("Vértice origen no existe");
        
        ColaLista cola = new ColaLista();
        m = new int[g.numVerts];
        // inicializa los vértices como no marcados
        for (int i = 0; i < g.numVerts; i++)
        m[i] = CLAVE;
        m[v] = 0; // vértice origen queda marcado
        cola.insertar(new Integer(v));
        while (! cola.colaVacia()){
        	Integer cw;
        	cw = (Integer) cola.quitar();
        	w = cw.intValue();
        	System.out.println("Vértice " + g.verts[w] + "visitado");
        	// inserta en la cola los adyacentes de w no marcados
        	for (int u = 0; u < g.numVerts; u++)
        	if ((g.matAd[w][u] == 1) && (m[u] == CLAVE))
        	{
        	// se marca vertice u con número de arcos hasta el
        	m[u] = m[w] + 1;
        	cola.insertar(new Integer(u));
        	}
        }
        return m;
        }
    
} 

class Nodo {
	Object elemento;
	Nodo siguiente;
	int dato;
	
	public Nodo(Object x) {
		elemento = x;
		siguiente = null;
	}
	public Nodo(int x){
		dato = x;
	    siguiente = null;
	}
	
	public Nodo(int x, Nodo n){
	    dato = x;
	    siguiente = n;
	}
	public int getDato(){
	    return dato;
	}
	
	public Nodo getEnlace(){
	    return siguiente;
	}
	public void setEnlace(Nodo enlace){
	    this.siguiente = enlace;
	}
	
}

class ColaLista { 
	protected Nodo frente;
	protected Nodo fin;

	public ColaLista(){
		frente = fin = null;
	}

    public void insertar(Object elemento){
    	Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()){
        	frente = a;
        } else {
        	fin.siguiente = a;
        }
        fin = a;
}

    public Object quitar() throws Exception{
    	Object aux;
    	if (!colaVacia()){
    		aux = frente.elemento;
    		frente = frente.siguiente;
    	}else throw new Exception("Eliminar de una cola vacía");
    	return aux;
    }
 
    public void borrarCola(){
    	for (; frente != null;) {
    		frente = frente.siguiente;
        }
    	System.gc();
    }
 
    public Object frenteCola() throws Exception{
    	if (colaVacia()) {
    		throw new Exception("Error: cola vacía");
        }
    	return (frente.elemento);
    }
 
    public boolean colaVacia(){
    	return (frente == null);
    }
    
}

class PilaLista { 
	private NodoPila cima;
	
	public PilaLista() {
		cima = null;
    }
	
	public boolean pilaVacia(){
		return cima == null;
	}
	
	public void insertar(Object elemento){
		NodoPila nuevo;
	    nuevo = new NodoPila(elemento);
	    nuevo.siguiente = cima;
	    cima = nuevo;
	}
	
	public Object quitar() throws Exception{
		if (pilaVacia())
			throw new Exception ("Pila vacía, no se puede extraer.");
		Object aux = cima.elemento;
		cima = cima.siguiente;
		return aux;
	}
	
	public Object cimaPila() throws Exception{
		if (pilaVacia())
			throw new Exception ("Pila vacía, no se puede leer cima.");
		return cima.elemento;
	}
	
	public void limpiarPila(){
		NodoPila t;
		while(!pilaVacia()) {
			t = cima;
			cima = cima.siguiente;
			t.siguiente = null;
		}
	}
	
}

class Arco{
	int destino;
    double peso;
    
    public Arco(int d){
    	destino = d;
    }
    public Arco(int d, double p){
    	this(d);
    	peso = p;
    }
    
    public int getDestino(){
        return destino;
    }
    public boolean equals(Object n){
    	Arco a = (Arco)n;
    	return destino == a.destino;
    }
    
} 

class GrafoAdcia{
	
	int numVerts;
    static int maxVerts = 20;
    Vertice [] tablAdc;
    
    public GrafoAdcia(int mx){
    	tablAdc = new Vertice[mx];
        numVerts = 0;
        maxVerts = mx;
    }
    
    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;){
       	 encontrado = tablAdc[i].equals(v);
       	 if (!encontrado) 
       		 i++ ;
       	 }
        return (i < numVerts) ? i : -1 ;
   }
    
} 

class NodoPila{
	Object elemento;
    NodoPila siguiente;
    
    NodoPila(Object x) {
    	elemento = x;
        siguiente = null;
    }
    
} 

public class EjercicioGrafos {
	
	public static void main(String[] args) throws Exception {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el límite de vertices a ingresar.");
		int lim = entrada.nextInt();
		
		GrafoMatriz grafo = new GrafoMatriz(lim);
		int opcion = 0;
		
		do {
			
			System.out.println("                  M E N Ú");
			System.out.println();
			System.out.println("1) Añadir vértice. ");
			System.out.println("2) Añadir arco. ");
			System.out.println("3) Comprobar si son adyacentes. ");
			System.out.println("4) Recorrer Anchura. ");
			System.out.println("5) Salir. ");
			System.out.println();
			System.out.println("Ingrese una opción: ");
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Ingrese un nombre para el vértice:");
				String nombre = entrada.nextLine();
				grafo.nuevoVertice(nombre);
				break;
			case 2:
				System.out.println("Ingrese el vértice de origen: ");
				String a = entrada.nextLine();
				System.out.println("Ingrese el vértice destino: ");
				String b = entrada.nextLine();
				grafo.nuevoArco(a, b);
				break;
			case 3:
				System.out.println("Ingrese el nombre de unvértice: ");
				String va = entrada.nextLine();
				System.out.println("Ingrese el nombre de un vértice: ");
				String vb = entrada.nextLine();
				
				if(grafo.adyacente(va, vb)) {
					System.out.println("Son adyacentes.");
				} else {
					System.out.println("No son adyacentes.");
				}
				break;
			case 4:
				System.out.println("Ingrese el nombre de un vertice para empezar: ");
				String nom = entrada.nextLine();
				grafo.recorrerAnchura(grafo, nom);
				break;
			case 5:
				System.out.println("Saliendo...");
			}
			
			
		} while(opcion != 5);
		
		
		
		
	}
}


