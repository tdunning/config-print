package com.tdunning;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.util.Map;

public class ConfigPrinter extends Configured implements Tool {
    static {
        // by default core-site.xml is already added
        // loading "hdfs-site.xml" from classpath
        Configuration.addDefaultResource("hdfs-site.xml");
        Configuration.addDefaultResource("mapred-site.xml");
    }

    @Override
    public int run(String[] strings) {
        Configuration config =  this.getConf();
        for (Map.Entry<String, String> entry : config) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        ToolRunner.run(new ConfigPrinter(), args);
    }
}

