package BazadeDate.classes;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiuneBaza;
    private static ConexiuneBazaDeDate instanta=null;

    private ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiuneBaza) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiuneBaza = linkConexiuneBaza;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiuneBaza='" + linkConexiuneBaza + '\'' +
                '}';
    }
    public static synchronized ConexiuneBazaDeDate getInstance(String numeBaza, int nrTabele, String linkConexiuneBaza)
    {
        if(instanta==null) {
            instanta=new ConexiuneBazaDeDate(numeBaza,nrTabele,linkConexiuneBaza);

        }
        return instanta;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public void setLinkConexiuneBaza(String linkConexiuneBaza) {
        this.linkConexiuneBaza = linkConexiuneBaza;
    }
}
