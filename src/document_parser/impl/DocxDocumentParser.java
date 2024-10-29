package document_parser.impl;

import document_parser.IParser;

public class DocxDocumentParser implements IParser {
    @Override
    public void parseFile(String fileName) {
        System.out.println("Get data from docx document");
    }
}
