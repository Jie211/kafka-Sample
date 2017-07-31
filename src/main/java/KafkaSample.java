/**
 * Created by kazono on 2016/09/13.
 */
public class KafkaSample {
    // produce するメッセージのトピック
    static String topic = "test2";

    public static void main(String[] args) {
        boolean isAsync = args.length == 0 || !args[0].trim().equalsIgnoreCase("sync");
        // Create constructors.
        ProducerSample producerThread = new ProducerSample(topic, isAsync);
        ConsumerSample consumerThread = new ConsumerSample(topic);
        producerThread.start();
        consumerThread.start();

    }
}
