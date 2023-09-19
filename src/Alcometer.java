public class Alcometer {

    public double countLitres(int bottles){
        return bottles*0.33;
    }

    public double countGrams(double litres){
        return litres*8*4.5;
    }

    public double countBurning(int weight){
        return (double) weight/10;
    }

    public double countGramsLeft(double grams, double burning, int time){
        return grams-burning*time;
    }

    public double countResult(double grams, int weight, char gender){
        if (gender == 'm'){
            return (double) Math.round(grams / (weight * 0.7)*10.0)/10.0;
        }
        return (double) Math.round(grams / (weight * 0.6)*10.0)/10.0;
    }
}
