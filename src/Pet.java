/**
 * Classe Pet.
 * @author Nicola Anghileri
 * @version 28.09.2021
 */
public class Pet implements Cloneable{
    /**
     * Il nome dell'animale.
     */
    private String name;

    /**
     * 
     */
    public int ad;

    /**
     * 
     */
    protected int as;

    /**
     * 
     */
    int sos;
    
    public Pet(String name){
        this.name = name;
    }

    public Pet(){
        this.name = "Fuffi";
    }
    
    public void prova(int a, String b){
        System.out.println(a + b);
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}