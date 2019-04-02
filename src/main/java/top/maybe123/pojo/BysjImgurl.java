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

    private static final long serialVersionUID = 1554112769769L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

    /**
    * 作品图片url
    * isNullAble:0,defaultVal:
    */
    private String proseurl;

    /**
    * 图片json数据
    * isNullAble:0
    */
    private String imgjson;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setProseurl(String proseurl){this.proseurl = proseurl;}

    public String getProseurl(){return this.proseurl;}

    public void setImgjson(String imgjson){this.imgjson = imgjson;}

    public String getImgjson(){return this.imgjson;}
    @Override
    public String toString() {
        return "BysjImgurl{" +
                "Id='" + Id + '\'' +
                "proseurl='" + proseurl + '\'' +
                "imgjson='" + imgjson + '\'' +
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

        private List<String> proseurlList;

        public List<String> getProseurlList(){return this.proseurlList;}


        private List<String> fuzzyProseurl;

        public List<String> getFuzzyProseurl(){return this.fuzzyProseurl;}

        private List<String> rightFuzzyProseurl;

        public List<String> getRightFuzzyProseurl(){return this.rightFuzzyProseurl;}
        private List<String> imgjsonList;

        public List<String> getImgjsonList(){return this.imgjsonList;}


        private List<String> fuzzyImgjson;

        public List<String> getFuzzyImgjson(){return this.fuzzyImgjson;}

        private List<String> rightFuzzyImgjson;

        public List<String> getRightFuzzyImgjson(){return this.rightFuzzyImgjson;}
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

        public QueryBuilder fuzzyImgjson (List<String> fuzzyImgjson){
            this.fuzzyImgjson = fuzzyImgjson;
            return this;
        }

        public QueryBuilder fuzzyImgjson (String ... fuzzyImgjson){
            this.fuzzyImgjson = solveNullList(fuzzyImgjson);
            return this;
        }

        public QueryBuilder rightFuzzyImgjson (List<String> rightFuzzyImgjson){
            this.rightFuzzyImgjson = rightFuzzyImgjson;
            return this;
        }

        public QueryBuilder rightFuzzyImgjson (String ... rightFuzzyImgjson){
            this.rightFuzzyImgjson = solveNullList(rightFuzzyImgjson);
            return this;
        }

        public QueryBuilder imgjson(String imgjson){
            setImgjson(imgjson);
            return this;
        }

        public QueryBuilder imgjsonList(String ... imgjson){
            this.imgjsonList = solveNullList(imgjson);
            return this;
        }

        public QueryBuilder imgjsonList(List<String> imgjson){
            this.imgjsonList = imgjson;
            return this;
        }

        public QueryBuilder fetchImgjson(){
            setFetchFields("fetchFields","imgjson");
            return this;
        }

        public QueryBuilder excludeImgjson(){
            setFetchFields("excludeFields","imgjson");
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

        private List<String> proseurlList;

        public List<String> getProseurlList(){return this.proseurlList;}


        private List<String> fuzzyProseurl;

        public List<String> getFuzzyProseurl(){return this.fuzzyProseurl;}

        private List<String> rightFuzzyProseurl;

        public List<String> getRightFuzzyProseurl(){return this.rightFuzzyProseurl;}
        private List<String> imgjsonList;

        public List<String> getImgjsonList(){return this.imgjsonList;}


        private List<String> fuzzyImgjson;

        public List<String> getFuzzyImgjson(){return this.fuzzyImgjson;}

        private List<String> rightFuzzyImgjson;

        public List<String> getRightFuzzyImgjson(){return this.rightFuzzyImgjson;}

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

        public ConditionBuilder fuzzyImgjson (List<String> fuzzyImgjson){
            this.fuzzyImgjson = fuzzyImgjson;
            return this;
        }

        public ConditionBuilder fuzzyImgjson (String ... fuzzyImgjson){
            this.fuzzyImgjson = solveNullList(fuzzyImgjson);
            return this;
        }

        public ConditionBuilder rightFuzzyImgjson (List<String> rightFuzzyImgjson){
            this.rightFuzzyImgjson = rightFuzzyImgjson;
            return this;
        }

        public ConditionBuilder rightFuzzyImgjson (String ... rightFuzzyImgjson){
            this.rightFuzzyImgjson = solveNullList(rightFuzzyImgjson);
            return this;
        }

        public ConditionBuilder imgjsonList(String ... imgjson){
            this.imgjsonList = solveNullList(imgjson);
            return this;
        }

        public ConditionBuilder imgjsonList(List<String> imgjson){
            this.imgjsonList = imgjson;
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
        public Builder proseurl(String proseurl){
            this.obj.setProseurl(proseurl);
            return this;
        }
        public Builder imgjson(String imgjson){
            this.obj.setImgjson(imgjson);
            return this;
        }
        public BysjImgurl build(){return obj;}
    }

}
