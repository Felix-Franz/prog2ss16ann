package ann;

/**
 * Created by patrickmennig on 25.04.16.
 */
public abstract class Neuron extends AbstractNeuron {


    protected double netInput(double[] input, double[] weights) {

        double net = 0;
        for(int i = 0, l = weights.length; i < l; ++i) {
            net += input[i] * weights[i];
        }

        return net;
    }

    protected double activation(double netInput) {
        return 1 / (1 + Math.exp(-1 * netInput));
    }


}




/*
 // sanity check
        if(input.length != weights.length) {
            // handle error
        }
 */