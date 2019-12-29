package homework9.task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExecutor {

    public void catchAllExceptions() {
        catchExceptionA();
        catchExceptionB();
        catchIOException();
        catchNullPointerException();
    }

    private void catchExceptionA() {
        try {
            throw new ExceptionA();
        } catch (ExceptionA exceptionA) {
            System.out.println(exceptionA.getExceptionInfo());
        }
    }

    private void catchExceptionB() {
        try {
            throw new ExceptionB();
        } catch (ExceptionB exceptionB) {
           exceptionB.printStackTrace();
        }
    }

    private void catchNullPointerException () {
            String newString = null;
            try {
                if(newString.equals("Test"));
            } catch (NullPointerException exception) {
                exception.printStackTrace();
            }
        }

        private void catchIOException () {
            File file = new File("testFile.txt");
            try {
                FileReader fileReader = new FileReader(file.getAbsoluteFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
