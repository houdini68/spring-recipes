package com.rudyvissers.springrecipes.shopByConfiguration.adminByComponent;

import com.rudyvissers.springrecipes.shopByConfiguration.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/*
** It is a little bit artificial here to make usage of @Component.
** This class should be part of ShopConfigurationInvokingConstructor.
** One of the int. of this class is to demo. the wiring of an array and a List of beans.
** Another int. is the usage of the wiring of beans instantiated by Java configuration
 */
@Component
public class ProductAdmin {

    private final Product[] arrayOfproducts;
    private final List<Product> listOfproducts;
    private final Map<String, Product> mapOfproducts;

    /*
    ** The only int. part. Not a single bean but an array and a List of Product is autowired.
     */
    @Autowired // by an array of beans, by a List of beans and by a Map of beans
    public ProductAdmin(Product[] arrayOfproducts, List<Product> listOfproducts, Map<String, Product> mapOfproducts) {
        this.arrayOfproducts = arrayOfproducts;
        this.listOfproducts = listOfproducts;
        this.mapOfproducts = mapOfproducts;
    }

    @Override
    public String toString() {

        /*
        ** Example:
        * 2018-09-17 06:35:03.701  INFO 3058 --- [           main] c.r.s.sequence.SequenceGenerator         : ProductAdmin {
        * -by array-
        * 'AAA','CD-RW',
        * -by List-
        * 'AAA','CD-RW',
        * -by Map-
        * key:'aaa',value:Product{name='AAA', price=2.5}
        * key:'cdrw',value:Product{name='CD-RW', price=1.5}
        * }
        */

        StringBuilder result = new StringBuilder("ProductAdmin {");

        /*
        ** toString method MUST be readable!
        *  the usage of "\n" is recommended
         */
        result.append("\n-by array-\n");
        for (Product product : arrayOfproducts) {
            result.append("\'").append(product.getName()).append("\'").append(",");
        }

        result.append("\n-by List-\n");
        for (Product product : listOfproducts) {
            result.append("\'").append(product.getName()).append("\'").append(',');
        }

        result.append("\n-by Map-\n");
        for (Map.Entry<String, Product> entry : mapOfproducts.entrySet()) {
            result.append("key:\'").append(entry.getKey()).append("',value:").append(entry.getValue()).append("\n");
        }

        result.append('}');
        return result.toString();
    }
}
