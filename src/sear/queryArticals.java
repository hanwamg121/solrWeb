package sear;


//public List<Article> queryArticles(String keyword,SolrQueryPageInfo solrQueryPageInfo) {
//
//    List<Article> articleList = new ArrayList<>();
//
//    SolrQuery solrQuery = new SolrQuery();
//    solrQuery.set("q",keyword);
//    solrQuery.set("df","article_keywords");//df=>default field
//    solrQuery.setSort("id", SolrQuery.ORDER.asc);
//
//    solrQuery.setStart(solrQueryPageInfo.getPageIndex()*solrQueryPageInfo.getPageSize());
//    solrQuery.setRows(solrQueryPageInfo.getPageSize());
//
//    //开启高亮显示
//    solrQuery.setHighlight(true);
//    solrQuery.addHighlightField("article_title");
//    solrQuery.addHighlightField("article_content");
//    solrQuery.setHighlightSimplePre("<em>");
//    solrQuery.setHighlightSimplePost("</em>");
//
//    QueryResponse queryResponse = null;
//    try {
//        queryResponse = solrServer.query(solrQuery);
//    } catch (SolrServerException e) {
//        e.printStackTrace();
//    }
//    SolrDocumentList solrDocumentList = queryResponse.getResults();
//    int total = (int) solrDocumentList.getNumFound();
//    solrQueryPageInfo.setTotal(total);
//    Map<String, Map<String, List<String>>> mapMapHighlighting = queryResponse.getHighlighting();
//
//    for(SolrDocument solrDocument : solrDocumentList)
//    {
//        Article article = new Article();
//        String id = (String)solrDocument.get("id");
//        String article_title = (String)solrDocument.get("article_title");
//        String article_content = (String)solrDocument.get("article_content");
//        Long article_id = (Long)solrDocument.get("article_id");
//        article.setTitle(article_title);
//        article.setContent(article_content);
//        article.setAid(article_id.intValue());
//        Map<String, List<String>> map = mapMapHighlighting.get(id);//一个商品，一个json对象
//
//        for(Map.Entry<String, List<String>> entry : map.entrySet())
//        {
//            if(entry.getKey().equals("article_title"))
//            {
//                article.setTitle(entry.getValue().get(0));
//            }
//            if(entry.getKey().equals("article_content"))
//            {
//                article.setContent(entry.getValue().get(0));
//            }
//
//        }
//
//        articleList.add(article);
//
//    }
//
//    return articleList;
//}
