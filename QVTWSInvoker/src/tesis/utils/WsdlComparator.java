package tesis.utils;

import java.util.Comparator;
import tesis.models.Wsdl;

public class WsdlComparator implements Comparator<Wsdl>{
    
    @Override
    public int compare(Wsdl x, Wsdl y) {
        if (x.getLong("availability") + x.getLong("reputation") - x.getLong("response") < y.getLong("availability") + y.getLong("reputation") - y.getLong("response")) {
            return -1;
        } else {
            return 1;
        }
    }
}
