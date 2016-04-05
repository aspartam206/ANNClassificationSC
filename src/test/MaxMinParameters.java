package test;

import java.io.Serializable;

/**
 * @author Renny P. Kusumawardani
 * Mar 23, 2016
 */
@SuppressWarnings("serial")
public class MaxMinParameters implements Serializable  {

    double[] maxIn, maxOut;
    double[] minIn, minOut;
    
    MaxMinParameters(double[] minIn, double[] maxIn) {
    	this.maxIn = maxIn;
    	this.minIn = minIn;
    }
    
    MaxMinParameters(MaxMinNormalizerFieldsAccessible mmnfa) {
    	this.maxIn  = mmnfa.getMaxIn();
    	this.minIn  = mmnfa.getMinIn();
    	this.maxOut = mmnfa.getMaxOut();
    	this.minOut = mmnfa.getMinOut();
    }
}
