package controllers;

import models.Product;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.*;

public class Products extends Controller {

    public Result list(){
        return ok(list.render(Product.findAll()));
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
