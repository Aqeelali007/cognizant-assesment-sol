public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        DocumentFactory e = new excelFactory();
        document d = e.createDocument();
        d.create();
    }
}

interface document{
    public void create();
}

class WordDocument implements document{

    @Override
    public void create() {        
        System.out.println("word document is created");
    }
}

class PdfDocument implements document{

    @Override
    public void create() {        
        System.out.println("Pdf document is created");
    }
}

class ExcelDocument implements document{

    @Override
    public void create() {        
        System.out.println("Excel document is created");
    }
}

abstract class DocumentFactory{
    public abstract document createDocument();
}

class wordFactory extends DocumentFactory{

    @Override
    public document createDocument() {        
        return new WordDocument();
    }
    
}

class pdfFactory extends DocumentFactory{

    @Override
    public document createDocument() {    
        return new PdfDocument();
    }
    
}
class excelFactory extends DocumentFactory{

    @Override
    public document createDocument() {        
        return new ExcelDocument();
    }
    
}