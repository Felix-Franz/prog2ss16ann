package ann;

/**
 * Created by patrickmennig on 02.05.16.
 */
public class NeuronalNetwork {


    private NeuronLayer[] layers;

    // layer anlegen + "verbinden"
    // layer speichern
    // NeuronLayer[]
    public NeuronalNetwork(){
        // wie viele Schichten?
        // wie viele Neuronen pro Schicht?
        // welche Gewichte Je neuron je Schicht...
    }

    // vorwärtslauf => eingangssignal annehmen, ausgangsignal erzeugen
    // input in die erste Schicht, output der ersten Schicht in die 2. usw...
    public double[] feedForward(double[] input){

        double[] outputFirstLayer = layers[0].feedForward(input);
        double[] outputSecondLayer = layers[1].feedForward(outputFirstLayer);
        //...

    }


}
