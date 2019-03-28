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
public class BysjUser implements Serializable {

    private static final long serialVersionUID = 1553738313920L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer Id;

    /**
    * 用户名 不超过20
    * isNullAble:0,defaultVal:
    */
    private String u_name;

    /**
    * 用户密码
    * isNullAble:0,defaultVal:
    */
    private String u_password;

    /**
    * 地址
    * isNullAble:0,defaultVal:
    */
    private String u_address;

    /**
    * 性别
    * isNullAble:0,defaultVal:
    */
    private String u_sex;

    /**
    * 邮箱
    * isNullAble:0,defaultVal:
    */
    private String u_email;

    /**
    * 生日
    * isNullAble:0,defaultVal:
    */
    private String u_birthday;


    public void setId(Integer Id){this.Id = Id;}

    public Integer getId(){return this.Id;}

    public void setU_name(String u_name){this.u_name = u_name;}

    public String getU_name(){return this.u_name;}

    public void setU_password(String u_password){this.u_password = u_password;}

    public String getU_password(){return this.u_password;}

    public void setU_address(String u_address){this.u_address = u_address;}

    public String getU_address(){return this.u_address;}

    public void setU_sex(String u_sex){this.u_sex = u_sex;}

    public String getU_sex(){return this.u_sex;}

    public void setU_email(String u_email){this.u_email = u_email;}

    public String getU_email(){return this.u_email;}

    public void setU_birthday(String u_birthday){this.u_birthday = u_birthday;}

