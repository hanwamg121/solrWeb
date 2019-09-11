//package sear;
//
//import java.util.Map;
//
//import javax.print.attribute.standard.PagesPerMinute;
//
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
//import com.sun.xml.internal.ws.util.StringUtils;
//
//public class ProductsServiceImpl implements ProductService{
//	private HttpSolrClient client; 
//	public PagesPerMinute search(String keyword,String catalogName,String price_str,int psort,int pageNum) {
//		SolrQuery query = new SolrQuery();
//		if(StringUtils.isEmpty(keyword)){
//			query.set("q","*");
//		}else{
//			query.set("q",keyword);
//		}
//		
//		if(!StringUtils.isEmpty(catalogName)){
//			query.addFilterQuery("prod_catalog_name:"+catalogName);
//		}
//		//设置默认域
//		query.set("df","prod_name");
//		
//		//高度设置
//		query.setHighligth(true);
//		query.seyHighField("prod_name");
//		query.setHighlightSimplePre("<font color='red'>");
//		query.setHighlightSimplePost("</font>");
//		
//		QueryResponse queryResponse=client.query(query);
//		
//		//得到高亮数据
//		Map<String, Map<String, List<String>>> map=queryResponse.getHighligthing();
//		
//		List<Products> list = queryResponse.getBeans(ProductService.class);
//		
//		for(Product p : list){
//			Map<String, List<String>> map1 = Map.get(p.getPid()); 
//			List<String> map2 = map1.get("prod_pname");
//			if(map2 !=null){
//				p.setPname(map2.get(0));
//			}
//		}
//		
//		
//		PageUtils pages=new PagesUtils(0,12,pageNum);
//		return pages;
//		
//		
//		
//		return null;
//	}	
//}
