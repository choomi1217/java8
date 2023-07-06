package basic.chained_exception;

public class ChainedException {
    public static void main(String[] args) throws BException {
        try {
            aMethod();
            cMethod();
        } catch (AException a) {
            BException b = new BException("AException occurred");
            b.initCause(a);
            throw b;
        } catch (CException c) {
            BException b = new BException("CException occurred");
            b.initCause(c);
            throw b;
        }
    }

    public static void aMethod() throws AException {
        throw new AException("AException occurred");
    }

    public static void cMethod() throws CException {
        throw new CException("CException occurred");
    }
}
