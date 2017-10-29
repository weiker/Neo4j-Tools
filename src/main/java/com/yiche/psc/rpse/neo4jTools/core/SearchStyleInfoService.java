package com.yiche.psc.rpse.neo4jTools.core;

import com.google.common.base.Preconditions;
import com.yiche.psc.rpse.neo4jTools.common.ModelInfoHandler;
import com.yiche.psc.rpse.neo4jTools.common.domain.ES.StyleInfo;
import com.yiche.psc.rpse.neo4jTools.config.EsConfig;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHits;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("SearchStyleInfoService")
public class SearchStyleInfoService{

    private static final Logger logger = LoggerFactory.getLogger(SearchStyleInfoService.class);

    @Autowired
    private TransportClient esClient;

    @Value("${es.showcar.index}")
    private String esShowCarIndex="car_info_show";

    @Value("${es.car.type.style}")
    private String style="style";

    @Value("${es.search.timeout}")
    private long esSearchTimeout=10000;

    @Value("${es.location.type.showstyle}")
    private String showStyle="style";

    public void closeESClient(){
        if(esClient!=null){
            esClient.close();
        }
    }

    private SearchHits getESResult(String logid,BoolQueryBuilder boolQueryBuilder) {
        SearchHits hits = null;
        EsConfig esConfig=new EsConfig();
        try {
            esClient=esConfig.getEsClient();
            SearchResponse scrollResp = esClient
                    .prepareSearch(esShowCarIndex)
                    .setTypes(style)
                    .setQuery(boolQueryBuilder)
//                    .addSort(ES_SORT_FIELD, SortOrder.DESC)
                    .setScroll(new TimeValue(60000))
                    .setTimeout(new TimeValue(esSearchTimeout))
                    .setSize(100)
                    .get();

//            scrollResp = esClient.prepareSearchScroll(scrollResp.getScrollId()).setScroll(new TimeValue(60000)).execute().actionGet();
            hits = scrollResp.getHits();
        } catch (Exception e) {
            logger.error(String.format("LogID:%s, SearchStyleInfo Failed! Error Message:",logid), e);
        }
        return hits;
    }

    public Map<String,Object> getStyleInfoMap(String logid,int styleID) {
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        boolQueryBuilder.must().add(QueryBuilders.termQuery("id",styleID));
        SearchHits hits=getESResult(logid,boolQueryBuilder);
        Map<String,Object> map=hits.getAt(0).getSourceAsMap();
        return map;

    }

    public StyleInfo getStyleInfo(String logid,int styleID) {
        Map<String,Object> map=getStyleInfoMap(logid,styleID);
        return transferStyleInfo(logid,map);

    }

    public StyleInfo getCarInfo(String logid, HashMap<String,String> conditionMap,int must) {
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        for(Map.Entry<String,String> entry:conditionMap.entrySet()){
            switch(must){
                case 1:boolQueryBuilder.must().add(QueryBuilders.termQuery(entry.getKey(),entry.getValue()));break;
                case 0:boolQueryBuilder.should().add(QueryBuilders.matchQuery(entry.getKey(),entry.getValue()));break;
                case -1:boolQueryBuilder.mustNot().add(QueryBuilders.termQuery(entry.getKey(),entry.getValue()));break;
                default:boolQueryBuilder.should().add(QueryBuilders.matchQuery(entry.getKey(),entry.getValue()));break;
            }
        }

        SearchHits hits=getESResult(logid,boolQueryBuilder);
        if(hits.getHits().length<1){
            return null;
        }
        Map<String,Object> map=hits.getAt(0).getSourceAsMap();
        return transferStyleInfo(logid,map);

    }

