package top.maybe123.pojo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class BysjProse implements Serializable {

    private static final long serialVersionUID = 1553738310699L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

    /**
    * 文章题目
    * isNullAble:0,defaultVal:
    */
    private String prose_titl;

    /**
    * 发表时间
    * isNullAble:0,defaultVal:未知
    */
    private String prose_time;

    /**
    * 来源
    * isNullAble:0,defaultVal:未知
    */
    private String prose_from;

    /**
    * 作者
    * isNullAble:0,defaultVal:
    */
    private String prose_author;

    /**
    * 阅读次数
    * isNullAble:0,defaultVal:0
    */
    private Integer prose_times;

    /**
    * 文章内容
    * isNullAble:0
    */
    private String prose_content;

    /**
    * 分类
    * isNullAble:0,defaultVal:
    */
    private String prose_classify;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setProse_titl(String prose_titl){this.prose_titl = prose_titl;}

    public String getProse_titl(){return this.prose_titl;}

    public void setProse_time(String prose_time){this.prose_time = prose_time;}

    public String getProse_time(){return this.prose_time;}

    public void setProse_from(String prose_from){this.prose_from = prose_from;}

    public String getProse_from(){return this.prose_from;}

    public void setProse_author(String prose_author){this.prose_author = prose_author;}

    public String getProse_author(){return this.prose_author;}

    public void setProse_times(Integer prose_times){this.prose_times = prose_times;}

    public Integer getProse_times(){return this.prose_times;}

    public void setProse_content(String prose_content){this.prose_content = prose_content;}

    public String getProse_content(){return this.prose_content;}

    public void setProse_classify(String prose_classify){this.prose_classify = prose_classify;}

    public String getProse_classify(){return this.prose_classify;}
    @Override
    public String toString() {
        return "BysjProse{" +
                "Id='" + Id + '\'' +
                "prose_titl='" + prose_titl + '\'' +
                "prose_time='" + prose_time + '\'' +
                "prose_from='" + prose_from + '\'' +
                "prose_author='" + prose_author + '\'' +
                "prose_times='" + prose_times + '\'' +
                "prose_content='" + prose_content + '\'' +
                "prose_classify='" + prose_classify + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private BysjProse set;

        private ConditionBuilder where;

        public UpdateBuilder set(BysjProse set){
            this.set = set;
            return this;
        }

        public BysjProse getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends BysjProse{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<String> prose_titlList;

        public List<String> getProse_titlList(){return this.prose_titlList;}


        private List<String> fuzzyProse_titl;

        public List<String> getFuzzyProse_titl(){return this.fuzzyProse_titl;}

        private List<String> rightFuzzyProse_titl;

        public List<String> getRightFuzzyProse_titl(){return this.rightFuzzyProse_titl;}
        private List<String> prose_timeList;

        public List<String> getProse_timeList(){return this.prose_timeList;}


        private List<String> fuzzyProse_time;

        public List<String> getFuzzyProse_time(){return this.fuzzyProse_time;}

        private List<String> rightFuzzyProse_time;

        public List<String> getRightFuzzyProse_time(){return this.rightFuzzyProse_time;}
        private List<String> prose_fromList;

        public List<String> getProse_fromList(){return this.prose_fromList;}


        private List<String> fuzzyProse_from;

        public List<String> getFuzzyProse_from(){return this.fuzzyProse_from;}

        private List<String> rightFuzzyProse_from;

        public List<String> getRightFuzzyProse_from(){return this.rightFuzzyProse_from;}
        private List<String> prose_authorList;

        public List<String> getProse_authorList(){return this.prose_authorList;}


        private List<String> fuzzyProse_author;

        public List<String> getFuzzyProse_author(){return this.fuzzyProse_author;}

        private List<String> rightFuzzyProse_author;

        public List<String> getRightFuzzyProse_author(){return this.rightFuzzyProse_author;}
        private List<Integer> prose_timesList;

        public List<Integer> getProse_timesList(){return this.prose_timesList;}

        private Integer prose_timesSt;

        private Integer prose_timesEd;

        public Integer getProse_timesSt(){return this.prose_timesSt;}

        public Integer getProse_timesEd(){return this.prose_timesEd;}

        private List<String> prose_contentList;

        public List<String> getProse_contentList(){return this.prose_contentList;}


        private List<String> fuzzyProse_content;

        public List<String> getFuzzyProse_content(){return this.fuzzyProse_content;}

        private List<String> rightFuzzyProse_content;

        public List<String> getRightFuzzyProse_content(){return this.rightFuzzyProse_content;}
        private List<String> prose_classifyList;

        public List<String> getProse_classifyList(){return this.prose_classifyList;}


        private List<String> fuzzyProse_classify;

        public List<String> getFuzzyProse_classify(){return this.fuzzyProse_classify;}

        private List<String> rightFuzzyProse_classify;

        public List<String> getRightFuzzyProse_classify(){return this.rightFuzzyProse_classify;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder IdBetWeen(Integer IdSt,Integer IdEd){
            this.IdSt = IdSt;
            this.IdEd = IdEd;
            return this;
        }

        public QueryBuilder IdGreaterEqThan(Integer IdSt){
            this.IdSt = IdSt;
            return this;
        }
        public QueryBuilder IdLessEqThan(Integer IdEd){
            this.IdEd = IdEd;
            return this;
        }


        public QueryBuilder Id(Integer Id){
            setId(Id);
            return this;
        }

        public QueryBuilder IdList(Integer ... Id){
            this.IdList = solveNullList(Id);
            return this;
        }

        public QueryBuilder IdList(List<Integer> Id){
            this.IdList = Id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","Id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","Id");
            return this;
        }

        public QueryBuilder fuzzyProse_titl (List<String> fuzzyProse_titl){
            this.fuzzyProse_titl = fuzzyProse_titl;
            return this;
        }

        public QueryBuilder fuzzyProse_titl (String ... fuzzyProse_titl){
            this.fuzzyProse_titl = solveNullList(fuzzyProse_titl);
            return this;
        }

        public QueryBuilder rightFuzzyProse_titl (List<String> rightFuzzyProse_titl){
            this.rightFuzzyProse_titl = rightFuzzyProse_titl;
            return this;
        }

        public QueryBuilder rightFuzzyProse_titl (String ... rightFuzzyProse_titl){
            this.rightFuzzyProse_titl = solveNullList(rightFuzzyProse_titl);
            return this;
        }

        public QueryBuilder prose_titl(String prose_titl){
            setProse_titl(prose_titl);
            return this;
        }

        public QueryBuilder prose_titlList(String ... prose_titl){
            this.prose_titlList = solveNullList(prose_titl);
            return this;
        }

        public QueryBuilder prose_titlList(List<String> prose_titl){
            this.prose_titlList = prose_titl;
            return this;
        }

        public QueryBuilder fetchProse_titl(){
            setFetchFields("fetchFields","prose_titl");
            return this;
        }

        public QueryBuilder excludeProse_titl(){
            setFetchFields("excludeFields","prose_titl");
            return this;
        }

        public QueryBuilder fuzzyProse_time (List<String> fuzzyProse_time){
            this.fuzzyProse_time = fuzzyProse_time;
            return this;
        }

        public QueryBuilder fuzzyProse_time (String ... fuzzyProse_time){
            this.fuzzyProse_time = solveNullList(fuzzyProse_time);
            return this;
        }

        public QueryBuilder rightFuzzyProse_time (List<String> rightFuzzyProse_time){
            this.rightFuzzyProse_time = rightFuzzyProse_time;
            return this;
        }

        public QueryBuilder rightFuzzyProse_time (String ... rightFuzzyProse_time){
            this.rightFuzzyProse_time = solveNullList(rightFuzzyProse_time);
            return this;
        }

        public QueryBuilder prose_time(String prose_time){
            setProse_time(prose_time);
            return this;
        }

        public QueryBuilder prose_timeList(String ... prose_time){
            this.prose_timeList = solveNullList(prose_time);
            return this;
        }

        public QueryBuilder prose_timeList(List<String> prose_time){
            this.prose_timeList = prose_time;
            return this;
        }

        public QueryBuilder fetchProse_time(){
            setFetchFields("fetchFields","prose_time");
            return this;
        }

        public QueryBuilder excludeProse_time(){
            setFetchFields("excludeFields","prose_time");
            return this;
        }

        public QueryBuilder fuzzyProse_from (List<String> fuzzyProse_from){
            this.fuzzyProse_from = fuzzyProse_from;
            return this;
        }

        public QueryBuilder fuzzyProse_from (String ... fuzzyProse_from){
            this.fuzzyProse_from = solveNullList(fuzzyProse_from);
            return this;
        }

        public QueryBuilder rightFuzzyProse_from (List<String> rightFuzzyProse_from){
            this.rightFuzzyProse_from = rightFuzzyProse_from;
            return this;
        }

        public QueryBuilder rightFuzzyProse_from (String ... rightFuzzyProse_from){
            this.rightFuzzyProse_from = solveNullList(rightFuzzyProse_from);
            return this;
        }

        public QueryBuilder prose_from(String prose_from){
            setProse_from(prose_from);
            return this;
        }

        public QueryBuilder prose_fromList(String ... prose_from){
            this.prose_fromList = solveNullList(prose_from);
            return this;
        }

        public QueryBuilder prose_fromList(List<String> prose_from){
            this.prose_fromList = prose_from;
            return this;
        }

        public QueryBuilder fetchProse_from(){
            setFetchFields("fetchFields","prose_from");
            return this;
        }

        public QueryBuilder excludeProse_from(){
            setFetchFields("excludeFields","prose_from");
            return this;
        }

        public QueryBuilder fuzzyProse_author (List<String> fuzzyProse_author){
            this.fuzzyProse_author = fuzzyProse_author;
            return this;
        }

        public QueryBuilder fuzzyProse_author (String ... fuzzyProse_author){
            this.fuzzyProse_author = solveNullList(fuzzyProse_author);
            return this;
        }

        public QueryBuilder rightFuzzyProse_author (List<String> rightFuzzyProse_author){
            this.rightFuzzyProse_author = rightFuzzyProse_author;
            return this;
        }

        public QueryBuilder rightFuzzyProse_author (String ... rightFuzzyProse_author){
            this.rightFuzzyProse_author = solveNullList(rightFuzzyProse_author);
            return this;
        }

        public QueryBuilder prose_author(String prose_author){
            setProse_author(prose_author);
            return this;
        }

        public QueryBuilder prose_authorList(String ... prose_author){
            this.prose_authorList = solveNullList(prose_author);
            return this;
        }

        public QueryBuilder prose_authorList(List<String> prose_author){
            this.prose_authorList = prose_author;
            return this;
        }

        public QueryBuilder fetchProse_author(){
            setFetchFields("fetchFields","prose_author");
            return this;
        }

        public QueryBuilder excludeProse_author(){
            setFetchFields("excludeFields","prose_author");
            return this;
        }

        public QueryBuilder prose_timesBetWeen(Integer prose_timesSt,Integer prose_timesEd){
            this.prose_timesSt = prose_timesSt;
            this.prose_timesEd = prose_timesEd;
            return this;
        }

        public QueryBuilder prose_timesGreaterEqThan(Integer prose_timesSt){
            this.prose_timesSt = prose_timesSt;
            return this;
        }
        public QueryBuilder prose_timesLessEqThan(Integer prose_timesEd){
            this.prose_timesEd = prose_timesEd;
            return this;
        }


        public QueryBuilder prose_times(Integer prose_times){
            setProse_times(prose_times);
            return this;
        }

        public QueryBuilder prose_timesList(Integer ... prose_times){
            this.prose_timesList = solveNullList(prose_times);
            return this;
        }

        public QueryBuilder prose_timesList(List<Integer> prose_times){
            this.prose_timesList = prose_times;
            return this;
        }

        public QueryBuilder fetchProse_times(){
            setFetchFields("fetchFields","prose_times");
            return this;
        }

        public QueryBuilder excludeProse_times(){
            setFetchFields("excludeFields","prose_times");
            return this;
        }

        public QueryBuilder fuzzyProse_content (List<String> fuzzyProse_content){
            this.fuzzyProse_content = fuzzyProse_content;
            return this;
        }

        public QueryBuilder fuzzyProse_content (String ... fuzzyProse_content){
            this.fuzzyProse_content = solveNullList(fuzzyProse_content);
            return this;
        }

        public QueryBuilder rightFuzzyProse_content (List<String> rightFuzzyProse_content){
            this.rightFuzzyProse_content = rightFuzzyProse_content;
            return this;
        }

        public QueryBuilder rightFuzzyProse_content (String ... rightFuzzyProse_content){
            this.rightFuzzyProse_content = solveNullList(rightFuzzyProse_content);
            return this;
        }

        public QueryBuilder prose_content(String prose_content){
            setProse_content(prose_content);
            return this;
        }

        public QueryBuilder prose_contentList(String ... prose_content){
            this.prose_contentList = solveNullList(prose_content);
            return this;
        }

        public QueryBuilder prose_contentList(List<String> prose_content){
            this.prose_contentList = prose_content;
            return this;
        }

        public QueryBuilder fetchProse_content(){
            setFetchFields("fetchFields","prose_content");
            return this;
        }

        public QueryBuilder excludeProse_content(){
            setFetchFields("excludeFields","prose_content");
            return this;
        }

        public QueryBuilder fuzzyProse_classify (List<String> fuzzyProse_classify){
            this.fuzzyProse_classify = fuzzyProse_classify;
            return this;
        }

        public QueryBuilder fuzzyProse_classify (String ... fuzzyProse_classify){
            this.fuzzyProse_classify = solveNullList(fuzzyProse_classify);
            return this;
        }

        public QueryBuilder rightFuzzyProse_classify (List<String> rightFuzzyProse_classify){
            this.rightFuzzyProse_classify = rightFuzzyProse_classify;
            return this;
        }

        public QueryBuilder rightFuzzyProse_classify (String ... rightFuzzyProse_classify){
            this.rightFuzzyProse_classify = solveNullList(rightFuzzyProse_classify);
            return this;
        }

        public QueryBuilder prose_classify(String prose_classify){
            setProse_classify(prose_classify);
            return this;
        }

        public QueryBuilder prose_classifyList(String ... prose_classify){
            this.prose_classifyList = solveNullList(prose_classify);
            return this;
        }

        public QueryBuilder prose_classifyList(List<String> prose_classify){
            this.prose_classifyList = prose_classify;
            return this;
        }

        public QueryBuilder fetchProse_classify(){
            setFetchFields("fetchFields","prose_classify");
            return this;
        }

        public QueryBuilder excludeProse_classify(){
            setFetchFields("excludeFields","prose_classify");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public BysjProse build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<String> prose_titlList;

        public List<String> getProse_titlList(){return this.prose_titlList;}


        private List<String> fuzzyProse_titl;

        public List<String> getFuzzyProse_titl(){return this.fuzzyProse_titl;}

        private List<String> rightFuzzyProse_titl;

        public List<String> getRightFuzzyProse_titl(){return this.rightFuzzyProse_titl;}
        private List<String> prose_timeList;

        public List<String> getProse_timeList(){return this.prose_timeList;}


        private List<String> fuzzyProse_time;

        public List<String> getFuzzyProse_time(){return this.fuzzyProse_time;}

        private List<String> rightFuzzyProse_time;

        public List<String> getRightFuzzyProse_time(){return this.rightFuzzyProse_time;}
        private List<String> prose_fromList;

        public List<String> getProse_fromList(){return this.prose_fromList;}


        private List<String> fuzzyProse_from;

        public List<String> getFuzzyProse_from(){return this.fuzzyProse_from;}

        private List<String> rightFuzzyProse_from;

        public List<String> getRightFuzzyProse_from(){return this.rightFuzzyProse_from;}
        private List<String> prose_authorList;

        public List<String> getProse_authorList(){return this.prose_authorList;}


        private List<String> fuzzyProse_author;

        public List<String> getFuzzyProse_author(){return this.fuzzyProse_author;}

        private List<String> rightFuzzyProse_author;

        public List<String> getRightFuzzyProse_author(){return this.rightFuzzyProse_author;}
        private List<Integer> prose_timesList;

        public List<Integer> getProse_timesList(){return this.prose_timesList;}

        private Integer prose_timesSt;

        private Integer prose_timesEd;

        public Integer getProse_timesSt(){return this.prose_timesSt;}

        public Integer getProse_timesEd(){return this.prose_timesEd;}

        private List<String> prose_contentList;

        public List<String> getProse_contentList(){return this.prose_contentList;}


        private List<String> fuzzyProse_content;

        public List<String> getFuzzyProse_content(){return this.fuzzyProse_content;}

        private List<String> rightFuzzyProse_content;

        public List<String> getRightFuzzyProse_content(){return this.rightFuzzyProse_content;}
        private List<String> prose_classifyList;

        public List<String> getProse_classifyList(){return this.prose_classifyList;}


        private List<String> fuzzyProse_classify;

        public List<String> getFuzzyProse_classify(){return this.fuzzyProse_classify;}

        private List<String> rightFuzzyProse_classify;

        public List<String> getRightFuzzyProse_classify(){return this.rightFuzzyProse_classify;}

        public ConditionBuilder IdBetWeen(Integer IdSt,Integer IdEd){
            this.IdSt = IdSt;
            this.IdEd = IdEd;
            return this;
        }

        public ConditionBuilder IdGreaterEqThan(Integer IdSt){
            this.IdSt = IdSt;
            return this;
        }
        public ConditionBuilder IdLessEqThan(Integer IdEd){
            this.IdEd = IdEd;
            return this;
        }


        public ConditionBuilder IdList(Integer ... Id){
            this.IdList = solveNullList(Id);
            return this;
        }

        public ConditionBuilder IdList(List<Integer> Id){
            this.IdList = Id;
            return this;
        }

        public ConditionBuilder fuzzyProse_titl (List<String> fuzzyProse_titl){
            this.fuzzyProse_titl = fuzzyProse_titl;
            return this;
        }

        public ConditionBuilder fuzzyProse_titl (String ... fuzzyProse_titl){
            this.fuzzyProse_titl = solveNullList(fuzzyProse_titl);
            return this;
        }

        public ConditionBuilder rightFuzzyProse_titl (List<String> rightFuzzyProse_titl){
            this.rightFuzzyProse_titl = rightFuzzyProse_titl;
            return this;
        }

        public ConditionBuilder rightFuzzyProse_titl (String ... rightFuzzyProse_titl){
            this.rightFuzzyProse_titl = solveNullList(rightFuzzyProse_titl);
            return this;
        }

        public ConditionBuilder prose_titlList(String ... prose_titl){
            this.prose_titlList = solveNullList(prose_titl);
            return this;
        }

        public ConditionBuilder prose_titlList(List<String> prose_titl){
            this.prose_titlList = prose_titl;
            return this;
        }

        public ConditionBuilder fuzzyProse_time (List<String> fuzzyProse_time){
            this.fuzzyProse_time = fuzzyProse_time;
            return this;
        }

        public ConditionBuilder fuzzyProse_time (String ... fuzzyProse_time){
            this.fuzzyProse_time = solveNullList(fuzzyProse_time);
            return this;
        }

        public ConditionBuilder rightFuzzyProse_time (List<String> rightFuzzyProse_time){
            this.rightFuzzyProse_time = rightFuzzyProse_time;
            return this;
        }

        public ConditionBuilder rightFuzzyProse_time (String ... rightFuzzyProse_time){
            this.rightFuzzyProse_time = solveNullList(rightFuzzyProse_time);
            return this;
        }

        public ConditionBuilder prose_timeList(String ... prose_time){
            this.prose_timeList = solveNullList(prose_time);
            return this;
        }

        public ConditionBuilder prose_timeList(List<String> prose_time){
            this.prose_timeList = prose_time;
            return this;
        }

        public ConditionBuilder fuzzyProse_from (List<String> fuzzyProse_from){
            this.fuzzyProse_from = fuzzyProse_from;
            return this;
        }

        public ConditionBuilder fuzzyProse_from (String ... fuzzyProse_from){
            this.fuzzyProse_from = solveNullList(fuzzyProse_from);
            return this;
        }

        public ConditionBuilder rightFuzzyProse_from (List<String> rightFuzzyProse_from){
            this.rightFuzzyProse_from = rightFuzzyProse_from;
            return this;
        }

        public ConditionBuilder rightFuzzyProse_from (String ... rightFuzzyProse_from){
            this.rightFuzzyProse_from = solveNullList(rightFuzzyProse_from);
            return this;
        }

        public ConditionBuilder prose_fromList(String ... prose_from){
            this.prose_fromList = solveNullList(prose_from);
            return this;
        }

        public ConditionBuilder prose_fromList(List<String> prose_from){
            this.prose_fromList = prose_from;
            return this;
        }

        public ConditionBuilder fuzzyProse_author (List<String> fuzzyProse_author){
            this.fuzzyProse_author = fuzzyProse_author;
            return this;
        }

        public ConditionBuilder fuzzyProse_author (String ... fuzzyProse_author){
            this.fuzzyProse_author = solveNullList(fuzzyProse_author);
            return this;
        }

        public ConditionBuilder rightFuzzyProse_author (List<String> rightFuzzyProse_author){
            this.rightFuzzyProse_author = rightFuzzyProse_author;
            return this;
        }

        public ConditionBuilder rightFuzzyProse_author (String ... rightFuzzyProse_author){
            this.rightFuzzyProse_author = solveNullList(rightFuzzyProse_author);
            return this;
        }

        public ConditionBuilder prose_authorList(String ... prose_author){
            this.prose_authorList = solveNullList(prose_author);
            return this;
        }

        public ConditionBuilder prose_authorList(List<String> prose_author){
            this.prose_authorList = prose_author;
            return this;
        }

        public ConditionBuilder prose_timesBetWeen(Integer prose_timesSt,Integer prose_timesEd){
            this.prose_timesSt = prose_timesSt;
            this.prose_timesEd = prose_timesEd;
            return this;
        }

        public ConditionBuilder prose_timesGreaterEqThan(Integer prose_timesSt){
            this.prose_timesSt = prose_timesSt;
            return this;
        }
        public ConditionBuilder prose_timesLessEqThan(Integer prose_timesEd){
            this.prose_timesEd = prose_timesEd;
            return this;
        }


        public ConditionBuilder prose_timesList(Integer ... prose_times){
            this.prose_timesList = solveNullList(prose_times);
            return this;
        }

        public ConditionBuilder prose_timesList(List<Integer> prose_times){
            this.prose_timesList = prose_times;
            return this;
        }

        public ConditionBuilder fuzzyProse_content (List<String> fuzzyProse_content){
            this.fuzzyProse_content = fuzzyProse_content;
            return this;
        }

        public ConditionBuilder fuzzyProse_content (String ... fuzzyProse_content){
            this.fuzzyProse_content = solveNullList(fuzzyProse_content);
            return this;
        }

        public ConditionBuilder rightFuzzyProse_content (List<String> rightFuzzyProse_content){
            this.rightFuzzyProse_content = rightFuzzyProse_content;
            return this;
        }

        public ConditionBuilder rightFuzzyProse_content (String ... rightFuzzyProse_content){
            this.rightFuzzyProse_content = solveNullList(rightFuzzyProse_content);
            return this;
        }

        public ConditionBuilder prose_contentList(String ... prose_content){
            this.prose_contentList = solveNullList(prose_content);
            return this;
        }

        public ConditionBuilder prose_contentList(List<String> prose_content){
            this.prose_contentList = prose_content;
            return this;
        }

        public ConditionBuilder fuzzyProse_classify (List<String> fuzzyProse_classify){
            this.fuzzyProse_classify = fuzzyProse_classify;
            return this;
        }

        public ConditionBuilder fuzzyProse_classify (String ... fuzzyProse_classify){
            this.fuzzyProse_classify = solveNullList(fuzzyProse_classify);
            return this;
        }

        public ConditionBuilder rightFuzzyProse_classify (List<String> rightFuzzyProse_classify){
            this.rightFuzzyProse_classify = rightFuzzyProse_classify;
            return this;
        }

        public ConditionBuilder rightFuzzyProse_classify (String ... rightFuzzyProse_classify){
            this.rightFuzzyProse_classify = solveNullList(rightFuzzyProse_classify);
            return this;
        }

        public ConditionBuilder prose_classifyList(String ... prose_classify){
            this.prose_classifyList = solveNullList(prose_classify);
            return this;
        }

        public ConditionBuilder prose_classifyList(List<String> prose_classify){
            this.prose_classifyList = prose_classify;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private BysjProse obj;

        public Builder(){
            this.obj = new BysjProse();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder prose_titl(String prose_titl){
            this.obj.setProse_titl(prose_titl);
            return this;
        }
        public Builder prose_time(String prose_time){
            this.obj.setProse_time(prose_time);
            return this;
        }
        public Builder prose_from(String prose_from){
            this.obj.setProse_from(prose_from);
            return this;
        }
        public Builder prose_author(String prose_author){
            this.obj.setProse_author(prose_author);
            return this;
        }
        public Builder prose_times(Integer prose_times){
            this.obj.setProse_times(prose_times);
            return this;
        }
        public Builder prose_content(String prose_content){
            this.obj.setProse_content(prose_content);
            return this;
        }
        public Builder prose_classify(String prose_classify){
            this.obj.setProse_classify(prose_classify);
            return this;
        }
        public BysjProse build(){return obj;}
    }

}
