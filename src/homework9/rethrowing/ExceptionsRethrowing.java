package homework9.rethrowing;

public class ExceptionsRethrowing {

    private void throwExceptionFirstMethod() throws Exception {
        throwExceptionSecondMethod();
    }

    private void throwExceptionSecondMethod() throws Exception {
        throw new Exception("Exception was found");
    }

    public static void throwAllExceptions() {
        try {
            new ExceptionsRethrowing().throwExceptionFirstMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
