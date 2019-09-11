//package sear;
//
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.solr.client.solrj.SolrServerException;
//import org.apache.solr.common.SolrInputDocument;
//import org.junit.Test;
//
//
//
//
//public class solrJTest {
//	
//	     
//	  
//	/*
//    根据id（唯一约束）域来更新Document的内容，如果根据id值搜索不到id域则会执行添加操作，如果找到则更新。
//     */
//    public void addDocument() throws IOException, SolrServerException {
//        /*
//        步骤
//        1、创建	HttpSolrClient对象，通过它和Solr服务器建立连接。
//        2、	创建SolrInputDocument对象，然后通过它来添加域。
//        3、	通过HttpSolrClient对象将SolrInputDocument添加到索引库。
//        4、	提交。
//         */
//        final String solrUrl = "http://localhost:8983/solr/test_Core";
//        //创建solrClient同时指定超时时间，不指定走默认配置
//        HttpSolrClient solrServer= new HttpSolrClient.Builder("").build();
//                .withConnectionTimeout(10000)
//                .withSocketTimeout(60000)
//                .build();
//        // 2、 创建SolrInputDocument对象，然后通过它来添加域。
//        SolrInputDocument document = new SolrInputDocument();
//        // 第一个参数：域的名称，域的名称必须是在schema.xml中定义的
//        // 第二个参数：域的值
//        // 注意：id的域不能少
//        document.addField("id", "c0001");
//        document.addField("title_ik", "使用solrJ添加的文档");
//        document.addField("content_ik", "文档的内容");
//        document.addField("product_name", "商品名称");
//        // 3、 通过HttpSolrServer对象将SolrInputDocument添加到索引库。
//        solrServer.add(document);
//        // 4、 提交。
//        solrServer.commit();
//    }
//
//	
	
	
}
