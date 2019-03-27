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
public class BysjAuthor implements Serializable {

    private static final long serialVersionUID = 1553655290334L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

    /**
    * 作者姓名
    * isNullAble:0,defaultVal:
    */
    private String au_name;

    /**
    * 国籍
    * isNullAble:0,defaultVal:
    */
    private String au_country;

    /**
    * 工作
    * isNullAble:0,defaultVal:
    */
    private String au_job;

    /**
    * 代表作
    * isNullAble:0,defaultVal:
    */
    private String au_famous;

    /**
    * 座右铭
    * isNullAble:0,defaultVal:
    */
    private String au_say;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setAu_name(String au_name){this.au_name = au_name;}

    public String getAu_name(){return this.au_name;}

    public void setAu_country(String au_country){this.au_country = au_country;}

    public String getAu_country(){return this.au_country;}

    public void setAu_job(String au_job){this.au_job = au_job;}

    public String getAu_job(){return this.au_job;}

    public void setAu_famous(String au_famous){this.au_famous = au_famous;}

    public String getAu_famous(){return this.au_famous;}

    public void setAu_say(String au_say){this.au_say = au_say;}

    public String getAu_say(){return this.au_say;}
    @Override
    public String toString() {
        return "BysjAuthor{" +
                "Id='" + Id + '\'' +
                "au_name='" + au_name + '\'' +
                "au_country='" + au_country + '\'' +
                "au_job='" + au_job + '\'' +
                "au_famous='" + au_famous + '\'' +
                "au_say='" + au_say + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private BysjAuthor set;

        private ConditionBuilder where;

        public UpdateBuilder set(BysjAuthor set){
            this.set = set;
            return this;
        }

        public BysjAuthor getSet(){
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

    public static class QueryBuilder extends BysjAuthor{
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

        private List<String> au_nameList;

        public List<String> getAu_nameList(){return this.au_nameList;}


        private List<String> fuzzyAu_name;

        public List<String> getFuzzyAu_name(){return this.fuzzyAu_name;}

        private List<String> rightFuzzyAu_name;

        public List<String> getRightFuzzyAu_name(){return this.rightFuzzyAu_name;}
        private List<String> au_countryList;

        public List<String> getAu_countryList(){return this.au_countryList;}


        private List<String> fuzzyAu_country;

        public List<String> getFuzzyAu_country(){return this.fuzzyAu_country;}

        private List<String> rightFuzzyAu_country;

        public List<String> getRightFuzzyAu_country(){return this.rightFuzzyAu_country;}
        private List<String> au_jobList;

        public List<String> getAu_jobList(){return this.au_jobList;}


        private List<String> fuzzyAu_job;

        public List<String> getFuzzyAu_job(){return this.fuzzyAu_job;}

        private List<String> rightFuzzyAu_job;

        public List<String> getRightFuzzyAu_job(){return this.rightFuzzyAu_job;}
        private List<String> au_famousList;

        public List<String> getAu_famousList(){return this.au_famousList;}


        private List<String> fuzzyAu_famous;

        public List<String> getFuzzyAu_famous(){return this.fuzzyAu_famous;}

        private List<String> rightFuzzyAu_famous;

        public List<String> getRightFuzzyAu_famous(){return this.rightFuzzyAu_famous;}
        private List<String> au_sayList;

        public List<String> getAu_sayList(){return this.au_sayList;}


        private List<String> fuzzyAu_say;

        public List<String> getFuzzyAu_say(){return this.fuzzyAu_say;}

        private List<String> rightFuzzyAu_say;

        public List<String> getRightFuzzyAu_say(){return this.rightFuzzyAu_say;}
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

        public QueryBuilder fuzzyAu_name (List<String> fuzzyAu_name){
            this.fuzzyAu_name = fuzzyAu_name;
            return this;
        }

        public QueryBuilder fuzzyAu_name (String ... fuzzyAu_name){
            this.fuzzyAu_name = solveNullList(fuzzyAu_name);
            return this;
        }

        public QueryBuilder rightFuzzyAu_name (List<String> rightFuzzyAu_name){
            this.rightFuzzyAu_name = rightFuzzyAu_name;
            return this;
        }

        public QueryBuilder rightFuzzyAu_name (String ... rightFuzzyAu_name){
            this.rightFuzzyAu_name = solveNullList(rightFuzzyAu_name);
            return this;
        }

        public QueryBuilder au_name(String au_name){
            setAu_name(au_name);
            return this;
        }

        public QueryBuilder au_nameList(String ... au_name){
            this.au_nameList = solveNullList(au_name);
            return this;
        }

        public QueryBuilder au_nameList(List<String> au_name){
            this.au_nameList = au_name;
            return this;
        }

        public QueryBuilder fetchAu_name(){
            setFetchFields("fetchFields","au_name");
            return this;
        }

        public QueryBuilder excludeAu_name(){
            setFetchFields("excludeFields","au_name");
            return this;
        }

        public QueryBuilder fuzzyAu_country (List<String> fuzzyAu_country){
            this.fuzzyAu_country = fuzzyAu_country;
            return this;
        }

        public QueryBuilder fuzzyAu_country (String ... fuzzyAu_country){
            this.fuzzyAu_country = solveNullList(fuzzyAu_country);
            return this;
        }

        public QueryBuilder rightFuzzyAu_country (List<String> rightFuzzyAu_country){
            this.rightFuzzyAu_country = rightFuzzyAu_country;
            return this;
        }

        public QueryBuilder rightFuzzyAu_country (String ... rightFuzzyAu_country){
            this.rightFuzzyAu_country = solveNullList(rightFuzzyAu_country);
            return this;
        }

        public QueryBuilder au_country(String au_country){
            setAu_country(au_country);
            return this;
        }

        public QueryBuilder au_countryList(String ... au_country){
            this.au_countryList = solveNullList(au_country);
            return this;
        }

        public QueryBuilder au_countryList(List<String> au_country){
            this.au_countryList = au_country;
            return this;
        }

        public QueryBuilder fetchAu_country(){
            setFetchFields("fetchFields","au_country");
            return this;
        }

        public QueryBuilder excludeAu_country(){
            setFetchFields("excludeFields","au_country");
            return this;
        }

        public QueryBuilder fuzzyAu_job (List<String> fuzzyAu_job){
            this.fuzzyAu_job = fuzzyAu_job;
            return this;
        }

        public QueryBuilder fuzzyAu_job (String ... fuzzyAu_job){
            this.fuzzyAu_job = solveNullList(fuzzyAu_job);
            return this;
        }

        public QueryBuilder rightFuzzyAu_job (List<String> rightFuzzyAu_job){
            this.rightFuzzyAu_job = rightFuzzyAu_job;
            return this;
        }

        public QueryBuilder rightFuzzyAu_job (String ... rightFuzzyAu_job){
            this.rightFuzzyAu_job = solveNullList(rightFuzzyAu_job);
            return this;
        }

        public QueryBuilder au_job(String au_job){
            setAu_job(au_job);
            return this;
        }

        public QueryBuilder au_jobList(String ... au_job){
            this.au_jobList = solveNullList(au_job);
            return this;
        }

        public QueryBuilder au_jobList(List<String> au_job){
            this.au_jobList = au_job;
            return this;
        }

        public QueryBuilder fetchAu_job(){
            setFetchFields("fetchFields","au_job");
            return this;
        }

        public QueryBuilder excludeAu_job(){
            setFetchFields("excludeFields","au_job");
            return this;
        }

        public QueryBuilder fuzzyAu_famous (List<String> fuzzyAu_famous){
            this.fuzzyAu_famous = fuzzyAu_famous;
            return this;
        }

        public QueryBuilder fuzzyAu_famous (String ... fuzzyAu_famous){
            this.fuzzyAu_famous = solveNullList(fuzzyAu_famous);
            return this;
        }

        public QueryBuilder rightFuzzyAu_famous (List<String> rightFuzzyAu_famous){
            this.rightFuzzyAu_famous = rightFuzzyAu_famous;
            return this;
        }

        public QueryBuilder rightFuzzyAu_famous (String ... rightFuzzyAu_famous){
            this.rightFuzzyAu_famous = solveNullList(rightFuzzyAu_famous);
            return this;
        }

        public QueryBuilder au_famous(String au_famous){
            setAu_famous(au_famous);
            return this;
        }

        public QueryBuilder au_famousList(String ... au_famous){
            this.au_famousList = solveNullList(au_famous);
            return this;
        }

        public QueryBuilder au_famousList(List<String> au_famous){
            this.au_famousList = au_famous;
            return this;
        }

        public QueryBuilder fetchAu_famous(){
            setFetchFields("fetchFields","au_famous");
            return this;
        }

        public QueryBuilder excludeAu_famous(){
            setFetchFields("excludeFields","au_famous");
            return this;
        }

        public QueryBuilder fuzzyAu_say (List<String> fuzzyAu_say){
            this.fuzzyAu_say = fuzzyAu_say;
            return this;
        }

        public QueryBuilder fuzzyAu_say (String ... fuzzyAu_say){
            this.fuzzyAu_say = solveNullList(fuzzyAu_say);
            return this;
        }

        public QueryBuilder rightFuzzyAu_say (List<String> rightFuzzyAu_say){
            this.rightFuzzyAu_say = rightFuzzyAu_say;
            return this;
        }

        public QueryBuilder rightFuzzyAu_say (String ... rightFuzzyAu_say){
            this.rightFuzzyAu_say = solveNullList(rightFuzzyAu_say);
            return this;
        }

        public QueryBuilder au_say(String au_say){
            setAu_say(au_say);
            return this;
        }

        public QueryBuilder au_sayList(String ... au_say){
            this.au_sayList = solveNullList(au_say);
            return this;
        }

        public QueryBuilder au_sayList(List<String> au_say){
            this.au_sayList = au_say;
            return this;
        }

        public QueryBuilder fetchAu_say(){
            setFetchFields("fetchFields","au_say");
            return this;
        }

        public QueryBuilder excludeAu_say(){
            setFetchFields("excludeFields","au_say");
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

        public BysjAuthor build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<String> au_nameList;

        public List<String> getAu_nameList(){return this.au_nameList;}


        private List<String> fuzzyAu_name;

        public List<String> getFuzzyAu_name(){return this.fuzzyAu_name;}

        private List<String> rightFuzzyAu_name;

        public List<String> getRightFuzzyAu_name(){return this.rightFuzzyAu_name;}
        private List<String> au_countryList;

        public List<String> getAu_countryList(){return this.au_countryList;}


        private List<String> fuzzyAu_country;

        public List<String> getFuzzyAu_country(){return this.fuzzyAu_country;}

        private List<String> rightFuzzyAu_country;

        public List<String> getRightFuzzyAu_country(){return this.rightFuzzyAu_country;}
        private List<String> au_jobList;

        public List<String> getAu_jobList(){return this.au_jobList;}


        private List<String> fuzzyAu_job;

        public List<String> getFuzzyAu_job(){return this.fuzzyAu_job;}

        private List<String> rightFuzzyAu_job;

        public List<String> getRightFuzzyAu_job(){return this.rightFuzzyAu_job;}
        private List<String> au_famousList;

        public List<String> getAu_famousList(){return this.au_famousList;}


        private List<String> fuzzyAu_famous;

        public List<String> getFuzzyAu_famous(){return this.fuzzyAu_famous;}

        private List<String> rightFuzzyAu_famous;

        public List<String> getRightFuzzyAu_famous(){return this.rightFuzzyAu_famous;}
        private List<String> au_sayList;

        public List<String> getAu_sayList(){return this.au_sayList;}


        private List<String> fuzzyAu_say;

        public List<String> getFuzzyAu_say(){return this.fuzzyAu_say;}

        private List<String> rightFuzzyAu_say;

        public List<String> getRightFuzzyAu_say(){return this.rightFuzzyAu_say;}

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

        public ConditionBuilder fuzzyAu_name (List<String> fuzzyAu_name){
            this.fuzzyAu_name = fuzzyAu_name;
            return this;
        }

        public ConditionBuilder fuzzyAu_name (String ... fuzzyAu_name){
            this.fuzzyAu_name = solveNullList(fuzzyAu_name);
            return this;
        }

        public ConditionBuilder rightFuzzyAu_name (List<String> rightFuzzyAu_name){
            this.rightFuzzyAu_name = rightFuzzyAu_name;
            return this;
        }

        public ConditionBuilder rightFuzzyAu_name (String ... rightFuzzyAu_name){
            this.rightFuzzyAu_name = solveNullList(rightFuzzyAu_name);
            return this;
        }

        public ConditionBuilder au_nameList(String ... au_name){
            this.au_nameList = solveNullList(au_name);
            return this;
        }

        public ConditionBuilder au_nameList(List<String> au_name){
            this.au_nameList = au_name;
            return this;
        }

        public ConditionBuilder fuzzyAu_country (List<String> fuzzyAu_country){
            this.fuzzyAu_country = fuzzyAu_country;
            return this;
        }

        public ConditionBuilder fuzzyAu_country (String ... fuzzyAu_country){
            this.fuzzyAu_country = solveNullList(fuzzyAu_country);
            return this;
        }

        public ConditionBuilder rightFuzzyAu_country (List<String> rightFuzzyAu_country){
            this.rightFuzzyAu_country = rightFuzzyAu_country;
            return this;
        }

        public ConditionBuilder rightFuzzyAu_country (String ... rightFuzzyAu_country){
            this.rightFuzzyAu_country = solveNullList(rightFuzzyAu_country);
            return this;
        }

        public ConditionBuilder au_countryList(String ... au_country){
            this.au_countryList = solveNullList(au_country);
            return this;
        }

        public ConditionBuilder au_countryList(List<String> au_country){
            this.au_countryList = au_country;
            return this;
        }

        public ConditionBuilder fuzzyAu_job (List<String> fuzzyAu_job){
            this.fuzzyAu_job = fuzzyAu_job;
            return this;
        }

        public ConditionBuilder fuzzyAu_job (String ... fuzzyAu_job){
            this.fuzzyAu_job = solveNullList(fuzzyAu_job);
            return this;
        }

        public ConditionBuilder rightFuzzyAu_job (List<String> rightFuzzyAu_job){
            this.rightFuzzyAu_job = rightFuzzyAu_job;
            return this;
        }

        public ConditionBuilder rightFuzzyAu_job (String ... rightFuzzyAu_job){
            this.rightFuzzyAu_job = solveNullList(rightFuzzyAu_job);
            return this;
        }

        public ConditionBuilder au_jobList(String ... au_job){
            this.au_jobList = solveNullList(au_job);
            return this;
        }

        public ConditionBuilder au_jobList(List<String> au_job){
            this.au_jobList = au_job;
            return this;
        }

        public ConditionBuilder fuzzyAu_famous (List<String> fuzzyAu_famous){
            this.fuzzyAu_famous = fuzzyAu_famous;
            return this;
        }

        public ConditionBuilder fuzzyAu_famous (String ... fuzzyAu_famous){
            this.fuzzyAu_famous = solveNullList(fuzzyAu_famous);
            return this;
        }

        public ConditionBuilder rightFuzzyAu_famous (List<String> rightFuzzyAu_famous){
            this.rightFuzzyAu_famous = rightFuzzyAu_famous;
            return this;
        }

        public ConditionBuilder rightFuzzyAu_famous (String ... rightFuzzyAu_famous){
            this.rightFuzzyAu_famous = solveNullList(rightFuzzyAu_famous);
            return this;
        }

        public ConditionBuilder au_famousList(String ... au_famous){
            this.au_famousList = solveNullList(au_famous);
            return this;
        }

        public ConditionBuilder au_famousList(List<String> au_famous){
            this.au_famousList = au_famous;
            return this;
        }

        public ConditionBuilder fuzzyAu_say (List<String> fuzzyAu_say){
            this.fuzzyAu_say = fuzzyAu_say;
            return this;
        }

        public ConditionBuilder fuzzyAu_say (String ... fuzzyAu_say){
            this.fuzzyAu_say = solveNullList(fuzzyAu_say);
            return this;
        }

        public ConditionBuilder rightFuzzyAu_say (List<String> rightFuzzyAu_say){
            this.rightFuzzyAu_say = rightFuzzyAu_say;
            return this;
        }

        public ConditionBuilder rightFuzzyAu_say (String ... rightFuzzyAu_say){
            this.rightFuzzyAu_say = solveNullList(rightFuzzyAu_say);
            return this;
        }

        public ConditionBuilder au_sayList(String ... au_say){
            this.au_sayList = solveNullList(au_say);
            return this;
        }

        public ConditionBuilder au_sayList(List<String> au_say){
            this.au_sayList = au_say;
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

        private BysjAuthor obj;

        public Builder(){
            this.obj = new BysjAuthor();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder au_name(String au_name){
            this.obj.setAu_name(au_name);
            return this;
        }
        public Builder au_country(String au_country){
            this.obj.setAu_country(au_country);
            return this;
        }
        public Builder au_job(String au_job){
            this.obj.setAu_job(au_job);
            return this;
        }
        public Builder au_famous(String au_famous){
            this.obj.setAu_famous(au_famous);
            return this;
        }
        public Builder au_say(String au_say){
            this.obj.setAu_say(au_say);
            return this;
        }
        public BysjAuthor build(){return obj;}
    }

}