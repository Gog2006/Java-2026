package ensembleentierborne;

public class Mystere {

	
	private int maxim;
	private EnsembleEntierBorne premiers;
	
	public Mystere(int maxim) {
		this.maxim = maxim;
		premiers = new EnsembleEntierBorne(maxim);
		}
	public void premier() {
	
		for (int i=2;i<=maxim;i++ ){
		premiers.add(i);
		
		}
		
		for (int i=2; i<=maxim; i++ ) {
			if (premiers.doesContain(i)) {
			    for (int j = 2 * i; j <= maxim; j += i) {
			        premiers.remove(j);
			    }
			}
			
		}
		System.out.println(premiers.toString());
		
	}
	
	static public void main(String[] args){
		
		Mystere test1= new Mystere(50) ;
		test1.premier();
		
	}
	
	
	
	
	
}
