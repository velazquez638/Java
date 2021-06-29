package MAT;

import java.util.Arrays;

public class MAT {


	
	 public static String toString(int [] vector) {
		 
		 String s = "{";
		 for (int i=0; i<vector.length; i++) {
			 s = s + vector[i];
			 if (i < vector.length-1)
				 s = s + ", ";
		 }
		 return s + "}";
	 }
	 
	 
	 public static String toString(int [] vector, String nombre) {
		 
		 return nombre + " " + toString(vector);
	 }
	 
	 
	 public static String toString(int [][] matriz, String nombre) {
		 
		 String s = nombre + "\n";
		 for (int i=0; i<matriz.length; i++)
			 s = s + toString(matriz[i]) + "\n";
		 return s;
	 }
	 
	 
	 public static int minimo(int [] vector) {
		 
		 int menor = 0;
		 for (int i = 0; i<vector.length; i++) {
			  
			 if (vector[i]<menor) {
				 menor = vector[i];
			 }
			 	 
		 }
		 
		 return menor;
	 }
	 
	 public static int maximo(int [] vector) {

		 int mayor = 0;
		 for (int i=0; i<vector.length; i++) {
			 if(vector[i]>mayor) {
				 
				 mayor = vector[i];
			 }
		 }
		 
		 return mayor;
	 }
	 
	 
	 
	 public static boolean busca(int [] vector, int n) {
		
		 boolean esta = true;
		 
		 for (int i =0; i<vector.length; i++) {
			 
			 if(n == vector[i]) {
				 
				 return esta;
				 
			 }else {
				 
				 return false;
				 
			 }
		 }
		 
		 return esta;
	 }
	 
	 
	 public static int minimo(int [][] matriz) {
		
		 int minimo = 0;
		 for(int i = 0; i<matriz.length; i++) {
			 for(int j = 0; j< matriz.length; j++) {
				 
				 if (matriz[i][j]<minimo) {
					 minimo = matriz[i][j];
				 }
			 }
		 }
		 
		 return minimo;
	 }

	 
	 public static int maximo(int [][] matriz) {

		 int maximo = 0;
		 for(int i = 0; i<matriz.length; i++) {
			 for(int j = 0; j< matriz.length; j++) {
				 
				 if (matriz[i][j]>maximo) {
					 maximo = matriz[i][j];
				 }
			 }
		 }
		 
		 return maximo;
	 }
	 
	 
	 public static double promedio(int [] vector) {

		 int promedio = 0;
		 int suma = 0;
		 
		 for (int i = 0; i<vector.length; i++) {
			 suma = vector[i]++;
		 }
		 
		 promedio = suma/(vector.length);
		 
		 return promedio;
	 }
	 
	 
	 public static void ordena(int [] vector) {
		 
		 Arrays.sort(vector); // Arrays.sort() ordena el vector en orden ascendente
		 
		 System.out.println("New vector: " + Arrays.toString(vector));
		 
	 }
	 
	 
	 public static void ascendente(int [] vector) {
		 
		int menor = 0;
		for(int i = 0; i<vector.length; i++) {
			menor=vector[i];
			if(vector[i] < menor) {
				menor = vector[i];
			}else {
				if(vector[i]>menor) {
					menor = menor;
				}
			}
		}
		 
		System.out.println("vector ordenado de menor a mayor: " + Arrays.toString(vector));
		
	 }
	 
	 
	 public static int [] suma(int [] A, int [] B) {
		 
		 int [] result = new int [A.length];
		 
		 for(int i=0; i<A.length; i++) {
			 result[i] = A[i] + B[i];
		 }
		 
		 return result;
		 
	 }
	 
	 public static int [][] suma(int [][] A, int [][] B) {
		 
		 int suma =0;
		 int producto[][] = new int [A.length][B.length];
		 
		 for(int i =0; i< A.length; i++) {
			 for (int j=0; j<B.length; j++) {
				 suma = 0;
				 for (int k=0; k<B.length; k++) {
					 suma = A[i][k] + B[k][j];
				 }
				 
				 producto[i][j] = suma;
			 }
		 }
		 
		 return producto;
	 }
		 
	 public static int [] producto(int k, int [] vector) {

		 int [] result = new int [vector.length];
		 
		 for (int i=0; i<vector.length; i++) {
			 
			 result [i] = k * vector[i];
		 }
		 
		 return result;
	 }
	 
	 
	 
