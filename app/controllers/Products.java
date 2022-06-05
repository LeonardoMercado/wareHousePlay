package controllers;

import models.Product;
import play.api.http.NotImplementedHttpRequestHandler;
import play.mvc.Controller;
import play.mvc.Result;

public class Products extends Controller {

    public Result list(){
        return ok(Product.findAll().toString());
    }

    public Result newProduct(){
        return ok("llegamos a crear un nuevo producto");
    }

    public Result details(String ean){
        return ok("llegamos al detalle del producto");
    }

    public Result save(){
        return ok("llegamos a guardar el producto");
    }
}
