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
public class BysjComment implements Serializable {

    private static final long serialVersionUID = 1557719199038L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

    /**
    * 评论人
    * isNullAble:0,defaultVal:
    */
    private String comment_person;

    /**
    * 头像
    * isNullAble:0,defaultVal:http://img1.imgtn.bdimg.com/it/u=1218485516,264644399&fm=26&gp=0.jpg
    */
    private String comment_src;

    /**
    * 评论
    * isNullAble:0
    */
    private String comment_content;

    /**
    * 点赞次数
    * isNullAble:0,defaultVal:0
    */
    private Integer comment_times;

    /**
    * 评论文章题目
    * isNullAble:0,defaultVal:
    */
    private String comment_title;

    /**
    * 评论的时间
    * isNullAble:0,defaultVal:未知时间
    */
    private String comment_date;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setComment_person(String comment_person){this.comment_person = comment_person;}

    public String getComment_person(){return this.comment_person;}

    public void setComment_src(String comment_src){this.comment_src = comment_src;}

    public String getComment_src(){return this.comment_src;}

    public void setComment_content(String comment_content){this.comment_content = comment_content;}

    public String getComment_content(){return this.comment_content;}

    public void setComment_times(Integer comment_times){this.comment_times = comment_times;}

    public Integer getComment_times(){return this.comment_times;}

    public void setComment_title(String comment_title){this.comment_title = comment_title;}

    public String getComment_title(){return this.comment_title;}

    public void setComment_date(String comment_date){this.comment_date = comment_date;}

