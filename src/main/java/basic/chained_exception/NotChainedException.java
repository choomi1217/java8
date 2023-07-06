package basic.chained_exception;

import java.sql.SQLException;

public class NotChainedException {
    public static void main(String[] args) throws BException {
        try {
            aMethod();
            cMethod();
        } catch (BException b) {
            b.printStackTrace();
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
