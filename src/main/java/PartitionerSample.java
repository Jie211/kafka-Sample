import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

public class PartitionerSample implements Partitioner {
    public PartitionerSample(){}

    /**
     * Compute the partition for the given record.
     *
     * @params topic The topic name
     * @params key The key to partition on (or null if no key)
     * @params keyBytes The serialized key to partition on( or null if no key)
     * @params value The value to partition on or null
     * @params valueBytes The serialized value to partition on or null
     * @params cluster The current cluster metadata
     */
    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
        int partition = Integer.parseInt(key.toString()) % 3;
        return partition;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
