package com.company.Array.exception;

public class CustomArrayException extends Exception {

   public CustomArrayException(){
       super();
    }

   public CustomArrayException(String massage){
       super(massage);
    }

   public CustomArrayException(String massage, Throwable cause){
       super(massage, cause);
    }

   public CustomArrayException(Throwable cause){
       super(cause);
    }
}
