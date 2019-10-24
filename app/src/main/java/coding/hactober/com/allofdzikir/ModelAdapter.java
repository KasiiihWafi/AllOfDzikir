package coding.hactober.com.allofdzikir;

public class ModelAdapter {
    private String judul;
    private String subJudul;

    public ModelAdapter(String judul, String subJudul) {
        this.judul = judul;
        this.subJudul = subJudul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubJudul() {
        return subJudul;
    }

    public void setSubJudul(String subJudul) {
        this.subJudul = subJudul;
    }
}


