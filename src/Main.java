public class Main {
    public static void main(String[] args) {
        Benutzerverwaltung v = new Benutzerverwaltung();
        v.neuenNutzerAnlegen("frank", "frank");
        v.neuenNutzerAnlegen("kuno", "frank");
        v.neuenNutzerAnlegen("jonas", "frank");
        v.neuenNutzerAnlegen("angelika", "frank");
        v.neuenNutzerAnlegen("tina", "frank");
        v.zeichneBaum();



    }
}
