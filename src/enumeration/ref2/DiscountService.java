package enumeration.ref2;

import static enumeration.ref2.Grade.*;

public class DiscountService {

    public int discount(Grade grade, int price){
        return grade.discount(price);
    }
}
