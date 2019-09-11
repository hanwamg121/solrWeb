//package sear;
//
//import javax.xml.ws.RequestWrapper;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.*;
//
//@Controller
//@RequestMapping("products")
//public class Controller {
//	@Controller
//	@RequestMapping("products")
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	@RequestMapping("query")
//    public void queryArticles(String keyword, Model model, SolrQueryPageInfo solrQueryPageInfo, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html;charset=utf-8");
//
//        ArticlePageInfo articlePageInfo = new ArticlePageInfo();
//        List<Article> articleList = articleService.queryArticles(keyword,solrQueryPageInfo);
//        articlePageInfo.setTotal(solrQueryPageInfo.getTotal());
//        articlePageInfo.setArticles(articleList);
//
//        String jsonString = JSON.toJSONString(articlePageInfo);
//        response.getWriter().println(jsonString);
//    }
//	 public int addArticle(Article article) {
//	        int result = articleMapper.addArticle(article);
//
//	        SolrInputDocument inputDocument = new SolrInputDocument();
//	        //向文档中添加域以及对应的值,注意：所有的域必须在schema.xml中定义过,前面已经给出过我定义的域。
//	        UUID uuid = UUID.randomUUID();
//	        inputDocument.addField("id", uuid);
//	        inputDocument.addField("article_title", article.getTitle());
//	        inputDocument.addField("article_content", article.getContent());
//	        inputDocument.addField("article_id", article.getAid());
//	        try {
//	            solrServer.add(inputDocument);
//	            solrServer.commit();
//	        } catch (SolrServerException e) {
//	            e.printStackTrace();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	        return result;
//	    }
}
