package controllers;

import models.Product;
import play.i18n.Lang;
import play.i18n.MessagesApi;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import javax.inject.Inject;
import views.html.products.*;
import java.util.ArrayList;

public class Products extends Controller {
    private final Form<Product> productoForm;
    private MessagesApi messagesApi;
    public final static ArrayList<Lang> idioma = new ArrayList<Lang>(){{
        add(Lang.forCode("es"));
    }};

    @Inject
    public Products(FormFactory formFactory, MessagesApi messagesApi) {
        this.productoForm = formFactory.form(Product.class);
        this.messagesApi = messagesApi;
    }

    public Result list(){
        return ok(list.render("Produtcs Catalogue",Product.findAll()));
    }

    public Result newProduct(){
        return ok(details.render("Detalle del producto",productoForm, messagesApi.preferred(idioma)));
    }

    public Result details(String ean){
        return ok("llegamos al detalle del producto");
    }

    public Result save(){
        return ok("llegamos a guardar el producto");
    }
}
