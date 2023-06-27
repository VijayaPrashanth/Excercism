public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes_in_oven) {
        return expectedMinutesInOven()-minutes_in_oven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int no_of_layers) {
        return 2*no_of_layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int no_of_layers,int minutes_in_oven) {
        return minutes_in_oven+preparationTimeInMinutes(no_of_layers);
    }
}
