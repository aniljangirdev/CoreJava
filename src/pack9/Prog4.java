package pack9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog4 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>() ;
        list.add("Gagan");
        list.add("Anil");
        list.add("Jitender");
        list.add("Elyse") ;


        for(int i=0;i<list.size();i++) {
            if(list.get(i).equals("Gagan")) {
                list.remove("Gagan");
            }
        }


// giving error
//        for (String name : list) {
//            if (name.equals("Anil")) {
//                list.remove("Anil");
//            }
//        }

    }
}
