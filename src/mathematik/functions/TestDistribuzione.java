package mathematik.functions;

public class TestDistribuzione {

	public static void main (String[] args){
		
		             double[] dati = new double[]{13,13,13,11,13,2,3,4,22,22,9,9,9,9,9,9,9,9,4,4,7,7,7,6,5,1,1,1,1,1,1,1,1,1};
		             double[] h = new double[24];
		             for(int i=0; i<dati.length;i++)
		                    h[(int)dati[i]]++;
		            
		             for (int i = 0; i < h.length; i++) {
					System.out.println("h("+i+") --> "+h[i]);	
					 }
		             
		             double sum = 0;
		             for(int i=0; i<h.length;i++)
		                    sum+=h[i];
		            
		             for(int i=0; i<h.length;i++)
		                    h[i] = h[i] / sum;
		            
		             for(int i=0; i<h.length;i++)
		                    System.out.println("p(h"+i+") = "+h[i]);
		            
		             // h è la distribuzione di probabilità che approssima i dati
		            
		             // calcolo la probabiolità cumulativa
		            
		             double[] cum = new double[24];
		             cum[0] = h[0];
		             for(int i=1; i<cum.length;i++)
		                    cum[i] = cum[i-1]+h[i];
		            
		             System.out.println();
		            
		             for(int i=0; i<cum.length;i++)
		                    System.out.println("cum(h"+i+") = "+cum[i]);
		            
		             double[] hs = new double[10];
		            
		             for(int i=0; i<hs.length;i++) {
		                    double x = Math.random();
		                    for(int j=0; j<cum.length;j++) {
		                           if(x < cum[j]) {
		                                  hs[i] = j;
		                                  break;
		                           }
		                    }
		             }
		             for(int i=0; i<hs.length;i++)
		                    System.err.println(hs[i]);
		                        
		       }
      }
