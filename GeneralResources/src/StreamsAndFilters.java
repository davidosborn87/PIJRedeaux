package Resources;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//see Day11: Person for example; Day 15 ExamResults for another

public class StreamsAndFilters {


    int getAge(){
        return 0;
    }
    public static List<Integer> getAdultNames(Collection<? extends StreamsAndFilters> collection) { //"This is a collection of unspecified Objects>"
        final int MIN_ADULT_AGE = 18;
        return collection.stream()
                .filter(p -> p.getAge() >= MIN_ADULT_AGE) //lambda creating variable p defined as those over 18 and only returns hits
                .map(StreamsAndFilters::getAge)//of those adults on the map of persons, returns specifically their name
                .collect(Collectors.toList());
        // Person::getName is not bound to a specific object. The method
        //will be called for all objects in the stream
    }
}