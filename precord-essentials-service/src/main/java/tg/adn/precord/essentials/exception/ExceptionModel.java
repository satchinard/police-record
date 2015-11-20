/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.exception;

/**
 *
 * @author cagecfi
 */
public class ExceptionModel extends RuntimeException {

    public ExceptionModel() {
    }

    public ExceptionModel(String message) {
        super(message);
    }

    public ExceptionModel(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionModel(Throwable cause) {
        super(cause);
    }

    public ExceptionModel(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
