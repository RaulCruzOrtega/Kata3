package kata_3;

public class Kata_3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");

        
        HistogramDisplay histogramdisplay = new HistogramDisplay("Histogram Display", histogram);
        histogramdisplay.execute();
    }
    
}
