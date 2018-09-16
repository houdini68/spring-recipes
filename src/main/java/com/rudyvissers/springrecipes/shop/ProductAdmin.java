package com.rudyvissers.springrecipes.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/*
** It is a little bit artificial here to make usage of @Component.
** This class should be part of ShopConfigurationInvokingConstructor.
** The only int. of this class is to demo. the wiring of an array and a List of beans.
 */
@Component
public class ProductAdmin {

    private final Product[] arrayOfproducts;
    private final List<Product> listOfproducts;

    /*
    ** The only int. part. Not a signle bean but an array and a List of Product is autowired.
     */
    @Autowired // by an array of beans and by a List of beans
    public ProductAdmin(Product[] arrayOfproducts, List<Product> listOfproducts) {
        this.arrayOfproducts = arrayOfproducts;
        this.listOfproducts = listOfproducts;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ProductAdmin{");
        result.append("-by array-");
        for (Product product : arrayOfproducts) {
            result.append("\'").append(product.getName()).append("\' ");
        }
        result.append("-by List-");
        for (Product product : listOfproducts) {
            result.append("\'").append(product.getName()).append("\' ");
        }
        result.append('}');
        return result.toString();
    }
}
