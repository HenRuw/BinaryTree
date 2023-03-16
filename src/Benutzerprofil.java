

public class Benutzerprofil implements ComparableContent<Benutzerprofil>{
    private String benutzername;
    private String passwort;

    public String getPasswort() {
        return passwort;
    }

    public Benutzerprofil(String pBenutzername, String pPw) {
        this.benutzername = benutzername;
        this.passwort = pPw;
    }

    public String getBenutzername() {
        return benutzername;
    }

    @Override
    public boolean isGreater(Benutzerprofil pContent) {
        return benutzername.compareTo(pContent.getBenutzername()) > 0;
    }

    @Override
    public boolean isEqual(Benutzerprofil pContent) {
        return benutzername.compareTo(pContent.getBenutzername()) == 0;
    }

    @Override
    public boolean isLess(Benutzerprofil pContent) {
        return benutzername.compareTo(pContent.getBenutzername()) < 0;
    }
}
