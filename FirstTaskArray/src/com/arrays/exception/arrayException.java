package com.arrays.exception;

public class arrayException extends Exception {
   public arrayException (){
        super();
    }

   public arrayException (String massage){
        super(massage);
    }

   public arrayException (String massage, Throwable cause){
        super(massage, cause);
    }

   public arrayException (Throwable cause){
        super(cause);
    }
}