    public StyleInfo transferStyleInfo(String logid,Map<String,Object> map){
        StyleInfo styleInfo=new StyleInfo();
        try{
            Preconditions.checkArgument(map.get("id")!=null,"StyleID is null !");
            styleInfo.setId((int)map.get("id"));
            styleInfo.setName((List<String>) map.get("name"));
            styleInfo.setStyle_common_name((String)map.get("style_common_name"));
            styleInfo.setModel_id((int)map.get("model_id"));
            styleInfo.setModel_name((List<String>) map.get("model_name"));
            styleInfo.setModel_common_name((String)map.get("model_common_name"));
            styleInfo.setMake_id((Integer) map.get("make_id"));
            styleInfo.setMake_name((List<String>) map.get("make_name"));
            styleInfo.setMake_common_name((String) map.get("make_common_name"));
            styleInfo.setBrand_id((Integer) map.get("brand_id"));
            styleInfo.setBrand_name((List<String>) map.get("brand_name"));
            styleInfo.setBrand_common_name((String) map.get("brand_common_name"));
            styleInfo.setLevel((List<String>) map.get("level"));
            styleInfo.setUse((List<String>) map.get("use"));
            styleInfo.setAdvantage((String)map.get("advantage"));
            styleInfo.setDefect((String)map.get("defect"));
            styleInfo.setWarranty((String)map.get("warranty"));
            styleInfo.setCountry_class((List<String>) map.get("country_class"));
            styleInfo.setCountry((List<String>) map.get("country"));
            styleInfo.setYear((List<String>) map.get("year"));
            styleInfo.setUrl((String)map.get("url"));
            styleInfo.setScore((Double) map.get("score"));
            styleInfo.setKb_advantage((String)map.get("kb_advantage"));
            styleInfo.setKb_defect((String)map.get("kb_defect"));
            styleInfo.setPv((Integer) map.get("pv"));
            styleInfo.setUv((Integer) map.get("uv"));
            styleInfo.setSale_status((String)map.get("sale_status"));
            styleInfo.setPicture_url((String)map.get("picture_url"));
            styleInfo.setTop((Integer) map.get("top"));
            styleInfo.setTop_rate((Double) map.get("top_rate"));
            styleInfo.setStyle_count((Integer) map.get("style_count"));
            styleInfo.setKoubei_count((Integer) map.get("koubei_count"));

            Map<String,Object> bodyMap= (Map<String, Object>) map.get("body");
            StyleInfo.Body body=styleInfo.new Body();
            body.setColor((List<String>) bodyMap.get("color"));
            body.setForm((List<String>) bodyMap.get("form"));
            body.setDescription((List<String>) bodyMap.get("description"));
            body.setScore((Double) bodyMap.get("score"));
            body.setEvaluation((String) bodyMap.get("evaluation"));
            body.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setBody(body);

            Map<String,Object> insideMap= (Map<String, Object>) map.get("inside");
            StyleInfo.Inside inside=styleInfo.new Inside();
            inside.setColor((String) insideMap.get("color"));
            inside.setDescription((List<String>) insideMap.get("description"));
            inside.setScore((Double) insideMap.get("score"));
            inside.setEvaluation((String) insideMap.get("evaluation"));
            inside.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setInside(inside);

            Map<String,Object> powerMap= (Map<String, Object>) map.get("power");
            StyleInfo.Power power=styleInfo.new Power();
            power.setType((String) powerMap.get("type"));
            power.setTransfer((List<String>) powerMap.get("transfer"));
            power.setDescription((List<String>) powerMap.get("description"));
            power.setScore((Double) powerMap.get("score"));
            power.setEvaluation((String) powerMap.get("evaluation"));
            power.setDisplacement((Double) powerMap.get("displacement"));
            power.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setPower(power);

            Map<String,Object> oilMap= (Map<String, Object>) map.get("oil");
            StyleInfo.Oil oil=styleInfo.new Oil();
            oil.set_100km((String) oilMap.get("100km"));
            oil.setDescription((List<String>) oilMap.get("description"));
            oil.setScore((Double) oilMap.get("score"));
            oil.setEvaluation((String) oilMap.get("evaluation"));
            oil.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setOil(oil);

            Map<String,Object> maintainMap= (Map<String, Object>) map.get("maintain");
            StyleInfo.Maintain maintain=styleInfo.new Maintain();
            maintain.setDescription((List<String>) maintainMap.get("description"));
            maintain.setScore((Double) maintainMap.get("score"));
            maintain.setEvaluation((String) maintainMap.get("evaluation"));
            styleInfo.setMaintain(maintain);

            Map<String,Object> viewMap= (Map<String, Object>) map.get("view");
            StyleInfo.View view=styleInfo.new View();
            view.setDescription((List<String>) viewMap.get("description"));
            view.setScore((Double) viewMap.get("score"));
            view.setEvaluation((String) viewMap.get("evaluation"));
            styleInfo.setView(view);

            Map<String,Object> spaceMap= (Map<String, Object>) map.get("space");
            StyleInfo.Space space=styleInfo.new Space();
            space.setDescription((List<String>) spaceMap.get("description"));
            space.setScore((Double) spaceMap.get("score"));
            space.setEvaluation((String) spaceMap.get("evaluation"));
            space.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setSpace(space);

            Map<String,Object> priceMap= (Map<String, Object>) map.get("price");
            StyleInfo.Price price=styleInfo.new Price();
            price.setDescription((List<String>) priceMap.get("description"));
            price.setScore((Double) priceMap.get("score"));
            price.setEvaluation((String) priceMap.get("evaluation"));
            price.setMeasure((Double) priceMap.get("measure"));
            price.setLow((Double) priceMap.get("low"));
            price.setHigh((Double) priceMap.get("high"));
            price.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setPrice(price);

            Map<String,Object> configureMap= (Map<String, Object>) map.get("configure");
            StyleInfo.Configure configure=styleInfo.new Configure();
            configure.setDescription((List<String>) configureMap.get("description"));
            configure.setScore((Double) configureMap.get("score"));
            configure.setEvaluation((String) configureMap.get("evaluation"));
            styleInfo.setConfigure(configure);

            Map<String,Object> operationMap= (Map<String, Object>) map.get("operation");
            StyleInfo.Operation operation=styleInfo.new Operation();
            operation.setDescription((List<String>) operationMap.get("description"));
            operation.setScore((Double) operationMap.get("score"));
            operation.setEvaluation((String) operationMap.get("evaluation"));
            operation.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setOperation(operation);

            Map<String,Object> comfortableMap= (Map<String, Object>) map.get("comfortable");
            StyleInfo.Comfortable comfortable=styleInfo.new Comfortable();
            comfortable.setDescription((List<String>) comfortableMap.get("description"));
            comfortable.setScore((Double) comfortableMap.get("score"));
            comfortable.setEvaluation((String) comfortableMap.get("evaluation"));
            comfortable.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setComfortable(comfortable);

            Map<String,Object> otherMap= (Map<String, Object>) map.get("other");
            StyleInfo.Other other=styleInfo.new Other();
            other.setDescription((List<String>) otherMap.get("description"));
            other.setScore((Double) otherMap.get("score"));
            other.setEvaluation((String) otherMap.get("evaluation"));
            other.setZhiJia_description((String) bodyMap.get("zhiJia_description"));
            styleInfo.setOther(other);

        }catch (Exception e){
            logger.error(String.format("Logid:%s . Error Message:",logid),e);
        }
        return styleInfo;
    }

    public static void main(String[] args) {
        SearchStyleInfoService searchStyleInfoService=new SearchStyleInfoService();
        StyleInfo styleInfo=searchStyleInfoService.getStyleInfo("test",118219);
        searchStyleInfoService.closeESClient();
    }
}
