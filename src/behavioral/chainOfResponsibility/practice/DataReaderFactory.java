package behavioral.chainOfResponsibility.practice;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var excelReader = new ExcelReader();
        var numbersReader = new NumbersReader();
        var quickBooksReader = new QuickBooksReader();

        quickBooksReader.setNext(numbersReader);
        numbersReader.setNext(excelReader);

        return quickBooksReader;
    }
}
