package Chapter11.Exercises;

import Chapter10.Listings.Loan;
import Chapter11.Listings.Circle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UseArrayList {

     public static void main(String[] args) {
          ArrayList<Object> arrayList = new ArrayList<>();

          arrayList.add(new Loan());
          arrayList.add(new Date());
          arrayList.add(new Circle());

    for (int i = 0; i < arrayList.size(); i++){
         System.out.println(arrayList.get(i));
    }


     }

}