	 public static int [][] producto(int k, int [][] A) {
		 
		 int suma=0;
		 int producto [][] = new int [A.length][A.length];
		 
		 for (int i=0; i<A.length; i++) {
			 for(int j=0; j<A.length; j++) {
				 
				 suma = A[i][j] * k;
				 producto [i][j] = suma;
			 }
			 	
		 }
		
		 return producto;
		 
	 }
	 
	 
	 
	 public static int [][] producto(int [][] A, int [][] B) {
			
		 int suma = 0; 
		 int result[][] = new int [A.length][B.length];
		 
		 for(int i = 0; i<A.length; i++) {
			 for(int j = 0; j< B.length; j++) {
				 suma = 0;
				 for(int k = 0; k<B.length; k++) {
					 suma = A[i][k] * B[k][j];
				 }
				 result[i][j] = suma;
			 } 
		 }
		 
		return result;
		 
	 }
	 
	 public static boolean esIgual(int [] S, int [] V) {
			 
		 if(S.length == V.length) {
			 for(int i=0; i<S.length; i++) {
				 for (int j=0; j<V.length; j++) {
					 if(S[i] == V[j]) {
						 System.out.println("Ambos son iguales");
					 }
				 }
			 }
		 }else {
			 
			 System.out.println("No son iguales");
		 }
		 
		 return true;
		 
	 }
	 
	 
	 @SuppressWarnings("unused")
	public static boolean esSimetrica(int [][] matriz) {
		 boolean esSimetrica = true;
		 int contador = 0;
		 for(int i= 0; i<matriz.length; i++) {
			 for(int j=0; j<matriz.length; j++) {
				 if(matriz[i][j] == matriz[j][i]) {
					 
				 }else {
					 contador = contador + 1;
				 }
			 }
		 }
		 
		 if(contador != 0) {
			 return esSimetrica = false;
			 
		 }else {
			 return esSimetrica = true;
		 }
	 }
	 
	 
	 
	 
	 public static boolean esIgual(int [][] A, int [][] B) {
 
	       for (int i = 0; i < A.length; i++) {

	           for (int a = 0; a < B.length; a++) {

	               if (A[i] == B[a]) {
	            	   
	                   System.out.println("true");
	                   return true;
	                   
	               } else {
	            	   
	                   System.out.println("False");
	                   return false;
	               }
	           }
	       }    
	       
	       return true;
	 }
	 
	 public static int[][] transpuesta(int [][] matriz) {
		 
		 int[][] matrizT = null;
		 
		 for (int i=0; i < matriz.length; i++) {
			 for (int j=0; j < matriz[i].length; j++) {
				 
				 matrizT[i][j] = matriz[i][j];
				 
				}
			}
		 
		 return matrizT;
	 }
	 
	 
	 public static int [] diagonal(int [][] matriz) {
		 
         int[] diagoPrincipal = new int[matriz.length];
         int[] diagoSecundaria = new int[matriz.length];
                
         for(int i=0;i<matriz.length;i++){
        	 for(int j=0;j<matriz[i].length;j++){
        		 
        		 if(i==j){
        			 diagoPrincipal[i] = matriz[i][j];
        		 }
                
        		 if(i+j == matriz.length-1){
        			 diagoSecundaria[i] = matriz[i][j];
        		 }
        	 }
         }
     
         return diagoPrincipal;
       
	 }
	 
	 public static boolean esCuadrada(int [][] matriz) {
		 
		 for (int i=0; i<= matriz.length; i++) {
			 for (int j=0; j<=matriz.length; j++) {
				 if(matriz[i][j] == matriz[j][i]) {
					 return true;
				 }else {
					 return false;
				 }
			 }
		 }
		 
		 return true;

	 
	 }
	 
	 public static int [] fila(int [][] matriz, int n) {
		 
		 int[] Fila = new int[matriz.length];
		 for (int i = 0; i<matriz.length; i++) {
			 for (int j = 0; j<matriz.length; j++) {
				 if (i == n) {
					 
					Fila[n] = matriz[n][j]; 
					 
				 }
			 }
		 }

		 return Fila;
	 
	 }
	 
	 public static int [] columna(int [][] matriz, int n) {
		 
		 int[] Columna = new int[matriz.length];
		 for (int i = 0; i<matriz.length; i++) {
			 for (int j = 0; j<matriz.length; j++) {
				 
				 if (j == n) {
					 
					Columna[n] = matriz[i][n]; 
					 
				 }
			 }
		 }

		 return Columna;
	 
	 }
	 
	 
	 /*
	 public static boolean esIdentidad(int [][] matriz) {
			 // devuelve true si la matriz es identidad
	 }
	 public static int [][] identidad(int tamaño) {
			 // devuelve la matriz identidad del tamaño indicado
	 }
	 
	 public static boolean esDiagonal(int [][] matriz) {
			 // devuelve true si la matriz es diagonal
	 }
			 
	 
	
	
	 }
	 
	 */
}



