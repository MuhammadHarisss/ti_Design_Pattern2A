package contoh;

public class AksesModifier {
    private String aksesPrivate;//bisa diakses dikelas ini aja
    public String aksesPublic;//bisa diakses dimana aja
    protected String aksesProtected;//bisa diakses karena class dan subclass
    String aksesDefault;//bisa diakses dalam kelas tapi dalam satu package

    private void methodPrivate(){
        System.out.println("AksesModifier method private");
    }
}
//interce adalah kelas yang berisi method tanpa