package controllers;

import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import utils.ExceptionMailer;

import java.util.concurrent.CompletionStage;

public class CatchAction extends Action.Simple{

    public CompletionStage<Result> call(Http.Request ctx){
        try{
            System.out.println("Entramos a delegar el request al action method");
            return delegate.call(ctx);
        }catch (Throwable e){
            ExceptionMailer.send(e);
            throw new RuntimeException(e);
        }
    }
}
