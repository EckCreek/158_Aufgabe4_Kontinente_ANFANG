public class Welt
{
    private Kontinent [] meineKontinente;

    public Welt()
    {
        meineKontinente = new Kontinent[6];

    }
    
    public void sortiereKontinenteNachFlaeche() //insertion Sort
    {

    }
	public void sortiereKontinenteNachEinwohnern() //insertion Sort
    {

    }
  
  // Methode zur Ausgabe auf der Konsole 
  public void ausgabeKontinente(){
      for (Kontinent k: meineKontinente){ // Alternative Form der for-Schleife (for each)
        System.out.println(k.getName());
      }
    }
}

