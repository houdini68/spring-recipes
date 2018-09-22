package com.rudyvissers.springrecipes.javaconfiguration.components;

import com.rudyvissers.springrecipes.javaconfiguration.beans.Bean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Bean5RefBean2 {

    private final Bean2[] bean2Array;
    private final List<Bean2> bean2List;
    private final Map<String, Bean2> bean2Map;

    // as of Spring 4.3 if you have only a single constructor, Spring will aut. use that const. for autowiring
    // you can omit @Autowired
    @Autowired
    public Bean5RefBean2(Bean2[] bean2Array, List<Bean2> bean2List, Map<String, Bean2> bean2Map) {
        this.bean2Array = bean2Array;
        this.bean2List = bean2List;
        this.bean2Map = bean2Map;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Bean5 {");
        result.append("\n-by array-\n");
        for (Bean2 bean2 : bean2Array) {
            result.append("\'").append(bean2.getAttribute1()).append("\'").append(",");
        }
        result.append("\n-by List-\n");
        for (Bean2 bean2 : bean2List) {
            result.append("\'").append(bean2.getAttribute1()).append("\'").append(",");
        }
        result.append("\n-by Map-\n");
        for (Map.Entry<String, Bean2> entry : bean2Map.entrySet()) {
            result.append("key:\'").append(entry.getKey()).append("',value:").append(entry.getValue()).append("\n");
        }
        result.append('}');
        return result.toString();
    }
}
