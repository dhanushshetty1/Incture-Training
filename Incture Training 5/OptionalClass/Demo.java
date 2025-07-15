package OptionalClass;

import java.util.Optional;

public class Demo {

    public static void main(String[] args) {
        Optional<Cat> myCat = findCatByName("Dahnsush");
        
    }

    private static Optional<Cat> findCatByName(String name){
        Cat cat = new Cat(name,3);
        return Optional.ofNullable(cat);
    }
    
}
