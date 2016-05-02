package ann;

/**
 * Created by patrickmennig on 25.04.16.
 */
public abstract  class AbstractNeuron {


    protected double[] weights;

    /**
     * Calculates the output of a neuron.
     * Summarizes the product of layer n-1 input multiplied
     * with connection weight and calulcates the activation.
     * Output equals activation.
     * @return
     */
    public abstract double getOutput (double[] input);


}
