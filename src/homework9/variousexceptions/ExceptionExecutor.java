package homework9.variousexceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExecutor {

    public void catchAllExceptions() {
        catchExceptionMinCartValue();
        catchExceptionEmptyCart();
        catchIOException();
        catchNullPointerException();
    }

    private void catchExceptionMinCartValue() {
        try {
            throw new NoMinPurchaseAmount();
        } catch (NoMinPurchaseAmount exception) {
            System.out.println(exception.getExceptionInfo());
        }
    }

    private void catchExceptionEmptyCart() {
        try {
            throw new NoItemsForPurchaseException();
        } catch (NoItemsForPurchaseException exception) {
            exception.printStackTrace();
        }
    }

    private void catchNullPointerException() {
        String newString = null;
        try {
            if (newString.equals("Test")) ;
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
    }

    private void catchIOException() {
        File file = new File("testFile.txt");
        try {
            FileReader fileReader = new FileReader(file.getAbsoluteFile());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
