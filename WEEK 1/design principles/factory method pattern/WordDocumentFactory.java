public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();  //returns a word doc
    }

}
