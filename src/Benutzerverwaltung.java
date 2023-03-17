public class Benutzerverwaltung {
    private BinarySearchTree<Benutzerprofil> benutzerBaum;
    private BaumZeichner baumZeichner;
    public void neuenNutzerAnlegen(String pBenutzername, String pPw){
        Benutzerprofil neu = new Benutzerprofil(pBenutzername,pPw);
    }
    public void nutzerLoeschen(String pBenutzername){
        Benutzerprofil search = new Benutzerprofil(pBenutzername, "");
        benutzerBaum.remove(search);
    }


    public Boolean profilVorhanden(String pBenutzername){
        Benutzerprofil search = new Benutzerprofil(pBenutzername, "");
        return benutzerBaum.search(search) != null;
    }

    public BinarySearchTree<Benutzerprofil> getBenutzerBaum() {
        return benutzerBaum;
    }

    public void zeichneBaum(){
        baumZeichner = new BaumZeichner(600,600,benutzerBaum);

    }
}
