import java.util.ArrayList;
import java.util.List;

public class School extends Magic{

    private List<Magic> magics;

    public School(String description) {
        super(description);
        this.magics = new ArrayList<Magic>();
    }

    public void addMagic(Magic magic) {
        this.magics.add(magic);
    }

    public String getMagic() {
        String saida = "";
        saida = "School: " + this.getDescription() + "\n";
        for (Magic magic : magics) {
            saida += magic.getMagic();
        }
        return saida;
    }
}
