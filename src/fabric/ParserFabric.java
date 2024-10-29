package fabric;

import document_parser.IParser;
import document_parser.impl.DocxDocumentParser;
import document_parser.impl.PdfDocumentParser;
import document_parser.impl.TxtDocumentParser;

public class ParserFabric {
    public static IParser createParser(String fileName){

        if(fileName.endsWith(".docx")){
            // TODO избавиться от return null и сделать возврат docx парсера
            return new DocxDocumentParser();
        } else if (fileName.endsWith(".pdf")) {
            return new PdfDocumentParser();
        } else {
            return new TxtDocumentParser();
        }

        // TODO (опционально) * попробовать переписать на конструкцию switch-case, может это будет более ёмкая запись
    }
}
