package ann;

/**
 * Created by patrickmennig on 02.05.16., edited by Felix Franz on 02.05.16
 */
public class NeuronalNetwork {


    private NeuronLayer[] layers;

    // layer anlegen + "verbinden"
    // layer speichern
    // NeuronLayer[]
    public NeuronalNetwork(int numLayers, double[][][] weights){
    	layers = new NeuronLayer[numLayers];
    	
    	for (int i = 0; i<numLayers; i++){
    		layers[i] = new NeuronLayer(weights[i].length, weights[i]);
    	}
    	
        // wie viele Schichten?
        // wie viele Neuronen pro Schicht?
        // welche Gewichte Je neuron je Schicht...
    }

    // vorwÃ¤rtslauf => eingangssignal annehmen, ausgangsignal erzeugen
    // input in die erste Schicht, output der ersten Schicht in die 2. usw...
    public double[] feedForward(double[] input){
    	
    	double result[];
    	double previousLayer[];
    	previousLayer = layers[0].feedForward(input);
    	for (int i = 1; i < layers.length; i++){
    		previousLayer = layers[i].feedForward(previousLayer);
    	}
    	return previousLayer;

    }


}
