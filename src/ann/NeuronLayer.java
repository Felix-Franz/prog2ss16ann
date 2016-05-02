package ann;

/**
 * Created by patrickmennig on 02.05.16.
 */
public class NeuronLayer {

    private AbstractNeuron[] neurons;

    public NeuronLayer(int numNeurons, double[][] weights) {

        neurons = new AbstractNeuron[numNeurons];

        for(int i = 0; i < numNeurons; ++i){
            neurons[i] = new ConcreteNeuron(weights[i]);
        }
    }



    public double[] feedForward(double[] input) {
        double[] output = new double[neurons.length];

        for(int i = 0, l = neurons.length; i < l; ++i){
            output[i] = neurons[i].getOutput(input);
        }

        return output;
    }

}
