package co.com.jccp.ealgorithms.initialization;

import co.com.jccp.ealgorithms.individual.MOEAIndividual;
import co.com.jccp.ealgorithms.utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Juan Camilo Castro Pinto
 **/
public class RandomRealInitialization extends PopulationInitialization<double[]> {

    private double[][] limits;

    public RandomRealInitialization(double[][] limits)
    {
        this.limits = limits;
    }

    @Override
    public List<MOEAIndividual<double[]>> init(int popSize, int dimensions) {
        List<MOEAIndividual<double[]>> pop = new ArrayList<>(popSize);

        for (int i = 0; i < popSize; i++) {
            double[] data = RandomUtils.generateRandomArray(dimensions, limits);
            MOEAIndividual<double[]> individual = new MOEAIndividual<>();
            individual.setData(data);
            pop.add(individual);
        }
        return pop;
    }

    public double[][] getLimits() {
        return limits;
    }

    public void setLimits(double[][] limits) {
        this.limits = limits;
    }
}
