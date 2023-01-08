package com.example.osnovi_algoritm_1______;

public class StorageIsFullExcption extends RuntimeException {
    public StorageIsFullExcption() {
    }

    public StorageIsFullExcption(String message) {
        super(message);
    }

    public StorageIsFullExcption(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullExcption(Throwable cause) {
        super(cause);
    }

    public StorageIsFullExcption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
