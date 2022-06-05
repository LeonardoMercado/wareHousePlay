package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Products extends Controller {

    public Result list(){
        return ok("llegamos al listado de los productos");
    }

    public Result newProduct(){
        return ok("llegamos a crear un nuevo producto");
    }

    public Result details(){
        return ok("llegamos al detalle del producto");
    }
    
    public Result save(){
        return ok("llegamos a guardar el producto");
    }
}
