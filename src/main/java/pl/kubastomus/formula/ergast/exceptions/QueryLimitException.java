package pl.kubastomus.formula.ergast.exceptions;

public class QueryLimitException extends IllegalArgumentException {
    public QueryLimitException(String msg) {
        super(msg);
    }
}
