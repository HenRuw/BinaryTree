public class Benutzerverwaltung {
    BinarySearchTree<Benutzerprofil> benutzerBaum;
    public void neuenNutzerAnlegen(String pBenutzername, String pPw){

    }
    public void nutzerLoeschen(String pBenutzername, String pPw){

    }
    public Boolean profilVorhanden(String pBenutzername){
        return benutzerBaum.search(pBenutzername);
    }
}
