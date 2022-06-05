package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Products extends Controller {

    public Result list(){
        return ok("llegamos al listado de los productos");
    }

}
