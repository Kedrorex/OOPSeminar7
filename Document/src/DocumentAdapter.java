public class DocumentAdapter implements Document {
    OldDocument oldDocument = new OldDocument();
    @Override
    public void openDocument() {
        oldDocument.openDocument();
        System.out.println("Документ открыт по новому");
    }

    @Override
    public void closeDocument() {
        oldDocument.closeDocument();
        System.out.println("Документ закрыт по новому");
    }
}