    public String getU_birthday(){return this.u_birthday;}
    @Override
    public String toString() {
        return "BysjUser{" +
                "Id='" + Id + '\'' +
                "u_name='" + u_name + '\'' +
                "u_password='" + u_password + '\'' +
                "u_address='" + u_address + '\'' +
                "u_sex='" + u_sex + '\'' +
                "u_email='" + u_email + '\'' +
                "u_birthday='" + u_birthday + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private BysjUser set;

        private ConditionBuilder where;

        public UpdateBuilder set(BysjUser set){
            this.set = set;
            return this;
        }

        public BysjUser getSet(){
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

    public static class QueryBuilder extends BysjUser{
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

        private List<String> u_nameList;

        public List<String> getU_nameList(){return this.u_nameList;}


        private List<String> fuzzyU_name;

        public List<String> getFuzzyU_name(){return this.fuzzyU_name;}

        private List<String> rightFuzzyU_name;

        public List<String> getRightFuzzyU_name(){return this.rightFuzzyU_name;}
        private List<String> u_passwordList;

        public List<String> getU_passwordList(){return this.u_passwordList;}


        private List<String> fuzzyU_password;

        public List<String> getFuzzyU_password(){return this.fuzzyU_password;}

        private List<String> rightFuzzyU_password;

        public List<String> getRightFuzzyU_password(){return this.rightFuzzyU_password;}
        private List<String> u_addressList;

        public List<String> getU_addressList(){return this.u_addressList;}


        private List<String> fuzzyU_address;

        public List<String> getFuzzyU_address(){return this.fuzzyU_address;}

        private List<String> rightFuzzyU_address;

        public List<String> getRightFuzzyU_address(){return this.rightFuzzyU_address;}
        private List<String> u_sexList;

        public List<String> getU_sexList(){return this.u_sexList;}


        private List<String> fuzzyU_sex;

        public List<String> getFuzzyU_sex(){return this.fuzzyU_sex;}

        private List<String> rightFuzzyU_sex;

        public List<String> getRightFuzzyU_sex(){return this.rightFuzzyU_sex;}
        private List<String> u_emailList;

        public List<String> getU_emailList(){return this.u_emailList;}


        private List<String> fuzzyU_email;

        public List<String> getFuzzyU_email(){return this.fuzzyU_email;}

        private List<String> rightFuzzyU_email;

        public List<String> getRightFuzzyU_email(){return this.rightFuzzyU_email;}
        private List<String> u_birthdayList;

        public List<String> getU_birthdayList(){return this.u_birthdayList;}


        private List<String> fuzzyU_birthday;

        public List<String> getFuzzyU_birthday(){return this.fuzzyU_birthday;}

        private List<String> rightFuzzyU_birthday;

        public List<String> getRightFuzzyU_birthday(){return this.rightFuzzyU_birthday;}
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

        public QueryBuilder fuzzyU_name (List<String> fuzzyU_name){
            this.fuzzyU_name = fuzzyU_name;
            return this;
        }

        public QueryBuilder fuzzyU_name (String ... fuzzyU_name){
            this.fuzzyU_name = solveNullList(fuzzyU_name);
            return this;
        }

        public QueryBuilder rightFuzzyU_name (List<String> rightFuzzyU_name){
            this.rightFuzzyU_name = rightFuzzyU_name;
            return this;
        }

        public QueryBuilder rightFuzzyU_name (String ... rightFuzzyU_name){
            this.rightFuzzyU_name = solveNullList(rightFuzzyU_name);
            return this;
        }

        public QueryBuilder u_name(String u_name){
            setU_name(u_name);
            return this;
        }

        public QueryBuilder u_nameList(String ... u_name){
            this.u_nameList = solveNullList(u_name);
            return this;
        }

        public QueryBuilder u_nameList(List<String> u_name){
            this.u_nameList = u_name;
            return this;
        }

        public QueryBuilder fetchU_name(){
            setFetchFields("fetchFields","u_name");
            return this;
        }

        public QueryBuilder excludeU_name(){
            setFetchFields("excludeFields","u_name");
            return this;
        }

        public QueryBuilder fuzzyU_password (List<String> fuzzyU_password){
            this.fuzzyU_password = fuzzyU_password;
            return this;
        }

        public QueryBuilder fuzzyU_password (String ... fuzzyU_password){
            this.fuzzyU_password = solveNullList(fuzzyU_password);
            return this;
        }

        public QueryBuilder rightFuzzyU_password (List<String> rightFuzzyU_password){
            this.rightFuzzyU_password = rightFuzzyU_password;
            return this;
        }

        public QueryBuilder rightFuzzyU_password (String ... rightFuzzyU_password){
            this.rightFuzzyU_password = solveNullList(rightFuzzyU_password);
            return this;
        }

        public QueryBuilder u_password(String u_password){
            setU_password(u_password);
            return this;
        }

        public QueryBuilder u_passwordList(String ... u_password){
            this.u_passwordList = solveNullList(u_password);
            return this;
        }

        public QueryBuilder u_passwordList(List<String> u_password){
            this.u_passwordList = u_password;
            return this;
        }

        public QueryBuilder fetchU_password(){
            setFetchFields("fetchFields","u_password");
            return this;
        }

        public QueryBuilder excludeU_password(){
            setFetchFields("excludeFields","u_password");
            return this;
        }

        public QueryBuilder fuzzyU_address (List<String> fuzzyU_address){
            this.fuzzyU_address = fuzzyU_address;
            return this;
        }

        public QueryBuilder fuzzyU_address (String ... fuzzyU_address){
            this.fuzzyU_address = solveNullList(fuzzyU_address);
            return this;
        }

        public QueryBuilder rightFuzzyU_address (List<String> rightFuzzyU_address){
            this.rightFuzzyU_address = rightFuzzyU_address;
            return this;
        }

        public QueryBuilder rightFuzzyU_address (String ... rightFuzzyU_address){
            this.rightFuzzyU_address = solveNullList(rightFuzzyU_address);
            return this;
        }

        public QueryBuilder u_address(String u_address){
            setU_address(u_address);
            return this;
        }

        public QueryBuilder u_addressList(String ... u_address){
            this.u_addressList = solveNullList(u_address);
            return this;
        }

        public QueryBuilder u_addressList(List<String> u_address){
            this.u_addressList = u_address;
            return this;
        }

        public QueryBuilder fetchU_address(){
            setFetchFields("fetchFields","u_address");
            return this;
        }

        public QueryBuilder excludeU_address(){
            setFetchFields("excludeFields","u_address");
            return this;
        }

        public QueryBuilder fuzzyU_sex (List<String> fuzzyU_sex){
            this.fuzzyU_sex = fuzzyU_sex;
            return this;
        }

        public QueryBuilder fuzzyU_sex (String ... fuzzyU_sex){
            this.fuzzyU_sex = solveNullList(fuzzyU_sex);
            return this;
        }

        public QueryBuilder rightFuzzyU_sex (List<String> rightFuzzyU_sex){
            this.rightFuzzyU_sex = rightFuzzyU_sex;
            return this;
        }

        public QueryBuilder rightFuzzyU_sex (String ... rightFuzzyU_sex){
            this.rightFuzzyU_sex = solveNullList(rightFuzzyU_sex);
            return this;
        }

        public QueryBuilder u_sex(String u_sex){
            setU_sex(u_sex);
            return this;
        }

        public QueryBuilder u_sexList(String ... u_sex){
            this.u_sexList = solveNullList(u_sex);
            return this;
        }

        public QueryBuilder u_sexList(List<String> u_sex){
            this.u_sexList = u_sex;
            return this;
        }

        public QueryBuilder fetchU_sex(){
            setFetchFields("fetchFields","u_sex");
            return this;
        }

        public QueryBuilder excludeU_sex(){
            setFetchFields("excludeFields","u_sex");
            return this;
        }

        public QueryBuilder fuzzyU_email (List<String> fuzzyU_email){
            this.fuzzyU_email = fuzzyU_email;
            return this;
        }

        public QueryBuilder fuzzyU_email (String ... fuzzyU_email){
            this.fuzzyU_email = solveNullList(fuzzyU_email);
            return this;
        }

        public QueryBuilder rightFuzzyU_email (List<String> rightFuzzyU_email){
            this.rightFuzzyU_email = rightFuzzyU_email;
            return this;
        }

        public QueryBuilder rightFuzzyU_email (String ... rightFuzzyU_email){
            this.rightFuzzyU_email = solveNullList(rightFuzzyU_email);
            return this;
        }

        public QueryBuilder u_email(String u_email){
            setU_email(u_email);
            return this;
        }

        public QueryBuilder u_emailList(String ... u_email){
            this.u_emailList = solveNullList(u_email);
            return this;
        }

        public QueryBuilder u_emailList(List<String> u_email){
            this.u_emailList = u_email;
            return this;
        }

        public QueryBuilder fetchU_email(){
            setFetchFields("fetchFields","u_email");
            return this;
        }

        public QueryBuilder excludeU_email(){
            setFetchFields("excludeFields","u_email");
            return this;
        }

        public QueryBuilder fuzzyU_birthday (List<String> fuzzyU_birthday){
            this.fuzzyU_birthday = fuzzyU_birthday;
            return this;
        }

        public QueryBuilder fuzzyU_birthday (String ... fuzzyU_birthday){
            this.fuzzyU_birthday = solveNullList(fuzzyU_birthday);
            return this;
        }

        public QueryBuilder rightFuzzyU_birthday (List<String> rightFuzzyU_birthday){
            this.rightFuzzyU_birthday = rightFuzzyU_birthday;
            return this;
        }

        public QueryBuilder rightFuzzyU_birthday (String ... rightFuzzyU_birthday){
            this.rightFuzzyU_birthday = solveNullList(rightFuzzyU_birthday);
            return this;
        }

        public QueryBuilder u_birthday(String u_birthday){
            setU_birthday(u_birthday);
            return this;
        }

        public QueryBuilder u_birthdayList(String ... u_birthday){
            this.u_birthdayList = solveNullList(u_birthday);
            return this;
        }

        public QueryBuilder u_birthdayList(List<String> u_birthday){
            this.u_birthdayList = u_birthday;
            return this;
        }

        public QueryBuilder fetchU_birthday(){
            setFetchFields("fetchFields","u_birthday");
            return this;
        }

        public QueryBuilder excludeU_birthday(){
            setFetchFields("excludeFields","u_birthday");
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

        public BysjUser build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> IdList;

        public List<Integer> getIdList(){return this.IdList;}

        private Integer IdSt;

        private Integer IdEd;

        public Integer getIdSt(){return this.IdSt;}

        public Integer getIdEd(){return this.IdEd;}

        private List<String> u_nameList;

        public List<String> getU_nameList(){return this.u_nameList;}


        private List<String> fuzzyU_name;

        public List<String> getFuzzyU_name(){return this.fuzzyU_name;}

        private List<String> rightFuzzyU_name;

        public List<String> getRightFuzzyU_name(){return this.rightFuzzyU_name;}
        private List<String> u_passwordList;

        public List<String> getU_passwordList(){return this.u_passwordList;}


        private List<String> fuzzyU_password;

        public List<String> getFuzzyU_password(){return this.fuzzyU_password;}

        private List<String> rightFuzzyU_password;

        public List<String> getRightFuzzyU_password(){return this.rightFuzzyU_password;}
        private List<String> u_addressList;

        public List<String> getU_addressList(){return this.u_addressList;}


        private List<String> fuzzyU_address;

        public List<String> getFuzzyU_address(){return this.fuzzyU_address;}

        private List<String> rightFuzzyU_address;

        public List<String> getRightFuzzyU_address(){return this.rightFuzzyU_address;}
        private List<String> u_sexList;

        public List<String> getU_sexList(){return this.u_sexList;}


        private List<String> fuzzyU_sex;

        public List<String> getFuzzyU_sex(){return this.fuzzyU_sex;}

        private List<String> rightFuzzyU_sex;

        public List<String> getRightFuzzyU_sex(){return this.rightFuzzyU_sex;}
        private List<String> u_emailList;

        public List<String> getU_emailList(){return this.u_emailList;}


        private List<String> fuzzyU_email;

        public List<String> getFuzzyU_email(){return this.fuzzyU_email;}

        private List<String> rightFuzzyU_email;

        public List<String> getRightFuzzyU_email(){return this.rightFuzzyU_email;}
        private List<String> u_birthdayList;

        public List<String> getU_birthdayList(){return this.u_birthdayList;}


        private List<String> fuzzyU_birthday;

        public List<String> getFuzzyU_birthday(){return this.fuzzyU_birthday;}

        private List<String> rightFuzzyU_birthday;

        public List<String> getRightFuzzyU_birthday(){return this.rightFuzzyU_birthday;}

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

        public ConditionBuilder fuzzyU_name (List<String> fuzzyU_name){
            this.fuzzyU_name = fuzzyU_name;
            return this;
        }

        public ConditionBuilder fuzzyU_name (String ... fuzzyU_name){
            this.fuzzyU_name = solveNullList(fuzzyU_name);
            return this;
        }

        public ConditionBuilder rightFuzzyU_name (List<String> rightFuzzyU_name){
            this.rightFuzzyU_name = rightFuzzyU_name;
            return this;
        }

        public ConditionBuilder rightFuzzyU_name (String ... rightFuzzyU_name){
            this.rightFuzzyU_name = solveNullList(rightFuzzyU_name);
            return this;
        }

        public ConditionBuilder u_nameList(String ... u_name){
            this.u_nameList = solveNullList(u_name);
            return this;
        }

        public ConditionBuilder u_nameList(List<String> u_name){
            this.u_nameList = u_name;
            return this;
        }

        public ConditionBuilder fuzzyU_password (List<String> fuzzyU_password){
            this.fuzzyU_password = fuzzyU_password;
            return this;
        }

        public ConditionBuilder fuzzyU_password (String ... fuzzyU_password){
            this.fuzzyU_password = solveNullList(fuzzyU_password);
            return this;
        }

        public ConditionBuilder rightFuzzyU_password (List<String> rightFuzzyU_password){
            this.rightFuzzyU_password = rightFuzzyU_password;
            return this;
        }

        public ConditionBuilder rightFuzzyU_password (String ... rightFuzzyU_password){
            this.rightFuzzyU_password = solveNullList(rightFuzzyU_password);
            return this;
        }

        public ConditionBuilder u_passwordList(String ... u_password){
            this.u_passwordList = solveNullList(u_password);
            return this;
        }

        public ConditionBuilder u_passwordList(List<String> u_password){
            this.u_passwordList = u_password;
            return this;
        }

        public ConditionBuilder fuzzyU_address (List<String> fuzzyU_address){
            this.fuzzyU_address = fuzzyU_address;
            return this;
        }

        public ConditionBuilder fuzzyU_address (String ... fuzzyU_address){
            this.fuzzyU_address = solveNullList(fuzzyU_address);
            return this;
        }

        public ConditionBuilder rightFuzzyU_address (List<String> rightFuzzyU_address){
            this.rightFuzzyU_address = rightFuzzyU_address;
            return this;
        }

        public ConditionBuilder rightFuzzyU_address (String ... rightFuzzyU_address){
            this.rightFuzzyU_address = solveNullList(rightFuzzyU_address);
            return this;
        }

        public ConditionBuilder u_addressList(String ... u_address){
            this.u_addressList = solveNullList(u_address);
            return this;
        }

        public ConditionBuilder u_addressList(List<String> u_address){
            this.u_addressList = u_address;
            return this;
        }

        public ConditionBuilder fuzzyU_sex (List<String> fuzzyU_sex){
            this.fuzzyU_sex = fuzzyU_sex;
            return this;
        }

        public ConditionBuilder fuzzyU_sex (String ... fuzzyU_sex){
            this.fuzzyU_sex = solveNullList(fuzzyU_sex);
            return this;
        }

        public ConditionBuilder rightFuzzyU_sex (List<String> rightFuzzyU_sex){
            this.rightFuzzyU_sex = rightFuzzyU_sex;
            return this;
        }

        public ConditionBuilder rightFuzzyU_sex (String ... rightFuzzyU_sex){
            this.rightFuzzyU_sex = solveNullList(rightFuzzyU_sex);
            return this;
        }

        public ConditionBuilder u_sexList(String ... u_sex){
            this.u_sexList = solveNullList(u_sex);
            return this;
        }

        public ConditionBuilder u_sexList(List<String> u_sex){
            this.u_sexList = u_sex;
            return this;
        }

        public ConditionBuilder fuzzyU_email (List<String> fuzzyU_email){
            this.fuzzyU_email = fuzzyU_email;
            return this;
        }

        public ConditionBuilder fuzzyU_email (String ... fuzzyU_email){
            this.fuzzyU_email = solveNullList(fuzzyU_email);
            return this;
        }

        public ConditionBuilder rightFuzzyU_email (List<String> rightFuzzyU_email){
            this.rightFuzzyU_email = rightFuzzyU_email;
            return this;
        }

        public ConditionBuilder rightFuzzyU_email (String ... rightFuzzyU_email){
            this.rightFuzzyU_email = solveNullList(rightFuzzyU_email);
            return this;
        }

        public ConditionBuilder u_emailList(String ... u_email){
            this.u_emailList = solveNullList(u_email);
            return this;
        }

        public ConditionBuilder u_emailList(List<String> u_email){
            this.u_emailList = u_email;
            return this;
        }

        public ConditionBuilder fuzzyU_birthday (List<String> fuzzyU_birthday){
            this.fuzzyU_birthday = fuzzyU_birthday;
            return this;
        }

        public ConditionBuilder fuzzyU_birthday (String ... fuzzyU_birthday){
            this.fuzzyU_birthday = solveNullList(fuzzyU_birthday);
            return this;
        }

        public ConditionBuilder rightFuzzyU_birthday (List<String> rightFuzzyU_birthday){
            this.rightFuzzyU_birthday = rightFuzzyU_birthday;
            return this;
        }

        public ConditionBuilder rightFuzzyU_birthday (String ... rightFuzzyU_birthday){
            this.rightFuzzyU_birthday = solveNullList(rightFuzzyU_birthday);
            return this;
        }

        public ConditionBuilder u_birthdayList(String ... u_birthday){
            this.u_birthdayList = solveNullList(u_birthday);
            return this;
        }

        public ConditionBuilder u_birthdayList(List<String> u_birthday){
            this.u_birthdayList = u_birthday;
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

        private BysjUser obj;

        public Builder(){
            this.obj = new BysjUser();
        }

        public Builder Id(Integer Id){
            this.obj.setId(Id);
            return this;
        }
        public Builder u_name(String u_name){
            this.obj.setU_name(u_name);
            return this;
        }
        public Builder u_password(String u_password){
            this.obj.setU_password(u_password);
            return this;
        }
        public Builder u_address(String u_address){
            this.obj.setU_address(u_address);
            return this;
        }
        public Builder u_sex(String u_sex){
            this.obj.setU_sex(u_sex);
            return this;
        }
        public Builder u_email(String u_email){
            this.obj.setU_email(u_email);
            return this;
        }
        public Builder u_birthday(String u_birthday){
            this.obj.setU_birthday(u_birthday);
            return this;
        }
        public BysjUser build(){return obj;}
    }

}
