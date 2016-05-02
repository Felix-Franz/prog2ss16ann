package ann;

/**
 * Created by patrickmennig on 25.04.16.
 */
public class ConcreteNeuron extends Neuron {

    public ConcreteNeuron(double[] weights, int numInputs, int numOutputs) {
        if(weights != null) {
            this.weights = weights;
        } else {
            this.weights = new double[numInputs];

            double b = Math.sqrt( 6 / (numInputs + numOutputs));

            for(int i = 0; i < numInputs; ++i) {
                this.weights[i] = Math(-b, b);
            }
        }
    }

    @Override
    public double getOutput(double[] input) {
        double netInput = this.netInput(input, weights);
        double activation = this.activation(netInput);

        return activation;
    }
}