    public String getComment_date(){return this.comment_date;}
    @Override
    public String toString() {
        return "BysjComment{" +
                "Id='" + Id + '\'' +
                "comment_person='" + comment_person + '\'' +
                "comment_src='" + comment_src + '\'' +
                "comment_content='" + comment_content + '\'' +
                "comment_times='" + comment_times + '\'' +
                "comment_title='" + comment_title + '\'' +
                "comment_date='" + comment_date + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private BysjComment set;

        private ConditionBuilder where;

        public UpdateBuilder set(BysjComment set){
            this.set = set;
            return this;
        }

        public BysjComment getSet(){
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

    public static class QueryBuilder extends BysjComment{
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

        private List<String> comment_personList;

        public List<String> getComment_personList(){return this.comment_personList;}


        private List<String> fuzzyComment_person;

        public List<String> getFuzzyComment_person(){return this.fuzzyComment_person;}

        private List<String> rightFuzzyComment_person;

        public List<String> getRightFuzzyComment_person(){return this.rightFuzzyComment_person;}
        private List<String> comment_srcList;

        public List<String> getComment_srcList(){return this.comment_srcList;}


        private List<String> fuzzyComment_src;

        public List<String> getFuzzyComment_src(){return this.fuzzyComment_src;}

        private List<String> rightFuzzyComment_src;

        public List<String> getRightFuzzyComment_src(){return this.rightFuzzyComment_src;}
        private List<String> comment_contentList;

        public List<String> getComment_contentList(){return this.comment_contentList;}


        private List<String> fuzzyComment_content;

        public List<String> getFuzzyComment_content(){return this.fuzzyComment_content;}

        private List<String> rightFuzzyComment_content;

        public List<String> getRightFuzzyComment_content(){return this.rightFuzzyComment_content;}
        private List<Integer> comment_timesList;

        public List<Integer> getComment_timesList(){return this.comment_timesList;}

        private Integer comment_timesSt;

        private Integer comment_timesEd;

        public Integer getComment_timesSt(){return this.comment_timesSt;}

        public Integer getComment_timesEd(){return this.comment_timesEd;}

        private List<String> comment_titleList;

        public List<String> getComment_titleList(){return this.comment_titleList;}


        private List<String> fuzzyComment_title;

        public List<String> getFuzzyComment_title(){return this.fuzzyComment_title;}

        private List<String> rightFuzzyComment_title;

        public List<String> getRightFuzzyComment_title(){return this.rightFuzzyComment_title;}
        private List<String> comment_dateList;

        public List<String> getComment_dateList(){return this.comment_dateList;}


        private List<String> fuzzyComment_date;

        public List<String> getFuzzyComment_date(){return this.fuzzyComment_date;}

        private List<String> rightFuzzyComment_date;

        public List<String> getRightFuzzyComment_date(){return this.rightFuzzyComment_date;}
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

        public QueryBuilder fuzzyComment_person (List<String> fuzzyComment_person){
            this.fuzzyComment_person = fuzzyComment_person;
            return this;
        }

        public QueryBuilder fuzzyComment_person (String ... fuzzyComment_person){
            this.fuzzyComment_person = solveNullList(fuzzyComment_person);
            return this;
        }

        public QueryBuilder rightFuzzyComment_person (List<String> rightFuzzyComment_person){
            this.rightFuzzyComment_person = rightFuzzyComment_person;
            return this;
        }

        public QueryBuilder rightFuzzyComment_person (String ... rightFuzzyComment_person){
            this.rightFuzzyComment_person = solveNullList(rightFuzzyComment_person);
            return this;
        }

        public QueryBuilder comment_person(String comment_person){
            setComment_person(comment_person);
            return this;
        }

        public QueryBuilder comment_personList(String ... comment_person){
            this.comment_personList = solveNullList(comment_person);
            return this;
        }

        public QueryBuilder comment_personList(List<String> comment_person){
            this.comment_personList = comment_person;
            return this;
        }

        public QueryBuilder fetchComment_person(){
            setFetchFields("fetchFields","comment_person");
            return this;
        }

        public QueryBuilder excludeComment_person(){
            setFetchFields("excludeFields","comment_person");
            return this;
        }

        public QueryBuilder fuzzyComment_src (List<String> fuzzyComment_src){
            this.fuzzyComment_src = fuzzyComment_src;
            return this;
        }

        public QueryBuilder fuzzyComment_src (String ... fuzzyComment_src){
            this.fuzzyComment_src = solveNullList(fuzzyComment_src);
            return this;
        }

        public QueryBuilder rightFuzzyComment_src (List<String> rightFuzzyComment_src){
            this.rightFuzzyComment_src = rightFuzzyComment_src;
            return this;
        }

        public QueryBuilder rightFuzzyComment_src (String ... rightFuzzyComment_src){
            this.rightFuzzyComment_src = solveNullList(rightFuzzyComment_src);
            return this;
        }

        public QueryBuilder comment_src(String comment_src){
            setComment_src(comment_src);
            return this;
        }

        public QueryBuilder comment_srcList(String ... comment_src){
            this.comment_srcList = solveNullList(comment_src);
            return this;
        }

        public QueryBuilder comment_srcList(List<String> comment_src){
            this.comment_srcList = comment_src;
            return this;
        }

        public QueryBuilder fetchComment_src(){
            setFetchFields("fetchFields","comment_src");
            return this;
        }

        public QueryBuilder excludeComment_src(){
            setFetchFields("excludeFields","comment_src");
            return this;
        }

        public QueryBuilder fuzzyComment_content (List<String> fuzzyComment_content){
            this.fuzzyComment_content = fuzzyComment_content;
            return this;
        }

        public QueryBuilder fuzzyComment_content (String ... fuzzyComment_content){
            this.fuzzyComment_content = solveNullList(fuzzyComment_content);
            return this;
        }

        public QueryBuilder rightFuzzyComment_content (List<String> rightFuzzyComment_content){
            this.rightFuzzyComment_content = rightFuzzyComment_content;
            return this;
        }

        public QueryBuilder rightFuzzyComment_content (String ... rightFuzzyComment_content){
            this.rightFuzzyComment_content = solveNullList(rightFuzzyComment_content);
            return this;
        }

        public QueryBuilder comment_content(String comment_content){
            setComment_content(comment_content);
            return this;
        }

        public QueryBuilder comment_contentList(String ... comment_content){
            this.comment_contentList = solveNullList(comment_content);
            return this;
        }

        public QueryBuilder comment_contentList(List<String> comment_content){
            this.comment_contentList = comment_content;
            return this;
        }

        public QueryBuilder fetchComment_content(){
            setFetchFields("fetchFields","comment_content");
            return this;
        }

        public QueryBuilder excludeComment_content(){
            setFetchFields("excludeFields","comment_content");
            return this;
        }

        public QueryBuilder comment_timesBetWeen(Integer comment_timesSt,Integer comment_timesEd){
            this.comment_timesSt = comment_timesSt;
            this.comment_timesEd = comment_timesEd;
            return this;
        }

        public QueryBuilder comment_timesGreaterEqThan(Integer comment_timesSt){
            this.comment_timesSt = comment_timesSt;
            return this;
        }
        public QueryBuilder comment_timesLessEqThan(Integer comment_timesEd){
            this.comment_timesEd = comment_timesEd;
            return this;
        }


        public QueryBuilder comment_times(Integer comment_times){
            setComment_times(comment_times);
            return this;
        }

        public QueryBuilder comment_timesList(Integer ... comment_times){
            this.comment_timesList = solveNullList(comment_times);
            return this;
        }

        public QueryBuilder comment_timesList(List<Integer> comment_times){
            this.comment_timesList = comment_times;
            return this;
        }

        public QueryBuilder fetchComment_times(){
            setFetchFields("fetchFields","comment_times");
            return this;
        }

        public QueryBuilder excludeComment_times(){
            setFetchFields("excludeFields","comment_times");
            return this;
        }

        public QueryBuilder fuzzyComment_title (List<String> fuzzyComment_title){
            this.fuzzyComment_title = fuzzyComment_title;
            return this;
        }

        public QueryBuilder fuzzyComment_title (String ... fuzzyComment_title){
            this.fuzzyComment_title = solveNullList(fuzzyComment_title);
            return this;
        }

        public QueryBuilder rightFuzzyComment_title (List<String> rightFuzzyComment_title){
            this.rightFuzzyComment_title = rightFuzzyComment_title;
            return this;
        }

        public QueryBuilder rightFuzzyComment_title (String ... rightFuzzyComment_title){
            this.rightFuzzyComment_title = solveNullList(rightFuzzyComment_title);
            return this;
        }

        public QueryBuilder comment_title(String comment_title){
            setComment_title(comment_title);
            return this;
        }

        public QueryBuilder comment_titleList(String ... comment_title){
            this.comment_titleList = solveNullList(comment_title);
            return this;
        }

        public QueryBuilder comment_titleList(List<String> comment_title){
            this.comment_titleList = comment_title;
            return this;
        }

        public QueryBuilder fetchComment_title(){
            setFetchFields("fetchFields","comment_title");
            return this;
        }

        public QueryBuilder excludeComment_title(){
            setFetchFields("excludeFields","comment_title");
            return this;
        }

        public QueryBuilder fuzzyComment_date (List<String> fuzzyComment_date){
            this.fuzzyComment_date = fuzzyComment_date;
            return this;
        }

        public QueryBuilder fuzzyComment_date (String ... fuzzyComment_date){
            this.fuzzyComment_date = solveNullList(fuzzyComment_date);
            return this;
        }

        public QueryBuilder rightFuzzyComment_date (List<String> rightFuzzyComment_date){
            this.rightFuzzyComment_date = rightFuzzyComment_date;
            return this;
        }

        public QueryBuilder rightFuzzyComment_date (String ... rightFuzzyComment_date){
            this.rightFuzzyComment_date = solveNullList(rightFuzzyComment_date);
            return this;
        }

        public QueryBuilder comment_date(String comment_date){
            setComment_date(comment_date);
            return this;
        }

        public QueryBuilder comment_dateList(String ... comment_date){
            this.comment_dateList = solveNullList(comment_date);
            return this;
        }

        public QueryBuilder comment_dateList(List<String> comment_date){
            this.comment_dateList = comment_date;
            return this;
        }

        public QueryBuilder fetchComment_date(){
            setFetchFields("fetchFields","comment_date");
            return this;
        }

        public QueryBuilder excludeComment_date(){
            setFetchFields("excludeFields","comment_date");
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

        public BysjComment build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<String> comment_personList;

        public List<String> getComment_personList(){return this.comment_personList;}


        private List<String> fuzzyComment_person;

        public List<String> getFuzzyComment_person(){return this.fuzzyComment_person;}

        private List<String> rightFuzzyComment_person;

        public List<String> getRightFuzzyComment_person(){return this.rightFuzzyComment_person;}
        private List<String> comment_srcList;

        public List<String> getComment_srcList(){return this.comment_srcList;}


        private List<String> fuzzyComment_src;

        public List<String> getFuzzyComment_src(){return this.fuzzyComment_src;}

        private List<String> rightFuzzyComment_src;

        public List<String> getRightFuzzyComment_src(){return this.rightFuzzyComment_src;}
        private List<String> comment_contentList;

        public List<String> getComment_contentList(){return this.comment_contentList;}


        private List<String> fuzzyComment_content;

        public List<String> getFuzzyComment_content(){return this.fuzzyComment_content;}

        private List<String> rightFuzzyComment_content;

        public List<String> getRightFuzzyComment_content(){return this.rightFuzzyComment_content;}
        private List<Integer> comment_timesList;

        public List<Integer> getComment_timesList(){return this.comment_timesList;}

        private Integer comment_timesSt;

        private Integer comment_timesEd;

        public Integer getComment_timesSt(){return this.comment_timesSt;}

        public Integer getComment_timesEd(){return this.comment_timesEd;}

        private List<String> comment_titleList;

        public List<String> getComment_titleList(){return this.comment_titleList;}


        private List<String> fuzzyComment_title;

        public List<String> getFuzzyComment_title(){return this.fuzzyComment_title;}

        private List<String> rightFuzzyComment_title;

        public List<String> getRightFuzzyComment_title(){return this.rightFuzzyComment_title;}
        private List<String> comment_dateList;

        public List<String> getComment_dateList(){return this.comment_dateList;}


        private List<String> fuzzyComment_date;

        public List<String> getFuzzyComment_date(){return this.fuzzyComment_date;}

        private List<String> rightFuzzyComment_date;

        public List<String> getRightFuzzyComment_date(){return this.rightFuzzyComment_date;}

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

        public ConditionBuilder fuzzyComment_person (List<String> fuzzyComment_person){
            this.fuzzyComment_person = fuzzyComment_person;
            return this;
        }

        public ConditionBuilder fuzzyComment_person (String ... fuzzyComment_person){
            this.fuzzyComment_person = solveNullList(fuzzyComment_person);
            return this;
        }

        public ConditionBuilder rightFuzzyComment_person (List<String> rightFuzzyComment_person){
            this.rightFuzzyComment_person = rightFuzzyComment_person;
            return this;
        }

        public ConditionBuilder rightFuzzyComment_person (String ... rightFuzzyComment_person){
            this.rightFuzzyComment_person = solveNullList(rightFuzzyComment_person);
            return this;
        }

        public ConditionBuilder comment_personList(String ... comment_person){
            this.comment_personList = solveNullList(comment_person);
            return this;
        }

        public ConditionBuilder comment_personList(List<String> comment_person){
            this.comment_personList = comment_person;
            return this;
        }

        public ConditionBuilder fuzzyComment_src (List<String> fuzzyComment_src){
            this.fuzzyComment_src = fuzzyComment_src;
            return this;
        }

        public ConditionBuilder fuzzyComment_src (String ... fuzzyComment_src){
            this.fuzzyComment_src = solveNullList(fuzzyComment_src);
            return this;
        }

        public ConditionBuilder rightFuzzyComment_src (List<String> rightFuzzyComment_src){
            this.rightFuzzyComment_src = rightFuzzyComment_src;
            return this;
        }

        public ConditionBuilder rightFuzzyComment_src (String ... rightFuzzyComment_src){
            this.rightFuzzyComment_src = solveNullList(rightFuzzyComment_src);
            return this;
        }

        public ConditionBuilder comment_srcList(String ... comment_src){
            this.comment_srcList = solveNullList(comment_src);
            return this;
        }

        public ConditionBuilder comment_srcList(List<String> comment_src){
            this.comment_srcList = comment_src;
            return this;
        }

        public ConditionBuilder fuzzyComment_content (List<String> fuzzyComment_content){
            this.fuzzyComment_content = fuzzyComment_content;
            return this;
        }

        public ConditionBuilder fuzzyComment_content (String ... fuzzyComment_content){
            this.fuzzyComment_content = solveNullList(fuzzyComment_content);
            return this;
        }

        public ConditionBuilder rightFuzzyComment_content (List<String> rightFuzzyComment_content){
            this.rightFuzzyComment_content = rightFuzzyComment_content;
            return this;
        }

        public ConditionBuilder rightFuzzyComment_content (String ... rightFuzzyComment_content){
            this.rightFuzzyComment_content = solveNullList(rightFuzzyComment_content);
            return this;
        }

        public ConditionBuilder comment_contentList(String ... comment_content){
            this.comment_contentList = solveNullList(comment_content);
            return this;
        }

        public ConditionBuilder comment_contentList(List<String> comment_content){
            this.comment_contentList = comment_content;
            return this;
        }

        public ConditionBuilder comment_timesBetWeen(Integer comment_timesSt,Integer comment_timesEd){
            this.comment_timesSt = comment_timesSt;
            this.comment_timesEd = comment_timesEd;
            return this;
        }

        public ConditionBuilder comment_timesGreaterEqThan(Integer comment_timesSt){
            this.comment_timesSt = comment_timesSt;
            return this;
        }
        public ConditionBuilder comment_timesLessEqThan(Integer comment_timesEd){
            this.comment_timesEd = comment_timesEd;
            return this;
        }


        public ConditionBuilder comment_timesList(Integer ... comment_times){
            this.comment_timesList = solveNullList(comment_times);
            return this;
        }

        public ConditionBuilder comment_timesList(List<Integer> comment_times){
            this.comment_timesList = comment_times;
            return this;
        }

        public ConditionBuilder fuzzyComment_title (List<String> fuzzyComment_title){
            this.fuzzyComment_title = fuzzyComment_title;
            return this;
        }

        public ConditionBuilder fuzzyComment_title (String ... fuzzyComment_title){
            this.fuzzyComment_title = solveNullList(fuzzyComment_title);
            return this;
        }

        public ConditionBuilder rightFuzzyComment_title (List<String> rightFuzzyComment_title){
            this.rightFuzzyComment_title = rightFuzzyComment_title;
            return this;
        }

        public ConditionBuilder rightFuzzyComment_title (String ... rightFuzzyComment_title){
            this.rightFuzzyComment_title = solveNullList(rightFuzzyComment_title);
            return this;
        }

        public ConditionBuilder comment_titleList(String ... comment_title){
            this.comment_titleList = solveNullList(comment_title);
            return this;
        }

        public ConditionBuilder comment_titleList(List<String> comment_title){
            this.comment_titleList = comment_title;
            return this;
        }

        public ConditionBuilder fuzzyComment_date (List<String> fuzzyComment_date){
            this.fuzzyComment_date = fuzzyComment_date;
            return this;
        }

        public ConditionBuilder fuzzyComment_date (String ... fuzzyComment_date){
            this.fuzzyComment_date = solveNullList(fuzzyComment_date);
            return this;
        }

        public ConditionBuilder rightFuzzyComment_date (List<String> rightFuzzyComment_date){
            this.rightFuzzyComment_date = rightFuzzyComment_date;
            return this;
        }

        public ConditionBuilder rightFuzzyComment_date (String ... rightFuzzyComment_date){
            this.rightFuzzyComment_date = solveNullList(rightFuzzyComment_date);
            return this;
        }

        public ConditionBuilder comment_dateList(String ... comment_date){
            this.comment_dateList = solveNullList(comment_date);
            return this;
        }

        public ConditionBuilder comment_dateList(List<String> comment_date){
            this.comment_dateList = comment_date;
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

        private BysjComment obj;

        public Builder(){
            this.obj = new BysjComment();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder comment_person(String comment_person){
            this.obj.setComment_person(comment_person);
            return this;
        }
        public Builder comment_src(String comment_src){
            this.obj.setComment_src(comment_src);
            return this;
        }
        public Builder comment_content(String comment_content){
            this.obj.setComment_content(comment_content);
            return this;
        }
        public Builder comment_times(Integer comment_times){
            this.obj.setComment_times(comment_times);
            return this;
        }
        public Builder comment_title(String comment_title){
            this.obj.setComment_title(comment_title);
            return this;
        }
        public Builder comment_date(String comment_date){
            this.obj.setComment_date(comment_date);
            return this;
        }
        public BysjComment build(){return obj;}
    }

}
