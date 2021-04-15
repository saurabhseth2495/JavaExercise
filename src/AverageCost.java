public class AverageCost {
    private String type;
    private float average_cost_production;

    public AverageCost(String type, float average_cost_production) {
        this.type = type;
        this.average_cost_production = average_cost_production;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getAverage_cost_production() {
        return average_cost_production;
    }

    public void setAverage_cost_production(float average_cost_production) {
        this.average_cost_production = average_cost_production;
    }
}
