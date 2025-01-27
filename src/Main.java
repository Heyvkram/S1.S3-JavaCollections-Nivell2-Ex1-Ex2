import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurantList = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("restaurant 1", 8);
        Restaurant restaurant2 = new Restaurant("restaurant 2", 1);
        Restaurant restaurant3 = new Restaurant("restaurant 3", 7);
        Restaurant restaurant4 = new Restaurant("restaurant 4", 5);
        Restaurant restaurant5 = new Restaurant("restaurant 4", 5);
        Restaurant restaurant6 = new Restaurant("restaurant 4", 9);
        Restaurant restaurant7 = new Restaurant("restaurant 4", 6);
        Restaurant restaurant8 = new Restaurant("restaurant 2", 5);


        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);
        restaurantList.add(restaurant3);
        restaurantList.add(restaurant4);
        restaurantList.add(restaurant5);
        restaurantList.add(restaurant6);
        restaurantList.add(restaurant7);
        restaurantList.add(restaurant8);

        restaurantList.forEach(System.out::println);

        List<Restaurant> restaurantArrayList = new ArrayList<>(restaurantList);

        Collections.sort(restaurantArrayList, Comparator.comparing(Restaurant::getName)
                .thenComparing(Restaurant::getScore).reversed());

        restaurantArrayList.forEach(System.out::println);

    }
}
