package Stream;

import poo.GettersAndSetters.User;

import java.util.List;

public class Stream {
    public static void main(String[] args){
        List<Users> users=List.of(
                new Users(14),
                new Users(10),
                new Users(2)
        );
//    // Forma imperativa
    int count=0;
//    for(Users user:users){
//        if (user.edad<18){
//            count++;
//        }
//    }
//
     // Declarativa
       var cantidad= users.stream().filter(users1 -> users1.edad<18).count();
        System.out.println("Cantidad= " +   cantidad);
    }


}
