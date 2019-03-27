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
public class BysjImgurl implements Serializable {

    private static final long serialVersionUID = 1553654938679L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String prosetitle;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String proseurl;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setProsetitle(String prosetitle){this.prosetitle = prosetitle;}

    public String getProsetitle(){return this.prosetitle;}

    public void setProseurl(String proseurl){this.proseurl = proseurl;}

    public String getProseurl(){return this.proseurl;}
    @Override
    public String toString() {
        return "BysjImgurl{" +
                "Id='" + Id + '\'' +
                "prosetitle='" + prosetitle + '\'' +
                "proseurl='" + proseurl + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private BysjImgurl set;

        private ConditionBuilder where;

        public UpdateBuilder set(BysjImgurl set){
            this.set = set;
            return this;
        }

        public BysjImgurl getSet(){
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

    public static class QueryBuilder extends BysjImgurl{
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

        private List<String> prosetitleList;

        public List<String> getProsetitleList(){return this.prosetitleList;}


        private List<String> fuzzyProsetitle;

        public List<String> getFuzzyProsetitle(){return this.fuzzyProsetitle;}

        private List<String> rightFuzzyProsetitle;

        public List<String> getRightFuzzyProsetitle(){return this.rightFuzzyProsetitle;}
        private List<String> proseurlList;

        public List<String> getProseurlList(){return this.proseurlList;}


        private List<String> fuzzyProseurl;

        public List<String> getFuzzyProseurl(){return this.fuzzyProseurl;}

        private List<String> rightFuzzyProseurl;

        public List<String> getRightFuzzyProseurl(){return this.rightFuzzyProseurl;}
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

        public QueryBuilder fuzzyProsetitle (List<String> fuzzyProsetitle){
            this.fuzzyProsetitle = fuzzyProsetitle;
            return this;
        }

        public QueryBuilder fuzzyProsetitle (String ... fuzzyProsetitle){
            this.fuzzyProsetitle = solveNullList(fuzzyProsetitle);
            return this;
        }

        public QueryBuilder rightFuzzyProsetitle (List<String> rightFuzzyProsetitle){
            this.rightFuzzyProsetitle = rightFuzzyProsetitle;
            return this;
        }

        public QueryBuilder rightFuzzyProsetitle (String ... rightFuzzyProsetitle){
            this.rightFuzzyProsetitle = solveNullList(rightFuzzyProsetitle);
            return this;
        }

        public QueryBuilder prosetitle(String prosetitle){
            setProsetitle(prosetitle);
            return this;
        }

        public QueryBuilder prosetitleList(String ... prosetitle){
            this.prosetitleList = solveNullList(prosetitle);
            return this;
        }

        public QueryBuilder prosetitleList(List<String> prosetitle){
            this.prosetitleList = prosetitle;
            return this;
        }

        public QueryBuilder fetchProsetitle(){
            setFetchFields("fetchFields","prosetitle");
            return this;
        }

        public QueryBuilder excludeProsetitle(){
            setFetchFields("excludeFields","prosetitle");
            return this;
        }

        public QueryBuilder fuzzyProseurl (List<String> fuzzyProseurl){
            this.fuzzyProseurl = fuzzyProseurl;
            return this;
        }

        public QueryBuilder fuzzyProseurl (String ... fuzzyProseurl){
            this.fuzzyProseurl = solveNullList(fuzzyProseurl);
            return this;
        }

        public QueryBuilder rightFuzzyProseurl (List<String> rightFuzzyProseurl){
            this.rightFuzzyProseurl = rightFuzzyProseurl;
            return this;
        }

        public QueryBuilder rightFuzzyProseurl (String ... rightFuzzyProseurl){
            this.rightFuzzyProseurl = solveNullList(rightFuzzyProseurl);
            return this;
        }

        public QueryBuilder proseurl(String proseurl){
            setProseurl(proseurl);
            return this;
        }

        public QueryBuilder proseurlList(String ... proseurl){
            this.proseurlList = solveNullList(proseurl);
            return this;
        }

        public QueryBuilder proseurlList(List<String> proseurl){
            this.proseurlList = proseurl;
            return this;
        }

        public QueryBuilder fetchProseurl(){
            setFetchFields("fetchFields","proseurl");
            return this;
        }

        public QueryBuilder excludeProseurl(){
            setFetchFields("excludeFields","proseurl");
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

        public BysjImgurl build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<String> prosetitleList;

        public List<String> getProsetitleList(){return this.prosetitleList;}


        private List<String> fuzzyProsetitle;

        public List<String> getFuzzyProsetitle(){return this.fuzzyProsetitle;}

        private List<String> rightFuzzyProsetitle;

        public List<String> getRightFuzzyProsetitle(){return this.rightFuzzyProsetitle;}
        private List<String> proseurlList;

        public List<String> getProseurlList(){return this.proseurlList;}


        private List<String> fuzzyProseurl;

        public List<String> getFuzzyProseurl(){return this.fuzzyProseurl;}

        private List<String> rightFuzzyProseurl;

        public List<String> getRightFuzzyProseurl(){return this.rightFuzzyProseurl;}

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

        public ConditionBuilder fuzzyProsetitle (List<String> fuzzyProsetitle){
            this.fuzzyProsetitle = fuzzyProsetitle;
            return this;
        }

        public ConditionBuilder fuzzyProsetitle (String ... fuzzyProsetitle){
            this.fuzzyProsetitle = solveNullList(fuzzyProsetitle);
            return this;
        }

        public ConditionBuilder rightFuzzyProsetitle (List<String> rightFuzzyProsetitle){
            this.rightFuzzyProsetitle = rightFuzzyProsetitle;
            return this;
        }

        public ConditionBuilder rightFuzzyProsetitle (String ... rightFuzzyProsetitle){
            this.rightFuzzyProsetitle = solveNullList(rightFuzzyProsetitle);
            return this;
        }

        public ConditionBuilder prosetitleList(String ... prosetitle){
            this.prosetitleList = solveNullList(prosetitle);
            return this;
        }

        public ConditionBuilder prosetitleList(List<String> prosetitle){
            this.prosetitleList = prosetitle;
            return this;
        }

        public ConditionBuilder fuzzyProseurl (List<String> fuzzyProseurl){
            this.fuzzyProseurl = fuzzyProseurl;
            return this;
        }

        public ConditionBuilder fuzzyProseurl (String ... fuzzyProseurl){
            this.fuzzyProseurl = solveNullList(fuzzyProseurl);
            return this;
        }

        public ConditionBuilder rightFuzzyProseurl (List<String> rightFuzzyProseurl){
            this.rightFuzzyProseurl = rightFuzzyProseurl;
            return this;
        }

        public ConditionBuilder rightFuzzyProseurl (String ... rightFuzzyProseurl){
            this.rightFuzzyProseurl = solveNullList(rightFuzzyProseurl);
            return this;
        }

        public ConditionBuilder proseurlList(String ... proseurl){
            this.proseurlList = solveNullList(proseurl);
            return this;
        }

        public ConditionBuilder proseurlList(List<String> proseurl){
            this.proseurlList = proseurl;
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

        private BysjImgurl obj;

        public Builder(){
            this.obj = new BysjImgurl();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder prosetitle(String prosetitle){
            this.obj.setProsetitle(prosetitle);
            return this;
        }
        public Builder proseurl(String proseurl){
            this.obj.setProseurl(proseurl);
            return this;
        }
        public BysjImgurl build(){return obj;}
    }

}
