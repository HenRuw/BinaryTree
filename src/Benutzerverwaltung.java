public class Benutzerverwaltung {
    BinarySearchTree<Benutzerprofil> benutzerBaum;
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
}
