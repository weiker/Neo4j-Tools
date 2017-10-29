package com.yiche.psc.rpse.neo4jTools.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 作者：jjlouis
 * 时间：2017/5/14 13:54
 * 联系方式：550388826@qq.com
 * 功能：
 **/

@Configuration
public class EsConfig {

//    @Autowired
//    ApplicationContext context;

    @Value("${es.servers}")
    String esServers="192.168.55.91:9300,192.168.55.93:9300";

    @Value("${es.cluster.name}")
    String clusterName="ESCluster";

//    @Value("${es.index}")
//    String index;
//
//    @Value("${es.search.timeout}")
//    long timeout;


    @Bean(name="esClient",destroyMethod = "close")
    public TransportClient getEsClient() throws UnknownHostException {
        Settings settings = Settings.builder()
                .put("cluster.name",clusterName)
                .build();
        TransportClient esClient =new PreBuiltTransportClient(settings).addTransportAddresses(getTransportAddressArray(esServers));
        return esClient;
    }

    public static InetSocketTransportAddress[] getTransportAddressArray(String hostPortList) throws UnknownHostException {
        if(hostPortList!=null)
        {
            String[] hostPortArray=hostPortList.split(",");
            InetSocketTransportAddress[] taArray=new InetSocketTransportAddress[hostPortArray.length];
            for (int i=0;i<hostPortArray.length;i++)
            {
                String[] hpArray=hostPortArray[i].split(":");
                if (hpArray.length==2)
                {
                    taArray[i]=new InetSocketTransportAddress(InetAddress.getByName(hpArray[0]), Integer.parseInt(hpArray[1]));
                }
            }
            return taArray;
        }
        else
        {
            return new InetSocketTransportAddress[0];
        }
    }


//    public String getIndex() {
//        return index;
//    }
//
//    public long getTimeout() {
//        return timeout;
//    }
}