/*
 * 
package matriz;

public class Matriz implements Cloneable{
    public int n;      //dimensión
    private double[][] x;
    public Matriz(int n) {
        this.n=n;
        x=new double[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                x[i][j]=0.0;
            }
        }
    }
    public Matriz(double[][] x) {
        this.x=x;
        n=x.length;
   }
   public Object clone(){
        Matriz obj=null;
        try{
            obj=(Matriz)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
//aquí está la clave  para clonar la matriz bidimensional
        obj.x=(double[][])obj.x.clone();
        for(int i=0; i<obj.x.length; i++){
            obj.x[i]=(double[])obj.x[i].clone();
        }
        return obj;
    }

    double traza(){
        double tr=0.0;
        for(int i=0; i<n; i++){
            tr+=x[i][i];
        }
        return tr;
    }
//suma de dos matrices
    static Matriz suma(Matriz a, Matriz b){
        Matriz resultado=new Matriz(a.n);
        for(int i=0; i<a.n; i++){
            for(int j=0; j<a.n; j++){
                resultado.x[i][j]=a.x[i][j]+b.x[i][j];
            }
        }
        return resultado;
    }
//producto de dos matrices
    static Matriz producto(Matriz a, Matriz b){
        Matriz resultado=new Matriz(a.n);
        for(int i=0; i<a.n; i++){
            for(int j=0; j<a.n; j++){
                for(int k=0; k<a.n; k++){
                    resultado.x[i][j]+=a.x[i][k]*b.x[k][j];
                }
            }
        }
        return resultado;
    }
//producto de una matriz por un escalar
    static Matriz producto(Matriz a, double d){
        Matriz resultado=new Matriz(a.n);
        for(int i=0; i<a.n; i++){
            for(int j=0; j<a.n; j++){
                resultado.x[i][j]=a.x[i][j]*d;
            }
        }
        return resultado;
    }
//producto de un escalar por una matriz
    static Matriz producto(double d, Matriz a){
        Matriz resultado=new Matriz(a.n);
        for(int i=0; i<a.n; i++){
            for(int j=0; j<a.n; j++){
                resultado.x[i][j]=a.x[i][j]*d;
            }
        }
        return resultado;
    }
//producto de un vector fila por una matriz da un vector fila (1xn) (nxn)= (1xn)
    static Vector producto(Vector v, Matriz a){
        Vector b=new Vector(v.n);
        int n=v.n;  //dimensión
        for(int j=0; j<n; j++){
            for(int k=0; k<n; k++){
                b.x[j]+=v.x[k]*a.x[k][j];
            }
        }
        return b;
    }
//producto de una matriz por un vector columna (nxn) (nx1)= (nx1)
    static Vector producto(Matriz a, Vector v){
        int n=v.n;  //dimensión
        Vector b=new Vector(n);
        for(int i=0; i<n; i++){
            for(int k=0; k<n; k++){
                b.x[i]+=a.x[i][k]*v.x[k];
            }
        }
        return b;
    }

//determinante de una matriz
    double determinante(){
        Matriz a=(Matriz)clone();
        for(int k=0; k<n-1; k++){
            for(int i=k+1; i<n; i++){
                for(int j=k+1; j<n; j++){
                    a.x[i][j]-=a.x[i][k]*a.x[k][j]/a.x[k][k];
                }
            }
        }
        double deter=1.0;
        for(int i=0; i<n; i++){
            deter*=a.x[i][i];
        }
        return deter;
    }
//matriz inversa
    static Matriz inversa(Matriz d){
        int n=d.n;  //dimensión de la matriz
        Matriz a=(Matriz)d.clone();
        Matriz b=new Matriz(n);   //matriz de los términos independientes
        Matriz c=new Matriz(n);   //matriz de las incógnitas
//matriz unidad
        for(int i=0; i<n; i++){
            b.x[i][i]=1.0;
        }
//transformación de la matriz y de los términos independientes
        for(int k=0; k<n-1; k++){
            for(int i=k+1; i<n; i++){
//términos independientes
                for(int s=0; s<n; s++){
                    b.x[i][s]-=a.x[i][k]*b.x[k][s]/a.x[k][k];
                }
//elementos de la matriz
                for(int j=k+1; j<n; j++){
                    a.x[i][j]-=a.x[i][k]*a.x[k][j]/a.x[k][k];
                }
            }
        }
//cálculo de las incógnitas, elementos de la matriz inversa
        for(int s=0; s<n; s++){
            c.x[n-1][s]=b.x[n-1][s]/a.x[n-1][n-1];
            for(int i=n-2; i>=0; i--){
                c.x[i][s]=b.x[i][s]/a.x[i][i];
                for(int k=n-1; k>i; k--){
                    c.x[i][s]-=a.x[i][k]*c.x[k][s]/a.x[i][i];
                }
            }
        }
        return c;
    }
//matriz traspuesta
    static Matriz traspuesta(Matriz a){
        int n=a.n;    //dimensión
        Matriz d=new Matriz(a.n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                d.x[i][j]=a.x[j][i];
            }
        }
        return d;
    }
//polinomio característico

    public double[] polCaracteristico(){
        Matriz pot=new Matriz(n);
//matriz unidad
        for(int i=0; i<n; i++){
            pot.x[i][i]=1.0;
        }
        double[] p=new double[n+1];
        double[] s=new double[n+1];
        for(int i=1; i<=n; i++){
            pot=Matriz.producto(pot, this);
            s[i]=pot.traza();
        }
        p[0]=1.0;
        p[1]=-s[1];
        for(int i=2; i<=n; i++){
            p[i]=-s[i]/i;
            for(int j=1; j<i; j++){
                p[i]-=s[i-j]*p[j]/i;
            }
        }
        return p;
    }

    public Matriz valoresPropios(double[] valores, int maxIter)throws ValoresExcepcion{
        final double CERO=1e-8;
        double maximo, tolerancia, sumsq;
        double x, y, z, c, s;
        int contador=0;
        int i, j, k, l;
        Matriz a=(Matriz)clone();      //matriz copia
        Matriz p=new Matriz(n);
        Matriz q=new Matriz(n);
//matriz unidad
        for(i=0; i<n; i++){
            q.x[i][i]=1.0;
        }
        do{
            k=0; l=1;
            maximo=Math.abs(a.x[k][1]);
            for(i=0; i<n-1; i++){
                for(j=i+1; j<n; j++){
                    if(Math.abs(a.x[i][j])>maximo){
                        k=i;        l=j;
                        maximo=Math.abs(a.x[i][j]);
                    }
                }
            }
            sumsq=0.0;
            for(i=0; i<n; i++){
                sumsq+=a.x[i][i]*a.x[i][i];
            }
            tolerancia=0.0001*Math.sqrt(sumsq)/n;
            if(maximo<tolerancia) break;
//calcula la matriz ortogonal de p
//inicialmente es la matriz unidad
            for(i=0; i<n; i++){
                for(j=0; j<n; j++){
                    p.x[i][j]=0.0;
                }
            }
            for(i=0; i<n; i++){
                p.x[i][i]=1.0;
            }
            y=a.x[k][k]-a.x[l][l];
            if(Math.abs(y)<CERO){
                c=s=Math.sin(Math.PI/4);
            }else{
                x=2*a.x[k][l];
                z=Math.sqrt(x*x+y*y);
                c=Math.sqrt((z+y)/(2*z));
                s=signo(x/y)*Math.sqrt((z-y)/(2*z));
            }
            p.x[k][k]=c;
            p.x[l][l]=c;
            p.x[k][l]=s;
            p.x[l][k]=-s;
            a=Matriz.producto(p, Matriz.producto(a, Matriz.traspuesta(p)));
            q=Matriz.producto(q, Matriz.traspuesta(p));
            contador++;
        }while(contador<maxIter);

        if(contador==maxIter){
            throw new ValoresExcepcion("No se han podido calcular los valores propios");
        }
//valores propios
        //double[] valores=new double[n];
        for(i=0; i<n; i++){
            valores[i]=(double)Math.round(a.x[i][i]*1000)/1000;
        }
//vectores propios
        return q;
    }

    private int signo(double x){
        return (x>0 ? 1 : -1);
    }

    public String toString(){
        String texto="\n";
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                texto+="\t "+(double)Math.round(1000*x[i][j])/1000;
            }
            texto+="\n";
        }
        texto+="\n";
        return texto;
  }

}

class ValoresExcepcion extends Exception {

  public ValoresExcepcion() {
         super();
  }
  public ValoresExcepcion(String s) {
         super(s);
  }
}
 */




