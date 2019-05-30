package top.maybe123.pojo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author pdd
*/
public class BysjAuditing implements Serializable {

    private static final long serialVersionUID = 1558096984249L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

    /**
    * 审核分类（作者信息：1，文章信息：2，其他：3）
    * isNullAble:0,defaultVal:1
    */
    private Integer aud_classify;

    /**
    * 审核内容对象的Json格式
    * isNullAble:0
    */
    private String aud_content;

    /**
    * 审核结果(1:待审核，2：审核通过，3：审核不通过)
    * isNullAble:0,defaultVal:1
    */
    private Integer aud_result;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setAud_classify(Integer aud_classify){this.aud_classify = aud_classify;}

    public Integer getAud_classify(){return this.aud_classify;}

    public void setAud_content(String aud_content){this.aud_content = aud_content;}

    public String getAud_content(){return this.aud_content;}

    public void setAud_result(Integer aud_result){this.aud_result = aud_result;}

    public Integer getAud_result(){return this.aud_result;}
    @Override
    public String toString() {
        return "BysjAuditing{" +
                "Id='" + Id + '\'' +
                "aud_classify='" + aud_classify + '\'' +
                "aud_content='" + aud_content + '\'' +
                "aud_result='" + aud_result + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private BysjAuditing set;

        private ConditionBuilder where;

        public UpdateBuilder set(BysjAuditing set){
            this.set = set;
            return this;
        }

        public BysjAuditing getSet(){
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

    public static class QueryBuilder extends BysjAuditing{
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

        private List<Integer> aud_classifyList;

        public List<Integer> getAud_classifyList(){return this.aud_classifyList;}

        private Integer aud_classifySt;

        private Integer aud_classifyEd;

        public Integer getAud_classifySt(){return this.aud_classifySt;}

        public Integer getAud_classifyEd(){return this.aud_classifyEd;}

        private List<String> aud_contentList;

        public List<String> getAud_contentList(){return this.aud_contentList;}


        private List<String> fuzzyAud_content;

        public List<String> getFuzzyAud_content(){return this.fuzzyAud_content;}

        private List<String> rightFuzzyAud_content;

        public List<String> getRightFuzzyAud_content(){return this.rightFuzzyAud_content;}
        private List<Integer> aud_resultList;

        public List<Integer> getAud_resultList(){return this.aud_resultList;}

        private Integer aud_resultSt;

        private Integer aud_resultEd;

        public Integer getAud_resultSt(){return this.aud_resultSt;}

        public Integer getAud_resultEd(){return this.aud_resultEd;}

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

        public QueryBuilder aud_classifyBetWeen(Integer aud_classifySt,Integer aud_classifyEd){
            this.aud_classifySt = aud_classifySt;
            this.aud_classifyEd = aud_classifyEd;
            return this;
        }

        public QueryBuilder aud_classifyGreaterEqThan(Integer aud_classifySt){
            this.aud_classifySt = aud_classifySt;
            return this;
        }
        public QueryBuilder aud_classifyLessEqThan(Integer aud_classifyEd){
            this.aud_classifyEd = aud_classifyEd;
            return this;
        }


        public QueryBuilder aud_classify(Integer aud_classify){
            setAud_classify(aud_classify);
            return this;
        }

        public QueryBuilder aud_classifyList(Integer ... aud_classify){
            this.aud_classifyList = solveNullList(aud_classify);
            return this;
        }

        public QueryBuilder aud_classifyList(List<Integer> aud_classify){
            this.aud_classifyList = aud_classify;
            return this;
        }

        public QueryBuilder fetchAud_classify(){
            setFetchFields("fetchFields","aud_classify");
            return this;
        }

        public QueryBuilder excludeAud_classify(){
            setFetchFields("excludeFields","aud_classify");
            return this;
        }

        public QueryBuilder fuzzyAud_content (List<String> fuzzyAud_content){
            this.fuzzyAud_content = fuzzyAud_content;
            return this;
        }

        public QueryBuilder fuzzyAud_content (String ... fuzzyAud_content){
            this.fuzzyAud_content = solveNullList(fuzzyAud_content);
            return this;
        }

        public QueryBuilder rightFuzzyAud_content (List<String> rightFuzzyAud_content){
            this.rightFuzzyAud_content = rightFuzzyAud_content;
            return this;
        }

        public QueryBuilder rightFuzzyAud_content (String ... rightFuzzyAud_content){
            this.rightFuzzyAud_content = solveNullList(rightFuzzyAud_content);
            return this;
        }

        public QueryBuilder aud_content(String aud_content){
            setAud_content(aud_content);
            return this;
        }

        public QueryBuilder aud_contentList(String ... aud_content){
            this.aud_contentList = solveNullList(aud_content);
            return this;
        }

        public QueryBuilder aud_contentList(List<String> aud_content){
            this.aud_contentList = aud_content;
            return this;
        }

        public QueryBuilder fetchAud_content(){
            setFetchFields("fetchFields","aud_content");
            return this;
        }

        public QueryBuilder excludeAud_content(){
            setFetchFields("excludeFields","aud_content");
            return this;
        }

        public QueryBuilder aud_resultBetWeen(Integer aud_resultSt,Integer aud_resultEd){
            this.aud_resultSt = aud_resultSt;
            this.aud_resultEd = aud_resultEd;
            return this;
        }

        public QueryBuilder aud_resultGreaterEqThan(Integer aud_resultSt){
            this.aud_resultSt = aud_resultSt;
            return this;
        }
        public QueryBuilder aud_resultLessEqThan(Integer aud_resultEd){
            this.aud_resultEd = aud_resultEd;
            return this;
        }


        public QueryBuilder aud_result(Integer aud_result){
            setAud_result(aud_result);
            return this;
        }

        public QueryBuilder aud_resultList(Integer ... aud_result){
            this.aud_resultList = solveNullList(aud_result);
            return this;
        }

        public QueryBuilder aud_resultList(List<Integer> aud_result){
            this.aud_resultList = aud_result;
            return this;
        }

        public QueryBuilder fetchAud_result(){
            setFetchFields("fetchFields","aud_result");
            return this;
        }

        public QueryBuilder excludeAud_result(){
            setFetchFields("excludeFields","aud_result");
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

        public BysjAuditing build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<Integer> aud_classifyList;

        public List<Integer> getAud_classifyList(){return this.aud_classifyList;}

        private Integer aud_classifySt;

        private Integer aud_classifyEd;

        public Integer getAud_classifySt(){return this.aud_classifySt;}

        public Integer getAud_classifyEd(){return this.aud_classifyEd;}

        private List<String> aud_contentList;

        public List<String> getAud_contentList(){return this.aud_contentList;}


        private List<String> fuzzyAud_content;

        public List<String> getFuzzyAud_content(){return this.fuzzyAud_content;}

        private List<String> rightFuzzyAud_content;

        public List<String> getRightFuzzyAud_content(){return this.rightFuzzyAud_content;}
        private List<Integer> aud_resultList;

        public List<Integer> getAud_resultList(){return this.aud_resultList;}

        private Integer aud_resultSt;

        private Integer aud_resultEd;

        public Integer getAud_resultSt(){return this.aud_resultSt;}

        public Integer getAud_resultEd(){return this.aud_resultEd;}


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

        public ConditionBuilder aud_classifyBetWeen(Integer aud_classifySt,Integer aud_classifyEd){
            this.aud_classifySt = aud_classifySt;
            this.aud_classifyEd = aud_classifyEd;
            return this;
        }

        public ConditionBuilder aud_classifyGreaterEqThan(Integer aud_classifySt){
            this.aud_classifySt = aud_classifySt;
            return this;
        }
        public ConditionBuilder aud_classifyLessEqThan(Integer aud_classifyEd){
            this.aud_classifyEd = aud_classifyEd;
            return this;
        }


        public ConditionBuilder aud_classifyList(Integer ... aud_classify){
            this.aud_classifyList = solveNullList(aud_classify);
            return this;
        }

        public ConditionBuilder aud_classifyList(List<Integer> aud_classify){
            this.aud_classifyList = aud_classify;
            return this;
        }

        public ConditionBuilder fuzzyAud_content (List<String> fuzzyAud_content){
            this.fuzzyAud_content = fuzzyAud_content;
            return this;
        }

        public ConditionBuilder fuzzyAud_content (String ... fuzzyAud_content){
            this.fuzzyAud_content = solveNullList(fuzzyAud_content);
            return this;
        }

        public ConditionBuilder rightFuzzyAud_content (List<String> rightFuzzyAud_content){
            this.rightFuzzyAud_content = rightFuzzyAud_content;
            return this;
        }

        public ConditionBuilder rightFuzzyAud_content (String ... rightFuzzyAud_content){
            this.rightFuzzyAud_content = solveNullList(rightFuzzyAud_content);
            return this;
        }

        public ConditionBuilder aud_contentList(String ... aud_content){
            this.aud_contentList = solveNullList(aud_content);
            return this;
        }

        public ConditionBuilder aud_contentList(List<String> aud_content){
            this.aud_contentList = aud_content;
            return this;
        }

        public ConditionBuilder aud_resultBetWeen(Integer aud_resultSt,Integer aud_resultEd){
            this.aud_resultSt = aud_resultSt;
            this.aud_resultEd = aud_resultEd;
            return this;
        }

        public ConditionBuilder aud_resultGreaterEqThan(Integer aud_resultSt){
            this.aud_resultSt = aud_resultSt;
            return this;
        }
        public ConditionBuilder aud_resultLessEqThan(Integer aud_resultEd){
            this.aud_resultEd = aud_resultEd;
            return this;
        }


        public ConditionBuilder aud_resultList(Integer ... aud_result){
            this.aud_resultList = solveNullList(aud_result);
            return this;
        }

        public ConditionBuilder aud_resultList(List<Integer> aud_result){
            this.aud_resultList = aud_result;
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

        private BysjAuditing obj;

        public Builder(){
            this.obj = new BysjAuditing();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder aud_classify(Integer aud_classify){
            this.obj.setAud_classify(aud_classify);
            return this;
        }
        public Builder aud_content(String aud_content){
            this.obj.setAud_content(aud_content);
            return this;
        }
        public Builder aud_result(Integer aud_result){
            this.obj.setAud_result(aud_result);
            return this;
        }
        public BysjAuditing build(){return obj;}
    }

}
