public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument(); // Returns a pdf doc
    }

}
